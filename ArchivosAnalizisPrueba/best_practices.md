          "IMPLEMENTACION DE LAS BUENAS PRACTICAS EN MI APLICACION"

Implementacion de best practices en MiAplicacionEvaluacionOscar:
Este informe documentara y detallara las buenas practicas o como se dicen las Best Practices, las cuales se implementan en la aplicacion para mejorar la seguridad y ayudar a proteger los datos de los usuarios, este informe esta basado en el analisis que realizo MobSF y tambien esta apuntando a mitigar las vulnerabilidades encontradas

A) Evitar el uso de versiones de android vulnerables:
1. Vulnerabilidad identificada:
   -La app puede instalarse en versiones de android no actualizadas lo cual expone      a la app a fallas de seguridad conocidas
2. Practica implementada:
   -Que logre soportar Android 10 o superior y limitar la instalacion en versiones     antiguas vulnerables
3. Beneficio de seguridad:
   -Los dispositivos reciben actualizaciones de seguridad y se reduce la exposicion     a vulnerabilidad conocidas en android antiguos

B) Deshabilitar Debug en produccion:
1. Vulnerabilidad identificada:
   - Debug habilitado y certificado de debug usado
2. Practica implementada:
   -  Deshabilitar debug en versión de producción y Firmar la app concertificado        de producción seguro
3. Beneficio de seguridad:
   - Evita que atacantes puedan depurar o manipular la app y tambien                   Garantizaautenticidad de la app instalada en los dispositivos

C) Proteccion de datos sensibles y claves:
1. Vulnerabilidad identificada:
   -  Información sensible hardcoded en el código (`google_maps_key`).  
- Datos de la app pueden ser respaldados vía ADB.
2. Practica implementada:
   - Se Cifran los datos sensibles en almacenamiento local y  
     se guardan las claves API en un lugar seguro, no en el código, tambien se  
     Desactiva el backup de la app en producción
3. Beneficio de seguridad
   - Protege información crítica de accesos no autorizados.  
     Minimiza el riesgo de que atacantes usen claves expuestas.

D) Comunicación segura:
1. Vulnerabilidad identificada:
   - La app se conecta a URLs externas, lo que podría ser interceptado.
2. Practica implementada:
   - Usar HTTPS con certificados TLS válidos para todas las comunicaciones de red.
3. Beneficio de seguridad:
   - Evita ataques de tipo Man-in-the-Middle (MITM) y tambien Garantiza                confidencialidad e integridad de los datos transmitidos

E) Control de permisos y componentes exportados
1. Vulnerabilidad identificada:
   - Broadcast Receiver expuesto sin protección adecuada.  
   - Uso de permisos peligrosos: `ACCESS_FINE_LOCATION`, `ACCESS_COARSE_LOCATION`.
2. Practica implementada:
   - Solicitar solo los permisos necesarios y de manera contextual ademas de   
     Revisar los componentes exportados y definir correctamente el nivel de            protección de los permisos.
3. Beneficio de seguridad:
   - Reduce la superficie de ataque y protege la privacidad del usuario y  
     Evita que otras apps interactúen con componentes sensibles.

F) Resumen de las Best Practices:
Implementar estas **Best Practices** asegura que la aplicación:  

- Sea más robusta frente a ataques.  
- Proteja datos sensibles de los usuarios.  
- Cumpla con estándares de seguridad recomendados para aplicaciones móviles.  
- Mitigue todas las vulnerabilidades detectadas por MobSF.
