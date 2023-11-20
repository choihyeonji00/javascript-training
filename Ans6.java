import java.util.Scanner;

public class Ans6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("1~99 사이의 정수를 입력하시오>>");
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		int first = num / 10; //나눗셈
		int second = num % 10; //나머지
		if((first==3||first==6||first==9) && (second==3||second==6||second==9)){
			System.out.println("박수짝짝");
		}
		else if((first==3||first==6||first==9) || (second==3||second==6||second==9)){
			System.out.println("박수짝");
		}//  ||결합(OR):피연산자 중 어느 한쪽만 참이면 참 AND결합(&&): 모두 참이어야 참
	
		else {
			System.out.println("출력하지 않음");
		}
		scanner.close();
	}
}
