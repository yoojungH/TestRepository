<%@page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no">
<title>JSP Page</title>
<link
	href="<%=application.getContextPath()%>/resources/bootstrap-3.3.7/css/bootstrap.min.css"
	rel="stylesheet" type="text/css" />
<script
	src="<%=application.getContextPath()%>/resources/jquery/jquery.js"
	type="text/javascript"></script>
<script
	src="<%=application.getContextPath()%>/resources/bootstrap-3.3.7/js/bootstrap.min.js"
	type="text/javascript"></script>
	
	
	<script type="text/javascript">
	function fileChange() {
		if($("#battach")[0].files.length != 0) { //선택된 파일이 있을 경우에만
			var originalfilename = $("#battach")[0].files[0].name;
			$("#spanFileName").text(originalfilename);
		}
	}
	</script>
	
	
	
</head>
<body>
	<h4>게시물 쓰기</h4>
	<hr />
	<form method="post" style="padding: 0px 20px"
		enctype="multipart/form-data">
		<input type="hidden" name="bno" value="${board.bno}" />

		<div class="form-group">
			<div class="input-group">
				<span class="input-group-addon"> <span
					class="glyphicon glyphicon-user"></span>
				</span> <input type="text" class="form-control" placeholder="제목"
					name="btitle" value="${board.btitle}" />
			</div>
		</div>
		
		<div class="form-group">
			<div class="input-group">
				<span class="input-group-addon"> <span
					class="glyphicon glyphicon-user"></span>
				</span> <input type="text" class="form-control" placeholder="제목"
					name="bimage" value="${board.bimage}" />
			</div>
		</div>

		<div class="form-group">
			<div class="input-group">
				<span class="input-group-addon"> <span
					class="glyphicon glyphicon-tag"></span>
				</span> <input type="text" class="form-control" placeholder="글쓴이"
					name="bwriter" value="${board.bwriter}" disabled />
			</div>
		</div>

		<div class="form-group">
			<div class="input-group">
				<span class="input-group-addon"> <span
					class="glyphicon glyphicon-lock"></span>
				</span> <input type="password" class="form-control" placeholder="비밀번호"
					name="bpassword" value="${board.bpassword}" />
			</div>
		</div>

		<div class="form-group">
			<div class="input-group">
				<span class="input-group-addon"> <span
					class="glyphicon glyphicon-lock"></span>
				</span>

				<textarea class="form-control" rows="5" cols="30" placeholder="내용"
					name="bcontent" value="${board.bcontent}"></textarea>
			</div>
		</div>

		<div class="form-group">
			<div class="input-group">
				<span class="input-group-addon"> <span
					class="glyphicon glyphicon-camera"></span>
				</span>

				<!-- 
				<a>
				<input class="form-control" type="file" name="battach"/>
				<input class="form-control" type="text" value="${board.boriginalfilename}"/>
				</a>
				 -->


				<div class="form-control" style="height: 47px">
				<span id="spanFileName">${board.boriginalfilename}</span>
				<label for="battach" class="btn btn-default">변경</label>
				<input id="battach" style="visibility: hidden;" type="file" name="battach" onchange="fileChange()" multiple/>
				</div>


			</div>
		</div>

		<input type="submit" class="btn btn-info" value="수정하기" />
	</form>

</body>
</html>
