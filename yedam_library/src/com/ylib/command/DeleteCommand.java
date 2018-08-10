package com.ylib.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ylib.dao.LibDAO;
import com.ylib.dto.LibVO;

public class DeleteCommand implements Command {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		LibVO dto = new LibVO();
		dto.setbId(Integer.parseInt(request.getParameter("bId")));
		
		LibDAO dao = new LibDAO();
		dao.deleteBook(dto);
		new ListCommand().execute(request, response);
	}
}
