<%@page import="domain.foodInfo"%>
<%@page import="dao.foodDao"%>
<%@page import="domain.photographerInfo"%>
<%@page import="dao.photographerDao"%>
<%@page import="domain.decorationInfo"%>
<%@page import="dao.decoratorDao"%>
<%@page import="domain.PackageInfo"%>
<%@page import="dao.PackageDao"%>
<%@page import="domain.placeInfo"%>
<%@page import="dao.placeDao"%>
<%@page import="domain.transportInfo"%>
<%@page import="dao.transportDao"%>
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
                                                        <li><a href="bookingConference.jsp">Booking For Wedding</a></li>
						</ul>
                                        </li>
					<li><a href="contact.jsp">CONTACT</a></li>
                                        <li><a href="login.jsp"><% if(user==null) out.println("LOGIN"); else out.println("LOGOUT"); %></a></li>
				</ul>
				<div id="combo-holder"></div>
				<!-- ends nav -->
                                <%
                                transportDao transport=transportDao.getInstance();
                                transportInfo transData[]=transport.getData();
                                placeDao place=placeDao.getInstance();
                                placeInfo placeData[]=place.getData();
                                PackageDao Package=PackageDao.getInstance();
                                PackageInfo PackageData[]=Package.getData();
                                decoratorDao decorator=decoratorDao.getInstance();
                                decorationInfo decoratorData[]=decorator.getData();
                                photographerDao photographer=photographerDao.getInstance();
                                photographerInfo photographerData[]=photographer.getData();
                                foodDao food=foodDao.getInstance();
                                foodInfo foodData[]=food.getData();
                                %>
		
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
                            <form  action="bookingWeddingController" autocomplete="on" method="post"> 
                                <h1> Conference Booking </h1> 
                                <p style="color: white; font-size: 16px"> 
                                    <label for="wedbookingtype" class="uname" >Booking Type:</label>
                                <select name="wedbookingtype">
                                        <option value="null"> Select One </option>
                                        <option value="complete"> Complete Package </option>
                                        <option value=custom> Customized Package </option>
                                </select>
                                    <br>
                                <br>
                                </p>
                                <p style="color: white;  font-size: 20px"> 
                                    <label for="weddingpackage" class="uname">Complete Package:</label>
                                    <br>
                                    <br>
                                    <select name="package">
                                        <option value="null"> Select One </option>
                                        <%
                                            int i;
                                            for(i=0;i<PackageData.length;i++)
                                            {
                                                if(PackageData[i].getPackageType().equals("wedding"))
                                                out.println("<option value=\""+PackageData[i].getPackageID()+"\">"+PackageData[i].getPackageID()+"("+PackageData[i].getPackageCost()+")"+"</option>");
                                            }
                                        %>
                                    </select>
                                </p>
                                <br>
                               
                                <p style="color: white;  font-size: 20px"> 
                                    <label for="weddingpackage2" class="uname">Customized Package:</label>
                                    <br>
                                    <br>
                                </p>
                                <p style="font-size: 16px">
                                    <label for="weddingdecoration" class="uname">Decoration Details:</label>
                                   
                                    <select style="position:absolute;left:35%;" name="decoration">
                                        <option value="null"> Select One </option>
                                        <%
                                            
                                            for(i=0;i<decoratorData.length;i++)
                                            {
                                                if(decoratorData[i].getdecorationType().equals("wedding"))
                                                out.println("<option value=\""+decoratorData[i].getdecorationID()+"\">"+decoratorData[i].getdecorationID()+"</option>");
                                            }
                                        %>
                                    </select>
                                </p>
                                <br>
                                <p style="font-size: 16px">
                                    <label for="weddingplace" class="uname">Place Details:</label>
                                    
                                    <select style="position:absolute;left:35%;" name="place">
                                        <option value="null"> Select One </option>
                                        <%
                                            
                                            for(i=0;i<placeData.length;i++)
                                            {
                                                if(placeData[i].getplaceType().equals("wedding"))
                                                out.println("<option value=\""+placeData[i].getplaceID()+"\">"+placeData[i].getplaceID()+"</option>");
                                            }
                                        %>
                                    </select>
                                </p>
                                
                               <br>
                                <p style="font-size: 16px">
                                    <label for="weddingtransport" class="uname">Transport:</label>
                                   
                                    <select style="position:absolute;left:35%;" name="transport">
                                        <option value="null"> Select One </option>
                                        <%
                                            
                                            for(i=0;i<transData.length;i++)
                                            {
                                                if(transData[i].gettransportType().equals("wedding"))
                                                out.println("<option value=\""+transData[i].gettransportID()+"\">"+transData[i].gettransportID()+"</option>");
                                            }
                                        %>
                                    </select>
                                </p>
                            <br>
                              <p style="font-size: 16px">
                                    <label for="weddingfood" class="uname">Food Details:</label>
                                   
                                    <select style="position:absolute;left:35%;" name="food">
                                        <option value="null"> Select One </option>
                                        <%
                                            
                                            for(i=0;i<foodData.length;i++)
                                            {
                                                if(foodData[i].getfoodType().equals("wedding"))
                                                out.println("<option value=\""+foodData[i].getfoodID()+"\">"+foodData[i].getfoodID()+"</option>");
                                            }
                                        %>
                                    </select>
                                </p>
                            <br>    
                                <p style="font-size: 16px">
                                    <label for="weddingphotography" class="uname">Photography Details:</label>
                                    
                                    <select style="position:absolute;left:35%;" name="photographer">
                                        <option value="null"> Select One </option>
                                        <%
                                            
                                            for(i=0;i<photographerData.length;i++)
                                            {
                                                if(photographerData[i].getphotographerType().equals("wedding"))
                                                out.println("<option value=\""+photographerData[i].getphotographerID()+"\">"+photographerData[i].getphotographerID()+"</option>");
                                            }
                                        %>
                                    </select>
                                </p>
                                <br>
                                
                                
                            <br>    
                                <p class="signin button"> 
									<input type="submit" value="Submit booking"/> 
								</p>
                                
                            </form>
                            <script>
                    function disable1()
                    {
                        if(document.getElementById("package").checked) document.getElementById("custom").checked=false;
                        else document.getElementById("custom").checked=true;
                    }
                    function disable2()
                    {
                        if(document.getElementById("custom").checked) document.getElementById("package").checked=false;
                        else document.getElementById("package").checked=true;
                    }
                    </script>
                        </div>
                    </div>
                </div>  
            </section>
                    </div>
                </div>                  
                        
</body>
	
	
	
</html>