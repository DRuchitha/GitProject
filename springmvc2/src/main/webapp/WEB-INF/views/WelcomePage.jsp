<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
    <head>
    <style>
    div{
    background-color:aqua;
    width:500px;
    height:200px;
    }
    span{
    color:red;
    }
    </style>
    </head>
    <body>
    <center>
        <h3 style=color:red>Welcome, Enter The User Details</h3>
        <form:form method="POST" 
          action="success" modelAttribute="register">
          <div>
          <br>
             <table>
                <tr>
                    <td><form:label path="name">Name</form:label></td>
                    <td><form:input path="name"/></td>
                    <span><td> <form:errors path="name"></form:errors></td></span>
                </tr>
                <tr>
                    <td><form:label path="age">Age</form:label></td>
                    <td><form:input path="age"/></td>
                   <span><td> <form:errors path="age"></form:errors></td></span>
                </tr>
                <tr>
                    <td><form:label path="email">
                      Email</form:label></td>
                    <td><form:input path="email"/></td>
                    <span><td> <form:errors path="email"></form:errors></td></span>
                </tr>
                 <tr>
                    <td><form:label path="country">
                      Country</form:label></td>
                    <td><form:input path="country"/></td>
                    <span><td> <form:errors path="country"></form:errors></td></span>
                </tr>
                
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
            </div>
        </form:form>
        </center>
    </body>
</html>