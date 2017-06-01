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
	type="text/javascript">
	
</script>

<script type="text/javascript">
	function handleBtnUpdate() {
		var mpassword = $("#mpassword").val();
		if(mpassword == "") {
			$("#mpassword").attr("placeholder","비밀번호를 입력하셔야 합니다.");
			$("#mpassword").css("border-color", "red");
			return;
		}
		$.ajax({
			url: "exam06CheckMpassword",
			method: "post",
			data: {"mid":"${member.mid}", "mpassword":mpassword},
			success: function(data) {
				if(data.result== "success") {
					//서버에서 응답이 와야함 - Json 형태의 {"result":"success"}
					location.href="exam06Update?mid=${member.mid}";	
				}else {
					$("#mpassword").val("");
					$("#mpassword").attr("placeholder","비밀번호가 다릅니다.");
					$("#mpassword").css("border-color", "red");
				}
			}
		});
	}

	function handleBtnDelete() {
		var mpassword = $("#mpassword").val();
		if(mpassword == "") {
			$("#mpassword").attr("placeholder","비밀번호를 입력하셔야 합니다.");
			$("#mpassword").css("border-color", "red");
			return;
		}
		$.ajax({
			url: "exam06CheckMpassword",
			method: "post",
			data: {"mid":"${member.mid}", "mpassword":mpassword},
			success: function(data) {
				if(data.result== "success") {			
					//서버에서 응답이 와야함 - Json 형태의 {"result":"success"}
					location.href="exam06Delete?mid=${member.mid}";	
				}else {
					$("#mpassword").val("");
					$("#mpassword").attr("placeholder","비밀번호가 다릅니다.");
					$("#mpassword").css("border-color", "red");
				}
			}
		});
	}
</script>

</head>
<body>
	<h4>회원정보 상세보기</h4>
	<hr />
	<form method="post" style="padding: 0px 20px"
		enctype="multipart/form-data">

		<div class="form-group">
			<div class="input-group">
				<span class="input-group-addon"> <span
					class="glyphicon glyphicon-user"></span>
				</span> <input type="text" class="form-control" placeholder="아이디"
					name="mid" value="${member.mid}" disabled />
			</div>
		</div>

		<div class="form-group">
			<div class="input-group">
				<span class="input-group-addon"> <span
					class="glyphicon glyphicon-user"></span>
				</span> <input type="text" class="form-control" placeholder="이름"
					name="mname" value="${member.mname}" disabled />
			</div>
		</div>

		<div class="form-group">
			<div class="input-group">
				<span class="input-group-addon"> <span
					class="glyphicon glyphicon-leaf"></span>
				</span> <input type="text" class="form-control" placeholder="전화번호"
					name="mtel" value="${member.mtel}" disabled />
			</div>
		</div>

		<div class="form-group">
			<div class="input-group">
				<span class="input-group-addon"> <span
					class="glyphicon glyphicon-leaf"></span>
				</span> <input type="date" class="form-control" placeholder="회원가입 날짜"
					name="bdate" value="${member.mdate}" disabled />
			</div>
		</div>

		<div class="form-group">
			<div class="input-group">
				<span class="input-group-addon"> <span
					class="glyphicon glyphicon-leaf"></span>
				</span> <input type="text" class="form-control" placeholder="이메일 주소"
					name="memail" value="${member.memail}" disabled />
			</div>
		</div>

		<div class="form-group">
			<div class="input-group">
				<span class="input-group-addon"> <span
					class="glyphicon glyphicon-leaf"></span>
				</span> <input type="text" class="form-control" placeholder="나이"
					name="mage" value="${member.mage}" disabled />
			</div>
		</div>

		<div class="form-group">
			<div class="input-group">
				<span class="input-group-addon"> <span
					class="glyphicon glyphicon-tag"></span>
				</span> <input type="text" class="form-control" placeholder="주소"
					name="maddress" value="${member.maddress}" disabled />
			</div>
		</div>

		<div class="form-group">
			<div class="input-group">
				<span class="input-group-addon"> <span
					class="glyphicon glyphicon-camera"></span>
				</span> <a class="form-control" href="#">${member.moriginalfilename}</a>
			</div>
		</div>

		<div class="form-group">
			<div class="input-group">
				<span class="input-group-addon"> <span
					class="glyphicon glyphicon-lock"></span>
				</span> <input id="mpassword" type="password" class="form-control"
					placeholder="비밀번호" name="mpassword" />
			</div>
		</div>

		<a href="exam06" class="btn btn-success">목록</a> <input
			onclick="handleBtnUpdate()" type="button" href="exam06"
			class="btn btn-warning" value="수정" /> <Input
			onclick="handleBtnDelete()" type="button" href="exam06"
			class="btn btn-danger" value="삭제" />

	</form>

</body>
</html>
