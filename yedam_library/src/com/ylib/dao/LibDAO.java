package com.ylib.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

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

	public void regist(String bName, String writer, String publisher, String comments) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = dataSource.getConnection();
			String sql = "insert into books(bId, bName, writer, location, amount, comments) values (books_seq.nextval, ?, ?, ?, books_seq.currval, ?)";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, bName);
			preparedStatement.setString(2, writer);
			preparedStatement.setString(3, publisher);
			preparedStatement.setString(4, comments);
			int rn = preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}	
	}
	
	public ArrayList<LibVO> list() {
		ArrayList<LibVO> dtos = new ArrayList<LibVO>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String sql = "select * from books order by bId desc";
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				int bId = resultSet.getInt("bId");
				String bName = resultSet.getString("bName");
				String writer = resultSet.getString("writer");
				String comments = resultSet.getString("comments");
				String location = resultSet.getString("location");
				int amount = resultSet.getInt("amount");
				
				LibVO dto = new LibVO(bId, bName, writer, comments, location, amount, location);
				dtos.add(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dtos;
	}
	
	public LibVO contentView(String strID) {
		
		LibVO dto = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			
			connection = dataSource.getConnection();
			
			String sql = "select * from books where bId = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, Integer.parseInt(strID));
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				int bId = resultSet.getInt("bId");
				String bName = resultSet.getString("bName");
				String writer = resultSet.getString("writer");
				String comments = resultSet.getString("comments");
				String location = resultSet.getString("location");
				int amount = resultSet.getInt("amount");
				
				dto = new LibVO(bId, bName, writer, comments, location, amount, location);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dto;
	}
	
	public void modify(String bId, String writer, String bName, String comments) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "update books set writer = ?, bName = ?, comments = ? where bId = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, writer);
			preparedStatement.setString(2, bName);
			preparedStatement.setString(3, comments);
			preparedStatement.setInt(4, Integer.parseInt(bId));
			int rn = preparedStatement.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
