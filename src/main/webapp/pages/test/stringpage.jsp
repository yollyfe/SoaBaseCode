<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<div>
	<table>
		<c:forEach items="${myList}" var="myString">
			<tr>
				<td>
					<b>${myString}</b>
				</td>
			</tr>
		</c:forEach>
		
		============ HOHOHO +==============
		${myString}
	</table>
</div>
