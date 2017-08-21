<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="include/importTags.jsp" %>

<html>
 <head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Home page</title>
 </head>
 <body> 
  <div class="container">
      <div class="row">
          <div class="col-sm-12 col-md-10 col-md-offset-1">
              <table class="table table-hover">
                  <thead>
                      <tr>
                          <th>${listPage[0].getText()}</th>
                          <th>${listPage[1].getText()}</th>
                          <th class="text-center">${listPage[2].getText()}</th>
                          <th class="text-center">${listPage[3].getText()}</th>
                          <th> </th>
                      </tr>
                  </thead>
                  <tbody>
                  
                  <c:forEach items="${orderContent}" var="orderContent">
                   <tr>
                          <td class="col-sm-8 col-md-6">
                          <div class="media">
                          		<h4 class="media-heading" >${orderContent.value.getLabel()}</h4>
                              <img class="media-object" style="width: 250px; height: 150px;" src='<spring:url value="/images/${orderContent.value.getImgProduct()}"/>' >
                              <div class="media-body">
                                  
                              </div>
                          </div></td>
                          <td class="col-sm-1 col-md-1" style="text-align: center">
                          <form:form  action="/divingshop/basket/modifyquantity" method="POST">
          						<input path="quantity" name="quantity" type="number" class="form-control" value="${orderContent.value.getQuantity()}" min="1" max="20" onchange="this.form.submit()">
          						<input type="hidden" name="idProduct" value="${orderContent.value.getProduct()}">        
                           </form:form>
                          </td>
                          <td class="col-sm-1 col-md-1 text-center"><strong>${orderContent.value.getPrice()}€</strong></td>
                          <td class="col-sm-1 col-md-1 text-center"><strong>${orderContent.value.getPrice()*orderContent.value.getQuantity()}€</strong></td>
                          <td class="col-sm-1 col-md-1">                       
                          
                          
                          <form:form  action="/divingshop/basket/delete" method="POST" commandName="cmd">
								    <input type="hidden" name="idprod" value="${orderContent.value.getProduct()}">
								    <button type="submit" class="btn btn-danger">
	                               			${listPage[4].getText()}
	                          		</button>
						 </form:form >
                          
                          
                          
                          </td>
                      </tr>
                      
                  </c:forEach>
                  
                                                              
                      <tr>
                          <td>   </td>
                          <td>   </td>
                          <td>   </td>
                          <td><h3>${listPage[5].getText()}</h3></td>
                          <td class="text-right"><h3><strong>${totPrice}€</strong></h3></td>
                      </tr>
                      <tr>
                          <td>   </td>
                          <td>   </td>
                          <td>   </td>
                          <td>
                          	<form:form method="POST"
								action="/divingshop/basket/welcome"
								modelAttribute="currentSession">
								
	                           <form:button  class="btn btn-default">
	                               ${listPage[6].getText()}
	                           </form:button>
	                       	</form:form>   
                          </td>
                          <td>
                          	
                          	<form:form method="POST"
								action="/divingshop/basket/valid"
								modelAttribute="currentSession">
                          	
                          	
	                           	<form:button class="btn btn-success">
	                               ${listPage[7].getText()} ! 
	                           	</form:button>
                          	</form:form>
                          
                          </td>
                      </tr>
                  </tbody>
              </table>
          </div>
      </div>
  </div>
 </body>
</html>