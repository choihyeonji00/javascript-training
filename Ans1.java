import java.util.Scanner;

public class Ans1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("원화를 입력하세요(단위 원) >>");
		Scanner in = new Scanner(System.in);
		double money = in.nextInt();
		System.out.println("3300원은 $" + money / 1100 +"입니다.");
		in.close();
	}
}

