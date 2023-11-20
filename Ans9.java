import java.util.Scanner;

public class Ans9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double x,y,r,d;
		int xMiddle, yMiddle;
		System.out.print("원의 중심과 반지름 입력>>");
		xMiddle= scanner.nextInt();
		yMiddle= scanner.nextInt();
		r= scanner.nextDouble();
		
		System.out.print("점 입력>>");
		x= scanner.nextDouble();
		y= scanner.nextDouble();
		d= Math.sqrt((x - xMiddle)*(x - xMiddle) + (x - xMiddle)*(y - yMiddle));
		
		//Math.sqrt= 제곱근(루트) 구하기
		//r*r = 원의 중심이 (a, b)이고 반지름이 r인 원의 방정식은 (x - a)2 + (y - b)2 = r2
		
		if(d<r) {
		System.out.print("점 ("+x+","+y+")은 원 안에 있다.");
		}
		else {
		System.out.print("점 ("+x+","+y+")은 원 안에 있지 않다.");
		}
		scanner.close();
}
}
