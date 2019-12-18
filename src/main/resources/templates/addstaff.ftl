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
<fieldset>
    <legend>Add employee</legend>
    <form name="nstaff" action="" method="POST">
        Name: <@spring.formInput "nstaff.name" "" "text"/>    <br/>
        Phone: <@spring.formInput "nstaff.phone" "" "text"/>    <br/>
        <input type="submit" value="Create" />
    </form>
</fieldset>
<a href="/showAllEmp" >Submit</a>
</body>
</html>