import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int i,j,n,sum=0,avg,count=0;
    n=sc.nextInt();
    int a[]=new int[n];
    for(i=0;i<n;i++)
    {
       a[i]=sc.nextInt();
    }
    for(i=0;i<n;i++)
    {
        sum+=a[i];
        count++;
    }
    avg=sum/count;
    System.out.println(sum);
    System.out.println(avg);
}
}
