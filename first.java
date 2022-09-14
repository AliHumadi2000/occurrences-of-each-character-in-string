package myproject;
import java.util.Scanner;
public class first {
//java program to count occurrences of each character in string :
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		//take the string from the user 
		System.out.println("Enter the string: ");
		String name=in.nextLine();
		CountOcuurency(name);
		
}
	public static void CountOcuurency(String str)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{		
		for(int j=i;j<str.length();j++)
		{
				if(str.charAt(i)==str.charAt(j))
				{
					count++;				  
				}	
		}  
		
	//do not print if the char is space 
		if(str.charAt(i)!=' ')
		{
		System.out.println(str.charAt(i)+" has "+count);
		}
		//remove the character which already count 
		str=str.replace(str.charAt(i),' ');
		count=0;
		}
		
	}
}