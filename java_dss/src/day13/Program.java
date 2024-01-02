package day13;

public interface Program {
	//int num1 = 10; //변수 앞에 final static이 자동으로 추가
	//final static int num2 =20;
	//매서드 앞에 public abstract가 자동으로 추가
	void printMenu();
	public void runMenu(int menu);
	public abstract void printExit();
	void run();
	default void test() {}
}

abstract class TestA{
	//클래스에서는 final static을 생략하면 맴버변수, 붙여주면 상수
	int num1 = 10;
	final static int num2 = 20;
	//클래스에서는 추상 매서드에 abstract가 자동으로 추가되지 않음
	public abstract void printMenu();
}
//class 클래스명 implement 인터페이스명{
// 매서드