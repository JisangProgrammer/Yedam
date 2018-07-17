package ch10.ConOverloading;

class Person {
	private int regiNum;  // 주민등록번호
	private int passNum;  // 여권 번호
	
	Person(int rnum, int pnum) {  // 여권이 있는 이를 위한 생성자
		regiNum = rnum;
		passNum = pnum;
	}
	Person(int rnum) {  // 여권이 없는 이를 위한 생성자
//		regiNum = rnum;
//		passNum = 0;
		this(rnum, 0);  // rnum과 0을 인자로 받는 다른 생성자 호출
	}
	void showPersonalInfo() {
		System.out.println("주민등록번호 : " + regiNum);
		
		if(passNum != 0)
			System.out.println("여권 번호 : " + passNum + '\n');
		else
			System.out.println("여권을 가지고 있지 않습니다. \n");
	}
}

class ConOverloading {
	public static void main(String[] args) {
		// 여권 있는 사람의 정보를 담은 인스턴스 생성
		Person jung = new Person(335577, 112233);
		Person hong = new Person(775544);
		jung.showPersonalInfo();
		hong.showPersonalInfo();
	}
}