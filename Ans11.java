import java.util.Scanner;

public class Ans11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("달을 입력하세요(1~12)>>");
		Scanner scanner = new Scanner(System.in);
		
		int month;
		month = scanner.nextInt();
		
		if(3<=month && month<=5){
			System.out.print("봄");
		}
		else if(month>=6 && month<=8) {
			System.out.print("여름");
		}
		else if(month>=9 && month<=11) {
			System.out.print("가을");
		}
		else if(month == 12 ||month == 1 || month == 2){
			System.out.print("겨울");
		}
		
		else {
			System.out.print("잘못입력");
		}
		scanner.close();
	}
}
