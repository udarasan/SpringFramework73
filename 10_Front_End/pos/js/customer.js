function saveCustomer() {
    let cId=$('#customerId').val();
    let cName=$('#customerName').val();
    let cAddress=$('#customerAddress').val();

    console.log(cId,cName,cAddress)

    $.ajax({
        url:"http://localhost:8080/api/v1/customer",
        method:"POST",
        contentType:"application/json",
        "data": JSON.stringify({
            "cId": cId,
            "cName": cName,
            "cAddress": cAddress
        }),
        success:function (res) {
            alert("done")
        },
        error:function (error) {
            alert("network error")
        }
    })
}