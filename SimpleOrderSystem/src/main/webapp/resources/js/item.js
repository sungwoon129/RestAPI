window.onload = function() {
	
	
	$.ajax({
		type:"GET",
		url:"/item/list",
		contentType:"application/json; charset=utf-8;",
		success:function(response) {
			
			let tBody = document.querySelector("tbody");
			let itemName;
			let itemPrice;
		
			for(let item of response) {
				
				let itemTr = document.createElement("tr");
				itemTr.dataset.code = item.itemId;
				
				itemName = document.createElement("td");
				itemName.className = "item_name";
				
				itemPrice = document.createElement("td");
				itemPrice.className = "item_price";
				
				itemName.textContent = item.name;
				itemPrice.textContent = item.price;

				itemTr.append(itemName);
				itemTr.append(itemPrice);
				tBody.append(itemTr);
				
				toggleDetailsBox.call(itemTr);
			}
		}
		
	})
	
		
	
	function toggleDetailsBox() {
		this.onclick = function() {
		
			$.ajax({				
				type:"GET",
				url:"/item/" + this.dataset.code,
				contentType: "application/json; charset=utf-8;",

				success:function(result) {
					
										
					$('.item_info_box').toggle("fast","linear");
					
					$('.item_box_name').text(result.name);
					$('.item_box_price').text(result.price + "원");
					
					document.getElementById('order').onclick = function() {
						location.href="/orderItem?itemId=" + result.itemId + "&itemName=" + result.name;
					}
					
				}
			
		
			});
			
			
					
		}
	}
	

	

}
