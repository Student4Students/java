import java.io.*;
import java.util.Scanner;

class Question2 
{
	public static void main(String args[])
	{
		String team[] = {"West Indis", "Australia", "England","India", "Pakistan", "Sri Lanka"};
		int arr[] = new int[team.length];
		
		String line = "";
		String splitby = ",";
		String countryname;
		int choice;
		String out[] = new String[team.length];
		
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Press 1 to display the data in terms of Year, Team-1, Team-2 and Winning Team");
			System.out.println("Press 2 to Display Team and number of times it won the World cup");
			System.out.println("Press 3 to enter the country name and display how many times that country won World Cup and with what margin");
		
			System.out.println("\nEnter your choice:");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1: BufferedReader br = new BufferedReader(new FileReader("cricket.csv"));
						while((line=br.readLine())!=null)
						{
							String str[] = line.split(splitby);
							System.out.println(str[7]+"\t"+str[1]+"\t"+str[2]+"\t"+str[6]);
						}
						br.close();
						break;
				case 2: BufferedReader br1 = new BufferedReader(new FileReader("cricket.csv"));
						while((line=br1.readLine())!=null)
						{
							String str[] = line.split(splitby);
							for(int i=0;i<team.length;i++)
							{
								try
								{
									if(team[i].equals(str[6]))
									{
										arr[i]++;
									}
								}
								catch(Exception e)
								{
									continue;
								}
							}
						}
						System.out.println("Teams : Number of times won");
						for(int i=0;i<team.length;i++)
						{
							System.out.println(team[i]+" : "+arr[i]);
						}
						br1.close();
						break;
				case 3: BufferedReader br2 = new BufferedReader(new FileReader("cricket.csv"));	
						System.out.print("Enter country name: ");
						sc.nextLine();
						countryname = sc.nextLine();
						int count = 0;
						int j = 0;
						while((line=br2.readLine())!=null)
						{
							String str[] = line.split(splitby);
							try
							{
								if(str[6].equals(countryname))
								{
									count++;
									out[j] = str[8];
									j++;
								}
							}
							catch(Exception e)
							{
								continue;
							}
								
						}
						System.out.println(countryname + " has won world cup " + count + " times");
						
						System.out.println("Margin by which it has won");
						for (int k = 0; k < j; k++)
						{
							System.out.println(out[k]);
						}
						br2.close();
						break;
				default: System.out.println("Wrong Input!!!");

			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
