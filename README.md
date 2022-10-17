# Api Rest Product BSale

## **Información técnica y funcional**

### El api rest tiene el alcance de mostrar información sobre categorías y productos, en el cual contempla 2 funcionalidades:
- Listado de categorias
- Listado de productos por categoria

### Implentado con las siguiente tecnologías:
- Java 11
- Spring boot
- Web Flux (Programacion reactiva)
- R2DBC
- Maria DB
- Lombok

## **Documentacion de Api**

### GET Lista de categorias
- GET /categories/ - retornara todos las categorias.

#### Headers:
- Content-Type: application/json

#### Parámetros:
- Sin parametros

#### Response:
```
[
    {
        "id": 1,
        "name": "bebida energetica"
    },
    {
        "id": 2,
        "name": "pisco"
    }
]
```

# #

### GET Lista de productos por categoria
- GET /products/category/{idCategoria} - retornara todos los productos por categoria.

#### Headers:
- Content-Type: application/json

#### Parámetros:
- idCategoria, permite filtrar por categoria

#### Response:
```
[
    {
        "id": 8,
        "name": "PISCO ALTO DEL CARMEN 35º",
        "urlImage": "https://dojiw2m9tvv09.cloudfront.net/11132/product/alto8532.jpg",
        "price": 7990.0,
        "discount": 10
    },
    {
        "id": 9,
        "name": "PISCO ALTO DEL CARMEN 40º ",
        "urlImage": "https://dojiw2m9tvv09.cloudfront.net/11132/product/alto408581.jpg",
        "price": 5990.0,
        "discount": 0
    },
    {
        "id": 10,
        "name": "PISCO ARTESANOS 35º ",
        "urlImage": "https://dojiw2m9tvv09.cloudfront.net/11132/product/artesanos8818.jpg",
        "price": 3990.0,
        "discount": 0
    }
]
```
