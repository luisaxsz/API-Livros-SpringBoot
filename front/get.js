function criaLinha(livros){
  linha = document.createElement("tr");
  tdId = document.createElement("td");
  tdNome = document.createElement("td");
  tdId.innerHTML = livros.idlivros;
  tdNome.innerHTML = livros.nome;
  linha.appendChild(tdId);
  linha.appendChild(tdNome);
  return linha;
}

function fazGet() {
  fetch("http://localhost:8080/api/v1/livros", {
    method: "GET",
  })
    .then((res) => res.json())
    .then(function(data){
      let tabela = document.getElementById("table-livro")
    
      console.log(JSON.parse(data))

      livros.forEach(element => { 
        let linha = criaLinha(element);
        tabela.appendChild(linha)
      })
});
}
