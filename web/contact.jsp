<%@page import="domain.userInfo"%>
<!doctype html> 
<html class="no-js">

	<head>
		<meta charset="utf-8"/>
		<title>EVENT PLANNER</title>
		
		<link rel="stylesheet" media="all" href="css/style.css"/>
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
		
		<!-- jplayer -->
		<link href="player-skin/jplayer-black-and-yellow.css" rel="stylesheet" type="text/css" />
		<script type="text/javascript" src="js/jquery.jplayer.min.js"></script>
		
		<!-- flexslider -->
		<link rel="stylesheet" href="css/flexslider.css" >
		<script src="js/jquery.flexslider.js"></script>
		
		<!-- reply move form -->
		<script src="js/moveform.js"></script>
		
	</head>
	<%userInfo user=(userInfo)request.getSession().getAttribute("user");
                session.setAttribute("user", user);
                %>	
	
	<body class="page" onload="">
	
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
                                        <li><a href="login.jsp"><% if(user==null) out.println("LOGIN"); else out.println("LOGOUT"); %></a></li>
				</ul>
				<div id="combo-holder"></div>
				<!-- ends nav -->

			</div>
		</header>
		<!-- ENDS HEADER -->
		
		<!-- MAIN -->
		<div id="main">
			<div class="wrapper cf">
			
			
				
			<!-- page content-->
        	<div id="page-content" class="cf">        	
	        		
				
				<p><h3>CONTACT FORM</h3></p>
				<p>Use this contact form to get in touch with us.</p>
				<!-- form -->
				<form id="contactForm" action="contactController" method="post">
					<fieldset>
						<% 
                                                    if(user==null)
                                                    {
                                                        out.println("<p>");
                                                        out.println("<label for=\"name\" >Name</label>");
                                                        out.println("<input name=\"name\"  id=\"name\" type=\"text\" class=\"form-poshytip\" title=\"Enter your full name\" />");
                                                        out.println("</p>");
                                                        out.println("<p>");
                                                        out.println("<label for=\"email\" >Email</label>");
                                                        out.println("<input name=\"email\"  id=\"email\" type=\"text\" class=\"form-poshytip\" title=\"Enter your email address\" />");
                                                        out.println("</p>");
                                                        session.setAttribute("userID", "anonymous");
                                                    }
                                                    else
                                                    {
                                                    session.setAttribute("userID", user.getuserID());
                                                    session.setAttribute("name", user.getuserName());
                                                    session.setAttribute("email", user.getuserEmail());
                                                    
                                                    }
                                                %>								
                                                <p>
							<label for="subject" >Subject</label>
							<input name="subject"  id="email" type="text" class="form-poshytip" title="Enter your subject" />
						</p>
						
						<p>
							<label for="comments">Message</label>
							<textarea  name="comments"  id="comments" rows="5" cols="20" class="form-poshytip" title="Enter your comments"></textarea>
						</p>
						
						<p><input type="submit" value="Send" name="submit" id="submit" /></p>
					</fieldset>
					
				</form>
				<!-- ENDS form -->				
				
    		</div>
    		<!-- ENDS page content-->
		
			</div><!-- ENDS WRAPPER -->
		</div>
		<!-- ENDS MAIN -->
		
		
		<!-- FOOTER -->
		<footer>
			<div class="wrapper cf">
			<!-- bottom -->
				<div class="footer-bottom">
						<ul id="social-bar" class="cf sb">
							<li><a href="http://www.facebook.com"  title="Become a fan" class="facebook">Facebbok</a></li>
							<li><a href="http://www.twitter.com" title="Follow my tweets" class="twitter"></a></li>
							<li><a href="http://plus.google.com" title="Enter my circles" class="plus"></a></li>
						</ul>
				</div>	
				<!-- ENDS bottom -->
			
			</div>
		</footer>
		<!-- ENDS FOOTER -->
		
		<!-- Start google map -->
		<script>initialize();</script>
	
	</body>
	
	
	
</html>