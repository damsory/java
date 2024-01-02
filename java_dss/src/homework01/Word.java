package homework01;

import java.io.Serializable;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Word implements Serializable {
	
	
	private static final long serialVersionUID = -2589417881748753391L;
	private String word,wordClass,meanIng;
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		return Objects.equals(meanIng, other.meanIng) && Objects.equals(word, other.word)
				&& Objects.equals(wordClass, other.wordClass);
	}
	@Override
	public int hashCode() {
		return Objects.hash(meanIng, word, wordClass);
	}
	
	
}
