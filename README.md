# Tutorial de Apache Kafka

El repositorio es un tutorial de Apache Kafka, en el mismo se encuentra tanto el productor y el consumidor. Todo el proyecto corre con Docker por lo que para desplegar es necesario tener lo instalado. En el docker-compose se encuentra la configuracion de los servicios.

## Conceptos

### Que es Kafka?
Es una plataforma de Streaming de Datos de alto rendimiento, permite a los desarrolladores; procesar, almacenar y enviar mensajes(Eventos) entre aplicaciones de manera eficiente y confiable. Es una tecnologia que nos permite enviar mensajes/eventos desde un microservicio o otro microservicio de manera asincrona

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

### Que es Apache Kafka

Apache Kafka es una plataforma de código abierto diseñada para transmitir datos en tiempo real de manera eficiente y confiable entre diferentes aplicaciones y sistemas distribuidos. Apache Kafka actúa como un intermediario que permite el envío, almacenamiento y procesamiento de flujos de eventos a gran escala.

## Fuentes
- [Tutorial de Youtube](https://www.youtube.com/watch?v=l4-wAvFYKCY)
- [Introducción a la arquitectura orientada a eventos.](https://medium.com/@diego.coder/introducci%C3%B3n-a-la-arquitectura-orientada-a-eventos-a532c71c9945)
- [Fundamentos de Apache Kafka.](https://medium.com/@diego.coder/introducci%C3%B3n-a-apache-kafka-d1118be9d632)
- [¿Qué es un broker de mensajería?](https://medium.com/@diego.coder/que-es-un-broker-de-mensajer%C3%ADa-8aa8ab7988e8)



