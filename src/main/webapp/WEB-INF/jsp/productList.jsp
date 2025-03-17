<%@ page isELIgnored="false" language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>상품 목록</title>
    <style>
        table {
            width: 60%;
            border-collapse: collapse;
            margin: 20px auto;
        }
        th, td {
            border: 1px solid #ddd;
            padding: 10px;
            text-align: center;
        }
        th {
            background-color: #f4f4f4;
        }
    </style>
</head>
<body>
    <h2 style="text-align: center;">상품 목록</h2>

    <table>
        <tr>
            <th>상품명</th>
            <th>가격</th>
            <th>추가 정보</th>
        </tr>
        <c:forEach var="product" items="${productDetails}">
            <tr>
                <td>${product.name}</td>
                <td>${product.price}</td>
                <td>${product.extra}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
