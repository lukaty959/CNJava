<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Nhúng Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h2 class="mb-4 text-center">Đăng ký tài khoản</h2>
    <form method="post" action="register.jsp"> <!-- hoặc servlet xử lý -->
        <div class="row mb-3">
            <div class="col-md-6">
                <label for="email" class="form-label">Email</label>
                <input type="email" class="form-control" id="email" name="email" required>
            </div>
            <div class="col-md-6">
                <label for="pass" class="form-label">Password</label>
                <input type="password" class="form-control" id="pass" name="pass" required>
            </div>
        </div>

        <div class="mb-3">
            <label for="address" class="form-label">Address</label>
            <input type="text" class="form-control" id="address" name="address" placeholder="1234 Main St" required>
        </div>

        <div class="mb-3">
            <label for="address2" class="form-label">Address 2</label>
            <input type="text" class="form-control" id="address2" name="address2" placeholder="Apartment, studio, or floor">
        </div>

        <div class="row mb-3">
            <div class="col-md-6">
                <label for="city" class="form-label">City</label>
                <input type="text" class="form-control" id="city" name="city" required>
            </div>
            <div class="col-md-4">
                <label for="state" class="form-label">State</label>
                <select class="form-select" id="state" name="state" required>
                    <option selected disabled value="">Choose...</option>
                    <option>Hà Nội</option>
                    <option>Đà Nẵng</option>
                    <option>Hồ Chí Minh</option>
                    <option>Khác</option>
                </select>
            </div>
            <div class="col-md-2">
                <label for="zip" class="form-label">Zip</label>
                <input type="text" class="form-control" id="zip" name="zip" required>
            </div>
        </div>

        <div class="mb-3 form-check">
            <input type="checkbox" class="form-check-input" id="checkme" name="checkme">
            <label class="form-check-label" for="checkme">Check me out</label>
        </div>

        <button type="submit" class="btn btn-primary">Sign in</button>
    </form>
</div>

</body>
</html>