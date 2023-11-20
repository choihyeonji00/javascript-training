import java.util.Scanner;

public class Ans3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("금액을 입력하시오>> ");
		Scanner scanner = new Scanner(System.in);
		int num=scanner.nextInt();
		if (num>50000) {
		System.out.println("오만원권"+ num/50000 +"매");
		num%=50000;
		}
		if (num>10000){
		System.out.println("만원권"+ num/10000 +"매");
		num = num % 10000;
		}
		if (num>1000) {
		System.out.println("천원권"+ num/1000 +"매");
		num= num % 1000;
		}
		if (num>100) {
		System.out.println("백원"+ num/100 +"개");
		num=num%100;	
		}
		if(num>50) {
		System.out.println("오십원"+ num/50 +"개");
		num=num%50;
		}
		if(num>10) {
		System.out.println("십원"+ num/10 +"개");
		num = num % 10;
		}
		if(num>1) {
		System.out.println("일원"+ num/1 +"개");
		num = num % 1;
		}
		scanner.close();
	 }
}
