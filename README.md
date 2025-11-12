# 🧩 TP - APIs REST con Spring Boot

## 📘 Descripción del proyecto

Este proyecto implementa una **API RESTful** desarrollada con **Spring Boot**, que permite gestionar productos en una base de datos **H2** embebida.  
El sistema incluye operaciones CRUD completas (crear, leer, actualizar y eliminar), manejo de errores mediante códigos HTTP estandarizados y documentación generada automáticamente con **Swagger UI**.

El objetivo del trabajo práctico es aplicar los fundamentos de **Spring Boot**, **Spring Web**, **JPA** y **H2 Database**, comprendiendo el ciclo de vida de una API REST y su documentación.

---

## ⚙️ Tecnologías utilizadas

- ☕ **Java 17**
- 🌱 **Spring Boot 3.x**
- 🧩 **Spring Web / Spring MVC**
- 💾 **Spring Data JPA**
- 🗃️ **Base de datos H2**
- 📘 **Swagger UI / OpenAPI**
- 🧰 **Maven**
- 🧪 **JUnit / Postman / Swagger para pruebas**

---

## 🚀 Instrucciones para clonar y ejecutar el proyecto

1. Clona el repositorio:

   bash
   git clone https://github.com/tuusuario/tp-springboot-rest.git
   cd tp-springboot-rest
2. Compila y ejecuta el proyecto:

mvn spring-boot:run


3. Accede a la documentación generada automáticamente:

Swagger UI:
👉 http://localhost:8080/swagger-ui/index.html

Consola H2:
👉 http://localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:testdb

Usuario: sa

Contraseña: (vacía)

4. Para reiniciar la base de datos, basta con reiniciar la aplicación (al ser en memoria).


Captura creacion de producto exitosa
<img width="1448" height="677" alt="1" src="https://github.com/user-attachments/assets/eef1a892-ae79-47b0-b611-86796926591b" />
<img width="1413" height="619" alt="2" src="https://github.com/user-attachments/assets/0fdbb895-ae0c-4219-af74-63b05cbf0bdf" />
<img width="1403" height="569" alt="3" src="https://github.com/user-attachments/assets/dc228887-fa6e-4ff5-9106-a8845131b563" />
<img width="1374" height="199" alt="4" src="https://github.com/user-attachments/assets/1ffdf89e-bdfd-470e-bd8a-0b3e14664cf1" />
Capturas de crear un producto sin nombre da error
<img width="478" height="646" alt="5" src="https://github.com/user-attachments/assets/3b47f283-25d0-40a2-8b4b-f555d3f0f9ad" />
Capturas de creacion de un producto con precio negativo da error
<img width="495" height="656" alt="6" src="https://github.com/user-attachments/assets/675e8826-890f-46c6-97e7-e60963cf2e42" />
Captura listar todos los productos creados
<img width="585" height="614" alt="7" src="https://github.com/user-attachments/assets/cb65d8d8-1ac2-423c-b167-04c7a229f721" />
Captura listar todos los productos por categoria
<img width="490" height="622" alt="8" src="https://github.com/user-attachments/assets/79787cfb-6b33-44d5-aba2-f95e6ca07da6" />
Captura buscar producto por id cuando no existe este
<img width="482" height="485" alt="10" src="https://github.com/user-attachments/assets/e2c44f4f-f7c5-4438-8208-1bcbc5cbb47d" />
Captura de actualizacion de producto completo por id
<img width="482" height="485" alt="10" src="https://github.com/user-attachments/assets/67cd6551-b1e1-403d-a331-02b834bdbfcc" />
Captura de actualizacion de stock por id
<img width="505" height="464" alt="11" src="https://github.com/user-attachments/assets/2e15bff4-b10c-45b4-9a0b-6910b6de66c1" />
Captura base de datos en h2
<img width="843" height="471" alt="12" src="https://github.com/user-attachments/assets/c9fb6b36-2e8e-4717-a602-822ecc9ea11d" />
Captura de busqueda de un producto ya eliminado
<img width="613" height="618" alt="13" src="https://github.com/user-attachments/assets/3bef73af-d3d1-4ee7-a88d-f3b3c716e03c" />


🔗 Instrucciones para acceder a Swagger UI y consola H2

Levantar la aplicación (mvn spring-boot:run)

Abrir los siguientes enlaces:

Swagger UI: http://localhost:8080/swagger-ui/index.html

H2 Console: http://localhost:8080/h2-console

En H2:

URL JDBC: jdbc:h2:mem:testdb

Usuario: sa

Contraseña: (vacía)

Ejecutar consultas SQL o visualizar las tablas generadas por JPA.

💭 Conclusiones personales

Este trabajo permitió consolidar los conocimientos sobre el ecosistema Spring Boot, entendiendo cómo se estructuran las capas Controller, Service y Repository, y cómo se comunican entre sí mediante el patrón MVC.
Además, se comprendió la importancia de las buenas prácticas REST, el versionado de endpoints, el uso de DTOs y la documentación con Swagger.

👤 Autor

Nombre: Octavio Martinez Cirona
Legajo: 51451
