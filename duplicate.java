import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int i,j,n;
    n=sc.nextInt();
    int a[]=new int[n];
    int s[]=new int[100];
    for(i=0;i<n;i++)
    {
       a[i]=sc.nextInt();
    }
 
   for (i=0;i<n;i++)
   { 
    s[a[i]]++;
    }
    for(i=0;i<100;i++)
    {
    if(s[i]>0)
    {
        System.out.print(" "+i);
    }
   }
}
}
