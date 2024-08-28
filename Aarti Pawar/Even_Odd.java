import java.util.*;
public class Even_Odd
{
    public static void main(String [] args)
    {
        int N1 = 0;
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Any Number=");
        N1 = sc.nextInt();

        if(N1%2==0)
            {
                System.out.println("Given Number is Even");
            }
            
        else
            {
                System.out.println("Given Number is Odd");
            }
        
    }
}