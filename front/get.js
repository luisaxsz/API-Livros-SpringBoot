function fazGet() {
  fetch("http://localhost:8080/api/v1/livros", {
    method: "GET",
  })
    .then((res) => res.json())
    .then(function (data) {
      let p = document.getElementById("livros");
      p.innerText = JSON.stringify(data);
    });
}
