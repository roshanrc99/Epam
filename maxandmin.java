
import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int i,j,n,max=0,avg,min;
    n=sc.nextInt();
    int a[]=new int[n];
    for(i=0;i<n;i++)
    {
       a[i]=sc.nextInt();
    }
    max=a[0];
    for(i=0;i<n;i++)
    {
        
     if(a[i]>max)
     {
         max=a[i];
     }
     
}
min=a[0];
for(i=0;i<n;i++)
    {
        
     if(a[i]<min)
     {
         max=a[i];
     }
     
}
System.out.println(max);
System.out.println(min);
}
}
