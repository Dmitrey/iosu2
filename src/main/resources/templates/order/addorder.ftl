<!-- FreeMarker Macros -->
<#import "/spring.ftl" as spring/>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <title>Add customer</title>
    <link rel="stylesheet"
          type="text/css"
          href="<@spring.url '/css/style.css'/>"/>
</head>
<body>
<a class="btn btn-dark" href="/showAllOrders" role="button">Back</a>
<fieldset>
    <legend>Add order</legend>
    <form name="norder" action="" method="POST">
        Customer Id: <@spring.formInput "norder.customers" "" "text"/>    <br/>
        Service Id: <@spring.formInput "norder.service" "" "text"/>    <br/>
        Staff Id: <@spring.formInput "norder.staff" "" "text"/>    <br/>
        Permission: <@spring.formInput "norder.permission" "" "text"/>    <br/>
        Date: <@spring.formInput "norder.date" "" "text"/>    <br/>
        Video name: <@spring.formInput "norder.vidName" "" "text"/>    <br/>
        Viedo length: <@spring.formInput "norder.vidLength" "" "text"/>    <br/>
        <input type="submit" value="Create" />
    </form>
</fieldset>
<#--<a href="/showAllEmp" >Submit</a>-->
</body>
</html>