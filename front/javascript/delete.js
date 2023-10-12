function deletarLivro(id){
    fetch(`http://localhost:8080/api/v1/livros/${id}}`,{
        method: "DELETE",
        headers:{
            "Access-Control-Allow-Origin": "*",
            "Access-Control-Allow-Headers": "*",
            'Access-Control-Request-Private-Network': true,
            "Access-Control-Allow-Credentials" : true ,
            "Content-type": "application/json",
            'Authorization': "Basic " + btoa("admin:123"),
        },
    }).then(res => console.log(res)).then(function(data){
        console.log(data)
    })
}