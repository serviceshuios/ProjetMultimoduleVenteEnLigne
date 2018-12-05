<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div id="formUser" class="cadre">
		<!-- dans modelAttribute on mets le modéle initié dans le contrôleur
	et dans le construction du formulaire l'attribut path contient
	à chaque fois un attribut du modèle
	personne.id, personne.nom, personne.prenom et personne.age -->
		<f:form modelAttribute="user" action="saveUser" method="post">
			<f:errors />
			<table>
				<tr>
					<td>username</td>
					<td><f:input path="userName" /></td>
					<td><f:errors path="userName"></f:errors></td>
				</tr>
				<tr>
					<td>password</td>
					<td><f:input path="password" /></td>
					<td><f:errors path="password"></f:errors></td>
				</tr>
				<tr>
					<td>role</td>
					<td><f:input path="role" /></td>
					<td><f:errors path="role"></f:errors></td>
				</tr>
				<tr>
					<td>adresse</td>
					<td><f:input path="adresse" /></td>
					<td><f:errors path="adresse"></f:errors></td>
				</tr>
				<tr>
					<td>email</td>
					<td><f:input path="email" /></td>
					<td><f:errors path="email"></f:errors></td>
				</tr>
				<tr>
					<td>tel</td>
					<td><f:input path="tel" /></td>
					<td><f:errors path="tel"></f:errors></td>
				</tr>
				<tr>
					<td><input type="submit" value="Save"></td>
				</tr>
			</table>
		</f:form>
	</div>
	<div id="tabPersonnes" class="cadre">
		<table class="tabStyle1">
			<tr>
				<th>ID</th>
				<th>username</th>
				<th>role</th>
				<th>adresse</th>
				<th>email</th>
				<th>tel</th>
				<th>SUPPR</th>
				<th>MAJ</th>
			</tr>
			<c:forEach items="${user}" var="u">
				<tr>
					<td>${u.idUser}</td>
					<td>${u.userName}</td>
					<td>${u.role}</td>
					<td>${u.adresse}</td>
					<td>${u.email}</td>
					<td>${u.tel}</td>
					<td><a href="supprPers?idPers=${u.idUser}">Supprimer</a></td>
					<td><a href="editPers?idPers=${u.idUser}">Edit</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>