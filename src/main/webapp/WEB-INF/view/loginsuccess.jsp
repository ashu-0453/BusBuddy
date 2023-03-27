<!DOCTYPE html>
    <html lang="en">
    
    <head>
        <meta charset="utf-8">
        <title>BUS BUDDY - Book Anywhere, Travel Anywhere</title>
        <meta content="width=device-width, initial-scale=1.0" name="viewport">
        <meta content="Free HTML Templates" name="keywords">
        <meta content="Free HTML Templates" name="description">
    
        <!-- Favicon -->
        <link href="img/favicon.ico" rel="icon">
    
        <!-- Google Web Fonts -->
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600;700&display=swap" rel="stylesheet"> 
    
        <!-- Font Awesome -->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">
    
        <!-- Libraries Stylesheet -->
        <link href="lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">
        <link href="lib/tempusdominus/css/tempusdominus-bootstrap-4.min.css" rel="stylesheet" />
    
        <!-- Customized Bootstrap Stylesheet -->
        <link href="css/style.css" rel="stylesheet">
    </head>
    
    <body>
        <!-- Topbar Start -->
        <div class="container-fluid bg-light pt-3 d-none d-lg-block">
            <div class="container">
                <div class="row">
                    <div class="col-lg-6 text-center text-lg-left mb-2 mb-lg-0">
                        <div class="d-inline-flex align-items-center">
                            <p><i class="fa fa-envelope mr-2"></i>busbuddy@gmail.com</p>
                            <p class="text-body px-3">|</p>
                            <p><i class="fa fa-phone-alt mr-2"></i>+91 6006026428</p>
                        </div>
                    </div>
                    <div class="col-lg-6 text-center text-lg-right">
                        <div class="d-inline-flex align-items-center">
                            <a class="text-primary px-3" href="">
                                <i class="fab fa-facebook-f"></i>
                            </a>
                            <a class="text-primary px-3" href="">
                                <i class="fab fa-twitter"></i>
                            </a>
                            <a class="text-primary px-3" href="">
                                <i class="fab fa-linkedin-in"></i>
                            </a>
                            <a class="text-primary px-3" href="">
                                <i class="fab fa-instagram"></i>
                            </a>
                            <a class="text-primary pl-3" href="">
                                <i class="fab fa-youtube"></i>
                            </a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Topbar End -->
    
    
        <!-- Navbar Start -->
        <div class="container-fluid position-relative nav-bar p-0">
            <div class="container-lg position-relative p-0 px-lg-3" style="z-index: 9;">
                <nav class="navbar navbar-expand-lg bg-light navbar-light shadow-lg py-3 py-lg-0 pl-3 pl-lg-5">
                    <a href="" class="navbar-brand">
                        <h1 class="m-0 text-primary"><span class="text-dark">BUS</span>BUDDY</h1>
                    </a>
                    <button type="button" class="navbar-toggler" data-toggle="collapse" data-target="#navbarCollapse">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse justify-content-between px-3" id="navbarCollapse">
                        <div class="navbar-nav ml-auto py-0">
                            <a href="/" class="nav-item nav-link active">Home</a>
                            <a href="about.html" class="nav-item nav-link">About</a>
    
                            <!-- <div class="nav-item dropdown">
                                <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown">Pages</a>
                                <div class="dropdown-menu border-0 rounded-0 m-0">
    
                                    <a href="User.html" class="dropdown-item">User</a>
                                    <a href="Reservation.html" class="dropdown-item">Reservation</a>
                                    <a href="Bus.html" class="dropdown-item">Bus Service</a>
                                    <a href="#" class="dropdown-item">Route</a>
                                    <a href="#" class="dropdown-item">Feedback</a>
                                </div>
                            </div> -->
    
                            <a href="contact.html" class="nav-item nav-link">Contact</a>
    
                            <div class="nav-item dropdown">
                                <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown">Account</a>
                                <div class="dropdown-menu border-0 rounded-0 m-0">
                                    <a href="loginAsUser.html" class="dropdown-item">User</a>
                                    <a href="loginAsAdmin.html" class="dropdown-item">Admin</a>
                                </div>
                            </div>
                            
    
                        </div>
                    </div>
                </nav>
            </div>
        </div>
        <!-- Navbar End -->
    
    
    
    
    
        <!-- Carousel Start -->
        <div class="container-fluid p-0">
            <div id="header-carousel" class="carousel slide" data-ride="carousel">
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img class="w-100" src="img/BusCarousel1.jpg" alt="Image" >
                        <div class="carousel-caption d-flex flex-column align-items-center justify-content-center">
    
    
                            <div class="searching">
                                <form:form action="/bus/listbusbysdd" method="get" modelAttribute="bus">
                               
                                <div class="form-group">
                                    <label for="source">From</label>
                                    <input type="text" id="source">
    
                                    <label for="destination">To</label>
                                    <input type="text" id="destination">
    
                                    <label for="date">Date</label>
                                    <input type="date" id="date">
    
                                    <!-- <button class="btn btn-lg btn-primary" id="submit" onclick="location.href ='bus/listbusbysdd'" >search</button> -->
    
                                    <button type="submit" class="btn btn-primary">Search</button>
                                </div>
                            </form:form>
                            </div>
    
                            
                            <br>
    
                            <div class="p-3" style="max-width: 900px;">
                                <h4 class="text-white text-uppercase mb-md-3">Tours & Travel</h4>
                                <h1 class="display-3 text-white mb-md-4">Let's Discover The World Together</h1>
                                <button class="btn btn-lg btn-primary" id="submit" onclick="location.href ='reservation/addreservation'" >Book Now</button>
                            </div>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <img class="w-100" src="img/BusCarousel2.jpg" alt="Image">
                        <div class="carousel-caption d-flex flex-column align-items-center justify-content-center">
    
                            <div class="searching">
                                <form:form action="/bus/listbusbysdd" method="get" modelAttribute="bus">
                               
                                <div class="form-group">
                                    <label for="source">From</label>
                                    <input type="text" id="source">
    
                                    <label for="destination">To</label>
                                    <input type="text" id="destination">
    
                                    <label for="date">Date</label>
                                    <input type="date" id="date">
    
                                    <button type="submit" class="btn btn-primary">Search</button>
                                </div>
                            </form:form>
                            </div>
    
                            <br>
    
                            <div class="p-3" style="max-width: 900px;">
                                <h4 class="text-white text-uppercase mb-md-3">Tours & Travel</h4>
                                <h1 class="display-3 text-white mb-md-4">Discover Amazing Places With Us</h1>
                                <button class="btn btn-lg btn-primary" id="submit" onclick="location.href ='reservation/addreservation'" >Book Now</button>
                            </div>
                        </div>
                    </div>
                </div>
                <a class="carousel-control-prev" href="#header-carousel" data-slide="prev">
                    <div class="btn btn-dark" style="width: 45px; height: 45px;">
                        <span class="carousel-control-prev-icon mb-n2"></span>
                    </div>
                </a>
                <a class="carousel-control-next" href="#header-carousel" data-slide="next">
                    <div class="btn btn-dark" style="width: 45px; height: 45px;">
                        <span class="carousel-control-next-icon mb-n2"></span>
                    </div>
                </a>
            </div>
        </div>
        <!-- Carousel End -->
    
    
        <!-- <div class="container" style="margin: 10px; padding-top: 30px; padding-bottom: 30px;border: 2px solid black; height: auto;">
            <form:form action="/bus/listbusbysourcedestinationanddate" method="get" modelAttribute="buses">
            
    
                <div class="form-group">
                    <label for="routeFrom">Source</label>
                    <input path="routeFrom" class="form-control" id="routeFrom"/>
                </div>
    
                <div class="form-group">
                    <label for="routeTo">Destination</label>
                    <input path="routeTo" class="form-control" id="routeTo"/>
                </div>
    
                <div class="form-group">
                    <label for="busDate">Bus Date</label>
                    <input type="date" path="busDate" class="form-control" id="busDate"/>
                </div>
    
    
                <div class="form-group">
                    <button type="submit" class="btn btn-primary">Search</button>
                </div>
    
            </form:form>
    
        </div> -->
               
    
        
        <!-- About Start -->
        <div class="container-fluid py-5">
            <div class="container pt-5">
                <div class="row">
                    <div class="col-lg-6" style="min-height: 500px;">
                        <div class="position-relative h-100">
                            <img class="position-absolute w-100 h-100" src="img/about1.jpg" style="object-fit: cover;">
                        </div>
                    </div>
                    <div class="col-lg-6 pt-5 pb-lg-5">
                        <div class="about-text bg-white p-4 p-lg-5 my-lg-5">
                            <h6 class="text-primary text-uppercase" style="letter-spacing: 5px;">About Us</h6>
                            <h1 class="mb-3">We Provide Best Tour Packages In Your Budget</h1>
                            <p>Dolores lorem lorem ipsum sit et ipsum. Sadip sea amet diam dolore sed et. Sit rebum labore sit sit ut vero no sit. Et elitr stet dolor sed sit et sed ipsum et kasd ut. Erat duo eos et erat sed diam duo</p>
                            <div class="row mb-4">
                                <div class="col-6">
                                    <img class="img-fluid" src="img/about-1.jpg" alt="">
                                </div>
                                <div class="col-6">
                                    <img class="img-fluid" src="img/about-2.jpg" alt="">
                                </div>
                            </div>
                                <button class="btn btn-lg btn-primary" id="submit" onclick="location.href ='reservation/addreservation'" >Book Now</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- About End -->
    
    
        <!-- Cards Start-->
    
    
        <div class="d-flex p-3 bg-secondary text-white">
            <div class="card" style="width: 18rem; margin: 30px; border-radius: 20px;">
                <img class="card-img-top" src="img/BOOK_NOW.jpg" alt="Card image cap">
                <div class="card-body">
                  <h5 class="card-title">Book A Ticket</h5>
                  <p class="card-text" style="color: black;font-size: large;">Reserve a ticket to your favourite destination.</p>
                  <button class="btn btn-lg btn-primary" id="submit" onclick="location.href ='reservation/addreservation'" style="margin-left: 40px; border-radius: 20px;" >Reserve Now</button>
                </div>
              </div>
    
              <div class="card" style="width: 18rem; margin: 30px; border-radius: 20px;">
                <img class="card-img-top" src="img/CANCEL_NOW.jpg" alt="Card image cap">
                <div class="card-body">
                  <h5 class="card-title">Cancel A Ticket</h5>
                  <p class="card-text" style="color: black;font-size: large;">Enter your Reservation ID and Cancel.</p>
                  <button class="btn btn-lg btn-primary" id="submit" onclick="location.href ='reservation/deletereservation'" style="margin-left: 40px; border-radius: 20px;" >Cancel Now</button>
                </div>
              </div>
    
              <div class="card" style="width: 18rem; margin: 30px; border-radius: 20px;">
                <img class="card-img-top" src="img/MODIFY_NOW.jpg" alt="Card image cap">
                <div class="card-body">
                  <h5 class="card-title">Modify A Ticket</h5>
                  <p class="card-text" style="color: black;font-size: large;">Modify your Ticket and Update the required Data.</p>
                  <button class="btn btn-lg btn-primary" id="submit" onclick="location.href ='reservation/modifyreservation'" style="margin-left: 40px; border-radius: 20px;" >Modify Now</button>
                </div>
              </div>
    
              <div class="card" style="width: 18rem; margin: 30px; border-radius: 20px;">
                <img class="card-img-top" src="img/FIND_NOW.jpg" alt="Card image cap">
                <div class="card-body">
                  <h5 class="card-title">Find By Bus Type</h5>
                  <p class="card-text" style="color: black;font-size: large;">Find your Bus by Entering Bus Type.</p>
                  <button class="btn btn-lg btn-primary" id="submit" onclick="location.href ='bus/findbus'" style="margin-left: 40px; border-radius: 20px;" >Find Now</button>
                </div>
              </div>
    
          </div>
    
        <!-- Cards End-->
    
    <!-- Feature Start -->
    <div class="container-fluid pb-5">
        <div class="container pb-5">
            <div class="row">
                <div class="col-md-4">
                    <div class="d-flex mb-4 mb-lg-0">
                        <div class="d-flex flex-shrink-0 align-items-center justify-content-center bg-primary mr-3" style="height: 100px; width: 100px;">
                            <i class="fa fa-2x fa-money-check-alt text-white"></i>
                        </div>
                        <div class="d-flex flex-column">
                            <h5 class="">Competitive Pricing</h5>
                            <p class="m-0">Best Offers at reasonable prices !</p>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="d-flex mb-4 mb-lg-0">
                        <div class="d-flex flex-shrink-0 align-items-center justify-content-center bg-primary mr-3" style="height: 100px; width: 100px;">
                            <i class="fa fa-2x fa-award text-white"></i>
                        </div>
                        <div class="d-flex flex-column">
                            <h5 class="">Best Services</h5>
                            <p class="m-0">Service like nowhere !</p>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="d-flex mb-4 mb-lg-0">
                        <div class="d-flex flex-shrink-0 align-items-center justify-content-center bg-primary mr-3" style="height: 100px; width: 100px;">
                            <i class="fa fa-2x fa-globe text-white"></i>
                        </div>
                        <div class="d-flex flex-column">
                            <h5 class="">Worldwide Coverage</h5>
                            <p class="m-0">Let's travel the world !</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Feature End -->
    
    
    <!-- Footer Start -->
    <div class="container-fluid bg-dark text-white-50 py-5 px-sm-3 px-lg-5" style="margin-top: 90px;">
        <div class="row pt-5">
            <div class="col-lg-3 col-md-6 mb-5">
                <a href="" class="navbar-brand">
                    <h1 class="text-primary"><span class="text-white">BUS</span>BUDDY</h1>
                </a>
                <h6 class="text-white text-uppercase mt-4 mb-3" style="letter-spacing: 5px;">Follow Us</h6>
                <div class="d-flex justify-content-start">
                    <a class="btn btn-outline-primary btn-square mr-2" href="#"><i class="fab fa-twitter"></i></a>
                    <a class="btn btn-outline-primary btn-square mr-2" href="#"><i class="fab fa-facebook-f"></i></a>
                    <a class="btn btn-outline-primary btn-square mr-2" href="#"><i class="fab fa-linkedin-in"></i></a>
                    <a class="btn btn-outline-primary btn-square" href="#"><i class="fab fa-instagram"></i></a>
                </div>
            </div>
            <div class="col-lg-3 col-md-6 mb-5">
                <h5 class="text-white text-uppercase mb-4" style="letter-spacing: 5px;">Our Services</h5>
                <div class="d-flex flex-column justify-content-start">
                    <a class="text-white-50 mb-2" href="about.html"><i class="fa fa-angle-right mr-2"></i>About</a>
                    <a class="text-white-50" href="/reservation/addreservation"><i class="fa fa-angle-right mr-2"></i>Book Ticket</a>
                    <a class="text-white-50" href="/reservation/deletereservation"><i class="fa fa-angle-right mr-2"></i>Cancel Ticket</a>
                    <a class="text-white-50" href="/reservation/modifyreservation"><i class="fa fa-angle-right mr-2"></i>Modify Ticket</a>

                </div>
            </div>
            <div class="col-lg-3 col-md-6 mb-5">
                <h5 class="text-white text-uppercase mb-4" style="letter-spacing: 5px;">Usefull Links</h5>
                <div class="d-flex flex-column justify-content-start">
                    <a class="text-white-50 mb-2" href="contact.html"><i class="fa fa-angle-right mr-2"></i>Contact</a>
                    <a class="text-white-50" href="/feedback/addfeedback"><i class="fa fa-angle-right mr-2"></i>Add Feedback</a>
                    <a class="text-white-50" href="/reservation/findreservation"><i class="fa fa-angle-right mr-2"></i>View Ticket By Date</a>


                </div>
            </div>
            <div class="col-lg-3 col-md-6 mb-5">
                <h5 class="text-white text-uppercase mb-4" style="letter-spacing: 5px;">Contact Us</h5>
                <p><i class="fa fa-map-marker-alt mr-2"></i>Haldia, West Bengal, India</p>
                <p><i class="fa fa-phone-alt mr-2"></i>+91 6006026428</p>
                <p><i class="fa fa-envelope mr-2"></i>busbuddy@gmail.com</p>
                
                
            </div>
        </div>
    </div>
    <div class="container-fluid bg-dark text-white border-top py-4 px-sm-3 px-md-5" style="border-color: rgba(256, 256, 256, .1) !important;">
        <div class="row">
            <div class="col-lg-6 text-center text-md-left mb-3 mb-md-0">
                <p class="m-0 text-white-50">Copyright &copy; <a href="#">BusBuddy</a>. All Rights Reserved.</a>
                </p>
            </div>
            <div class="col-lg-6 text-center text-md-right">
                <p class="m-0 text-white-50">Designed by <a href="https://github.com/ashu-0453">Astush Sharma</a>
                </p>
            </div>
        </div>
    </div>
    <!-- Footer End -->
    
    
        <!-- Back to Top -->
        <a href="#" class="btn btn-lg btn-primary btn-lg-square back-to-top"><i class="fa fa-angle-double-up"></i></a>
    
    
        <!-- JavaScript Libraries -->
        <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js"></script>
        <script src="lib/easing/easing.min.js"></script>
        <script src="lib/owlcarousel/owl.carousel.min.js"></script>
        <script src="lib/tempusdominus/js/moment.min.js"></script>
        <script src="lib/tempusdominus/js/moment-timezone.min.js"></script>
        <script src="lib/tempusdominus/js/tempusdominus-bootstrap-4.min.js"></script>
    
        <!-- Contact Javascript File -->
        <script src="mail/jqBootstrapValidation.min.js"></script>
        <script src="mail/contact.js"></script>
    
        <!-- Template Javascript -->
        <script src="js/main.js"></script>
    
</body>
</html>