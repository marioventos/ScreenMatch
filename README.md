# 🎬 ScreenMatch

Proyecto backend desarrollado con **Spring Boot** que permite gestionar series, temporadas, episodios y frases famosas de series, consumiendo datos desde la API de **OMDb** y persistiendo la información en **PostgreSQL**.

---

## 🚀 Tecnologías utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- PostgreSQL
- OMDb API
- Maven
- Git & GitHub

---

## 📦 Funcionalidades principales

### 📺 Series
- Listar todas las series
- Obtener Top 5 por evaluación
- Ver lanzamientos recientes
- Buscar series por categoría
- Obtener detalle completo de una serie

### 🎞️ Temporadas y episodios
- Cargar episodios por temporada desde OMDb
- Listar episodios por serie
- Listar episodios por temporada

### 💬 Frases
- Obtener una frase aleatoria de series
- Endpoint dedicado para consumo desde frontend

---

## 🔗 Endpoints principales

### Series
- `GET /series`
- `GET /series/{id}`
- `GET /series/top5`
- `GET /series/lanzamientos`
- `GET /series/{id}/temporadas/todas`
- `GET /series/{id}/temporadas/{numero}`

### Episodios
- `GET /series/{id}/episodios`

### Frases
- `GET /series/frases`

---

## 🗄️ Base de datos

- PostgreSQL
- Relaciones:
  - Serie → Episodios (OneToMany)
  - Episodio → Serie (ManyToOne)

---

## ⚙️ Configuración

Configurar el archivo `application.properties` con:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/screenmatch
spring.datasource.username=TU_USUARIO
spring.datasource.password=TU_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
