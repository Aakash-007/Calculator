package Calculator;

import java.util.Scanner;

public class Sub {  public int num1,num2;
    public Sub()
    {
        Scanner sr=new Scanner(System.in);
        System.out.println("Enter 2 Numbers");
        num1=sr.nextInt();
        num2=sr.nextInt();
    }
    public double result() {
        return ((double) num1 - num2);
    }
}
