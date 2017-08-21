<%@ include file="../include/importTags.jsp"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Diving Shop</title>

    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/shop-homepage.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    
    <style>
    	.langage{			
			width:30px;
			height:30px;;
		}
		
    </style>

</head>

<body>

    <!-- Navigation -->
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="/divingshop/welcome">${listMenu[0].getText()}</a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                	<li>
                		
									
							<script>
							var login = "<c:out value='${currentSession.getCurrentUser().getLogin()}'/>";
							
							if(login==""){
								document.write('<li>'+'<a href="/divingshop/userInscription">${listMenu[3].getText()}</a>'+'</li>');
								document.write('<li>'+'<a href="/divingshop/connection">${listMenu[4].getText()}</a>'+'</li>');
								}
											
							else{document.write('<li>'+'<a>'+'Hello '+login+' !'+'</a>'+'</li>');
							};
							
							
							</script>						
							
                	
                	</li>
                
                    
                    <li>
                         <a href="/divingshop/about">${listMenu[2].getText()}</a>
                     </li>
                    <li>
                        <a href="/divingshop/basket">${listMenu[1].getText()}</a>
                    </li>
                    <li>
                    	<a href="/divingshop/language?idLanguage=1"><img src='<spring:url value="/images/francais.png"/>'class="langage"></a>
                      </li>  
                       <li>
                          <a href="/divingshop/language?idLanguage=2"><img src='<spring:url value="/images/anglais.png"/>'class="langage"></a>
                      </li>
                    
                   
                    
                    
                    
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>

    <!-- Page Content -->
		<div>
			<tiles:insertAttribute name="main-content"/>
		</div>
    <!-- /.container -->

    <div class="container">

        <hr>

        <!-- Footer -->
        <footer>
            <div class="row">
                <div class="col-lg-12">
                    <p>Copyright Matthieu Lhote; Java Web 2017</p>
                    <form:form method="GET"
									action="/divingshop/welcome/deconnection">

									<script>
										if(login!=""){document.write(`<input type='submit' value='${listMenu[5].getText()}'>`);}
									</script>
								
					</form:form>
                </div>
            </div>
            
        </footer>

    </div>
    <!-- /.container -->

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

</body>

</html>