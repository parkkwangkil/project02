package test05;
import java.io.File;

public class test05 {

	public static void main(String[] args) {
		File dir = new File("c:/pkk");
		
		System.out.println(dir.isDirectory());
		
		for(File f:dir.listFiles()){
			System.out.println(f.getAbsolutePath());
		}
				

	}

}
