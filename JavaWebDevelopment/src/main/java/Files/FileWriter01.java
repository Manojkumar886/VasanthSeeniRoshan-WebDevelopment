package Files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriter01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file=new File("E:\\JAVA\\Rani\\She is queen of world.txt");
		file.createNewFile();
		FileWriter fw=new FileWriter(file);
		fw.write("Final topic is Files");
		//fw.write(65567898);
		fw.flush();
		fw.close();
		Scanner scan=new Scanner(System.in);
		scan.close();
	}

}
