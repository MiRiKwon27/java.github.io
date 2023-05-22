import java.util.*;
/*
class Math
{
	//인스턴스 메서드
	int add(int a, int b)
	{
		
		System.out.println("add 메서드 시작 : a= "+a+",b = " +b);
		a = a+10;
		b = b+10;
		int result = a+b;
		
		System.out.println("add 메서드 끝 : a= "+a+",b = " +b);
		return result;
	}

}

class Math2 // 선생님답
{
	int add (int a, int b//매개변수)
	{
		return a+b;		
	}
	int substace (int a, int b)
	{
		if(a>b)
		{
			return a-b;
		}
		else
		{
			return b-a;  // else가 없으면 반환타입이 없으므로 오류가 남
		}	
	}	
	int multiply (int a, int b)
	{
		return a*b;		
	}	
	double divide (int a, int b)
	{
		if(a>b)
		{
			return (double)a/b;
		}
		else
		{
			return (double)b/a;
		}			
	}
}


class Math2 // 자바는 지역변수를 우선
{
	int a, b;  // 인스턴스 변수 , 객체선언할 때 a,b방 만들어짐.
	
	int add()  // 인스턴스 메서드
	{
		return a+b;		//지역변수 없어도 알아서 인스턴스 변수 가져다가 사용.
	}
//	int add (int a, int b//매개변수) 변수는 중복이 안되는데 여기는 중복이 됨. 왜냐면 자바는 지역변수를 우선적으로 생각하기때문이고
//	{                             return a,b는 ()안의 지역변수 값이 온다.
//		return a+b;		
//	}
	int substace()
	{
		if(a>b)
		{
			return a-b;
		}
		else
		{
			return b-a;  // else가 없으면 반환타입이 없으므로 오류가 남
		}	
	}	
	int multiply()
	{
		return a*b;		
	}	
	double divide()
	{
		if(a>b)
		{
			return (double)a/b;
		}
		else
		{
			return (double)b/a;
		}			
	}
}


class Math2 // 자바는 지역변수를 우선
{
	static int a, b;  // 클래스 변수, 객체생성 안해도 사용 가능.
	
//	static int add()  // 오류남, 클래스 변수는 객체생성 안해도 사용 가능. 인스턴스 변수는 객체생성을 해야만 사용할 수 있기에 클래스 메서드에서 사용불가다.
//	{
//		return a+b;		
//	}
	int add()  // 인스턴스 메서드
	{
		return a+b;		
	}
	int substace()
	{
		if(a>b)
		{
			return a-b;
		}
		else
		{
			return b-a;  
		}	
	}	
	int multiply()
	{
		return a*b;		
	}	
	double divide()
	{
		if(a>b)
		{
			return (double)a/b;
		}
		else
		{
			return (double)b/a;
		}			
	}
}
*/

public class MySample0522_3 {

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner (System.in);

		/*
		//클래스
		System.out.println("정수 2개를 입력하세요.>");
		int a = scn.nextInt();
		int b = scn.nextInt();
		
		System.out.println("main 메서드 시작 a = "+a+",b = " +b );
		
		Math m = new Math();
		int c = m.add(a, b);
		
		System.out.println("a = "+a+",b = " +b+",c = " +c);
		System.out.println("main 메서드 끝 a = "+a+",b = " +b );
		
		문제) 두 정수를 입력받아 더하기, 빼기, 곱하기, 나누기 연산 결과 출력
		입력예) 두 정수를 입력하세요.> 5 3
		출력예) add(a,b) = 8
		substace(a,b) = 2
		multiply(a,b) = 15
		divide(a,b) = 1.666667
		단, divide 메서드는 result 타입을 double
		빼기와 나누기는 큰수에서 작은수를 빼거나 나누게 처리함.
		계산기 클래스는 Math2, 결과 출력은 main에서 처리.
		
		
		System.out.print("두 정수를 입력하세요.>");
		int a=scn.nextInt();  // 지역변수
		int b=scn.nextInt();
		
		Math2 m = new Math2();
		System.out.println("add(a,b) = "+m.add(a,b));
		System.out.println("substace(a,b) = "+m.substace(a,b));
		System.out.println("multiply(a,b) = "+m.multiply(a,b));
		System.out.println("divide(a,b) = "+m.divide(a,b));
		
		위 문제와 동일하며 입력받는 변수 a,b를 인스턴스 변수로 선언후 사용.
	
		System.out.print("두 정수를 입력하세요.>");
		Math2 m = new Math2();  // 인스턴스 변수는 반드시 math2 클래스를 쓰려면 객체를 생성해줘야함.
		m.a=scn.nextInt();
		m.b=scn.nextInt();
		
		System.out.println("add(a,b) = "+m.add());
		System.out.println("substace(a,b) = "+m.substace());
		System.out.println("multiply(a,b) = "+m.multiply());
		System.out.println("divide(a,b) = "+m.divide());
		
		위 문제와 동일하며 입력받는 클래스 변수 선언후 사용.
		
		System.out.print("두 정수를 입력하세요.>");
		Math2.a=scn.nextInt();
		Math2.b=scn.nextInt();
		
		Math2 m = new Math2();
		
		System.out.println("add(a,b) = "+m.add());
		System.out.println("substace(a,b) = "+m.substace());
		System.out.println("multiply(a,b) = "+m.multiply());
		System.out.println("divide(a,b) = "+m.divide());
		*/

	}

}
