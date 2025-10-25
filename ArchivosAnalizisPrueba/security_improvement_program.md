      "App Security Improvement Program MiAplicacionEvaluacionOscar"

Este documento describe un programa estructurado para evaluar y mejorar la seguridad de la aplicación, basado en el análisis de MobSF y las prácticas de seguridad implementadas.

A) Revisión periódica de seguridad:

1.Objetivo:  
Garantizar que la aplicación se mantenga segura frente a nuevas amenazas y vulnerabilidades.

2.Acciones implementadas:
- Realizar análisis estático y dinámico de la app usando MobSF al menos cada nueva versión.  
- Ejecutar pruebas de seguridad automatizadas con herramientas como OWASP ZAP.  
- Revisar logs de comportamiento y permisos de la aplicación periódicamente.

3.Beneficio:  
- Detecta vulnerabilidades nuevas rápidamente.  
- Permite aplicar medidas correctivas antes de que los problemas afecten a los usuarios.

B) Identificación de métricas clave:

1.Objetivo:  
Medir la seguridad de la aplicación de manera cuantitativa para evaluar mejoras.

2.Métricas implementadas:
| Métrica | Descripción | Valor Actual |
|---------|------------|--------------|
| App Security Score | Score general de MobSF | 38/100 (High Risk) |
| Vulnerabilidades altas | Número de problemas críticos detectados | 3 |
| Vulnerabilidades medias | Número de problemas importantes detectados | 3 |
| Permisos peligrosos | Número de permisos de alto riesgo utilizados | 2 |
| Hardcoded secrets | Número de credenciales o claves expuestas | 1 |

3.Beneficio:  
- Permite medir el impacto de las mejoras de seguridad implementadas.  
- Facilita establecer prioridades para futuras acciones de seguridad.
  
C) Plan de acción para futuras mejoras:

1.Objetivo:
Mantener la aplicación segura de forma continua.

2.Acciones futuras recomendadas:
a. Actualizar la app para soportar Android 10 o superior.  
b. Deshabilitar Debug y usar certificados de producción en nuevas versiones.  
c. Eliminar información sensible hardcoded y usar almacenamiento seguro.  
d. Implementar pruebas de penetración periódicas para detectar vulnerabilidades avanzadas.  
e. Actualizar dependencias y librerías para minimizar riesgos de seguridad.  
f. Capacitar al equipo de desarrollo sobre seguridad en Android y mejores prácticas.

3.Beneficio:  
- Mantiene la app protegida frente a nuevas vulnerabilidades.  
- Permite establecer un ciclo de mejora continua en la seguridad de la aplicación.

D) Resumen:
El App Security Improvement Program garantiza que la aplicación:  
- Sea revisada y analizada periódicamente.  
- Mantenga métricas de seguridad claras y cuantificables.  
- Tenga un plan de acción para aplicar mejoras continuas.  
- Cumpla con buenas prácticas de seguridad y proteja los datos de los usuarios
