package com.pets.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pets.models.Cat;


@WebServlet("/DisplayCat")
public class DisplayCat extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public DisplayCat() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/Cat.jsp");
	view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cat cat = new Cat(request.getParameter("name"), request.getParameter("breed"),
				Integer.parseInt(request.getParameter("weight")));
			request.setAttribute("cat", cat);
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/Cat.jsp");
		view.forward(request,  response);
	}

}
