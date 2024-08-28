import java.util.*;
public class Reverse_Table
{
    public static void main(String arg[])
    {
        int N;
        int Mul;
        
        Scanner sc =  new Scanner(System.in);

        System.out.print("\n Enter Number : ");
        N=sc.nextInt();

       int X=10; 
       while(X>=1)
            {
                Mul=N*X;
                System.out.println(Mul); 
                X--;
            }

    }
}