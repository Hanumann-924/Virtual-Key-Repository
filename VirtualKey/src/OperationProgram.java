import java.io.IOException;
import java.util.Scanner;

public class OperationProgram 
{
	public static void main(String[] args) throws IOException
	{
		AddFile af = new AddFile();
		DisplayFile df= new DisplayFile();
		SearchFile sf = new SearchFile();
		DeleteFile delf = new DeleteFile();
		Scanner sc = new Scanner(System.in);
		
		exit : while(true) 
		{
			System.out.println("\tWELCOME TO VIRTUAL KEY FOR YOUR REPOSITORIES!!");
			System.out.println("\t\tCREATED BY – THIRUWIEDDHI HANUMANN");
			System.out.println();
			System.out.println("File Handling");
			System.out.println("Enter the choice you want \n  1. Display the files  \n  2 .File Operations \n  3. To Exit");
			int choice = sc.nextInt();
			switch(choice) 
			{
			case 1 :
				df.displayallfiles();
				System.out.println("----------------------");
				break;
			case 2 :
				while(true) 
				{	
					System.out.println("File Operations");
					System.out.println("  1. Adding a File  \n  2. Searching a file  \n  3. Deleting a file  \n  4. Back to menu  \n" );
					int option = sc.nextInt();
					switch(option) 
					{
					case 1 :
						af.createfile();
						break;
					case 2 :
						sf.searchingafile();
						break;
					case 3 :
						delf.deletingafile();
						break;
					case 4 :
						continue exit;
					default :
						System.out.println("Check Your Option You have Entered and enter your option again");
					}
					
				}
			case 3 :
				System.exit(0);
			default :
				System.out.println("Check Your Option You have Entered and enter your option again");
			}
		}
	}
}
