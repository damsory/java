package test;

import java.io.Serializable;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor

public class Book implements Serializable{

		//직렬화 할 때 serialVersionUID가 일치하는 경우만 읽어오도록 하기 위해 값을 지정
		private static final long serialVersionUID = 2291865063337215853L;
		
		private String title;//품사
		private int price;//뜻
		
	
		
		public Book(String title,int price) {
			this.title=title;
			this.price=price;
		}
		public void getTitle() {
			return title;
		}
		public void setTitle() {
			this.title;
		}
		public void getprice() {
			return price;
		}
		public void setprice() {
			this.price;
		}
		@Override
		public String toString() {
			return price+ "("+title+"title)";
		}


		
		
		
		