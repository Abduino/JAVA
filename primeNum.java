import java.util.Scanner;
public class primeNum 
{
public static void main(String []args)
{
       Scanner x=new Scanner(System.in);
       System.out.println("Enter the number:");
       long y=x.nextLong();
       long i;
       for( i=2;i<y;i++)
{
       long z=y%i;
           if(z==0){
           System.out.println(y+" is not a prime");
           System.out.println(y+" Divide by "+i);
           i=y;    
                         }

           }if(i==y) System.out.println("itis prime"); 
            if(y==1) System.out.println("Number 1 is not a prime");
     }
}