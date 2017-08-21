<%@ page language="java" contentType="text/html; charset=UTF=8" pageEncoding="UTF-8"%>
<%@ include file="include/importTags.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Inscription</title>
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
	
	<form:form  id="form"
				method="POST"
				action="/divingshop/userInscription/send"
				modelAttribute="currentUser">
				
		<form:label path="login">${listPage[1].getText()}* :</form:label>
		<form:input path="login" required="true"/>
		<br/>
		<form:label path="password">${listPage[2].getText()}* :</form:label>
		<form:input type="password" path="password" required="true"/>
		<br/>
		<form:label path="confirmationPassword">${listPage[3].getText()}* :</form:label>
		<form:input type="password" path="confirmationPassword" required="true"/>
		<br/>		
		<form:label path="firstName">${listPage[4].getText()}* :</form:label>
		<form:input path="firstName" required="true"/>
		<br/>
		<form:label path="lastName">${listPage[5].getText()}* :</form:label>
		<form:input path="lastName" required="true"/>
		<br/>
		<form:label path="address">${listPage[6].getText()}* :</form:label>
		<form:input path="address" required="true"/>
		<br/>
		<form:label path="email">${listPage[7].getText()} *:</form:label>
		<form:input path="email"/>
		<br/>
		<form:label path="mobilePhoneNumber">${listPage[8].getText()}* :</form:label>
		<form:input path="mobilePhoneNumber" required="true"/>			
		<br/>
		<form:label path="phoneNumber">${listPage[9].getText()} :</form:label>
		<form:input path="phoneNumber"/>
		<br/>
		<p>* ${listPage[10].getText()}</p>
		<form:button >${listPage[11].getText()}</form:button>
	</form:form>
	
</html>