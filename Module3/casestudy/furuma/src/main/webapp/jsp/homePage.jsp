<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Home Page</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="../assert/bootstrap413/css/bootstrap.min.css">
    <link rel="stylesheet" href="../assert/datatables/css/dataTables.bootstrap4.min.css">
    <link href="https://use.fontawesome.com/releases/v5.0.4/css/all.css" rel="stylesheet">
    <link href="../assert/css/styleCSS.css" rel="stylesheet">

</head>
<body>

<!-- Navigation -->
<nav class="navbar navbar-expand-md navbar-light bg-light sticky-top">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">
            <img src="../assert/img/logo1.png" height="50">
        </a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item">
                    <a class="nav-link active" href="#">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Employee</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Customer</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Service</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Contract</a>
                </li>
            </ul>
            <form class="form-inline my-2 my-lg-0">
                <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
            </form>
        </div>
    </div>
</nav>
<!--Carousel-->
<div id="sliders" class="carousel sliders" data-ride="carousel">
    <ul class="carousel-indicators">
        <li data-target="#sliders" data-slide-to="0" class="active"></li>
        <li data-target="#sliders" data-slide-to="1"></li>
        <li data-target="#sliders" data-slide-to="2"></li>
        <li data-target="#sliders" data-slide-to="3"></li>
    </ul>
    <div class="carousel-inner">
        <div class="carousel-item active">
            <img src="../assert/img/body1.jpg">
            <div class="carousel-caption">
                <h1 class="display-2"> Welcome To Furuma Resort</h1>
                <h3>5 Star Resort</h3>
                <button type="button" class="btn btn-outline-light btn-lg">
                    VIEW FURUMA RESORT
                </button>
                <button type="button" class="btn btn-primary btn-lg">Get started</button>
            </div>
        </div>
        <div class="carousel-item">
            <img src="../assert/img/body2.jpg">
        </div>
        <div class="carousel-item">
            <img src="../assert/img/body3.jpg">
        </div>
        <div class="carousel-item">
            <img src="../assert/img/body4.jpg">
        </div>
    </div>
</div>
<!-- jumbotron-->
<div class="container-fluid">
    <div class="jumbotron">
        <div class="col-xs-12 col-sm-12 col-md-9 col-lg-9 col-xl-10">
            <p>KHU NGHỈ DƯỠNG ĐẲNG CẤP THẾ GIỚI, FURAMA ĐÀ NẴNG, NỔI TIẾNG LÀ KHU NGHỈ DƯỠNG ẨM THỰC TẠI VIỆT NAM.</p>
        </div>
    </div>
</div>
<div class="container-fluid padding">
    <div class="row welcome text-center">
        <div class="col-4"></div>
        <div class="col-4">
            <h1 class="display-4">CÁC LOẠI PHÒNG</h1>
        </div>
        <div class="col-4"></div>
        <div class="col-4"></div>
        <div class="col-4">
            <p>Khu nghỉ dưỡng có 196 phòng được thiết kế theo phong cách truyền thống Việt Nam kết hợp
                với phong cách Pháp, 2 tòa nhà 4 tầng có hướng nhìn ra biển, nhìn ra hồ bơi trong xanh
                và những khu vườn nhiệt đới xanh tươi mát. Ngoài ra, khu nghỉ dưỡng Furama còn cung cấp
                các liệu pháp spa, phòng xông hơi ướt, phòng xông hơi khô, dịch vụ mát-xa cạnh hồ bơi,
                các dịch vụ thể thao dưới nước và các lớp tập yoga và Thái Cực Quyền trên bãi biển.</p>
        </div>
        <div class="col-12">
            <a href="#">
                <button type="button" class="btn btn-outline-secondary">View all Rooms</button>
            </a>
        </div>
    </div>
</div>

<footer>
    <div class="container-fluid padding">
        <div class="row text-center">
            <div class="col-md-4">
                <img src="../assert/img/logo2.png" style="height: 50px" width="100%">
                <hr class="light">
                <p>Tel.: 84-236-3847 333/888 * Fax: 84-236-3847 666</p>
                <p>Email: reservation@furamavietnam.com * www.furamavietnam.com</p>
                <p>103 - 105 Vo Nguyen Giap Street, Khue My Ward, Ngu Hanh Son </p>
                <p>District, Danang City, Vietnam</p>
            </div>
            <div class="col-md-4">
                <hr class="light">
                <h5>Working hours</h5>
                <hr class="light">
                <p>Monday-Friday: 8am - 5pm</p>
                <p>Weekend: 8am - 12am</p>
            </div>
            <div class="col-md-4">
                <hr class="light">
                <h5>Services</h5>
                <hr class="light">
                <p>Giá Công Bố</p>
                <p>Lifestyle Blog</p>
                <p>Tuyển Dụng</p>
            </div>
            <div class="col-12">
                <hr class="light-100">
                <h5>&copy; WebPro</h5>
            </div>
        </div>
    </div>
</footer>
<script src="../assert/jquery/jquery-3.5.1.min.js"></script>
<script src="../assert/datatables/js/jquery.dataTables.min.js"></script>
<script src="../assert/datatables/js/dataTables.bootstrap4.min.js"></script>
<script src="../assert/bootstrap413/js/bootstrap.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js">
</script>

</body>
</html>
