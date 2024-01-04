package day18.student;

import java.io.Serializable;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;



@Data
@AllArgsConstructor
public class Student implements Serializable{

	
	private static final long serialVersionUID = 6787455733541030095L;
	private int grade, classNum,num;
	private String name;
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return classNum == other.classNum && grade == other.grade && num == other.num;
	}
	@Override
	public int hashCode() {
		return Objects.hash(classNum, grade, num);
	}
	@Override
	public String toString() {
		return "Student [grade=" + "학년" + ", classNum=" + "반" + ", num=" + "번호" + ", name=" + "이름" + "]";
	}
	
}
