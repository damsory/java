package day10;

public class StaticEx1 {

	public static void main(String[] args) {
		KiaCar c1 =new KiaCar("모닝");
		KiaCar c2 =new KiaCar("레이");
		KiaCar c3 =new KiaCar("k3");
		//kiaCar에서 brand는 static이 아니기 때문에 인스턴스마다 brand를 수정해야함
		c1.brand ="기아";
		c2.brand ="기아";
		c3.brand ="기아";
		c1.print();
		c2.print();
		c3.print();
		
		
		
		KiaCar2 c1 =new KiaCar2("모닝");
		KiaCar2 c2 =new KiaCar2("레이");
		KiaCar2 c3 =new KiaCar2("k3");
		//kiaCar에서 brand는 static이 아니기 때문에 인스턴스마다 brand를 수정해야함
		c4.brand ="기아";
		c5.brand ="기아";
		c6.brand ="기아";
		c4.print();
		c5.print();
		c6.print();
	}

}

class KiaCar{
	public static String brand ="KIA";
	public String name;//차이름

	public KiaCar(String name) {
		this.name = name;
		
	}
	public void print() {
		System.out.println(brand);
		System.out.println("차명 : "+name);
	}
	
	class KiaCar2{
		public static String brand ="KIA";
		public String name;//차이름

		public KiaCar2(String name) {
			this.name = name;
			
		}
		public void print() {
			System.out.println(brand);
			System.out.println("차명 : "+name);
		}
}
}