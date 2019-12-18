<!-- FreeMarker Macros -->
<#import "/spring.ftl" as spring/>
<html>
<head>
    <title>Person List</title>
    <link rel="stylesheet"
          type="text/css"
          href="<@spring.url '/css/style.css'/>"/>
</head>
<body>
<h3>Person List</h3>
<a href="/addEmp">Add Person</a>
<br><br>
<div>

    <table border="1">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Phone</th>
        </tr>
        <#if list??>
        <#list list as staff>
            <tr>
                <td>${staff.idStaff}</td>
                <td>${staff.name}</td>
                <td>${staff.phone}</td>
            </tr>
        </#list>
        </#if>
    </table>
</div>
</body>
</html>