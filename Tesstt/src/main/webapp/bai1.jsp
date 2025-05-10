<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Giải phương trình bậc hai: ax² + bx + c = 0</h2>

    <form method="post">
        a: <input type="text" name="a" required><br>
        b: <input type="text" name="b" required><br>
        c: <input type="text" name="c" required><br>
        <input type="submit" value="Giải">
    </form>

<%
    String aStr = request.getParameter("a");
    String bStr = request.getParameter("b");
    String cStr = request.getParameter("c");

    if (aStr != null && bStr != null && cStr != null) {
        try {
            double a = Double.parseDouble(aStr);
            double b = Double.parseDouble(bStr);
            double c = Double.parseDouble(cStr);

            if (a == 0) {
                if (b == 0) {
                    if (c == 0) {
                        out.println("<p>Phương trình có vô số nghiệm.</p>");
                    } else {
                        out.println("<p>Phương trình vô nghiệm.</p>");
                    }
                } else {
                    double x = -c / b;
                    out.println("<p>Phương trình có một nghiệm: x = " + x + "</p>");
                }
            } else {
                double delta = b * b - 4 * a * c;
                if (delta > 0) {
                    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                    out.println("<p>Phương trình có hai nghiệm phân biệt:</p>");
                    out.println("<p>x1 = " + x1 + "</p>");
                    out.println("<p>x2 = " + x2 + "</p>");
                } else if (delta == 0) {
                    double x = -b / (2 * a);
                    out.println("<p>Phương trình có nghiệm kép: x = " + x + "</p>");
                } else {
                    out.println("<p>Phương trình vô nghiệm (vì delta < 0).</p>");
                }
            }
        } catch (NumberFormatException e) {
            out.println("<p>Vui lòng nhập đúng định dạng số.</p>");
        }
    }
%>
</body>
</html>