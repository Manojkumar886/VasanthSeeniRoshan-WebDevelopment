package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("E:\\JAVA\\Rani\\She is queen of world.txt");
		FileReader fr=new FileReader(file);

//		fr.read();
		
		int hai=0;
		
		while((hai=fr.read())!=-1)
		{
			System.out.print((char)hai);//Typecasting
		}
		
		
		
	}

}
