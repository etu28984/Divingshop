<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="include/importTags.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Insert title here</title>
	
	<style>
		#dive {						
			height:400px;;
		}
	</style>
	
	</head>
<body>

	<div class="container">

        <div class="row">

            <!-- Post Content Column -->
            <div class="col-lg-8">
				
				<form:form method="POST"
						action="/divingshop/product/basket"
						modelAttribute="orderContent">
					
				
				                <!-- Title -->
				                <h1 class="mt-4">${product.label}</h1>
				
				                <hr>
				
				                			
				                <!-- Preview Image -->
				                <img id="dive" src='<spring:url value="/images/${product.imgProduct}"/>'>
				
				                <hr>
				
				                <!-- Post Content -->
				                <p>${product.marque}</p>
				                <p>${product.model}</p>
				                <p>${product.description}</p>
				                <h2>${product.price}€</h2>
				                <form:input path="imgProduct" type="hidden" value="${product.imgProduct}"/>
				                <form:input path="label" type="hidden" value="${product.label}"/>
				                <form:input path="englishLabel" type="hidden" value="${product.englishLabel}"/>
				                <form:input path="price" type="hidden" value="${product.price}"/>
				                <form:input path="product" type="hidden" value="${product.idProduct}"/>
				                <form:input path="quantity" type="number" value="1" class="form-control" min="1" max="20"/>
				                <br/>
				               
                				<form:button name="idProduct" value="${product.idProduct}">Buy it !</form:button>

                
               
				</form:form>
               

            </div>

            

                

                

            </div>

        </div>
        <!-- /.row -->

    </div>
    <!-- /.container -->

    <!-- Footer -->
    

    <!-- Bootstrap core JavaScript -->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/tether/tether.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.min.js"></script>

</body>
</html>