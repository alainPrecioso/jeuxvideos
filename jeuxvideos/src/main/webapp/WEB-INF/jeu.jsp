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
					<%-- <c:out value="${jeu.dateSortie}" /> --%>
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



			</div>
		</div>
	</div>








	<%-- <div class="accordion-item">
		<h2 class="accordion-header" id="panelsStayOpen-heading${i}">
			<button class="accordion-button" type="button"
				data-bs-toggle="collapse"
				data-bs-target="#panelsStayOpen-collapse${i}" aria-expanded="false"
				aria-controls="panelsStayOpen-collapse${i}">
				<c:out value="${jeu.nom}" />
			</button>
		</h2>
		<div id="panelsStayOpen-collapse${i}"
			class="accordion-collapse collapse"
			aria-labelledby="panelsStayOpen-heading${i}">
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
			</div>
		</div>
	</div> --%>








	<%-- <div class="accordion-item">
    <h2 class="accordion-header" id="panelsStayOpen-heading${i}">
      <button class="accordion-button" type="button" data-bs-toggle="collapse" data-bs-target="#panelsStayOpen-collapse${i}" aria-expanded="false" aria-controls="panelsStayOpen-collapse${i}">
        <c:out value="${jeu.nom}" />
      </button>
    </h2>
    <div id="panelsStayOpen-collapse${i}" class="accordion-collapse collapse show" aria-labelledby="panelsStayOpen-heading${i}">
      <div class="accordion-body">
        <c:out value="${jeu.description}" />
      </div>
    </div>
  </div> --%>


	<%-- <h3><c:out value="${jeu.nom}" /></h3>
	<p>
		<c:out value="${jeu.description}" />
	</p>
	<hr>
	</div> --%>



</div>
