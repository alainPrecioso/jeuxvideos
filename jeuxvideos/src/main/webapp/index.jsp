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
<title>Projet Jeux Vidéos</title>
</head>
<body>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2"
		crossorigin="anonymous"></script>
<script type="text/javascript">
    $(function () {
        $("[rel='tooltip']").tooltip();
    });
</script>

	<c:if test="${empty requestScope.list }">
<p>
		<a href="list">liste</a>
		</p>
	</c:if>
	<c:if test="${!empty requestScope.list }">
		<div class="accordion" id="accjeux">
			<c:set var="i" value="0" scope="request" />
			<c:forEach items="${requestScope.list}" var="jeu">
				<c:set var="i" value="${i+1}" scope="request" />
				<c:set var="jeu" value="${jeu}" scope="request" />
				<c:import url="WEB-INF/jeu.jsp"></c:import>

			</c:forEach>
		</div>
	</c:if>
</body>
</html>