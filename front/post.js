let url = 'http://localhost:8080/api/v1/livros';

function fazPost(){
    let request = new XMLHttpRequest();
    request.open("POST", url, true);
    //Para dizer o que ta mandando pra ele -> Content-type tipo de conteúdo
    request.setRequestHeader("Content-type", "application/json");
    request.setRequestHeader("Authorization", "Basic" + btoa("admin:123"));
    request.send(JSON.stringify(body));
    
    request.onload = function(){
        console.log(this.responseText);
    }

    return request.responseText;

}

function testfazpost(){
    fetch('http://localhost:8080/api/v1/livros',{
        method:"POST",
        mode:'cors',
        headers:new Headers({
            "Access-Control-Allow-Origin": "*",
            "Access-Control-Allow-Headers": "*",
            'Access-Control-Request-Private-Network': true,
            "Access-Control-Allow-Credentials" : true ,
            "Content-type": "application/json",
            'Authorization': "Basic " + btoa("admin:123"),
        }),
        body: JSON.stringify(body),
    })
    .then(res => res.text())
    .then((data) => console.log(data))
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

    testfazpost(body)
}
