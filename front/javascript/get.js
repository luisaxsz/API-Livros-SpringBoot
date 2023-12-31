function criaLinha(livros){
  let linha = document.createElement("tr");
  const tdNome = document.createElement("td");
  const tdGenero = document.createElement("td");
  const tdNumPag = document.createElement("td");
  const tdEditora = document.createElement("td");
  const tdAno = document.createElement("td");

  const buttonEditar = document.createElement("button")
  const buttonDeletar = document.createElement("button")

  tdNome.innerHTML = livros.nome;
  tdGenero.innerHTML = livros.genero;
  tdNumPag.innerHTML = livros.numpaginas;
  tdEditora.innerHTML = livros.editora;
  tdAno.innerHTML = livros.anopublicacao;
  
  buttonEditar.innerHTML = "Editar"
  buttonDeletar.innerHTML = "Deletar"
  // Gera um class='' para o elemento criado
  buttonEditar.classList.add("button-editar");
  buttonDeletar.classList.add("button-deletar");

  buttonEditar.addEventListener("click", function(){
    mostrarPopUp(livros.idlivros);
  });
  buttonDeletar.addEventListener("click", function(){
    deletarLivro(livros.idlivros);
  });
 

  linha.appendChild(tdNome);
  linha.appendChild(tdGenero);
  linha.appendChild(tdNumPag);
  linha.appendChild(tdEditora);
  linha.appendChild(tdAno);
  linha.appendChild(buttonEditar)
  linha.appendChild(buttonDeletar)
  return linha;
}

function fazGet() {
  fetch("http://localhost:8080/api/v1/livros", {
    method: "GET",
    mode: 'cors',
    headers:{
      'Access-Control-Allow-Origin': '*',
      'Access-Control-Allow-Headers': '*',
      'Access-Control-Request-Private-Network': true,
    }
  })
    .then(res => res.json())
    .then(function(data){
      let tabela = document.getElementById("table-livros")

      data.forEach(element => { 
        let linha = criaLinha(element);
        tabela.appendChild(linha);
      })
});
}