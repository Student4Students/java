import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;

class Question1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter source File Name : ");
		String sf = sc.next();
		
		File f = new File(sf);
		if(f.exists())
		{
			try
			{
				FileReader fr = new FileReader(f);
				int n = fr.read();
				String data = "";
				while(n!=-1)
				{
					char ch = (char)n;
					if(ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u')
					{
						data+=Character.toUpperCase(ch);
					}
					else
					{
						data+=ch;
					}
					
					n = fr.read();
				}
				fr.close();
				
				System.out.print("Enter Destination File Name: ");
				String df = sc.next();
				FileWriter fw = new FileWriter(df);
				fw.write(data);
				fw.close();
			}
			catch(IOException io)
			{
				io.printStackTrace();
			}
				
		}
		else
		{
			System.out.print("Source file does not exists!!");
		}
	}
}