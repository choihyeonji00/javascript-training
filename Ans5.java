import java.util.Scanner;

public class Ans5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("정수 3개를 입력하시오>>");
		Scanner scanner=new Scanner(System.in);
		int num1=scanner.nextInt();
		int num2=scanner.nextInt();
		int num3=scanner.nextInt();
		if(num1>=num2 && num1>=num3) {
			if(num2 + num3> num1) {
				System.out.println("삼각형이 됩니다.");
			}
			else {
				System.out.println("삼각형이 되지 않습니다.");
			}
		}
		else if(num2>=num1 && num2>=num3) {
				if(num1+num3>num2) {
				System.out.println("삼각형이 됩니다.");
			}
				else {
				System.out.println("삼각형이 되지 않습니다.");
				}
		}
		else if(num3>num2 && num3>=num1) {
			if(num2+num1>num3) {
				System.out.println("삼각형이 됩니다.");
			}
			else {
				System.out.println("삼각형이 되지 않습니다.");
			}
		}
		scanner.close();
	}

}
