package day08;

public class Car {
	//자동차 
	// -정보 :맴버변수
	//  -무게: 단위는 톤으로 ,브랜드,분류,색상,바퀴종료,차명,년식 :
	double weight; //파란색은 맴버변수
	String brand;
	//0:소형,1:중형,2:대형,3:화물
	String category;
	//0xff0000
	String color;
	String [] tires;
	String carName;
	int year;
	
	boolean power;//시동
	int speed;//현재 속력
	boolean leftLight;//왼쪽 깜박이
	boolean rightLight;//우측 깜박이
	
	//-기능 :메서드
	//-가속(액셀을 밟음) ,감속, 시동을 켜기/끄기
	//-좌측|우측 깜박이를 켜기/끄기
	
	//시동을 켜기/끄기
	//시동이 꺼져있으면 켜점, 시동이 켜져있으면 꺼짐
	
	public void turn() {
		power = !power;
		if(power) {
			System.out.println("시동 켜짐");
		}else {
			System.out.println("시동 꺼짐");
		}
	}
	//가속
	public void speedUp() {
		speed++;
	}
	//감속
	public void speedDown() {
		speed--;
	}
	//좌측|우측 깜박이 켜기/끄기 위:우측,가운데,아래:좌측
	public void turnLight(int direction) {
		switch(direction) {
		case 1:  rightLight =true; leftLight=false; break;
		case -1: rightLight =false; leftLight=true; break;
		case 0:  rightLight =false; leftLight=false; break;
		}
	}
	// 자동차 현재 상태를 출력하는 메서드
	public void print() {
		System.out.println("-------------------------");
		System.out.println("시동 :"+power);
		System.out.println("속력 : "+ speed);
		System.out.println("좌깜 : "+ leftLight);
		System.out.println("속력 : "+ rightLight);
		System.out.println("--------------------------");
	}
	
}
