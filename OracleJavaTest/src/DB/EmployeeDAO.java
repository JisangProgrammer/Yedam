package DB;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeDAO {
	Connection conn = null;
	
	public Connection getConnection() {
		
        try {
            String user = "hr"; 
            String pw = "hr";
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            
            Class.forName("oracle.jdbc.driver.OracleDriver");        
            conn = DriverManager.getConnection(url, user, pw);
            
            System.out.println("Database에 연결되었습니다.\n");
            
        } catch (ClassNotFoundException cnfe) {
            System.out.println("DB 드라이버 로딩 실패 :"+cnfe.toString());
        } catch (SQLException sqle) {
            System.out.println("DB 접속 실패 : "+sqle.toString());
        } catch (Exception e) {
            System.out.println("Unknown error");
            e.printStackTrace();
        }
		return conn;
	}
	
	public void insertEmp(EmployeeDTO dto) {
		getConnection();
		
		String sql = "INSERT INTO employees (employee_id, first_name, last_name, email, hire_date, job_id) VALUES (?, ?, ?, ?, sysdate, ?)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getEmployeeId());
			pstmt.setString(2, dto.getFirstName());
			pstmt.setString(3, dto.getLastName());
			pstmt.setString(4, dto.geteMail());
			pstmt.setString(5, dto.getJobId());
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + " 건이 입력되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void insertEmpProc(EmployeeDTO dto) {
		getConnection();
		
		try {
       	 	CallableStatement cstmt = conn.prepareCall("{call insert_emp_proc(?,?,?,?)}");
       	 	cstmt.setString(1, dto.getFirstName());
       	 	cstmt.setString(2, dto.getLastName());
       	 	cstmt.setString(3, dto.geteMail());
       	 	cstmt.setString(4, dto.getJobId());
       	 	int r = cstmt.executeUpdate();
       	 	System.out.println(r + " 건이 입력되었습니다.");
            
        } catch (SQLException e) {
       	 e.printStackTrace();
        }
	}
	
	public void updateEmp(EmployeeDTO dto) {
		getConnection();
		
		String sql = "UPDATE employees SET first_name = ?, last_name = ?, email = ?, job_id = ? WHERE employee_id = ?";
		int c = 1;
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(c++, dto.getFirstName());
			pstmt.setString(c++, dto.getLastName());
			pstmt.setString(c++, dto.geteMail());
			pstmt.setString(c++, dto.getJobId());
			pstmt.setString(c++, dto.getEmployeeId());
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + " 건이 수정되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void updateEmpProc() {
		getConnection();
		
		
	}
	
	public EmployeeDTO getEmpDTO(String emp_id) {
		getConnection();
		
        EmployeeDTO dto = null;
        String sql = "SELECT employee_id, first_name, last_name, email FROM employees WHERE employee_id = ?";
        
        try {
       	 	PreparedStatement pstmt = conn.prepareStatement(sql);
       	 	pstmt.setString(1, emp_id);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
           	 dto = new EmployeeDTO();
           	 dto.setEmployeeId(rs.getString("employee_id"));
           	 dto.setFirstName(rs.getString("first_name"));
           	 dto.setLastName(rs.getString("last_name"));
           	 dto.seteMail(rs.getString("email"));
            }
            
        } catch (SQLException e) {
       	 e.printStackTrace();
        }
		return dto;
	}
	
	public List<EmployeeDTO> getEmpList(SearchVO vo) {
		getConnection();
        
        EmployeeDTO dto = null;
        List<EmployeeDTO> list = new ArrayList<>();
        
        String whereClause = " where 1=1 ";
        
        if(vo.getSearchCondition().equals("first_name"))
        	whereClause += "and first_name like '%' || '" + vo.getSearchKeyword() + "' ||'%'";
        
        if(vo.getSearchCondition().equals("hire_date"))
        	whereClause += "and hire_date > to_date(" + vo.getSearchKeyword() + ", 'rrrrmmdd')";
        
        String sql = "SELECT employee_id, first_name, last_name, email FROM employees" + whereClause + " ORDER BY 1 DESC";
        System.out.println(sql);
        try {
        	PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
           	 dto = new EmployeeDTO();
           	 dto.setEmployeeId(rs.getString("employee_id"));
          	 dto.setFirstName(rs.getString("first_name"));
          	 dto.setLastName(rs.getString("last_name"));
          	 dto.seteMail(rs.getString("email"));
           	 list.add(dto);
            }
            
        } catch (SQLException e) {
       	 e.printStackTrace();
        }
		return list;
	}
	
	public List<Map<String, Object>> getEmplistMap() {
		getConnection();
		
		String sql = "SELECT employee_id, first_name FROM employees";
		Map<String, Object> map = null;
		List<Map<String, Object>> list = new ArrayList<>();
		
		try {
       	 	PreparedStatement pstmt = conn.prepareStatement(sql);
       	 	ResultSet rs = pstmt.executeQuery();
       	 	while(rs.next()) {
       	 		map = new HashMap<>();
       	 		map.put("employee_id", rs.getString("employee_id"));
       	 		map.put("first_name", rs.getString("first_name"));
       	 		list.add(map);
       	 	}
            
        } catch (SQLException e) {
        	e.printStackTrace();
        } finally {
        	try {
        		conn.close();
        	} catch (SQLException e) {
        		e.printStackTrace();
        	}
        }
		return list;
	}
	
	public List<EmployeeDTO> getEmpListCursor() {
		getConnection();
		
		List<EmployeeDTO> list = new ArrayList<>();
		EmployeeDTO dto = null;
		
		try {
			CallableStatement cstmt = conn.prepareCall("{call get_emplist_proc(?,?,?)}");
			cstmt.setInt(1, 500);
			cstmt.setDate(2, new Date(100,0,1));
			cstmt.registerOutParameter(3, oracle.jdbc.OracleTypes.CURSOR);
			cstmt.executeQuery();
			ResultSet rs = (ResultSet) cstmt.getObject(3);
			while (rs.next()) {
				dto = new EmployeeDTO();
				dto.setEmployeeId(rs.getString("employee_id"));
	          	dto.setFirstName(rs.getString("first_name"));
	          	dto.setLastName(rs.getString("last_name"));
	          	dto.seteMail(rs.getString("email"));
	          	dto.setJobId(rs.getString("job_id"));
	          	list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
		
	}
}
