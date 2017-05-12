<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<div>
	<table>
		<c:forEach items="${myTableList}" var="myTable">
			<tr>
				<td>
					<b>${myTable.id} - ${myTable.age} - ${myTable.name}</b>
				</td>
			</tr>
		</c:forEach>
		
		============ HOHOHO +==============
		${myString}
	</table>
	
	======================INSERT NI =======================
	
		<form action="${pageContext.request.contextPath}/modulename/mytable/insert" method="GET">
			ID : <input type="text" name="id"/><br/>
			NAME : <input type="text" name="name"/><br/>
			AGE : <input type="text" name="age" /><br/>
			<button type="submit">Insert Me</button>
		</form>
		
	======================UPDATE NI =======================
	
		<form action="${pageContext.request.contextPath}/modulename/mytable/update" method="GET">
			ID : <input type="text" name="id"/><br/>
			NAME : <input type="text" name="name"/><br/>
			AGE : <input type="text" name="age" /><br/>
			<button type="submit">Update Me</button>
		</form>
		
		======================DELETE NI =======================
	
		<form action="${pageContext.request.contextPath}/modulename/mytable/delete" method="GET">
			ID : <input type="text" name="id"/><br/>
			NAME : <input type="text" name="name"/><br/>
			AGE : <input type="text" name="age" /><br/>
			<button type="submit">Delete Me</button>
		</form>
</div>
