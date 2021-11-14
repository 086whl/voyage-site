$(function () {
    //加载页面自动执行
    $.get("header.html",function (data) {
        $("#header").html(data);
    });
    $.get("menu.html",function (data){
        $("#menu").html(data);
    });
    $.get("footer.html",function (data) {
        $("#footer").html(data);
    });
});