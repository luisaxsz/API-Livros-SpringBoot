let id;

function fazPut(body,id){
    fetch(`http://localhost:8080/api/v1/livros/${id}`, {
        method: "PUT",
        headers:{
            "Access-Control-Allow-Origin": "*",
            "Access-Control-Allow-Headers": "*",
            'Access-Control-Allow-Methods': "*",
            'Access-Control-Request-Private-Network': true,
            "Access-Control-Allow-Credentials" : true ,
            "Content-type": "application/json",
            'Authorization': "Basic " + btoa("admin:123"),
        },
        body: JSON.stringify(body)
    })
    .then(res => res.text())
    .then((data)=> console.log(data,"ok"))
    .catch(err => console.log(err,"erro"))
}

function editarLivro(){
    event.preventDefault();
    let nome = document.getElementById('nome-editar').value;
    let genero = document.getElementById('genero-editar').value;
    let numPag = document.getElementById('numPag-editar').value;
    let editora  = document.getElementById('editora-editar').value;
    let ano = document.getElementById('ano-editar').value;

    body = {
        "nome": nome,
        "genero": genero,
        "numpaginas": numPag,
        "editora": editora,
        "anopublicacao": ano
    }

    fazPut(body,id);
}

function mostrarPopUp(idLivro){
    id = idLivro;
    document.getElementById("editar-livro").style.display = 'block';
}
function fecharPopUp(){
    document.getElementById("editar-livro").style.display = 'none';
}