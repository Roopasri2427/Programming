import java.io.*;
import java.util.*;
class Task22
{
	public static void main(String args[])
	{
		String s;
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		if(s.matches("(CTS)[-]{1}[0-9]{3}"))
			System.out.println("Valid");
		else
			System.out.println("Invalid");
	}
}