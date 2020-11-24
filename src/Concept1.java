import java.io.File;
import java.io.IOException;

public class Concept1 {
	public static void main(String[] args) throws IOException {
		/*File f = new File("C:\\Users\\sseela\\Desktop\\sandeep.txt");
		boolean bool = f.createNewFile();
		if(bool) {
			System.out.println("created");
		} else {
			System.out.println("not created");
		}*/
		
		/*File f = new File("C:\\Users\\sseela\\Desktop\\Folder");
		f.mkdir();*/
		
		File f = new File("C:\\Users\\sseela\\Desktop\\file");
		f.createNewFile();
	}
}
