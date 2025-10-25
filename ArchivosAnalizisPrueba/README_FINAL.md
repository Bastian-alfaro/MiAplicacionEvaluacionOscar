                     "MiAplicacionEvaluacionOscar"

A) Descripcion:
+Este proyecto es una aplicacion android la cual implementa las medidas de seguridad para asi poderse proteger contra las vulnerabilidades comunes, para haber logrado eso se tuvieron que seguir recomendaciones de un analisis estatico y dinamico realizado gracias a MobSF

B) Vulnerabilidades encontradas: 
+Durant el analisis que se realizo gracias a MobSF se detectaron las siguientes vulnerabilidades:
- Altas:
    1. La app puede instalarse en versiones Android vulnerables.
    2. Debug habilitado en la app.
    3. La app está firmada con un certificado de depuración.
- Medias:
    1. Los datos de la app pueden ser respaldados.
    2. Broadcast Receiver expuesto.
    3. Hardcoded sensitive information.

C) Mejoras implementadas:
Para mitigar las vulnerabilidades detectadas se aplicaron las siguientes mejoras de seguridad:
- Cifrado de datos sensibles.
- Comunicación segura mediante HTTPS.
- Validación y sanitización de todas las entradas del usuario.
- Deshabilitación de Debug en versión de producción.
- Uso de certificados de producción para firmar la app.
- Eliminación de información sensible hardcoded.
- Revisiones periódicas de seguridad y métricas de seguridad implementadas.

D) Documentacion:
Los documentos detallados se encuentran en este repositorio:
- [Vulnerabilidades](vulnerabilities.md)
- [Best Practices](best_practices.md)
- [Security Tips](security_tips.md)
- [Security Improvement Program](security_improvement_program.md)

E) Como ejecutar la aplicacion de forma segura:
+ Clonar el repositorio: "https://github.com/Bastian-alfaro/MiAplicacionEvaluacionOscar.git" (pueden descargar el archivo zip) -Abrir e ingresar el proyecto en android studio -Añadir tu API Key de google maps en 'app/res/values/strings.xml -ejecuta la aplicacion con el emulador que tengas:)

DESCARGAR APK mencionar que si se ejecuta el emulador el mapa que se muestra mostrara la ubicacion de donde esta el emulador osea lejos en un lugar no adecuado para que se vea su verdadero funcionamiento se puede conectar el telefono ya ea por medio USB oh descargar un apk que se hace al ir ah las 4 lineas en la esquina superior izquierda en android studio luego ir hacia build y buscar la opcion que diga "generate apk bundle or apks y seleccionar generar apks luego cuando se complete la descargar en las notificaciones seleccionar donde dice locate y en viar el archivo que aparece hacia su telefono por via usb

F) Preguntas de cierre:
Dejare las preguntas de cierre dadas en el pdf aqui:
1.¿Qué nuevos conocimientos y habilidades has adquirido en la protección de aplicaciones Android contra amenazas de seguridad?
Aprendí a identificar vulnerabilidades comunes en aplicaciones Android, a interpretar reportes de análisis de seguridad y a aplicar buenas prácticas para mitigarlas, como deshabilitar Debug, usar certificados de producción y proteger datos sensibles.

2.¿Cómo podrías utilizar los conocimientos adquiridos para mejorar la seguridad en aplicaciones móviles en diferentes entornos?
Los conocimientos adquiridos se pueden aplicar en aplicaciones financieras, de salud o comercio electrónico para garantizar confidencialidad de datos, comunicaciones seguras y reducción de riesgos de explotación de vulnerabilidades.

3.¿Lograste implementar las mejores prácticas y los consejos de seguridad de manera efectiva? ¿Qué desafíos encontraste y cómo los superaste?
Sí, se implementaron varias prácticas de seguridad. Los desafíos incluyeron identificar todos los permisos peligrosos y eliminar información hardcoded; se superaron revisando el código con MobSF y aplicando recomendaciones de buenas prácticas.
