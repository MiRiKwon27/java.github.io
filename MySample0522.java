
class Tv
{
	//인스턴스 변수
	String color;                 //tv색상
	boolean power;                //전원상태(on/off)
	int channel;                  //채널

	
	//인스턴스 메서드
	void power()
	{
		power = !power;   //전원 켜져있으면 꺼지고 꺼져있으면 켜지는 것
	}
	void channelup()
	{
		channel++;
	}
	void channeldown()
	{
		channel--;
	}
}

public class MySample0522 {

	public static void main(String[] args) 
	{
		/*
		//클래스
		Tv t = new Tv();
		t.channel = 11;
		t.channeldown();
		t.channelup();
		System.out.println("현재 채널은 "+ t.channel + "번 입니다.");
		
		//현재 채널 11에서 7번으로 변경 설정.
		t.power();
		t.color="검정";
		
		for(int i = t.channel;i>7;i--)
		{
			t.channeldown();
		}
		System.out.printf("tv 전원은 %b이고, 색상은 %s, 채널은 %d입니다.\n",t.power,t.color,t.channel);
	실행결과 ) t1의 channel 값은 0입니다.
			t2의 channel 값은 0입니다.
			t1의 channel 값을 7로 변경했습니다.
			t1의 channel 값은 7입니다.
			t2의 channel 값은 7입니다.  // 참조형 대입으로 처리.

	Tv t1,t2;
	t1 = new Tv();
	t2 = new Tv();

	System.out.println("t1의 channel 값은"+ t1.channel+"입니다.\n"+"t2의 channel 값은"+ t2.channel+"입니다.");
	t1.channel=7;
	System.out.println("t1의 channel 값을"+ t1.channel+"로 변경했습니다.");
	System.out.println("t1의 channel 값은"+ t1.channel+"입니다.\n"+"t2의 channel 값은"+ t2.channel+"입니다.");
	t2=t1;
	System.out.println("t1의 channel 값은"+ t1.channel+"입니다.\n"+"t2의 channel 값은"+ t2.channel+"입니다.");
		
	실행결과 ) t1의 channel 값은 0입니다.
			t2의 channel 값은 0입니다.
			t1의 channel 값을 5로 변경했습니다.  // 변수의 값대입 적용
			t2의 channel 값을 11로 변경했습니다. // 변수의 값대입 적용
			t1의 channel 값은 11입니다.
			t2의 channel 값은 11입니다.  // 참조형 대입으로 처리.
	

		Tv t1,t2;
		t1 = new Tv();
		t2 = new Tv();
		
		System.out.println("t1의 channel 값은 "+ t1.channel+"입니다.\n"+"t2의 channel 값은 "+ t2.channel+"입니다.");
		t1.channel=5;
		t2.channel=11;
		System.out.println("t1의 channel 값을 "+ t1.channel+"로 변경했습니다.\n"+"t2의 channel 값을 "+ t2.channel+"로 변경했습니다.");
		t1 = t2;
		System.out.println("t1의 channel 값은 "+ t1.channel+"입니다.\n"+"t2의 channel 값은 "+ t2.channel+"입니다.");

	//객체 배열
	*/

	Tv[] t1=new Tv[3];
	int i;
	
	for(i=0;i<t1.length;i++)
	{
		t1[i] = new Tv();
		t1[i].channel = i + 10;
		System.out.printf("전 t1[%d].channel = %d \n",i,t1[i].channel);
	}
	System.out.println();
	for(i=0;i<t1.length;i++)
	{
		t1[i].channelup();
		System.out.printf("후 t1[%d].channel = %d \n",i,t1[i].channel);
	}
	System.out.println();
	
	//객체배열 복사 응용
	System.out.println("t1 : " +t1);
	System.out.println("t1[0] : " +t1[0]);
	System.out.println("t1[1] : " +t1[1]);
	System.out.println("t1[2] : " +t1[2]);
	System.out.println();
	
	Tv a=new Tv();
	
	System.out.println("a : " + a);
	
	a=t1[1];
	System.out.println("후 a : " +a);
	System.out.println("a.channel : " +a.channel+", t1[1].chaneel :"+ t1[1].channel);
	a.channel = 20;
	System.out.println("후 a.channel : " +a.channel+", t1[1].chaneel :"+ t1[1].channel);
	t1[1].channel = 30;
	System.out.println("후 a.channel : " +a.channel+", t1[1].chaneel :"+ t1[1].channel);
	a=t1[2];
	System.out.println("a.channel : " +a.channel+", t1[1].chaneel :"+ t1[1].channel+", t1[2].chaneel :"+ t1[2].channel);
	t1[2].channel = 40;
	System.out.println("a.channel : " +a.channel+", t1[1].chaneel :"+ t1[1].channel+", t1[2].chaneel :"+ t1[2].channel);
	

	}
	

}
