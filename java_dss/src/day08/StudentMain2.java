package day08;

public class StudentMain2 {

	public static void main(String[] args) {
		// 5명의 학생을 저장하기 위한 배열을 생성하세요.
		Student [] stds =new Student[5];
		
		//학생 5명의 학생 정보를 출력하는 코드를 작성하세요
		for(int i=1; i<5;i++) {
			stds[i] =new Student(); //인스턴
			stds[i].num++;
			stds[i].printInfo();
			
		}
		
	}
}
