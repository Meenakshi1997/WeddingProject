package com.wedding.controller;

import java.io.IOException;        
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.wedding.daos.SubCategoryDao;
import com.wedding.daosimpl.SubCategoryDaoImpl;
import com.wedding.models.SubCategory;


@WebServlet("/addSubCategoryProcess")
public class AddSubCategoryProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		
		int catId=(Integer)session.getAttribute("subCategoryId");
		String name=request.getParameter("subCategoryName");
		

		SubCategory subCatObj=new SubCategory();
		subCatObj.setSubCategoryName(name);
		subCatObj.setSubCategoryId(catId);
		
		SubCategoryDao subDaoObj=new SubCategoryDaoImpl();
		boolean r=subDaoObj.addSubCategory(subCatObj);
		
		if(r){
			List<SubCategory> subCategoriesList=subDaoObj.getAllSubCategories(catId);
			
			request.setAttribute("scList",subCategoriesList);
			request.setAttribute("msg","SubCategory Added Succesfully");
			RequestDispatcher rd=request.getRequestDispatcher("ViewSubCategories.jsp");
			rd.forward(request, response);
		}
		else {
			request.setAttribute("msg","Fail to Add SubCategory..SubCategory already exist.");
			RequestDispatcher rd=request.getRequestDispatcher("AddSubCategoryForm.jsp");
			rd.forward(request, response);
			
		}
		
	}

}
