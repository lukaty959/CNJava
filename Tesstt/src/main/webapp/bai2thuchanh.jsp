<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Nhúng Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        .custom-table th, .custom-table td {
            border: 4px solid #4CAF50;       /* Viền xanh */
        }
        .custom-table {
            background-color: #f9f9f9;       /* Nền bảng */
            color: #333333;                  /* Màu chữ */
        }
        .custom-header {
            background-color: #4CAF50;       /* Nền tiêu đề */
            color: white;                    /* Chữ tiêu đề */
        }
    </style>
</head>
<body>
<div class="container mt-5">
    <h2 class="text-center mb-4">Danh sách sinh viên</h2>

    <table class="table custom-table text-center">
        <thead class="custom-header">
            <tr>
                <th>STT</th>
                <th>Mã SV</th>
                <th>Họ và tên</th>
                <th>Quê quán</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>1</td>
                <td>SV001</td>
                <td>NGUYỄN VĂN BẰNG</td>
                <td>Hà Nội</td>
            </tr>
            <tr>
                <td>2</td>
                <td>SV002</td>
                <td>DƯƠNG ĐỨC TRUNG NGUYÊN</td>
                <td>Hải Phòng</td>
            </tr>
            <tr>
                <td>3</td>
                <td>SV003</td>
                <td>NGUYỄN HUY HIẾU</td>
                <td>Đà Nẵng</td>
            </tr>
        </tbody>
    </table>
</div>
</body>
</html>