package DB;

import java.util.Scanner;

public class Employee 
{
	public static void main(String[] args) {
		 EmployeeMgmt mgmt = new EmployeeMgmt();
		 
		 Scanner sc = new Scanner(System.in);
		 
		 int menu;
		 
		 while (true) {
			 System.out.println("메뉴를 선택하세요.\n1:전체 조회(조건), 2:단건 조회, 3:입력, 4:수정, 5:전체 조회(Map), 6:종료, 7:리스트(커서)");
			 
			 menu = sc.nextInt();
			 System.out.println("조회 조건을 입력하세요.");
			 
			 switch (menu) {
			 case 1:
				 mgmt.empListProc();
				 break;
			 case 2:
				 mgmt.empDTOProc();
				 break;
			 case 3:
				 mgmt.insertEmpProc();
				 break;
			 case 4:  // Update
				 mgmt.updateEmpProc();
				 break;
			 case 5:
				 mgmt.empListMapProc();
				 break;
			 case 6:
				 System.out.println("프로그램을 종료합니다.");
				 System.exit(0);
			 case 7:
				 mgmt.empListCursorProc();
				 break;
			 } 
		 }
	}
}