
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		        int cnt = 0; 
  int a,b;
   Scanner sc=new Scanner(System.in);
a=sc.nextInt();
         b=sc.nextInt();
        for (int i = a; i <= b; i++) 
            for (int j = 1; j * j <= i; j++) 
                if (j * j == i) 
                    cnt++; 
       
    
System.out.println(cnt);
} 
  }

