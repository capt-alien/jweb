package com.pets.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pets.models.Dog;


@WebServlet("/DisplayDog")
public class DisplayDog extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DisplayDog() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/Dog.jsp");
		view.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Dog dog = new Dog(request.getParameter("name"), request.getParameter("breed"),
										Integer.parseInt(request.getParameter("weight")));
		request.setAttribute("dog", dog);
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/Dog.jsp");
		view.forward(request,  response);
	}

}
