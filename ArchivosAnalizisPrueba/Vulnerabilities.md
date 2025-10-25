                  # REPORTE DE VULNERABILIDADES DE MI APP #

Vulnerabilidades encontraras:
Este archivo mostrara todas las vulnerabilidades que encontre al analizar mi app.debug con MobSF, el cual me entrego un pdf completo de todo lo encontrado, el pdf tambien se encontrara en la misma carpeta llamada ArchivosAnalizisPrueba por si lo quieren revisar.

A) Nivel de las Vulnerabilidades:
High: 3
Medium:3
Info: 0

B) Vulnerabilidades Altas:
1. La app puede instalarse en versiones Android Vulnerables:
-Riesgo: El dispositivo podria no recibir actualizaciones de seguridad
-Recomendacion: Soportar Android 10 o superior
2. El Debug esta habilitado:
-Riesgo: Permite a que los atacantes usen la depuracion para acceder a la informacion sensible y asi poder manipular la app
-Recomendacion: Deshabilitar el debug en version de produccion
3. La app esta firmada con certificado de depuracion:
-Riesgo: El no usar certificados de depuracion en la produccion puede exponer a la app a que sea atacada
-Recomendación: Usar el certificado de produccion

C) Vulnerabilidades Medias:
1. Los datos de la app pueden ser respaldados.
-Riesgo: Los usuarios maliciosos podrian extraer la informacion de la app por medio de ADB
-Recomendacion: Desactivar el backup en produccion
2. Broadcast Receiver expuesto:
-Riesgo: Otras apps podrian interactuar con este componente si el permiso no es seguro
-Recomendacion: Revisar el exported y el nivel de proteccion del permiso
3. Hardcoded sensitive information
-Encontrado: google_maps_key en el codigo
-Riesgo: Cualquier persona podria usar esta clave para acceder a los servisios del google maps o podrian abusar de ella
-Recomendacion: Guardar las claves en un lugar seguro no en el codigo

D) Informacion sensible dada por el app analizado en MobSF:
1. Uso de permisos peligrosos como serian el ACCESS_FINE_LOCATION y el ACCESS_COARSE_LOCATION
2. Uso del permiso INTERNET y ACCESS_NETWORK_STATE lo cual es normal ya que es necesario para la app
3. Codigo compilado con R8 lo cual puede probocar una posible ofuscacion debil
4. Analisis de comportamiento: Conexion a URL externa la cual esta en actividadInicio.java

Esta serian todas las vulnerabilidades que me entrego el analizis el cual se realizo por medio de la aplicacion de MobSF
