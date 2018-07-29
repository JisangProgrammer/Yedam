package ch16.MyFriends2;

class Friend {
	protected String name;
	protected String phone;
	
	public Friend(String na, String ph) {
		name = na;
		phone = ph;
	}
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("전화 : " + phone);
	}
}

class UnivFriend extends Friend {
	private String major;
	
	public UnivFriend(String na, String ma, String ph) {
		super(na, ph);
		major = ma;
	}
	public void showInfo() {
		super.showInfo();
		System.out.println("전공 : " + major);
	}
}

class CompFriend extends Friend {
	private String department;
	
	public CompFriend(String na, String de, String ph) {
		super(na, ph);
		department = de;
	}
	public void showInfo() {
		super.showInfo();
		System.out.println("부서 : " + department);
	}
}

class MyFriends2 {
	public static void main(String[] args) {
		Friend[] frns = new Friend[10];
		int cnt = 0;
		
		frns[cnt++] = new UnivFriend("LEE", "Computer", "010-1234-5678");
		frns[cnt++] = new UnivFriend("JANG", "Economy", "010-8765-4321");
		frns[cnt++] = new CompFriend("KI", "R&D 1", "02-123-8888");
		frns[cnt++] = new CompFriend("KOO", "R&D 2", "02-321-3212");
		
		// 모든 동창 및 동료의 정보 전체 출력
		for(int i = 0; i < cnt; i++) {
			frns[i].showInfo();  // 오버라이딩한 메소드가 호출된다.
			System.out.println();
		}
	}
}