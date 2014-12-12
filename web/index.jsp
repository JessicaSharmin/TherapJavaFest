<%@page import="domain.userInfo"%>
<!doctype html>
<html class="no-js">

	<head>
		<meta charset="utf-8"/>
		<title>EVENT PLANNER</title>
		 
		<!--[if lt IE 9]>
			<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
		<![endif]-->
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
		
		<!-- flexslider -->
		<link rel="stylesheet" href="css/flexslider.css" >
		<script src="js/jquery.flexslider.js"></script>

	</head>
	
	<%userInfo user=(userInfo)request.getSession().getAttribute("user");
                session.setAttribute("user", user);
                %>	
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
                                                        <li><a href="bookingConference.jsp">Booking For Conference</a></li>
						</ul>
                                        </li>
					<li><a href="contact.jsp">CONTACT</a></li>
                                        <li><a href="login.jsp"><% if(user==null) out.println("LOGIN"); else out.println("LOGOUT"); %></a></li>
				</ul>
                                <div id="combo-holder"></div>
				<!-- ends nav -->
				
				
				<!-- SLIDER -->				
				<div id="home-slider" class="lof-slidecontent">
					
					<div class="preload"><div></div></div>
					
					<!-- slider content --> 
					<div class="main-slider-content" >
					<ul class="sliders-wrap-inner">
					    <li>
					          <img src="img/dummies/slides/01.jpg" title="" alt="alt" />           
					          
					    </li>
					    
					    <li>
					          <img src="img/dummies/slides/02.jpg" title="" alt="alt" />           
					          
					    </li>
					    
					    <li>
					          <img src="img/dummies/slides/03.jpg" title="" alt="alt" />           
					          
					    </li>
					    
					    <li>
					          <img src="img/dummies/slides/04.jpg" title="" alt="alt" />           
					          
					    </li>
					    
					    <li>
					          <img src="img/dummies/slides/05.jpg" title="" alt="alt" />           
					          
					    </li>
					    
					    <li>
					          <img src="img/dummies/slides/06.jpg" title="" alt="alt" />    
					    </li>
					    <li>
					          <img src="img/dummies/slides/07.jpg" title="" alt="alt" /> 
					    </li>
					  </ul>  	
					</div>
					<!-- ENDS slider content --> 
				           
					<!-- slider nav -->
					<div class="navigator-content">
					  <div class="navigator-wrapper">
					        <ul class="navigator-wrap-inner">
					           <li><img src="img/dummies/slides/01_thumb.jpg" alt="alt" /></li>
					           <li><img src="img/dummies/slides/02_thumb.jpg" alt="alt" /></li>
					           <li><img src="img/dummies/slides/03_thumb.jpg" alt="alt" /></li>
					           <li><img src="img/dummies/slides/04_thumb.jpg" alt="alt" /></li>
					           <li><img src="img/dummies/slides/05_thumb.jpg" alt="alt" /></li>
					           <li><img src="img/dummies/slides/06_thumb.jpg" alt="alt" /></li>
					           <li><img src="img/dummies/slides/07_thumb.jpg" alt="alt" /></li>
					        </ul>
					  </div>
					  <div class="button-next">Next</div>
					  <div  class="button-previous">Previous</div>
					  <!-- REMOVED TILL FIXED <div class="button-control"><span>STOP</span></div> -->
					</div> 
					<!-- slider nav -->         
				 </div> 
				<!-- ENDS SLIDER -->

			</div>
		</header>
		<!-- ENDS HEADER -->
		
		<!-- MAIN -->
		<div id="main">
			<div class="wrapper cf">
	
			<!-- featured -->
			<div class="home-featured">
            		<!-- Filter container -->
				<div id="filter-container" class="cf">
					<figure>
						<img src="img/dummies/featured/01_thumb.jpg" alt="alt" class="thumb"/>
						<figcaption>
							<h3 class="heading">About Us</h3>
                                                        <p>Our event management company provides services for two types of event, wedding and conference management.</p>
                                                        <p>We provide a variety of packages providing decoration, transport, catering service for the events.</p>
                                                        <p>We customize event strategies to match your goals, budget and manpower resources. </p>
                                                            <p>We customize an event that best suits our client's needs.</p>
                                                </figcaption>
					</figure>
					
					<figure>
						<img src="img/dummies/featured/pro1.jpg" alt="alt" class="thumb"/>
						<figcaption>
							<h3 class="heading">Site Created By</h3>
							<p>Jessica Sharmin Rahman</p>
                                                        <p>Session : 2011-12 (18th Batch)</p>
                                                        <p>Department of Computer Science & Engineering</p>
                                                        <p>University of Dhaka</p>
                                                </figcaption>
					</figure>
				
					<figure>
						<img src="img/dummies/featured/pro2.jpg" alt="alt" class="thumb"/>
						<figcaption>
							<h3 class="heading">Site Created By</h3>
							<p>Saidur Rahman Rifath</p>
                                                        <p>Session : 2011-12 (18th Batch)</p>
                                                        <p>Department of Computer Science & Engineering</p>
                                                        <p>University of Dhaka</p>
                                                </figcaption>
					</figure>
			
				</div><!-- ENDS Filter container -->	
			</div>
			<!-- ENDS featured -->

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
		
	</body>
	
	
	
</html>