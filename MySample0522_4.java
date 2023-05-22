import java.util.*;
class Math4
{
	int add(int a, int b)
	{
		int result;
		a=10;
		b=20;
		result = a + b;
		System.out.println("add 메서드 a:" +a+",b : "+b);
		System.out.println("결과 : " +result);
		return result;
	}
}

public class MySample0522_4 {

	public static void main(String[] args) 
	{
		
		Scanner scn = new Scanner(System.in);
		/*
		//클래스(메서드 호출순서 - 스택)
		System.out.println("mainMethod start...");
		firstMethod(); //같은 클래스 안에 있는 메서드를 호출할 때는 클래스/인스턴스명 생략 가능.(static-static / instance - intstance)
		System.out.println("mainMethod end...");
	}
	static void firstMethod()
	{
		System.out.println("firstMethod start...");
		secondMethod();
		System.out.println("firstMethod end...");
	}
	static void secondMethod()
	{
		System.out.println("secondMethod start...");
		thirdMethod();
		System.out.println("secondMethod end...");
	}
	static void thirdMethod()
	{
		System.out.println("thirdMethod start...");
		System.out.println("thirdMethod end...");
	}
	정수 2개를 입력받아 메서드 호출 전과 후에 대한 겨로가를 출력하는 프로그램
	입력예 정수 2개를 입력하세요.>5,10
	출력예 호출전 a:5, b:10
	add메서드 a:10 b:20
	결과 : 30
	호출 후 a:5,b:10
	*/
	System.out.print("정수 2개를 입력하세요.>");
	int a =scn.nextInt();
	int b =scn.nextInt();
		
	System.out.printf("호출 전 a : %d, b: %d \n",a,b);
	
	Math4 m4 = new Math4();
	System.out.println("결과 : " +m4.add(a, b));
	m4.add(a,b) ;
	System.out.printf("호출 후 a : %d, b: %d \n",a,b);

		
	}

}
