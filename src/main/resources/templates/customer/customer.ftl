<!-- FreeMarker Macros -->
<#import "/spring.ftl" as spring/>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <title class="text-lg-center">>Customer List</title>
    <link rel="stylesheet"
          type="text/css"
          href="<@spring.url '/css/style.css'/>"/>
</head>
<body>
<h1>Customer List</h1>
<h1></h1>
<p>

    <a class="btn btn-dark" href="/addCus" role="button">Add Customer</a>
    <a class="btn btn-dark" href="/" role="button">Back</a>

</p>
<br><br>
<div>
    <table class="table table-dark">
        <thead>
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Type</th>
            <th>Phone</th>
            <th>City</th>
        </tr>

        <#if cuslist??>
            <#list cuslist as cust>
                <tr>
                    <td>${cust.customerID}</td>
                    <td>${cust.name}</td>
                    <td>${cust.type}</td>
                    <td>${cust.phone}</td>
                    <td>${cust.city}</td>
                    <td><a href="/deleteCus?id=${cust.customerID}">Delete Service</a></td>
                </tr>
            </#list>
        </#if>
        </thead>
    </table>
</div>
</body>
</html>