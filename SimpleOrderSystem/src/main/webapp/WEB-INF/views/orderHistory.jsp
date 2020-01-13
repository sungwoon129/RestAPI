<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>SimpleOrderSystem_주문 내역</title>
	<link rel="stylesheet" href="/resources/css/default.css" >
	<link rel="stylesheet" href="/resources/css/orderHistory.css">
	
</head>
<body>
<div id="wrapper">
	<header>SimpleOrderSystem_주문내역</header>

	<nav>
		<ul>
			<li><a href="/">회원 가입</a></li>
			<li><a href="item">상품 목록</a></li>
			<li class="on_menu"><a href="orderHistory">주문 내역</a></li>
		</ul>
	</nav>
	<section>
		<article>
			<h2>주문 내역</h2>
	
			<table class="memeber_list">
				<thead>
					<tr>
						<th>주문번호</th>
						<th>상품명</th>
						<th>수량</th>
						<th>ID</th>
						<th>상태</th>
						<th>신청일</th>
						<th>결제수단</th>
						<th>연락처</th>
						<th>주소</th>
						<th colspan="2">action</th>
					</tr>
				</thead>
				<tbody class="items">
				
				</tbody>
			</table>
		</article>
	
	</section>

</div>

<script
  src="https://code.jquery.com/jquery-3.4.1.js"
  integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
  crossorigin="anonymous"></script>
<script src="/resources/js/orderHistory.js"></script>
</body>
</html>