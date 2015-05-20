<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<c:if test="${not empty usuarioLogado}">
 Logado como: ${usuarioLogado.email}</br></br>
	</c:if>


	Bem vindo ao nosso gerenciador de empresas!!
	<br />
	<form action="novaEmpresa" method="POST">
		Nome: <input type="text" name="nome"> <input type="submit"
			value="Enviar">
	</form>

	<form action="login" method="POST">
		Email: <input type="email" name="email" /> Senha: <input
			type="password" name="senha" /> <input type="submit" value="Logar" />
	</form>

	<form action="logou" method="POST">
		<input type="submit"value"Logout">
	</form>
</body>
</html>

