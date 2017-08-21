<%@ page language="java" contentType="text/html; charset=UTF=8" pageEncoding="UTF-8"%>
<%@ include file="include/importTags.jsp" %>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>DivingShop</title>
	<style>
		#dive {			
			width:150px;
			height:150px;;
		}
		.slide-image{
			height:300px;
			witdht:800px;
		}
		
	</style>
</head>
<body>
	<!-- Page Content -->
    <div class="container">
        <div class="row">
            <div class="col-md-3">
            
                </div>
         </div>
            <div class="col-md-9">
                <div class="row carousel-holder">
                    <div class="col-md-12">
                        <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
                            <ol class="carousel-indicators">
                                <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                                <li data-target="#carousel-example-generic" data-slide-to="1"></li>
                                <li data-target="#carousel-example-generic" data-slide-to="2"></li>
                            </ol>
                            <div class="carousel-inner">
                                <div class="item active">
                                    <img src='<spring:url value="/images/divehomepage1.jpg"/>'/>
                                </div>
                                <div class="item">
                                    <img src='<spring:url value="/images/divehomepage2.jpg"/>'/>
                                </div>
                                <div class="item">
                                    <img src='<spring:url value="/images/divehomepage3.jpg"/>'/>
                                </div>
                            </div>
                            
                        </div>
                    </div>

                </div>

                <div class="row">
                
        			<div class="featured-info">			
			
						<form:form method="POST"
							action="/divingshop/welcome/product"
							modelAttribute="product">
							
								<c:forEach items="${listproduct}" var="product">
											
											
									<div class="col-sm-4 col-lg-4 col-md-4">
				                        <div class="thumbnail">
				                            <img id="dive" src='<spring:url value="/images/${product.imgProduct}"/>'>
				                            <div class="caption">
				                                <h4 class="pull-right">${product.price}€</h4>
				                                <h4><a href="#">${product.label}</a></h4>
				                                
				                                <p>${product.marque} : ${product.model}</p>
				                                
				                                <form:button name="idProduct" value="${product.idProduct}">Information</form:button>
				                            </div>
				                            
				                        </div>
				                        
				                    </div>
								
								</c:forEach>
											
						</form:form>				
				
					</div>
		

                </div>

            </div>
            
            

        </div>
        
        
            
            
        

 
</body>
</html>