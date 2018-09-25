var uri = location.protocol + "\\\\" + location.hostname + ":" + (location.port == "" ? 80 : location.port) + "\\PorNic";
$("#test").click(function(){
	alert(uri)
});
var totalPage;
$(function() {
	to_page(1);
});
function to_page(pn) {
	$.ajax({
		url : uri+"/emps",
		data : "pn=" + pn,
		type : "get",
		success : function(result) {
			build_emps_table(result);
			build_page_info(result);
			build_page_nav(result);
			totalPage = result.extend.pageInfo.total;
		}
	});
}
function getDepts(ele) {
	$(ele).empty();
	$.ajax({
		url : uri+"/depts",
		type : "get",
		success : function(result) {
			//console.log(result)
			$.each(result.extend.depts, function() {
				var optionEle = $("<option></option>")
						.append(this.deptName).attr("value", this.deptId);
				optionEle.appendTo(ele);
			});
		}
	});
}

$("#emp_add_modal_btn").click(function() {
	$("#addModal form")[0].reset();
	reset_form("#addModal form");
	getDepts("#addModal select");
	$("#addModal").modal({
		backdrop : "static"
	});
});
$("#empName_add_input").change(
		function() {
			$.ajax({
				url : uri+"/checkuser",
				type : "post",
				data : "empName=" + this.value,
				success : function(result) {
					if (result.code == 100) {
						show_validate_msg("#empName_add_input", "success",
								"用户名可用");
						$("#empName_add_input").attr("ajax-va", "success");
					} else if (result.code == 200) {
						show_validate_msg("#empName_add_input", "error",
								result.extend.va_msg);
						$("#empName_add_input").attr("ajax-va", "error");
					}

				}
			});
		});

$("#emp_save_btn").click(
		function() {
			if (!validate_add_form()) {
				return false;
			}
			if ($(this).attr("ajax-va") == "error") {
				return false;
			}
			$.ajax({
				url : uri+"/emps",
				type : "post",
				data : $("#addModal form").serialize(),
				success : function(result) {
					//alert(result.msg);
					if (result.code == 100) {
						$("#addModal").modal("hide");
						to_page(totalPage + 1);
					} else if (result.code == 200) {
						//	console.log(result);

						var errors = result.extend.errorFields;
						/*
							$.each(errors,function(index,item){
								if(item!=undefined){
									 
								}
							});
						 */
						if (errors.email != undefined) {
							show_validate_msg("#email_add_input", "error",
									errors.email);
						}
						if (errors.empName != undefined) {
							show_validate_msg("#empName_add_input",
									"error", errors.empName);
						}
					}
				}
			});
		});
function getEmp(id) {
	$.ajax({
				url : uri+"/emp/" + id,
				type : "GET",
				success : function(result) {
					//console.log(result); 
					var empData = result.extend.emp;
					$("#empName_update_static").text(empData.empName);
					$("#email_update_input").val(empData.email);
					$("#updateModal input[name=gender]").val([empData.gender]); 
					$("#updateModal select").val([empData.dId]);
				}
			});
}
$(document).on("click", ".edit_btn", function() {
	getDepts("#updateModal select");
	getEmp($(this).attr("edit_id"));
	$("#emp_update_btn").attr("edit_id",$(this).attr("edit_id"));
	$("#updateModal").modal({
		backdrop : "static"
	});
});
$("#emp_update_btn").click(function(){
	//验证邮箱格式 
	var email = $("#email_update_input").val();
	var regEmail = /^([a-z0-9_\.-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$/;
	if (!regEmail.test(email)) {
		show_validate_msg("#email_add_input", "error", "邮箱格式不正确！");
		return false;
	} else {
		show_validate_msg("#email_add_input", "success", "");
	}
	$.ajax({
		url:uri+"/emp/"+$(this).attr("edit_id"),
		type:"PUT",
		data:$("#updateModal form").serialize(),
		success:function(result){
			$("#updateModal").modal("hide");
			to_page(currentPage);
		}
	});
	
	
});


function build_page_nav(result) {
	$("#page_nav_area").empty();
	var firstPage = $("<li></li>").append(
			$("<a></a>").append("首页").attr("href", "#"));
	var prePage = $("<li></li>").append(
			$("<a></a>").append("&laquo;").attr("href", "#"));
	var nextPage = $("<li></li>").append(
			$("<a></a>").append("&raquo;").attr("href", "#"));
	var lastPage = $("<li></li>").append(
			$("<a></a>").append("末页").attr("href", "#"));
	var pageInfo = result.extend.pageInfo;
	if (!pageInfo.hasPreviousPage) {
		prePage.addClass("disabled");
		firstPage.addClass("disabled");
	} else {
		firstPage.click(function() {
			to_page(1);
		});
		prePage.click(function() {
			to_page(pageInfo.prePage);
		});
	}
	if (!pageInfo.hasNextPage) {
		lastPage.addClass("disabled");
		nextPage.addClass("disabled");
	} else {
		nextPage.click(function() {
			to_page(pageInfo.nextPage);
		});
		lastPage.click(function() {
			to_page(pageInfo.pages);
		});
	}
	var ul = $("<ul></ul>").addClass("pagination");
	ul.append(firstPage).append(prePage);
	$.each(result.extend.pageInfo.navigatepageNums, function(index, item) {
		var numLi = $("<li></li>").append(
				$("<a></a>").append(item).attr("href", "#"));
		if (result.extend.pageInfo.pageNum == item) {
			numLi.addClass("active");
		}
		numLi.click(function() {
			to_page(item);
		});
		ul.append(numLi);
	});
	ul.append(nextPage).append(lastPage);
	var navEle = $("<nav></nav>").append(ul);
	navEle.appendTo("#page_nav_area")

}
var currentPage;
function build_page_info(result) {
	$("#page_info_area").empty();
	var pageInfo = result.extend.pageInfo;
	var pageNum = pageInfo.pageNum;
	var pages = pageInfo.pages;
	var total = pageInfo.total;
	currentPage=pageNum;
	$("#page_info_area").append(
			"当前第" + pageNum + "页,总共" + pages + "页，总共" + total + "条记录");
}
function build_emps_table(result) {
	$("#emps_table tbody").empty();
	var emps = result.extend.pageInfo.list;
	$.each(emps, function(index, item) {
		var checkboxTd=$("<td><input type='checkbox' class='check_item'/></td>")
		var empIdTd = $("<td></td>").append(item.empId);
		var empNameTd = $("<td></td>").append(item.empName);
		var genderTd = $("<td></td>").append(item.gender == 'M' ? "男" : "女");
		var emailTd = $("<td></td>").append(item.email);
		var deptNameTd = $("<td></td>").append(item.department.deptName);

		var editbtn = $("<button></button>").addClass("btn btn-info btn-sm edit_btn")
				.append(
						$("<span></span>").addClass(
								"glyphicon glyphicon-pencil")).attr("edit_id",item.empId).append("编辑");
		var delbtn = $("<button></button>").addClass("btn btn-warning btn-sm delete_btn")
				.append(
						$("<span></span>")
								.addClass("glyphicon glyphicon-trash")).attr("delete_id",item.empId).append(
						"删除");
		var btnTd = $("<td></td>").append(editbtn).append(" ").append(delbtn);
		$("<tr></tr>").append(checkboxTd).append(empIdTd).append(empNameTd).append(emailTd)
				.append(genderTd).append(deptNameTd).append(btnTd).appendTo(
						"#emps_table tbody");
	});
}
function reset_form(ele) {
	$(ele)[0].reset();
	$(ele).find("*").removeClass("has-success has-error");
	$(ele).find(".help-block").text("");
}
function show_validate_msg(ele, status, msg) {
	$(ele).parent().removeClass("has-success has-error");
	$(ele).next("span").text("");
	if (status == "success") {
		$(ele).parent().addClass("has-success");
		$(ele).next("span").text(msg);
	} else if (status == "error") {
		$(ele).parent().addClass("has-error");
		$(ele).next("span").text(msg);
	}
}
function validate_add_form() {
	/*
	 * var empName=$("#empName_add_input").val(); var
	 * regName=/(^[a-zA-Z0-9_-]{6,16}$)|([\u2E80-\u9FFF]{2,5})/;
	 * if(!regName.test(empName)){
	 * show_validate_msg("#empName_add_input","error","用户名必须是2-5位中文或者6-16位英文和数字的组合")
	 * return false; }else{ show_validate_msg("#empName_add_input","success"," ") }
	 */
	var email = $("#email_add_input").val();
	var regEmail = /^([a-z0-9_\.-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$/;
	if (!regEmail.test(email)) {
		show_validate_msg("#email_add_input", "error", "邮箱格式不正确！");
		return false;
	} else {
		show_validate_msg("#email_add_input", "success", "");
	}
	return true;
};
$(document).on("click",".delete_btn",function(){
	var empName=$(this).parents("tr").find("td:eq(2)").text();
	if(confirm("确认删除【"+empName+"】吗？")){
		$.ajax({
			url:uri+"/emp/"+$(this).attr("delete_id"),
			type:"DELETE",
			success:function(){
				alert("删除成功");
				to_page(currentPage);
			}
		});
	}
});
$("#check_all").click(function(){

	$(".check_item").prop("checked",$(this).prop("checked"));
	
});
$(document).on("click",".check_item",function(){
	flag=$(".check_item:checked").length==$(".check_item").length;
	if(flag){
		$("#check_all").prop("checked",flag);
	}
});
$("#emp_delete_all_btn").click(function(){
	var empNames="";
	var del_idstr="";
	$.each($(".check_item:checked"),function(){
		empNames+=$(this).parents("tr").find("td:eq(2)").text()+",";
		del_idstr+=$(this).parents("tr").find("td:eq(1)").text()+"-";
	});
	empNames=empNames.substring(0,empNames.length-1);
	del_idstr=del_idstr.substring(0,del_idstr.length-1);
	if(confirm("确认删除【"+empNames+"】吗？")){
		$.ajax({
			url:uri+"/emp/"+del_idstr,
			type:"DELETE",
			success:function(){
				alert("删除成功！");
				to_page(currentPage);
			}
		});
	}
});