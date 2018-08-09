package com.ylib.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ylib.dao.LibDAO;
import com.ylib.dto.LibVO;

public class InsertCommand implements Command {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		LibVO dto = new LibVO();
		dto.setbName(request.getParameter("bName"));
		dto.setWriter(request.getParameter("writer"));
		dto.setPublisher(request.getParameter("publisher"));
		dto.setComments(request.getParameter("comments"));
		dto.setLocation(request.getParameter("location"));
		
		LibDAO dao = new LibDAO();
		dao.insertBook(dto);
		new ListCommand().execute(request, response);
	};
}
