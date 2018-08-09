package com.ylib.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ylib.dao.LibDAO;
import com.ylib.dto.LibVO;

public class ListCommand implements Command {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		LibDAO dao = new LibDAO();
		List<LibVO> dtos = dao.list();
		request.setAttribute("list", dtos);
	};
}
