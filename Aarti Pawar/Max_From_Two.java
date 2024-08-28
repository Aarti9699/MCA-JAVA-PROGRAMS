import java.util.*;
public class Max_From_Two
{
    public static void main(String [] args)
    {
        int N1, N2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        N1 = sc.nextInt();

        System.out.print("Enter Second Number : ");
        N2 = sc.nextInt();

        if (N1>N2)
        {
            System.out.print("This is maximum number");
        }
        else{
            System.out.print("This is minimum number");
        }

    }
}