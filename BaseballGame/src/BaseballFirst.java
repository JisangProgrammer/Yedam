import java.util.Scanner;

public class BaseballFirst {
	public static void main(String[] args) {
		int[] User = new int[3];
		int[] Com = new int[3];
		int strike = 0;
		int ball = 0;
		int out = 0;
		int count = 0;
		
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < Com.length; i++) { // 0~9 중 중복되지 않게 Com에 난수 입력받음
			Com[i] = (int) (Math.random() * 9);
			for (int j = 0; j < i; j++) { // 중복 방지
				if (Com[j] == Com[i]) {
					i--;
					break;
				}
			}
		}
		
		// //////////////// Com과 User의 숫자 비교 구현
		System.out.println("============ Rule ============");
		System.out.println("1. 숫자와 자리가 동시에 일치할 때, 스트라이크");
		System.out.println("2. 숫자만 맞고 자리는 맞지 않을 때, 볼");
		System.out.println("3. 숫자와 자리가 하나도 맞지 않을 때, 아웃");
		System.out.println("4. 0 ~ 9까지 입력 가능하고, 횟수는 9번");
		System.out.println("5. 3 스트라이크, 3 아웃, 횟수 초과 시 게임 종료 ");
		System.out.println("==============================");
		System.out.println("     게임 시작 !      ");
		
		while (true) {
			System.out.println("숫자 3개를 입력해주세요.");
			for (int i = 0; i < User.length; i++) { // 0 ~ 9 중 중복되지 않게 User에 입력
				System.out.print(i + 1 + "번째 숫자 입력 : ");
				User[i] = scan.nextInt();
				for (int j = 0; j < i; j++) {
					if (User[j] == User[i]) { // 중복 방지
						System.out.println("같은 숫자를 입력하였습니다. 다시 입력해주세요.");
						i--;
						break;
					}
				}
			}
			count++; // 횟수 증감식
			
			for (int i = 0; i < Com.length; i++) { // Strike, Ball 판단하는 조건식
				for (int j = 0; j < User.length; j++) {
					if (Com[i] == User[j]) {
						if (i == j) {
							strike += 1;
						} else
							ball += 1;
					}
				}
			}
			
			if (strike > 0 || ball > 0) { // Strike, Ball 출력
				System.out.println(strike + " 스트라이크, " + ball + " 볼입니다.");
				System.out.println();
			} else { // out 출력
				out++;
				System.out.println(out + " 아웃입니다.");
				System.out.println();
			}
			if (strike == 3) { // 3 스트라이크일 때 종료
				System.out.println("3 스트라이크로 게임을 종료합니다.");
				break;
			} else if (out == 3) { // 3 아웃일 때 종료
				System.out.println("3 아웃으로 게임을 종료합니다.");
				break;
			} else if (count == 9) { // 횟수 9번일 때 종료
				System.out.println("횟수 9번을 다 사용했습니다.");
				System.out.println("게임을 종료합니다.");
				break;
			}
			
			strike = 0; // Strike 값 초기화
			ball = 0; // Ball 값 초기화
		}
	}
}