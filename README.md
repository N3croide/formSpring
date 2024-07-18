# Proyecto de Formulario con Spring Boot

## Descripción

Este proyecto implementa un formulario simple utilizando Spring Boot para capturar datos de usuario (nombre de usuario y correo electrónico) y enviarlos al servidor.

## Tecnologías Utilizadas

### Backend:

- **Spring Boot**: Framework para aplicaciones Java basado en Spring.
- **Spring MVC**: Para el manejo de controladores y solicitudes HTTP.

### Frontend:

- **JavaScript**: Para la interactividad del formulario y el envío de datos al servidor.
- **HTML**: Para la estructura del formulario.

## Funcionalidad

El formulario permite al usuario ingresar su nombre de usuario y correo electrónico. Los datos son enviados al servidor utilizando JavaScript y fetch API. Un controlador en Spring Boot recibe y procesa los datos, almacenándolos o realizando las operaciones necesarias.

## Estructura del Proyecto

### Backend:

- **UserController.java**: Controlador para manejar las solicitudes POST y guardar los datos de usuario en el servidor.

### Frontend:

- **index.html**: Formulario HTML que captura el nombre de usuario y correo electrónico.
- **script.js**: Script JavaScript para manejar la captura de datos del formulario y enviarlos al servidor.
