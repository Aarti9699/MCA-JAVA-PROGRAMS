import java.util.*;

public class Table
{
    public static void main(String arg[])
    {
        int N, Mul;
        
        Scanner sc =  new Scanner(System.in);

        System.out.print("\n Enter Number : ");
        N=sc.nextInt();

         int X=1; 
         while(X<=10)
                {
                    Mul=N*X;
                    System.out.println(Mul); 
                    X++;
                }

    }
}