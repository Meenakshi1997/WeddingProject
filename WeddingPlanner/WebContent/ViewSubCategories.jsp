<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div style="background-image:url(images\\bg-body.jpg); height:100%; width:100%"></div>
<jsp:include page="AdminHeader.jsp"/>
	<br/><br/><br/><br/>
<!-- Content -->
<div class="container" style="margin-top:-600px">
	<c:if test="${not empty msg}">
		<div class="alert alert-success">
			${msg}
		</div>
	</c:if>
	
	<h1 style="font-family:Monotype Corsiva; text-align:center; color:brown; font-size:30px; font-weight:bold">List of Sub Categories</h1>
	<br/>
	<c:choose>
		<c:when test="${scList.size() eq 0}">
			No Categories Found...
		</c:when>
		<c:otherwise>
			<table class="table table-hover">
				<tr>
					<!--<th>Category Id</th>-->
		<!-- 			<th>Category Id</th> -->
					<th style="font-family:Monotype Corsiva; color:brown; font-size:30px; font-weight:bold">Category Name</th>
					<th style="font-family:Monotype Corsiva; color:brown; font-size:30px; font-weight:bold">Category Description</th>
				</tr>
				<c:forEach items="${scList}" var="subCategoryObj">
					<tr>
						<!--<td>${categoryObj.categoryId}</td>-->
						<%-- <td>${categoryObj.categoryId}</td> --%>
						<td>${subCategoryObj.subCategoryName}</td>
						
						<td>
							
							<a href="deleteSubCategory?subCatId=${subCategoryObj.subCategoryId}"><i class="fa fa-trash" aria-hidden="true"></i></a>
						</td>
						<td>
							<a href="updateSubCategory?subCatId=${subCategoryObj.subCategoryId}"><i class="fa fa-edit" aria-hidden="true"></i></a>
						</td>
						
					</tr>
				</c:forEach>
			</table>
		</c:otherwise>
	</c:choose>
 </div>