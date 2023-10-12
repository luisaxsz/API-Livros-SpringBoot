function deletarLivro(id){

    fetch(`http://localhost:8080/api/v1/livros/${id}`,{
        method: "DELETE",
        mode:'cors',
        headers:{
            "Access-Control-Allow-Origin": "*",
            "Access-Control-Allow-Headers": "*",
            'Access-Control-Allow-Methods': "*",
            'Access-Control-Request-Private-Network': true,
            "Access-Control-Allow-Credentials" : true ,
            "Content-type": "application/json",
            'Authorization': "Basic " + btoa("admin:123"),
        }
    })
    .then(res => res.text())
    .then(function(data){
        console.log(data)
    })
}
