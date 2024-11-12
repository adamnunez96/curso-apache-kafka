# Tutorial de Apache Kafka

El repositorio es un tutorial de Apache Kafka, en el mismo se encuentra tanto el productor y el consumidor. Todo el proyecto corre con Docker por lo que para desplegar es necesario tener lo instalado. En el docker-compose se encuentra la configuracion de los servicios.

## Conceptos

### Event-Driven Architecture (Arquitectura Orientada a Eventos).

La arquitectura orientada a eventos (EDA, por sus siglas en inglés, Event-driven architecture) es un enfoque arquitectónico en el cual los sistemas se diseñan para responder a eventos o cambios de estado de manera asíncrona. En lugar de depender de una comunicación directa y sincrónica entre componentes, la arquitecturentos se basa a orientada a even el intercambio de eventos como mecanismo central de comunicación.

A su vez, la arquitectura orientada a eventos no está directamente relacionada con los eventos que emite un computador (hardware). Su enfoque principal es procesar datos basados en la generación, detección y reacción a eventos del sistema.

- Es una arquitectura asincrona y distribuida, pensada para crear aplicaciones altamente escalables
- Los componentes no se comunican de forma tradicional, en la cual se establece comunicacion de forma sincrona, se obtiene una respuesta y se procede con el siguiente paso.

### Evento

Un evento en este contexto arquitectónico se refiere a un suceso significativo que ocurre en un sistema en un momento específico. El evento puede ser cualquier acción, notificación o suceso digno de ser capturado y procesado.

También un evento contiene información sobre lo que ha ocurrido, como datos relevantes, metadatos y contexto asociado al suceso. El evento puede ser desencadenado por diversas fuentes, como interacciones de usuarios, acciones de otros componentes, cambios de propiedades del sistema, actualizaciones de sensores, eventos externos, entre otros.

<div align="center">
<img src="https://miro.medium.com/v2/resize:fit:1400/1*J1PZH-nkVCZA6VvHfCe3Wg.jpeg" width="600" height="200" alt="Arquitectura Orientada a Eventos">
</div>

### Que es Apache Kafka?

Apache Kafka es una plataforma de código abierto diseñada para transmitir datos en tiempo real de manera eficiente y confiable entre diferentes aplicaciones y sistemas distribuidos. Apache Kafka actúa como un intermediario que permite el envío, almacenamiento y procesamiento de flujos de eventos a gran escala.

<div align="center">
<img src="https://miro.medium.com/v2/resize:fit:1400/format:webp/1*gQijKcsTmGS7aGScQEWFqA.png" width="500" height="300" alt="Arquitectura Orientada a Eventos">
</div>

Conceptos clave a entender de la arquitectura:

- Productores (Producers): Los productores son responsables de enviar mensajes a los tópicos de Kafka. Estos mensajes pueden ser eventos, registros, datos de sensores, etc. Los productores envían mensajes a tópicos específicos y Kafka se encarga de distribuirlos a las particiones adecuadas.
- Tópicos (Topics): Los tópicos son canales virtuales a los que los productores envían mensajes. Cada tópico puede tener uno o más productores y cero o más consumidores. Los tópicos son la unidad fundamental de organización de datos en Kafka.
- Particiones (Partitions): Cada tópico se divide en una o más particiones. Cada partición es una secuencia ordenada e inmutable de mensajes. Las particiones permiten la distribución paralela de datos y mejoran el rendimiento y la escalabilidad. Cada partición tiene un número de offset único que identifica cada mensaje dentro de ella.
- Broker: En Apache Kafka, un “broker” se refiere a un nodo o servidor individual dentro de un clúster de Kafka. Cada broker es responsable de almacenar datos en particiones y manejar la comunicación con los productores y consumidores.
- Consumidores (Consumers): Los consumidores son aplicaciones que leen mensajes de los tópicos y particiones en Kafka. Los consumidores pueden suscribirse a uno o más tópicos y consumir datos a su propio ritmo. Pueden ser grupos de consumidores, lo que permite la distribución de la carga y la paralelización del procesamiento.
- Grupos de Consumidores (Consumer Groups): Los grupos de consumidores permiten la escalabilidad horizontal y el paralelismo en el procesamiento de datos. Cada partición de un tópico solo puede ser consumida por un consumidor dentro de un grupo en un momento dado. Esto permite que múltiples consumidores dentro de un grupo trabajen en paralelo y procesen datos de manera eficiente.


## Fuentes
- [Tutorial de Youtube](https://www.youtube.com/watch?v=l4-wAvFYKCY)
- [Introducción a la arquitectura orientada a eventos.](https://medium.com/@diego.coder/introducci%C3%B3n-a-la-arquitectura-orientada-a-eventos-a532c71c9945)
- [Fundamentos de Apache Kafka.](https://medium.com/@diego.coder/introducci%C3%B3n-a-apache-kafka-d1118be9d632)
- [¿Qué es un broker de mensajería?](https://medium.com/@diego.coder/que-es-un-broker-de-mensajer%C3%ADa-8aa8ab7988e8)