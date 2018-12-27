<%--
  Created by IntelliJ IDEA.
  User: acer
  Date: 2018/12/27
  Time: 11:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <script type="application/javascript">

        $(document).ready(function(){

            $("#testCORS").on('click',function () {

                var data = {
                    "name":"张三",
                    "age":"18",
                    "like":"打篮球"
                };

                $.ajax({
                    url: "http://questionsystem.zerozrz.com/test/cors",
                    //url: "${pageContext.request.contextPath}/test/cors",
                    headers: {'zrzHeader': 'Basic'},
                    type:"POST",
                    contentType: "application/json; charset=utf-8",
                    dataType:"json",
                    data:JSON.stringify(data),
                    timeout:10000,
                    success:function(data){

                        var d = JSON.stringify(data);

                        $("h4").text(d);

                        console.log(data);
                    },
                    error:function(e){
                        console.log(e);
                    }
                });

            });

            $("#testCORS2").on('click',function () {

                $.ajax({
                    url: "http://questionsystem.zerozrz.com/test/getcors",
                    //url: "${pageContext.request.contextPath}/test/getcors",
                    headers: {'zrzHeader': 'Basic'},
                    type:"POST",
                    contentType: "application/json; charset=utf-8",
                    dataType:"json",
                    timeout:10000,
                    success:function(data){

                        var d = JSON.stringify(data);

                        $("h4").text(d);

                        console.log(data);
                    },
                    error:function(e){
                        console.log(e);
                    }
                });

            });


        });

    </script>

</head>
<body>

    <h1>测试jsonCORS</h1>

    <input id="testCORS" type="button" value="点击测试CORS">

    <input id="testCORS2" type="button" value="点击测试getcors">

    <h4></h4>

</body>
</html>
