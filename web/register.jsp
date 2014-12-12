<!doctype html>
<html class="no-js">

	<head>
		<meta charset="utf-8"/>
		<title>EVENT PLANNER</title>
		 
		<!--[if lt IE 9]>
			<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
		<![endif]-->
		<link rel="stylesheet" media="all" href="css/style.css"/>
                <link rel="stylesheet" media="all" href="css/style2.css"/>
		<meta name="viewport" content="width=device-width, initial-scale=1"/>
		<!-- Adding "maximum-scale=1" fixes the Mobile Safari auto-zoom bug: http://filamentgroup.com/examples/iosScaleBug/ -->		
				
		<!-- JS -->
		<script src="js/jquery-1.7.1.min.js"></script>
		<script src="js/custom.js"></script>
		<script src="js/tabs.js"></script>
		<script src="js/css3-mediaqueries.js"></script>
		<script src="js/jquery.columnizer.min.js"></script>
		
		<!-- Isotope -->
		<script src="js/jquery.isotope.min.js"></script>
		
		<!-- Lof slider -->
		<script src="js/jquery.easing.js"></script>
		<script src="js/lof-slider.js"></script>
		<link rel="stylesheet" href="css/lof-slider.css" media="all"  /> 
		<!-- ENDS slider -->
		
		<!-- Tweet -->
		<link rel="stylesheet" href="css/jquery.tweet.css" media="all"  /> 
		<script src="js/tweet/jquery.tweet.js" ></script> 
		<!-- ENDS Tweet -->
		
		<!-- superfish -->
		<link rel="stylesheet" media="screen" href="css/superfish.css" /> 
		<script  src="js/superfish-1.4.8/js/hoverIntent.js"></script>
		<script  src="js/superfish-1.4.8/js/superfish.js"></script>
		<script  src="js/superfish-1.4.8/js/supersubs.js"></script>
		<!-- ENDS superfish -->
		
		<!-- prettyPhoto -->
		<script  src="js/prettyPhoto/js/jquery.prettyPhoto.js"></script>
		<link rel="stylesheet" href="js/prettyPhoto/css/prettyPhoto.css"  media="screen" />
		<!-- ENDS prettyPhoto -->
		
		<!-- poshytip -->
		<link rel="stylesheet" href="js/poshytip-1.1/src/tip-twitter/tip-twitter.css"  />
		<link rel="stylesheet" href="js/poshytip-1.1/src/tip-yellowsimple/tip-yellowsimple.css"  />
		<script  src="js/poshytip-1.1/src/jquery.poshytip.min.js"></script>
		<!-- ENDS poshytip -->
		
		<!-- JCarousel -->
		<script type="text/javascript" src="js/jquery.jcarousel.min.js"></script>
		<link rel="stylesheet" media="screen" href="css/carousel.css" /> 
		<!-- ENDS JCarousel -->
		
		<!-- GOOGLE FONTS -->
		<link href='http://fonts.googleapis.com/css?family=Voltaire' rel='stylesheet' type='text/css'>

		<!-- modernizr -->
		<script src="js/modernizr.js"></script>
		
		<!-- SKIN -->
		<link rel="stylesheet" media="all" href="css/skin.css"/>
		
		<!-- Less framework -->
		<link rel="stylesheet" media="all" href="css/lessframework.css"/>
		
		<!-- flexslider -->
		<link rel="stylesheet" href="css/flexslider.css" >
		<script src="js/jquery.flexslider.js"></script>

	</head>
	
	
	<body class="home">
	
		<!-- HEADER -->
		<header>
			<div class="wrapper cf">
				
				<div id="logo">
					<a href="index.html"><img  src="img/logo.png" alt="Simpler"></a>
				</div>
				
				<!-- nav -->
				<ul id="nav" class="sf-menu">
					<li class="current-menu-item"><a href="index.jsp">HOME</a></li>
					
					<li><a href="#">WEDDING PLAN</a>
                                                <ul>
							<li><a href="packageWeddingDetails.jsp">Full Package Details</a></li>
							<li><a href="decorationWeddingDetails.jsp">Decoration Details</a></li>
							<li><a href="transportWeddingDetails.jsp">Transport Details</a></li>
                                                        <li><a href="placeWeddingDetails.jsp">Place Details</a></li>
                                                        <li><a href="foodWeddingDetails.jsp">Food Details</a></li>
                                                        <li><a href="photographerWeddingDetails.jsp">Photographer Details</a></li>
                                                        <li><a href="bookingWedding.jsp">Booking For Wedding</a></li>
						</ul>
                                        
                                        </li>
                                        <li><a href="#">CONFERENCE PLAN</a>
                                                <ul>
							<li><a href="packageConferenceDetails.jsp">Full Conference Package Details</a></li>
							<li><a href="decorationConferenceDetails.jsp">Decoration Details</a></li>
							<li><a href="transportConferenceDetails.jsp">Transport Details</a></li>
                                                        <li><a href="placeConferenceDetails.jsp">Place Details</a></li>
                                                        <li><a href="foodConferenceDetails.jsp">Food Details</a></li>
                                                        <li><a href="photographerConferenceDetails.jsp">Photographer Details</a></li>
                                                        <li><a href="bookingConference.jsp">Booking For Wedding</a></li>
						</ul>
                                        </li>
					<li><a href="contact.jsp">CONTACT</a></li>
                                        <li><a href="login.jsp">LOGIN</a></li>
				</ul>
				<div id="combo-holder"></div>
				<!-- ends nav -->
				
		
		<!-- MAIN -->
                <div id="main">
                    <div class="wrapper cf">
		<section>				
                <div id="container_demo" >
                    <!-- hidden anchor to stop jump http://www.css3create.com/Astuce-Empecher-le-scroll-avec-l-utilisation-de-target#wrap4  -->
                    <a class="hiddenanchor" id="toregister"></a>
                    <a class="hiddenanchor" id="tologin"></a>
                    <div id="wrapper">
                        <div id="to" class="animate form">
                            <form  action="registerController" autocomplete="on" method="post"> 
                                <h1> Sign up </h1> 
                                <p> 
                                    <label for="usernamesignup" class="uname" data-icon="u">Your username</label>
                                    <input id="usernamesignup" name="userName" required="required" type="text" placeholder="mysuperusername690" />
                                </p>
                                <p> 
                                    <label for="fullnamesignup" class="uname" data-icon="u">Your Full Name</label>
                                    <input id="fullnamesignup" name="fullName" required="required" type="text" placeholder="MR.ABCD" />
                                </p>
                                <p> 
                                    <label for="passwordsignup" class="youpasswd" data-icon="p">Your password </label>
                                    <input id="passwordsignup" name="password" required="required" type="password" placeholder="eg. X8df!90EO"/>
                                </p>
                                <p> 
                                    <label for="passwordsignup_confirm" class="youpasswd" data-icon="p">Please confirm your password </label>
                                    <input id="passwordsignup_confirm" name="confirmpassword" required="required" type="password" placeholder="eg. X8df!90EO"/>
                                </p>
                                <p> 
                                    <label for="emailsignup" class="youmail" data-icon="e" > Your email</label>
                                    <input id="emailsignup" name="email" required="required" type="email" placeholder="mysupermail@mail.com"/> 
                                </p>
                                <p> 
                                    <label for="mobilesignup" class="youmail" data-icon="e" > Your mobile</label>
                                    <input id="mobilesignup" name="mobile" required="required" placeholder="mysupermail@mail.com"/> 
                                </p>
                                <p> 
                                    <label for="banknamesignup" class="youmail" data-icon="e" > Your Bank Name</label>
                                    <input id="banknamesignup" name="bankName" required="required" placeholder="HSBC Bank LTD"/> 
                                </p>
                                <p> 
                                    <label for="bankaccountsignup" class="youmail" data-icon="e" > Your Bank Account Number</label>
                                    <input id="bankaccountsignup" name="bankAccount" required="required"  placeholder="123456789"/> 
                                </p>
                                
                                <p class="signin button"> 
									<input type="submit" value="Sign up"/> 
								</p>
                                <p class="change_link">  
									Already a member ?
									<a href="login.jsp" class="to_register"> Go and log in </a>
								</p>
                            </form>
                        </div>
                    </div>
                </div>  
            </section>
                    </div>
                </div>
		<!-- ENDS MAIN		
	</body>
	
	
	
</html>