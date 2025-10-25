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
+
