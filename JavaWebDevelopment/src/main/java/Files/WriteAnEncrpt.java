package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;

public class WriteAnEncrpt {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\ELCOT\\Desktop\\trainer token\\tech.zip");
		FileOutputStream fos=new  FileOutputStream(file);
		DeflaterOutputStream dos=new DeflaterOutputStream(fos);
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Tell us what you wish to write");
		String content=scan.nextLine();
		scan.close();
		
		dos.write(content.getBytes());
		dos.close();
		fos.close();
		
		
				
		

	}

}
