<%-- 
    Document   : welcome
    Created on : Mar 7, 2017, 6:58:30 PM
    Author     : Otema
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <link rel="stylesheet"href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
        <title>Home|Welcome</title>
        <link rel="shortcut icon" href="/resources/images/logo.png" type="image/x-icon"/>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link href="https://fonts.googleapis.com/css?family=Merriweather|Roboto|Roboto+Slab" rel="stylesheet"> 
        <link rel="stylesheet" href="<c:url value="/resources/css/style.css" />"></script>
    <!-- Bootstrap Date-Picker Plugin -->
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/js/bootstrap-datepicker.min.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/css/bootstrap-datepicker3.css"/>
    <!--  JavaScript -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="https://use.fontawesome.com/e00b541afd.js"></script>
    <script type="text/javascript" src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
    <script src="<c:url value="/resources/js/Displays.js" />"></script>  
</head>
<body>
    <div class="container well">
        <canvas id="clock" height="100" width="100" class="clock"> </canvas>
        <h1 class="text-center" style="color: #000033; font-family: Merriweather Sans-serif;"> ${greeting} </h1>
        <h3 class="text-center"> ${tagline} </h3>
    </div>
    <section class="navigation">
        <div class="navbar navbar-inverse navbar-static-top my-navbar" data-spy="affix" data-offset-top="197">
            <div class="container">
                <a href="https://www.facebook.com/O2JOSE" class="navbar-brand"><image src="<c:url value="/resources/images/logo.png" />" alt="Otema" class="image-responsive image-medium"/> </a>
                <button class="navbar-toggle" data-toggle="collapse" data-target=".navHeaderCollapse">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <div class="collapse navbar-collapse navHeaderCollapse">
                    <ul class="nav navbar-nav navbar-right">
                        <li class="active"><a href="welcome.jsp">Home</a></li>
                        <li class="dropdown">
                            <a data-target="" href="" data-toggle="dropdown" class="dropdown-toggle">Products <b class="caret"></b></a>
                            <ul class="dropdown-menu">
                                <li><a href="#">Education</a></li>
                                <li><a href="#">Agriculture</a></li>
                                <li><a href="#">Transport</a></li>
                                <li><a href="#">Property Management</a></li>
                                <li><a href="#">Technology</a></li>
                            </ul>
                        </li>
                        <li><a href="" onclick="displayLogin()">Login</a>
                        <li><a href="#">Contact us</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </section>
    <div class="container well">
        <div class="rows">
            <div class="col-md-3 well">
                <p><b>Welcome to  </b></p><p>
                    This system allows Investigators to submit their proposals/protocols/projects electronically.
                    <br> Investigators can follow their proposals/protocols/projects’ progress through the review process.</p>
                <p><b class="bg-note">New users:</b> Please click <a href="">Register Now</a> and enter the requested information. Upon successful registration, you will be sent an email with instructions and your log-in information.</p>
                <p><b class="bg-note">Existing users:</b> Do not register again. Simply enter your username and password and click the Investigator log in button. If you have forgotten your details please click <a href="">Forgot Password.</a></p>
                <p><b class="bg-note"> </b> 
            </div>
            <div class="col-md-6 well">

            </div>
            <div class="col-md-3 well"
                 <form action="pages/process1.php" method="post" accept-charset="UTF-8" id="login" style="display:none;">
                    <div class="form-group">
                        <label for="username">User Name/Email</label>
                        <input type="email" name="username" class="form-control" id="username" placeholder="user name/email" autocomplete="on">
                    </div>
                    <div class="form-group">
                        <label for="userPassword">Password</label>
                        <input type="password" name="password" class="form-control" id="userPassword" placeholder="Password">
                    </div>
                    <div class="form-group">
                        <input type="submit" class="form-control btn-primary" id="login" value="Login">
                        <label for="forgotpassword"><a href="">Forgot Password?</a></label>
                    </div>
            </div>
        </div>
    </div>
    <section>
        <div class="container-fluid well">
            <p style="float:left;">${copyrightyear}</p>
            <p style="float: right;">${loadtime}</p>
        </div>
    </section>
    <script src="<c:url value="/resources/js/Clock.js" />"></script>
</body>
</html>
