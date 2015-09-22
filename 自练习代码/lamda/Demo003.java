package lamda;

import java.io.File;

public class Demo003 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		listFiles();
	}
	
	public static void listFiles(){
		String path = "F:\\SSH" ;
		File dir = new File(path) ;
		File [] files = dir.listFiles(file->file.isFile()) ;
		for (File f : files) {
			System.out.println(f.getName());
		}
	}

}
