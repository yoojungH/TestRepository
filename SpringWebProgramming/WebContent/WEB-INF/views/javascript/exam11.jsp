<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
		<title>JSP Page</title>
		<link href="<%=application.getContextPath()%>/resources/bootstrap-3.3.7/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
		<script src="<%=application.getContextPath()%>/resources/jquery/jquery.js" type="text/javascript"></script>
		<script src="<%=application.getContextPath()%>/resources/bootstrap-3.3.7/js/bootstrap.min.js" type="text/javascript"></script>
		<script>
			function handleBtn1() {
				//var img = document.querySelector("img");
				//img.src ="<%=application.getContextPath()%>/resources/images/photo02.jpg"				
				
				var imgArray = document.querySelectorAll("img");
				for(var i=0; i<imgArray.length; i++){
					imgArray[i].src = "<%=application.getContextPath()%>/resources/images/photo02.jpg";
				}
			}
			function handleBtn2(){
				var img1 = document.querySelector("#img1");
				img1.src = "<%=application.getContextPath()%>/resources/images/photo03.jpg";
			}
			
			function handleBtn3(){
				var class1 = document.querySelectorAll(".class1");
				for(var i=0; i<class1.length; i++){
					class1[i].src = "<%=application.getContextPath()%>/resources/images/photo04.jpg";
				}
			}
		</script>
	</head>
	<body>
		<h1>DOM 사용하기</h1>
		<div>
			<button onclick="handleBtn1()">이미지 변경</button> <br/>
			<img src="<%=application.getContextPath()%>/resources/images/photo01.jpg" width="100px" height="100px"/>
			<img src="<%=application.getContextPath()%>/resources/images/photo01.jpg" width="100px" height="100px"/>
		</div>
		
		<div>
			<button onclick="handleBtn2()" class="btn btn-success">img1의 이미지 변경</button> 
			<button onclick="handleBtn3()" class="btn btn-success">class1의 이미지 변경</button> <br/>
			<img id="img1" src="<%=application.getContextPath()%>/resources/images/photo01.jpg" width="100px" height="100px"/>
			<img class="class1" src="<%=application.getContextPath()%>/resources/images/photo01.jpg" width="100px" height="100px"/>
			<img class="class1" src="<%=application.getContextPath()%>/resources/images/photo01.jpg" width="100px" height="100px"/>
		</div>		
	</body>
</html>
