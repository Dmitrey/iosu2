<!-- FreeMarker Macros -->
<#import "/spring.ftl" as spring/>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <title class="text-lg-center">>Orders List</title>
    <link rel="stylesheet"
          type="text/css"
          href="<@spring.url '/css/style.css'/>"/>
</head>
<body>
<h1>Orders List</h1>
<h1></h1>
<p>

    <a class="btn btn-dark" href="/addOrder" role="button">Add Order</a>
    <a class="btn btn-dark" href="/" role="button">Back</a>

</p>
<br><br>
<div>
    <table class="table table-dark">
        <thead>
        <tr>
            <th>orderID</th>
            <th>customers</th>
            <th>serviceID</th>
            <th>staffID</th>
            <th>permission</th>
            <th>date</th>
            <th>vidName</th>
            <th>vidLength</th>
        </tr>

        <#if orderlist??>
            <#list orderlist as orlist>
                <tr>
                    <td>${orlist.orderID}</td>
                    <td>${orlist.customers}</td>
                    <td>${orlist.service}</td>
                    <td>${orlist.staff}</td>
                    <td>${orlist.permission}</td>
                    <td>${orlist.date}</td>
                    <td>${orlist.vidName}</td>
                    <td>${orlist.vidLength}</td>
                    <td><a href="/deleteOrder?id=${orlist.orderID}">Delete Order</a></td>
                </tr>
            </#list>
        </#if>
        </thead>
    </table>
</div>
</body>
</html>