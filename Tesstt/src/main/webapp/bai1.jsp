<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Kiểm tra tam giác</title>
</head>
<body>
    <h2>Kiểm tra 3 cạnh có tạo thành tam giác không</h2>

    <form action="triangleCheck.jsp" method="post">
        Cạnh a: <input type="number" name="a" step="any" required><br><br>
        Cạnh b: <input type="number" name="b" step="any" required><br><br>
        Cạnh c: <input type="number" name="c" step="any" required><br><br>
        <input type="submit" value="Kiểm tra">
    </form>

    <%
        String sa = request.getParameter("a");
        String sb = request.getParameter("b");
        String sc = request.getParameter("c");

        if (sa != null && sb != null && sc != null) {
            try {
                double a = Double.parseDouble(sa);
                double b = Double.parseDouble(sb);
                double c = Double.parseDouble(sc);

                if (a > 0 && b > 0 && c > 0) {
                    if (a + b > c && a + c > b && b + c > a) {
                        out.println("<p style='color:green;'>Ba cạnh (" + a + ", " + b + ", " + c + ") tạo thành một tam giác hợp lệ.</p>");
                    } else {
                        out.println("<p style='color:red;'>Ba cạnh (" + a + ", " + b + ", " + c + ") không tạo thành một tam giác.</p>");
                    }
                } else {
                    out.println("<p style='color:red;'>Các cạnh phải lớn hơn 0.</p>");
                }
            } catch (NumberFormatException e) {
                out.println("<p style='color:red;'>Vui lòng nhập số hợp lệ.</p>");
            }
        }
    %>
</body>
</html>
