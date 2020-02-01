<%@ include file="header.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
    <head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
    </head>
    <body>
    <div class="container">    
  		<div class="row">
        <h3>Enter Delivery Details</h3>
        <form:form method="POST"
          action="/createOrder" modelAttribute="order">
             <table>
                <tr>
                    <td><form:label path="email" class =".control-label">EmailId</form:label></td>
                    <td><form:input path="email"/></td>
                </tr>
                <tr>
                    <td><form:label path="address">StreetAddress</form:label></td>
                    <td><form:input path="address"/></td>
                </tr>
                <tr>
                    <td><form:label path="pincode">
                      Pin Code</form:label></td>
                    <td><form:input path="pincode"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Place Order"/></td>
                </tr>
            </table>
        </form:form>
          </div>
</div><br>
    </body>
</html>