import java.util.Scanner;

public class Ans8 {

	public static void main(String args[]){
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int x1, y1, x2, y2;
		System.out.print("직사각형의 왼쪽 상단 모서리 (x1, y1)의 좌표를 입력하시오>>");
		x1 = scanner.nextInt();
		y1 = scanner.nextInt();
		System.out.print("직사각형의 오른쪽 하단 모서리 (x2, y2)의 좌표를 입력하시오>>");
		x2 = scanner.nextInt();
		y2 = scanner.nextInt();
		
		if(inRect(x1, y1) && inRect(x2, y2))
			System.out.println("충돌합니다.");
		else
			System.out.println("충돌하지 않습니다.");
		scanner.close();
	}
	public static boolean inRect(int x, int y)
	{
		if((x>=100 && x<=200) || (y>=100 && y<=200))
			return true;
		else return false;
	}
}
