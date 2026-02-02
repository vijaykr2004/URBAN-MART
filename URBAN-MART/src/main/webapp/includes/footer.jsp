<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Footer Bottom</title>

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">

<style>
/* ===== PAGE LAYOUT ===== */
html, body {
  height: 100%;
  margin: 0;
}

body {
  display: flex;
  flex-direction: column;
}

/* Push footer to bottom */
.page-wrapper {
  flex: 1;
}

/* ===== FOOTER ===== */
.site-footer {
  width: 100%;
  font-size: 16px;
}

.site-footer .navbar {
  min-height: 50px;
}

@media (max-width: 768px) {
  .site-footer {
    font-size: 14px;
  }
}
</style>
</head>

<body>

<!-- ===== PAGE CONTENT ===== -->
<div class="page-wrapper container mt-5">
  <!-- your form or content here -->
</div>

<!-- ===== FOOTER ===== -->
<footer class="site-footer mt-auto">
  <nav class="navbar navbar-light bg-secondary justify-content-center">
    <p class="mb-0 text-white text-center">
      COPYRIGHTS &copy; URBAN-MART.COM
    </p>
  </nav>
</footer>

<!-- ===== SCRIPTS ===== -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>

</body>
</html>
