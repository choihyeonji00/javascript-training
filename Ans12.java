import java.util.Scanner;

public class Ans12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("연산>>");
		Scanner scanner= new Scanner(System.in);
		
	int num1,num2;
	int answer=0;
	
	num1 = scanner.nextInt();
	String s= scanner.next();
	num2 = scanner.nextInt();
	
	if(s.equals("+")) {
		answer = num1+num2;
	}
	else if(s.equals("-")) {
		answer = num1-num2;
	}
	else if(s.equals("*")) {
		answer = num1*num2;
	}
	else if (s.equals("/")) {
		if(num2==0) {
			System.out.print("0으로 나눌 수 없습니다.");
			scanner.close();
		}
		else {
			answer = num1 / num2;
			scanner.close();
		}
	}
	else {
		System.out.print("잘못된 입력입니다.");
		scanner.close();
	}
	System.out.print(num1+s+num2+"의 계산 결과는"+answer);
		scanner.close();
	}
}
