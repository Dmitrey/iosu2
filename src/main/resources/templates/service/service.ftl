<!-- FreeMarker Macros -->
<#import "/spring.ftl" as spring/>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <title class="text-lg-center">>Service List</title>
    <link rel="stylesheet"
          type="text/css"
          href="<@spring.url '/css/style.css'/>"/>
</head>
<body>
<h1>Service List</h1>
<h1></h1>
<p>

    <a class="btn btn-dark" href="/addServ" role="button">Add Service</a>
    <a class="btn btn-dark" href="/" role="button">Back</a>

</p>
<br><br>
<div>
    <table class="table table-dark">
        <thead>
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Phone</th>
        </tr>

        <#if servlist??>
            <#list servlist as service>
                <tr>
                    <td>${service.serviceID}</td>
                    <td>${service.serviceName}</td>
                    <td>${service.price}</td>
                    <td><a href="/deleteServ?id=${service.serviceID}">Delete Service</a></td>
                </tr>
            </#list>
        </#if>
        </thead>
    </table>
</div>
</body>
</html>