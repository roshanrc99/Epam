import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int i,j,n,count=0,pos;
    n=sc.nextInt();
    int key=sc.nextInt();
    int a[]=new int[n];
    for(i=0;i<n;i++)
    {
       a[i]=sc.nextInt();
    }
    for(i=0;i<n;i++)
    {
        if(a[i]==key)
        {
            count++;
            pos=i;
        }
    }
    if(count==1)
    {
    System.out.println(pos);
    }
    else
    {
        System.out.println("-1");
    }
	}
}
