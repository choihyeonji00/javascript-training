import java.util.Scanner;

public class Ans12Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("연산>>");
		Scanner scanner= new Scanner(System.in);
		
	int num1,num2;
	int answer=0;
	
	num1 = scanner.nextInt();
	String s= scanner.next();
	num2 = scanner.nextInt();
	
	switch(s) {
	case "+":
		answer = num1 + num2;
		System.out.print(num1+s+num2+"의 계산 결과는");
		break;
	case "-":
		answer = num1 - num2;
		System.out.print(num1+s+num2+"의 계산 결과는");
		break;
	case "*":
		answer = num1 * num2;
		System.out.print(num1+s+num2+"의 계산 결과는"+answer);
		break;
	case "/":
		if(num2==0) {
			System.out.print("0으로 나눌 수 없습니다.");
		}
		else {
			answer = num1/num2;
			System.out.print(num1+s+num2+"의 계산 결과는"+answer);
		}
		break;
	}
	scanner.close();
}
}