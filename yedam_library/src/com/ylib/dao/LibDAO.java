package com.ylib.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.ylib.dto.LibVO;

public class LibDAO {
	DataSource dataSource;
	
	public LibDAO() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/orcl");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<LibVO> list() {
		String sql = "select * from books order by bId desc";
		List<LibVO> dtos = new ArrayList<LibVO>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = dataSource.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				LibVO dto = new LibVO();
				dto.setbId(rs.getInt("bId"));
				dto.setbName(rs.getString("bName"));
				dto.setWriter(rs.getString("writer"));
				dto.setPublisher(rs.getString("publisher"));
				dto.setComments(rs.getString("comments"));
				dto.setLocation(rs.getString("location"));
				dto.setAmount(rs.getInt("amount"));
				dtos.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dtos;
	}

	public void insertBook(LibVO dto) {
		String sql = "insert into books(bId, bName, writer, publisher, location, amount, comments)"
					+ "values (books_seq.nextval, ?, ?, ?, ?, books_seq.currval, ?)";
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getbName());
			pstmt.setString(2, dto.getWriter());
			pstmt.setString(3, dto.getPublisher());
			pstmt.setString(4, dto.getLocation());
			pstmt.setString(5, dto.getComments());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}	
	}
	
	public LibVO contentView(String strID) {
		String sql = "select * from books where bId = ?";
		LibVO dto = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(strID));
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				dto = new LibVO();
				dto.setbId(rs.getInt("bId"));
				dto.setbName(rs.getString("bName"));
				dto.setWriter(rs.getString("writer"));
				dto.setPublisher(rs.getString("publisher"));
				dto.setComments(rs.getString("comments"));
				dto.setLocation(rs.getString("location"));
				dto.setAmount(rs.getInt("amount"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dto;
	}
	
	public void updateBook(LibVO dto) {
		String sql = "update books"
				+ "set bName = ?, writer = ?, publisher = ?, comments = ?, location = ?"
				+ "where bId = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getbName());
			pstmt.setString(2, dto.getWriter());
			pstmt.setString(3, dto.getPublisher());
			pstmt.setString(4, dto.getComments());
			pstmt.setString(5, dto.getLocation());
			pstmt.setInt(6, dto.getbId());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
