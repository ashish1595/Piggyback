<%@ include file="header.jsp" %>
<html>
<head>
<title>PARTNER APP</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>

	<h3>Confirm Order</h3>
	<table class="table table-striped">
		<tr>
			<th>Option</th>
			<th>Id</th>
			<th>Name</th>
			<th>Description</th>
			<th>Price</th>
			<th>Seller</th>
			<th>Quantity</th>
			<th>Sub Total</th>
		</tr>
		<c:set var="total" value="0"></c:set>
		<c:forEach var="item" items="${sessionScope.cart }">
			<c:set var="total"
				value="${total + item.product.price * item.quantity}"></c:set>	
			<tr>
				<td align="center"><a
					href="${pageContext.request.contextPath }/cart/remove/${item.product.id }"
					onclick="return confirm('Are you sure?')">Remove</a></td>
				<td>${item.product.id }</td>
				<td>${item.product.name }</td>
				<td>${item.product.description }</td>
				<td>${item.product.price }</td>
				<td>${item.product.seller}</td>
				<td>${item.quantity }</td>
				<td>${item.product.price * item.quantity }</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="7" align="right"><button type="button"
           onClick="location.href='${pageContext.request.contextPath }promo/' ">Apply Promo Code</button></td>
           <c:set var="codeValue"  value="${sessionScope.codeValue }"/>
           <td colspan="7" align="right"><input type= text name ="offer code"/></td>
		</tr>
		<tr>
			<td colspan="7" align="right">Sum</td>
			<td>${total - codeValue }</td>
		</tr>
	</table>
	<br>
	<a href="${pageContext.request.contextPath }/products/all">Continue
		Shopping</a>
	<div class="panel-footer"> <button type="button" class="btn btn-primary btn-md"
           onClick="location.href='${pageContext.request.contextPath }/order' ">Check Out</button></div>
</body>
</html>