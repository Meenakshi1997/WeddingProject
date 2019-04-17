package com.wedding.controller;

import java.io.IOException;
import java.io.PrintWriter;

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


@WebServlet("/addSubCategory")
public class AddSubCategoryController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		int id=Integer.parseInt(request.getParameter("catId"));
		
		//CategoryDao catDao=new CategoryDaoImpl();
		//Category cat=catDao.getCategoryById(id);
		
		//HttpSession session=request.getSession();
		//session.setAttribute("catId",cat.getCategoryId());
		//request.setAttribute("categoryObj",cat);
		
		RequestDispatcher rd=request.getRequestDispatcher("SubCategoryForm.jsp");
		request.setAttribute("categoryId",id);
		rd.forward(request, response);
	}

}
