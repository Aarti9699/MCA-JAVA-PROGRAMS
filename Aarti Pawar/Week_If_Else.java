import java.util.*;
public class Week_If_Else
{
    public static void main(String [] args)
    {
        int N1 = 0;
        Scanner sc=new Scanner(System.in); 

        System.out.print("Enter Any Number=");
        N1 = sc.nextInt();


        if(N1==1)
            {
                System.out.println("Sunday")
            }

        else if(N1==2)
            {
                System.out.println("Monday");
            }

        else if(N1==3)
            {
                System.out.println("Tuesday");
            }

        else if(N1==4)
            {
                System.out.println("Wedensday");
            }

        else if(N1==5)
            {
                System.out.println("Thursday");
            }

        else if(N1==6)
            {
                System.out.println("Friday");
            }

        else if(N1==7)
            {
                System.out.println("Saturday");
            }
            
        else
            {
                System.out.println("Given Number is Invalid");
            }
    }
}