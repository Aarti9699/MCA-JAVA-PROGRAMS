import java.util.*;
public class Max_From_Three
{
    public static void main(String arg[])
    {
        int N1, N2,N3;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        N1 = sc.nextInt();

        System.out.print("Enter Second Number : ");
        N2 = sc.nextInt();

        System.out.print("Enter Third Number : ");
        N3 = sc.nextInt();

        if (N1>N2 || N1>N3 )
        {
            System.out.print(" is maximum number");
        }
        else 
        {
            System.out.print("is minimum number");
        }
    }
}