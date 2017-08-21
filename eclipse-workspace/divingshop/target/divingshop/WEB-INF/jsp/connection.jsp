<%@ page language="java" contentType="text/html; charset=UTF=8" pageEncoding="UTF-8"%>
<%@ include file="include/importTags.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="http://netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css" rel="stylesheet">
    <style type="text/css">
        body {
			margin: 0 auto; 
			text-align: center; 			
			}
    </style>
    <script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
    <script src="http://netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>

</head>
<body>
	<h2>${listPage[0].getText()}</h2>
	
	
				
		 <form:form id="connectionForm"
					method="POST"
					action="/divingshop/connection/send"
					modelAttribute="userlog">
					<form:input path="login" type="text" placeholder="${listPage[1].getText()}" required="true"/>
					<form:input path="password" type="password" placeholder="${listPage[2].getText()}" required="true"/>
					<form:button>${listPage[3].getText()}</form:button>
		</form:form>		
		
		
	
	
	
</body>
</html>