<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>OrderSystem_주문</title>
	<link rel="stylesheet" href="/resources/css/default.css" >
	<link rel="stylesheet" href="/resources/css/index.css" >
</head>
<body>
<div id="wrapper">
	<header>OrderSystem_주문</header>
	<nav>
		<ul>
			<li><a href="/">회원 가입</a></li>
			<li><a href="item">상품 목록</a></li>
			<li><a href="orderHistory">주문 내역</a></li>
		</ul>
	</nav>
	<section>
		<article>
			<h2>주문 하기</h2>
			<div class="itemName"></div>
			<form name="order_form">
				<input type="hidden" value="" name="itemId" id="itemId">
				<div class="item"><label for="amount">수량  </label><input type="number" min="1" name="amount" value="1" max="999999"></div>
				<div class="item"><label for="id">아이디   </label><input type="text" name="id" id="id"></div>
				<div class="item">
				<span>결제수단    </span>
				<label for="payMethod">신용카드</label>
				<input type="radio" name="payMethod" value="신용카드">
				<label for="payMethod">현금</label>
				<input type="radio" name="payMethod" value="현금"></div>
				<div class="item"><label for="phone">연락처</label><input type="text" name="phone"></div>
				<div class="item"><label for="address">주소</label><input type="text" name="address"></div>
			</form>
			<button type="button" id="order_btn")>주문 하기</button>
		</article>
		
	</section>
</div>
<script
  src="https://code.jquery.com/jquery-3.4.1.js"
  integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
  crossorigin="anonymous"></script>
<script src="/resources/js/order.js"></script>
</body>
</html>