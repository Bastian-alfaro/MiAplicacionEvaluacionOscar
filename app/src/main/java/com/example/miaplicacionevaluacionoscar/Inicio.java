package com.example.miaplicacionevaluacionoscar;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Inicio extends AppCompatActivity {

    EditText etNombreFoto;
    Button btAceptar;
    Button btnDescargar;
    Bitmap imagenDescargada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_inicio);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        etNombreFoto = findViewById(R.id.ETNombreFoto);
        btAceptar = findViewById(R.id.BTAceptar);
        btnDescargar = findViewById(R.id.BTDescargar);

        btAceptar.setEnabled(false);

        btnDescargar.setOnClickListener(v -> {
            btAceptar.setEnabled(false);
            Toast.makeText(this, "Descargando imagen...", Toast.LENGTH_SHORT).show();

            new Thread(() -> {
                try {
                    String urlStr = "https://tse4.mm.bing.net/th/id/OIP.JaU0IVQ4I7ioMvgwEybvWQHaHa?cb=12&rs=1&pid=ImgDetMain&o=7&rm=3";
                    URL url = new URL(urlStr);
                    HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
                    conexion.connect();

                    if (conexion.getResponseCode() != HttpURLConnection.HTTP_OK) {
                        throw new Exception("Error en la conexión: " + conexion.getResponseCode());
                    }

                    InputStream inputStream = conexion.getInputStream();
                    imagenDescargada = BitmapFactory.decodeStream(inputStream);
                    conexion.disconnect();

                    runOnUiThread(() -> {
                        Toast.makeText(Inicio.this, "Imagen descargada correctamente", Toast.LENGTH_SHORT).show();
                        btAceptar.setEnabled(true);
                    });

                } catch (Exception e) {
                    e.printStackTrace();
                    runOnUiThread(() ->
                            Toast.makeText(Inicio.this, "Error al descargar la imagen", Toast.LENGTH_SHORT).show()
                    );
                }
            }).start();
        });

        btAceptar.setOnClickListener(view -> {
            String nombre = etNombreFoto.getText().toString();

            ByteArrayOutputStream stream = new ByteArrayOutputStream();
            imagenDescargada.compress(Bitmap.CompressFormat.PNG, 100, stream);
            byte[] bytes = stream.toByteArray();

            Intent intent = new Intent(Inicio.this, MainActivity.class);
            intent.putExtra("nombreFoto", nombre);
            intent.putExtra("imagen", bytes);
            startActivity(intent);
        });
    }
}
