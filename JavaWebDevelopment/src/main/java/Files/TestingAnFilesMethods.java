package Files;

import java.io.File;
import java.io.IOException;

public class TestingAnFilesMethods {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
//		File file=new File("E:\\JAVA\\Raja\\testing.txt");
//		File rename=new File("E:\\JAVA\\Raja\\Test.txt");
//		file.exists();
		//file.mkdir();///folder creation
//		file.mkdirs();//sub folders
		//file.createNewFile();//File creation
		//file.renameTo(rename);//file rename
		
//		rename.delete();//file delete
//		System.out.println(file.getName());
		
		File file=new File("E:\\JAVA");
		
		String[] ListAllFoldersFiles=file.list();
		
		for(String Decode:ListAllFoldersFiles)//For each
		{
			System.out.println(Decode);
		}
		
	
	}

}
