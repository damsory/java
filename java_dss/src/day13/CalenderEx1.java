package day13;

import java.util.Calendar;

public class CalenderEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar cal =Calendar.getInstance();
		int year =cal.get(Calendar.YEAR);
		System.out.print(year+"년");
		int month =cal.get(Calendar.MONTH);
		System.out.print(month+"월");
		int day =cal.get(Calendar.DAY_OF_MONTH);
		System.out.print(day+"일");
	}

}
