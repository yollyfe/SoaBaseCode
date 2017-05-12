<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<div>
	<p>
	
		HELLO WORLD! - 
		<form action="${pageContext.request.contextPath}/modulename/profile" method="GET">
			UID : <input type="text" name="uid"/><br/>
			FNAME : <input type="text" name="fname" value="${myUser.fname}"/><br/>
			LNAME : <input type="text" name="fname" /><br/>
			TF 1 : <input type="text" name="testField" /><br/>
			TF 2 : <input type="text" name="testField" /><br/>
			<button type="submit">Submit Me</button>
		</form>
		
		${myString}
		My Name = ${myUser.fname }<br/>
		My UID = ${myUser.uid }<br/>
		
		//JSTL
		<c:forEach items="${myUserList}" var="myUsersss">
			USER FNAME IS === ${myUsersss.fname}<br/>
		</c:forEach>
	</p>
</div>
