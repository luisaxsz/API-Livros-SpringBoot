function editarLivro(id){
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
    .then((data)=> console.log(data))
}