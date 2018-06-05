package Driver;
import Calculator.*;
import java.util.Scanner;

public class Program
{
    public static void main(String args [])
    {
        double res;
        Scanner sr =new Scanner(System.in);
        System.out.println("\t\t\tMENU");
        System.out.println("Press 1 to Add");
        System.out.println("Press 2 to Subtract");
        System.out.println("Press 3 to Multiply");
        System.out.println("Press 4 to divide");
        int ch =sr.nextInt();
        switch (ch)
        {
               case 1:
                   Add ob1 = new Add();
                   res=ob1.result();
                   System.out.println("The Result is "+res);
                   break;
               case 2:
                   Sub ob2 = new Sub();
                   res=ob2.result();
                   System.out.println("The Result is "+res);
                   break;
               case 3:
                   Multiply ob3 = new Multiply();
                   res=ob3.result();
                   System.out.println("The Result is "+res);
                   break;
               case 4:
                   Divide ob4 = new Divide();
                   res=ob4.result();
                   System.out.println("The Result is "+res);
                   break;
               default:
                   System.out.println("Please Enter valid choice");
        }
        sr.close();
    }

}
