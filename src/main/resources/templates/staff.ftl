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
<a href="addStaff">Add Person</a>
<br><br>
<div>

    <table border="1">
        <tr>
            <th>Name</th>
            <th>Phone</th>
        </tr>
        <#list list as staff>
            <tr>
                <td>${staff.name}</td>
                <td>${staff.phone}</td>
            </tr>
        </#list>
    </table>
</div>
</body>
</html>