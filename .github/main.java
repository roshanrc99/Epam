
import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int i,j,n,count,second,max;
    n=sc.nextInt();
    int a[]=new int[n];
    for(i=0;i<n;i++)
    {
       a[i]=sc.nextInt();
    }
for(i=0;i<n-1;i++)
{
for(j=0;j<n-i-1;j++)
{
    if(a[j]>a[j+1])
    {
        count=a[j];
        a[j]=a[j+1];
        a[j+1]=count;
    }
}
for(i=0;i<n;i++)
{
   System.out.print(a[i]);
}
}
}}
   
   
