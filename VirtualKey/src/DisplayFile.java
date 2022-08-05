import java.io.File;
import java.util.Arrays;

public class DisplayFile 
{
	void displayallfiles()
	{
		String path="C:\\Users\\hp\\Documents\\workspace-spring-tool-suite-4-4.15.1.RELEASE\\VirtualKey\\";
		File f=new File(path);
		//display operation
		File filenames[]=f.listFiles();
		Arrays.sort(filenames);
		System.out.println("The List of Files are: \n");
		for(File ff:filenames) {
			System.out.println(ff.getName());
		}
	}
}
