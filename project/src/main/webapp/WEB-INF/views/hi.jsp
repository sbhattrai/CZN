<%@taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<tags:template>
	<jsp:attribute name="head">  
		<script type="text/javascript">
			// inline JavaScript here 
		</script>
  	</jsp:attribute>  
	<jsp:body>
	 <style>
	
	 h1{
       background-color: green;
	   color: yellow;
	   }
	   </style>
	   
	
		<h1><c:out value="${ name }" /></h1>
		
		<a href="hello">Homepage</a>
	</jsp:body>
</tags:template>
