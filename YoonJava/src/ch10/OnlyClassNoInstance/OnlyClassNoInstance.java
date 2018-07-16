package ch10.OnlyClassNoInstance;

class InstCnt {
	static int instNum = 100;
	
	InstCnt() {
		instNum++;
		System.out.println("인스턴스 생성 : " + instNum);
	}
}

class OnlyClassNoInstance {
	public static void main(String[] args) {
		InstCnt.instNum -= 15;  // 인스턴스 생성 없이 instNum에 접근
		System.out.println(InstCnt.instNum);
	}
}
