package pyramid;
import java.util.Scanner;
public class Pyramid {
   public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   int v=1;
	   for(int i=1;i<=n;i++)
	   {
		   for(int j=1;j<=n-i;j++) System.out.print(" ");
		   for(int j=1;j<=i;j++) { 
			   if(v==10) v=0; 
			   System.out.print(v); v++; 
		   }
		   int v1=v-2;
		   for(int j=1;j<i;j++) {
			   if(v1<0) v1=9;
			   System.out.print(v1); v1--;
		   }
		   System.out.print("\n"); 
	   }
   }
}
