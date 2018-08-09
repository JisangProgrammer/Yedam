package com.ylib.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ylib.dao.LibDAO;
import com.ylib.dto.LibVO;

public class UpdateCommand implements Command {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		LibVO dto = new LibVO();
		dto.setbId(Integer.parseInt(request.getParameter("bId")));
		dto.setbName(request.getParameter("bName"));
		dto.setWriter(request.getParameter("writer"));
		dto.setPublisher(request.getParameter("publisher"));
		dto.setLocation(request.getParameter("location"));
		dto.setComments(request.getParameter("comments"));
		
		LibDAO dao = new LibDAO();
		dao.updateBook(dto);
		new ListCommand().execute(request, response);
	}
}
