
class Card
{
	String kind;
	int number;
	
	static int width = 100;
	static int height = 250;
}
public class MySample0522_2 {

	public static void main(String[] args) {
		//클래스
		System.out.println("Card.width : " + Card.width);   // 객체생성 안해도 클래스 변수는 사용 가능
		System.out.println("Card.height : " + Card.height);
		
		Card c1 = new Card(); 
		c1.kind = "Heart";
;		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number=4;
		
		System.out.println("c1은 " + c1.kind + ", "+c1.number + "이며, 크기는 (" + c1.width+"), "+c1.height);
		System.out.println("c2은 " + c2.kind + ", "+c2.number + "이며, 크기는 (" + c2.width+"), "+c2.height);
		
		c1.number = 12;
		c2.number= 8;
		
		c2.width= 50;  // Card.width=50; 가 맞는거임. 그러나 인스턴스로 접근 가능하다.
		c2.height= 80;
	
		System.out.println("c1은 " + c1.kind + ", "+c1.number + "이며, 크기는 (" + c1.width+"), "+c1.height);
		System.out.println("c2은 " + c2.kind + ", "+c2.number + "이며, 크기는 (" + c2.width+"), "+c2.height);
	
	
	
	}

}
