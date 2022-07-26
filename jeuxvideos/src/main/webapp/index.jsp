<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
	crossorigin="anonymous">
<link rel="stylesheet" href="./ressources/css/index.css">
<title>Insert title here</title>
</head>
<body>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2"
		crossorigin="anonymous"></script>

	<c:if test="${empty requestScope.list }">
		<a href="list">list</a>
	</c:if>
	<c:if test="${!empty requestScope.list }">
		<c:forEach items="${requestScope.list}" var="jeu">
			<!-- <c:import url="WEB-INF/jeu.jsp"></c:import> -->
			<div>
				<p>test jeu.jsp</p>
				<p>
					<c:out value="${jeu.nom}" />
				</p>
				<p>
					<c:out value="${jeu.description}" />
				</p>
			</div>
		</c:forEach>
	</c:if>

</body>
</html>