package com.loginsignup.hibernate.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.loginsignup.hibernate.pojo.Userdetails;

import com.sun.org.apache.xerces.internal.parsers.IntegratedParserConfiguration;

/**
 * Servlet implementation class Signup
 */
public class Signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Signup() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Userdetails user = new Userdetails();
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone_number = request.getParameter("phone");
		String password = request.getParameter("pwd");
		user.setId(Integer.parseInt("100"));
		user.setName(name);
		user.setEmail(email);
		user.setPhone(phone_number);
		user.setPassword(password);
		org.hibernate.SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
		out.println("Thank you for registration");
         
		
	}

}
