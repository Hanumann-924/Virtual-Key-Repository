import java.io.File;
import java.util.Scanner;

public class DeleteFile 
{
	void deletingafile() 
	{
		String path="C:\\Users\\hp\\Documents\\workspace-spring-tool-suite-4-4.15.1.RELEASE\\VirtualKey\\";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the filename to delete a file");
		String filename=sc.next();
		String finalpath=path+filename;
		File f=new File(finalpath);
		//delete operation
		if(f.delete())
		{
			System.out.println("file deleted successfully");
		}
		else {
			System.out.println("File not found");
		}
	}

}
