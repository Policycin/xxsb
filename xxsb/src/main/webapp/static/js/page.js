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
