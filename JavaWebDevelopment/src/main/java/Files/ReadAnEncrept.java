package Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.zip.InflaterInputStream;

public class ReadAnEncrept {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\ELCOT\\Desktop\\trainer token\\tech.zip");
		
		FileInputStream fis=new FileInputStream(file);
		InflaterInputStream dis=new InflaterInputStream(fis);
		
		byte[] temp=new byte[fis.available()];
		dis.read(temp);
		dis.close();
		fis.close();
		System.out.println(file.getName()+" has following content\n"+new String(temp));
	}

}
