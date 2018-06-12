<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Spring-4 MVC</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="<c:url value='/' />">Home</a></li>
      <li><a href="<c:url value='/other' />" >Other</a></li>
      <li><a href="#">Page 2</a></li>
      <li><a href="#">Page 3</a></li>
      <li><a href="<c:url value='/list' />" >Admin</a></li>
      <li><c:if test="${pageContext.request.userPrincipal.name != null}">
            	<a href="javascript:document.getElementById('logout').submit()">Logout</a>
            </c:if></li>

            <li><a href="<c:url value="/logout" />">Logout</a></li>

    </ul>
  </div>


</nav>