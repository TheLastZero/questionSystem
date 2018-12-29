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

            $("#testGetPageListByStatus").on('click',function () {

                //@RequestParam(value="pn",defaultValue="1")Integer pn,//查询页码，默认为第一页
                //@RequestParam(value="surveyStatus",defaultValue="-1")Integer surveyStatus,//-1表示查询全部
                //@RequestParam(value="surveyName",defaultValue="-1")String surveyName,//有名字的话，把名字的条件也带上
                //@RequestParam(value="userId")Integer userId//根据用户id查询

                var data = {
                    "pn":1,
                    "surveyStatus":-1,
                    "surveyName":"1",
                    "userId":1
                };

                $.ajax({
                    //url: "http://questionsystem.zerozrz.com/test/cors",
                    url: "${pageContext.request.contextPath}/diagens/survey/getPageListByStatus",
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
                    //url: "${pageContext.request.contextPath}/diagens/survey/testGetPageListByStatus",
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

    <input id="testGetPageListByStatus" type="button" value="测试分页数据">


    <h4></h4>

</body>
</html>
