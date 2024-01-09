package accountbook;

import java.io.Serializable;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class Book implements Serializable{
	

	
	private static final long serialVersionUID = -3829778132069097166L;
		//내용등록 :지출,수입,날짜
		private int expenditure,income,date;

		@Override
		public int hashCode() {
			return Objects.hash(date, expenditure, income);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Book other = (Book) obj;
			return date == other.date && expenditure == other.expenditure && income == other.income;
		}
		
		
}
