package myTest;

import java.util.HashSet;

class MyNum {
	private int num;
	public MyNum(int n) {
		num = n;
	}
	
	@Override
	public String toString() {
		return String.valueOf(num);
	}
}

class MyTest3 {
	public static void main(String[] args) {
		HashSet<MyNum> set = new HashSet<>();
		set.add(new MyNum(1111));
		set.add(new MyNum(2222));
		set.add(new MyNum(3333));
		set.add(new MyNum(1111));
		System.out.println(set.size());
	}
}
