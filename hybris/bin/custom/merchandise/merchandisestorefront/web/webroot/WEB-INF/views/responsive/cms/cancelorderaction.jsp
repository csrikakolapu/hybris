<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="theme" tagdir="/WEB-INF/tags/shared/theme" %>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 
 
 <c:choose>
 
 	<c:when test="${cancellable}">
 		<form:form action="${actionUrl}" method="post">
         	<p><button class="form"><spring:theme code="text.cancel" text="Cancel"/></button></p>
    	 </form:form>
 	</c:when>
 	<c:otherwise>
 		no actions
 	</c:otherwise>
 	
 </c:choose>
 