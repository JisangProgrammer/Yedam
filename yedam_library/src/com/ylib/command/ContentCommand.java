package com.ylib.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ylib.dao.LibDAO;
import com.ylib.dto.LibVO;

public class ContentCommand implements Command {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String bId = request.getParameter("bId");
		LibDAO dao = new LibDAO();
		LibVO dto = dao.contentView(bId);
		
		request.setAttribute("content_view", dto);
	};
}
