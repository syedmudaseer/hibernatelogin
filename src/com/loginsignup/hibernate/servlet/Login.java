package com.loginsignup.hibernate.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.loginsignup.hibernate.pojo.Userdetails;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("lemail");
		String password = request.getParameter("pwd");
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		
		Query query= session.createQuery("from Userdetails where Email='"+email+"' ");
				List list = query.list();
				Iterator itr= list.iterator();
				while(itr.hasNext()) {
					Userdetails u =(Userdetails)itr.next();
					String authpwd = u.getPassword();
					if(authpwd.equals(password)) {
					RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
					rd.forward(request,response);
				}
				}
				PrintWriter w = response.getWriter();
				RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
				w.print("<h1>invalid username</h1>");
				rd.include(request,response);
	}
	}

