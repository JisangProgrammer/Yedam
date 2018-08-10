package com.ylib.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ylib.command.Command;
import com.ylib.command.ContentCommand;
import com.ylib.command.DeleteCommand;
import com.ylib.command.ListCommand;
import com.ylib.command.UpdateCommand;
import com.ylib.command.InsertCommand;

@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public FrontController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		actionDo(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		actionDo(request, response);
	}
	
	private void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String viewPage = null;
		
		Command command = null;
		
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());
		
		if(com.equals("/regist_view.do")) {
			viewPage = "regist_view.jsp";
		}
		else if(com.equals("/regist.do")) {
			command = new InsertCommand();
			command.execute(request, response);
			viewPage = "list.do";
		}
		else if(com.equals("/list.do")) {
			command = new ListCommand();
			command.execute(request, response);
			viewPage = "list.jsp";
		}
		else if(com.equals("/content_view.do")){
			command = new ContentCommand();
			command.execute(request, response);
			viewPage = "content_view.jsp";
		}
		else if(com.equals("/modify.do")) {
			command = new UpdateCommand();
			command.execute(request, response);
			viewPage = "list.do";
		}
		else if(com.equals("/delete.do")) {
			command = new DeleteCommand();
			command.execute(request, response);
			viewPage = "list.do";
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}
}
