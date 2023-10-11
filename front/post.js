let url = 'http://localhost:8080/api/v1/livros';

function fazPost(){
    let request = new XMLHttpRequest();
    request.open("POST", url, true);
    //Para dizer o que ta mandando pra ele -> Content-type tipo de conteúdo
    request.setRequestHeader("Content-type", "application/json");
    request.send(JSON.stringify(body));
    
    request.onload = function(){
        console.log(this.responseText);
    }

    return request.responseText;

}

function cadastroLivro(){
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

    fazPost(url, body);
}
