let param;
var output;
var getParameter = function(param) {
  var returnValue;
  var url = location.href;
  var parameters = url.slice(url.indexOf("?") + 1, url.length).split("&");
  for (var i = 0; i < parameters.length; i++) {
    var varName = parameters[i].split("=")[0];
    if (varName.toUpperCase() == param.toUpperCase()) {
      returnValue = parameters[i].split("=")[1];
      return decodeURIComponent(returnValue);
    }
  }
};

window.onload = function() {
  document.querySelector(".itemName").textContent = getParameter("itemName");
  document.querySelector("#itemId").textContent = getParameter("itemId");

  document.getElementById("order_btn").onclick = function() {
    param = {
      itemId: getParameter("itemId"),
      amount: document.order_form.amount.value,
      userId: output,
      payMethod: document.order_form.payMethod.value,
      address: document.order_form.address.value,
      phone: document.order_form.phone.value
    };

    $.ajax({
      type: "POST",
      url: "/order",
      contentType: "application/json; charset=UTF-8;",
      dataType: "json",
      data: JSON.stringify(param),
      success: function(result) {},
      error: function(request, status, error) {
        console.log(error);
      },
      complete: function() {
        location.href = "/orderHistory";
      }
    });
  };

  document.getElementById("id").onblur = function() {
    $.ajax({
      url: "/isExistId",
      type: "GET",
      data: {
        username: this.value
      },
      success: function(result) {
        if (result >= 1) output = result;
        else alert("존재하지 않는 아이디입니다.");
      }
    });
  };
};
