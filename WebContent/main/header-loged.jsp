<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<!-- <link rel="stylesheet" href="../assets/css/main/bulma.css"> -->
<link rel="stylesheet" href="../assets/css/header.css">
<title>Insert title here</title>
<style type="text/css">

	.nav-notification img {
		width: 32px;
		/* background-color: #9E9E9E; */
		/* font-family: "Consolas", "Menlo", "Ubuntu Mono", monospace; */
		filter: invert(54%) sepia(87%) saturate(0%) hue-rotate(279deg) brightness(94%) contrast(115%);
	}

	.show-img {
		display: flex;
	}
	
	.hide-img {
		display: none;
	}
</style>
</head>
<body>
	<nav class="navigation">
		<div class="nav-wrapper">
			<div class="nav-container">
				<button class="nav-hamburger">
					<img style="width: 24px" alt="" src="../assets/img/main/hamburger-icon.png">
				</button>
				<div class="nav-left">
					<a class="nav-brand">
						<img alt="" src="../assets/img/account/logo.png" style="width: 55px">
					</a>
				</div>
				<div class="nav-right">
					<div class="nav-right-item nav-search">
						<form action="#" class="form-search">
							<input placeholder="궁금한 것을 검색해보세요.">
							<button style="appearance: none; border: 0 solid; text-align: left;">
								<img style="height: 36px" alt="" src="../assets/img/main/search_icon.png">
							</button>
						</form>
					</div>
					<div class="nav-right-item nav-notification">
						<img class="show-img" src="../assets/img/main/bell.png" alt="">
						<img class="hide-img" src="../assets/img/main/bell-alert.png" alt="">
					</div>
					<div class="nav-right-item nav-profile">
						
					</div>
				</div>
			</div>
		</div>
	</nav>
</body>
</html>