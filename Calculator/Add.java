package Calculator;

import java.util.Scanner;

public class Add
{
    public int num1,num2;
    public Add()
    {
        Scanner sr=new Scanner(System.in);
        System.out.println("Enter 2 Numbers");
        num1=sr.nextInt();
        num2=sr.nextInt();
    }
    public double result() {
        return ((double) num1 + num2);
    }
}
