$(function(){
	
	getList.call();
	
function getList() {
	$.ajax({
		type:"GET",
		url:"/order/list",
		success:function(result) {
			let tbody = document.querySelector('.items');
			while(tbody.firstChild) {
				tbody.removeChild(tbody.firstChild);
			}
			for(let item of result) {
				let tr = document.createElement("tr");
				let orderid = document.createElement("td");
			
				let amount = document.createElement("td");
				let itemName = document.createElement("td");
				let userId = document.createElement("td");
				let status = document.createElement("td");
				let applyDate = document.createElement("td");
				let payMethod = document.createElement("td");
				let phone = document.createElement("td");
				let address = document.createElement("td");
				let action = document.createElement("td");
				
				orderid.textContent = item.orderId;
				itemName.textContent = item.name;
				amount.textContent = item.amount;
				userId.textContent = item.userId;
				status.textCotent = "준비중";
				applyDate.textContent = item.applyDate;
				payMethod.textContent = item.payMethod;
				phone.textContent = item.phone;
				address.textContent = item.address;
				action.innerHTML = "<button type='button' class='del_btn' data-code='" + item.orderId + "'>삭제</button>";
				
				tr.append(orderid);
				tr.append(itemName)
				tr.append(amount);
				tr.append(userId);
				tr.append(status);
				tr.append(applyDate);
				tr.append(payMethod);
				tr.append(phone);
				tr.append(address);
				tr.append(action);
				
				$('.items').append(tr);
		
				
			}
		}
	});
}

	
	$(document).on('click','.del_btn',function(e) {
		let target = e.target || e.srcElement;
		$.ajax({
			type:"DELETE",
			url:"/order/" + target.dataset.code,
			contentType:" application/json; charset=UTF-8;",
			success:function(result) {
		
				getList.call();
			}	
		});
	
	})
	
	
})