<%-- 
    Document   : products
    Created on : Mar 16, 2017, 7:11:15 PM
    Author     : Otema
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Products</title>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet"href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
        <link rel="shortcut icon" href="/resources/images/logo.png" type="image/x-icon"/>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link href="https://fonts.googleapis.com/css?family=Merriweather|Roboto|Roboto+Slab" rel="stylesheet"> 
        <link rel="stylesheet" href="<c:url value="/resources/css/style.css" />"></script>
    <!-- Bootstrap Date-Picker Plugin -->
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/js/bootstrap-datepicker.min.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/css/bootstrap-datepicker3.css"/>

    <!--  JavaScript -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="https://use.fontawesome.com/e00b541afd.js"></script>

    <!-- Include jQuery -->
    <script type="text/javascript" src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
    <script src="<c:url value="/resources/js/myfunctions.js" />"></script>

    <!-- Include Date Range Picker -->
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/js/bootstrap-datepicker.min.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/css/bootstrap-datepicker3.css"/>
</head>
<body>
    <section>
        <div class="jumbotron">
            <div class="container">
                <h1 class="text-center">Products</h1>
                <h3 class="text-center">All the available products in our store</h3>
            </div>
        </div>
    </section>
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
                        <li><a href="welcome.jsp">Home</a></li>
                        <li class="active"><a href="">Products</a></li>
                        <li><a href="#" onclick="displayLogin()">Login</a>
                        <li><a href="#">Contact us</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </section>
       <section>
      <div class="jumbotron">
        <div class="container">
          <h1>Products</h1>
          <p>All the available products in our store</p>
        </div>
      </div>
    </section>
    <section class="container">
      <div class="row">
        <c:forEach items="${products}" var="product">
          <div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
            <div class="thumbnail">
              <div class="caption">
                <h3>${product.name}</h3>
                <p>${product.description}</p>
                <p>$${product.unitPrice}</p>
                <p>Available ${product.unitsInStock} units in stock</p>
              </div>
            </div>
          </div>
        </c:forEach>
      </div>
    </section>
    <section>
        <div class="container-fluid well">
            <p style="float:left;">${copyrightyear}</p>
            <p style="float: right;">${loadtime}</p>
        </div>
    </section>
</body>
</html>