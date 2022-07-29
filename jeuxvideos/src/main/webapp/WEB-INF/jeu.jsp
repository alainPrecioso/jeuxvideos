<div>
	<div class="accordion-item">
		<h2 class="accordion-header" id="heading${i}">
			<button class="accordion-button" type="button"
				data-bs-toggle="collapse" data-bs-target="#collapse${i}"
				aria-expanded="false" aria-controls="collapse${i}">
				<c:out value="${jeu.nom}" />
			</button>
		</h2>
		<div id="collapse${i}" class="accordion-collapse collapse"
			aria-labelledby="heading${i}" data-bs-parent="#accjeux">
			<div class="accordion-body">
				<p>
					Description :
					<c:out value="${jeu.description}" />
				</p>
				<p>
					Prix :
					<c:out value="${jeu.prix}" />
					€
				</p>
				<p>
					Sortie :
					<fmt:formatDate dateStyle="long" pattern="dd MMMM yyyy"
						value="${jeu.dateSortie}" />
				</p>
				<p>
					Pays :
					<c:out value="${jeu.pays}" />
				</p>
				<p>
					Connexion :
					<c:out value="${jeu.connexion}" />
				</p>
				<p>
					Mode(s) :
					<c:out value="${jeu.mode}" />
				</p>
				<p>
					Genre : <a href="#" rel="tooltip" title="${jeu.genre.description}"><c:out
							value="${jeu.genre.nom}" /></a>
				</p>
				<p>
					Plateforme(s) :
					<c:forEach items="${jeu.plateformes}" var="pf">
						<a href="#" rel="tooltip" title="${pf.description}"><c:out
								value="${pf.nom}" /></a>
					</c:forEach>
				</p>
				<%-- 			<form method="post" action="editjeu">
  <button type="submit" name="edit" value="${jeu.nom}">
    Modifier
  </button>
</form> --%>



				<c:set var="jeumodif" value="${jeumodif}" scope="request" />
				<button type="button" class="btn btn-primary" data-bs-toggle="modal"
					data-bs-target="#staticBackdrop${i}">Modifier</button>

			</div>
		</div>
	</div>


	<!-- Modal -->
	<div class="modal fade" id="staticBackdrop${i}" data-bs-backdrop="static"
		data-bs-keyboard="false" tabindex="-1"
		aria-labelledby="staticBackdropLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="staticBackdropLabel">
						Modifier
						<c:out value="${jeu.nom}" />
					</h5>
					<button type="button" class="btn-close" data-bs-dismiss="modal"
						aria-label="Close"></button>
				</div>
				<div class="modal-body">
				<form method="post" action="editjeu">
					<c:import url="WEB-INF/editjeu.jsp"></c:import>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-bs-dismiss="modal">Close</button>
					<button type="submit" class="btn btn-primary">Modifier</button>
					</form>
				</div>
			</div>
		</div>
	</div>
</div>
