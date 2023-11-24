# API-Livros-SpringBoot
## Ferramentas
<p>
  <img src="https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white"/>
  <img src="https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white"/>
  <img src="https://img.shields.io/badge/Oracle-F80000?style=for-the-badge&logo=oracle&logoColor=white"/>
  <img src="https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white"/>
  <img src="https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white"/>
  <img src="https://img.shields.io/badge/javascript-%23323330.svg?style=for-the-badge&logo=javascript&logoColor=%23F7DF1E"/>
  
</p>

## Funcionalidades
- Consultar Livros(por id, genero e ano de publicação)
- Adicionar Livros
- Atualizar Livros
- Deletar Livros
- Spring Security 
## API Livros 
### Consultar todos os carros
```GET /api/v1/livros```
```json
{
    "idlivros": 5,
    "nome": "O Senhor dos Anéis: A Sociedade do Anel",
    "genero": "Fantasia",
    "numpaginas": 434,
    "editora": "Martins Fontes",
    "anopublicacao": 1954
}
```

### Consultar Livro por gênero
```GET /api/v1/livros/genero/{Genero}```

```json
 {
        "idlivros": 3,
        "nome": "Os sete maridos de evelyn hugo",
        "genero": "Romance",
        "numpaginas": 360,
        "editora": "Paralela",
        "anopublicacao": 2019
    },
    {
        "idlivros": 4,
        "nome": "Dom Casmurro",
        "genero": "Romance",
        "numpaginas": 256,
        "editora": "Martin Claret",
        "anopublicacao": 1899
    }

```

### Consultar por ano de publicação
```GET /api/v1/livros/ano/{Ano de publicação}```

```json
 {
        "idlivros": 6,
        "nome": "Percy Jackson e o Ladrão de Raios",
        "genero": "Fantasia",
        "numpaginas": 400,
        "editora": "Intrínseca",
        "anopublicacao": 2005
    },
    {
        "idlivros": 7,
        "nome": "A Menina que Roubava Livros",
        "genero": "Drama",
        "numpaginas": 480,
        "editora": "Intrínseca",
        "anopublicacao": 2005
    }

```

### Consultar Livro por ID
```GET /api/v1/livros/{id}```
```json
{
    "idlivros": 6,
    "nome": "Percy Jackson e o Ladrão de Raios",
    "genero": "Fantasia",
    "numpaginas": 400,
    "editora": "Intrínseca",
    "anopublicacao": 2005
}

```

### Adicionar novo livro e Atualizar Livro
```POST /api/v1/livros```
```PUT /api/v1/livros/{ID}```
```json
{
        "nome": "Os sete maridos de evelyn hugo",
        "genero": "Romance",
        "numpaginas": 360,
        "editora": "Paralela",
        "anopublicacao": 2019
}
```
- Não é possível inserir o id -> Para criação de Livro
- Só é possível inserir um livro novo ou atualizar livro caso tenha ROLE de admin(necessário autorização)

### Deletar Livro
```DELETE /api/v1/livros/{ID}```

- Também só é possível deletar livro caso possua ROLE admin(necessário autorização)
