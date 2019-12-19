<!-- FreeMarker Macros -->
<#import "/spring.ftl" as spring/>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <title>Add employee</title>
    <link rel="stylesheet"
          type="text/css"
          href="<@spring.url '/css/style.css'/>"/>
</head>
<body>
<a class="btn btn-dark" href="/showAllEmp" role="button">Back</a>
<fieldset>
    <legend>Add employee</legend>
    <form name="nstaff" action="" method="POST">
        Name: <@spring.formInput "nstaff.name" "" "text"/>    <br/>
        Phone: <@spring.formInput "nstaff.phone" "" "text"/>    <br/>
        <input type="submit" value="Create" />
    </form>
</fieldset>
<#--<a href="/showAllEmp" >Submit</a>-->
</body>
</html>