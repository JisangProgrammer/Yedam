package DB;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EmployeeMgmt {
	EmployeeDAO dao = new EmployeeDAO();
	EmployeeDTO dto = new EmployeeDTO();
	SearchVO vo = new SearchVO();
	Scanner sc = new Scanner(System.in);
	
	public void empListProc() {	
		vo.setSearchCondition("hire_date");
		vo.setSearchKeyword("20080101");
		 
		List<EmployeeDTO> list = dao.getEmpList(vo);
//		System.out.println("                                      <리스트>");
//		System.out.println("================================================================================");
//		System.out.println("  사원 번호\t이름\t성\t이메일\t입사일");
		System.out.println("================================================================================");
		for (EmployeeDTO dto1 : list)
			System.out.println(dto1);
	}
	public void empDTOProc() {
		System.out.println("조회할 사원 번호를 입력하세요.");
		String empNo = sc.nextLine();
		EmployeeDTO dto2 = dao.getEmpDTO(empNo);
		System.out.println(dto2);
	}
	public void insertEmpProc() {
		System.out.println("입력할 사원 번호를 입력하세요.");
		String empNo = sc.nextLine();
		System.out.println("이름을 입력하세요.");
		String FirstName = sc.nextLine();
		System.out.println("성을 입력하세요.");
		String LastName = sc.nextLine();
		System.out.println("이메일을 입력하세요.");
		String eMail = sc.nextLine();
		System.out.println("직무를 입력하세요.");
		String job = sc.nextLine();
		
		dto.setEmployeeId(empNo);
		dto.setFirstName(FirstName);
		dto.setLastName(LastName);
		dto.seteMail(eMail);
		dto.setJobId(job);
//		dao.insertEmp(dto);
		dao.insertEmpProc(dto);
	}
	public void updateEmpProc() {
		System.out.println("수정할 사원 번호를 입력하세요.");
		String empNo = sc.nextLine();
		System.out.println("이름을 입력하세요.");
		String FirstName = sc.nextLine();
		System.out.println("성을 입력하세요.");
		String LastName = sc.nextLine();
		System.out.println("이메일을 입력하세요.");
		String eMail = sc.nextLine();
		System.out.println("직무를 입력하세요.");
		String job = sc.nextLine();
		
		dto.setEmployeeId(empNo);
		dto.setFirstName(FirstName);
		dto.setLastName(LastName);
		dto.seteMail(eMail);
		dto.setJobId(job);
		dao.updateEmp(dto);
	}
	public void empListMapProc() {
		List<Map<String, Object>> list1 = new ArrayList<Map<String, Object>>();
		 list1 = dao.getEmplistMap();
		 for (Map<String, Object> map : list1)
			 System.out.println(map);
	}
	public void empListCursorProc() {
		List<EmployeeDTO> list = dao.getEmpListCursor();
		for (EmployeeDTO dto : list) {
			
		}
	}
}