package com.ylib.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ylib.dao.LibDAO;

public class ModifyCommand implements Command {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String bId = request.getParameter("bId");
		String writer = request.getParameter("writer");
		String bName = request.getParameter("bName");
		String comments = request.getParameter("comments");
		
		LibDAO dao = new LibDAO();
		dao.modify(bId, writer, bName, comments);
	}
}
