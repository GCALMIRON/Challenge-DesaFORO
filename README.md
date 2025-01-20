## Challenge ALURA-LATAM: DesaFORO
Desafío etapa 3 del curso de Backend de Alura-Latam

---

## **Arquitectura del Sistema**
El proyecto está diseñado con una arquitectura por capas:
- **Capa API**: Contiene los controladores REST y configuraciones de seguridad.
- **Capa de Dominio**: Define las entidades, repositorios y DTOs.
- **Capa de Infraestructura**: Incluye configuración de base de datos, manejo de errores y documentación de API.

---

## **Tecnologías Utilizadas**
- Java 17
- Maven 3.8+
- MySQL 8.0+
- **Framework Principal**: Spring Boot
- **Seguridad**: Spring Security, JWT
- **Acceso a Datos**: Spring Data JPA, Hibernate
- **Base de Datos**: MySQL
- **Documentación**: SpringDoc OpenAPI (Swagger)

---

## **Configuración e Instalación**

### **Pasos**
1. Clonar el repositorio:
   ```bash
   git clone https://github.com/GCALMIRON/Challenge-DesaFORO.git
   cd Challenge-DesaFORO
   ```
2. Configurar la base de datos:
   - Crear una base de datos en MySQL.
   - Actualizar las credenciales en el archivo `application.properties`:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/DesaFORO
     spring.datasource.username=tu_usuario
     spring.datasource.password=tu_contraseña
     ```
3. Compilar y ejecutar la aplicación:
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```
4. Acceder a la documentación de la API en:
   [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

---

## **Endpoints Principales**

| Método | Endpoint                  | Descripción                            |
|--------|---------------------------|----------------------------------------|
| POST   | `/auth/login`             | Autenticar un usuario.                 |
| GET    | `/users`                  | Obtener lista de usuarios.             |
| GET    | `/topics`                 | Listar todos los temas.                |
| POST   | `/topics`                 | Crear un nuevo tema.                   |
| GET    | `/courses`                | Listar todos los cursos.               |
| POST   | `/responses`              | Publicar una respuesta en un tema.     |

---

## **Licencia**
Este proyecto está bajo la Licencia MIT. Consulta el archivo `LICENSE` para más detalles.
