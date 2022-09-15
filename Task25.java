import java.io.*;
import java.util.*;
class Task25
{
	static int ncr(int n,int r)
	{
		return fact(n)/(fact(r)*fact(n-r));
	}
	static int fact(int n)
	{
		int res=1;
		for(int i=2;i<=n;i++)
			res*=i;
		return res;
	}
	public static void main(String args[])
	{
		int n,r;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		r=sc.nextInt();
		System.out.println("nCr="+ncr(n,r));
	}
}