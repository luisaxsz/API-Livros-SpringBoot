let id;


function fazPut(body, id) {
    fetch(`http://localhost:8080/api/v1/livros/${id}`)
        .then(res => res.json())
        .then(livro => {
            const updatedLivro = { ...livro, ...body };
            fetch(`http://localhost:8080/api/v1/livros/${id}`, {
                method: "PUT",
                headers: {
                    "Access-Control-Allow-Origin": "*",
                    "Access-Control-Allow-Headers": "*",
                    "Access-Control-Allow-Methods": "*",
                    "Access-Control-Request-Private-Network": true,
                    "Access-Control-Allow-Credentials": true,
                    "Content-type": "application/json",
                    "Authorization": "Basic " + btoa("admin:123"),
                },
                body: JSON.stringify(updatedLivro)
            })
                .then(res => res.text())
                .then((data) => console.log(data, "ok"))
                .catch(err => console.log(err, "erro"))
        })
        .catch(err => console.log(err, "erro ao buscar livro"))
}

function editarLivro(){
    event.preventDefault();
    let valorAtributo = document.getElementById("editar-atributo").value
    let atributoSelecionado = document.getElementById('seletor-atributo').value;

    if (atributoSelecionado === "nome") {
        body = { "nome": valorAtributo };
    } else if (atributoSelecionado === "genero") {
        body = { "genero": valorAtributo };
    } else if (atributoSelecionado === "numPag") {
        body = { "numpaginas": valorAtributo };
    } else if (atributoSelecionado === "editora") {
        body = { "editora": valorAtributo };
    } else if (atributoSelecionado === "anoPub") {
        body = { "anopublicacao": valorAtributo };
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

//*Explicação para ... UpdatedLivro
/* 
    O primeiro objeto é o objeto updatedLivro.
    O segundo objeto é o objeto livro.
    O operador de espalhamento copia todas as propriedades enumerables do objeto livro para o objeto updatedLivro.
*/

//*Cód exemplo - para lembrar
/** 
 * const livro = {
  nome: "O Senhor dos Anéis",
  genero: "Fantasia",
  numPaginas: 1000,
  editora: "HarperCollins",
  anoPublicacao: 1954,
};

const novoAtributo = {
  cor: "Verde",
};

const livroAtualizado = { ...livro, ...novoAtributo };

console.log(livroAtualizado); */