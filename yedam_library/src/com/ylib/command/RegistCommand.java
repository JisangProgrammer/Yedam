package com.ylib.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ylib.dao.LibDAO;

public class RegistCommand implements Command {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String bName = request.getParameter("bName");
		String writer = request.getParameter("writer");
		String publisher = request.getParameter("publisher");
		String comments = request.getParameter("comments");
		
		LibDAO dao = new LibDAO();
		dao.regist(bName, writer, publisher, comments);
	};
}
