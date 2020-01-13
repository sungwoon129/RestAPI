<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
	<title>SimpleOrderSystem_상품 목록</title>
	<link rel="stylesheet" href="/resources/css/default.css" >
	<link rel="stylesheet" href="/resources/css/item.css">
	
</head>
<body>
<div id="wrapper">
	<header>SimpleOrderSystem_상품목록</header>

	<nav>
		<ul>
			<li><a href="/">회원 가입</a></li>
			<li class="on_menu"><a href="item">상품 목록</a></li>
			<li><a href="orderHistory">주문 내역</a></li>
		</ul>
	</nav>
	<section>
		<article>
			<h2>상품 목록</h2>
	
			<table class="memeber_list">
				<thead>
					<tr>
						<th>상품명</th>
						<th>가격</th>
						
					</tr>
				</thead>
				<tbody class="items">
	
				</tbody>
			</table>
		</article>
		<article class="fixed_box">
			<div class="item_info_box">
				<div class="item_box_name">상품명 : </div>
				<div class="item_box_price">가격 : </div>

				<button type="button" id="order">주문하러 가기</button>
			</div>
		</article>
	
	</section>

</div>

<script
  src="https://code.jquery.com/jquery-3.4.1.js"
  integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
  crossorigin="anonymous"></script>
<script src="/resources/js/item.js"></script>
</body>
</html>