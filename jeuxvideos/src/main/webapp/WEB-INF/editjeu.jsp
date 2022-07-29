	 <input type="hidden" name="nom" value="${jeumodif.nom}">
	<p>
		Description :
		<input type="text" name="description" value="${jeumodif.description}">
	</p>
	<p>
		Prix :
		<input type="text" name="prix" value="${jeumodif.prix}">
		€
	</p>
	<p>
		Sortie :
		<input type="date" id="start" name="dateSortie" value="${jeumodif.dateSortie}">
	</p>
	<p>
		Pays :
		<c:out value="${jeumodif.pays}" />
	</p>
	<p>
		Connexion :
		<c:out value="${jeumodif.connexion}" />
	</p>
	<p>
		Mode(s) :
		<c:out value="${jeumodif.mode}" />
	</p>
	<p>
		Genre : <select name="genres" id="genres">
				<option value="">Genre</option>
				<c:forEach items="${requestScope.genres}" var="genre">
					<option value="${genre.nom}" <c:if test="${genre.nom == jeumodif.genre.nom}">selected="selected"</c:if>><c:out value="${genre.nom}" /></option>
				</c:forEach>
				</select>
	</p>
	<p>
		Plateforme(s) :
		<c:forEach items="${jeumodif.plateformes}" var="pf">
			<a href="#" rel="tooltip" title="${pf.description}"><c:out
					value="${pf.nom}" /></a>
		</c:forEach>
		</select>
	</p>
	
	

	
	
	
	

