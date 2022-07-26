<div>
<div class="accordion-item">
    <h2 class="accordion-header" id="panelsStayOpen-heading${i}">
      <button class="accordion-button" type="button" data-bs-toggle="collapse" data-bs-target="#panelsStayOpen-collapse${i}" aria-expanded="false" aria-controls="panelsStayOpen-collapse${i}">
        <c:out value="${jeu.nom}" />
      </button>
    </h2>
    <div id="panelsStayOpen-collapse${i}" class="accordion-collapse collapse" aria-labelledby="panelsStayOpen-heading${i}">
      <div class="accordion-body">
        Description : <c:out value="${jeu.description}" />
      </div>
    </div>
  </div>








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
