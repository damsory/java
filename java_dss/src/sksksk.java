import java.io.FileWriter;
import java.io.IOException;

public class sksksk {
	
	public static void main(String[] args) {
		 
			FileWriter fw =null;
			try {
				
				fw=new FileWriter("test.txt");
				fw.write(97);
				fw.write(65);
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
}

