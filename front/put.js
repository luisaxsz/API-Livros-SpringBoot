editarLivro(){
    event.preventDefault();
    let nome = document.getElementById('nome').value;
    let genero = document.getElementById('genero').value;
    let numPag = document.getElementById('numPag').value;
    let editora  = document.getElementById('editora').value;
    let ano = document.getElementById('ano').value;

    body = {
        "nome": nome,
        "genero": genero,
        "numpaginas": numPag,
        "editora": editora,
        "anopublicacao": ano
    }

    fazPut(url,body)
}