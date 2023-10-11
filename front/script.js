fetch('http://localhost:8080/api/v1/livros')
.then(res => res.json())
.then(function(data){
    const p = document.getElementById('livros');
    p.innerText = JSON.stringify(data)
})