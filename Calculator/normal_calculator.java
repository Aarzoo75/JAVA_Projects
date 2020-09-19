package com.company;
import java.util.Scanner;

public class normal_calculator {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\tjava normal calculator : created by Aarzoo\n");
        System.out.println("\t\t------------------------------------------");
        System.out.println("\t\t\t            WELCOME");
        System.out.println("\t\t\t              to");
        System.out.println("\t\t\t        THE CALCULATOR");
        System.out.println("\n\t\t------------------------------------------");
        System.out.println("\t\t------------------------------------------");
        System.out.println("\n\t\t> press S to start the calculator");
        System.out.println("\t\t> press Y to formalities");
        System.out.println("\t\t------------------------------------------\n");
        String start = sc.next();
        if ((start.equals("s")) || (start.equals("S")))
        {
            while (true)
            {
                System.out.println("\n> press 1 if you want to add");
                System.out.println("> press 2 if you want to subtract");
                System.out.println("> press 3 if you want to multiply");
                System.out.println("> press 4 if you want to division\n");
                int con = sc.nextInt();
                if (con == 1)
                {
                    System.out.print("\nenter number : ");
                    double num1 = sc.nextDouble();
                    System.out.print("enter number : ");
                    double num2 = sc.nextDouble();

                    double sum = num1 + num2;
                    System.out.print("\nsum of "+num1 + " and " + num2 + " is = ");
                    System.out.println(sum);
                }
                else if (con == 2)
                {
                    System.out.print("\nenter number : ");
                    double num3 = sc.nextDouble();
                    System.out.print("enter number : ");
                    double num4 = sc.nextDouble();

                    double sub = num3 - num4;
                    System.out.print("\nsubtract of " +num3 + " and " +num4 + "is = ");
                    System.out.println(sub);
                }
                else if (con == 3)
                {
                    System.out.print("\nenter number : ");
                    double num5 = sc.nextDouble();
                    System.out.print("enter number : ");
                    double num6 = sc.nextDouble();

                    double mul = num5*num6;
                    System.out.print("\nmultiply of " +num5 + " and " +num6 + "is = ");
                    System.out.println(mul);
                }
                else if (con == 4)
                {
                    System.out.print("\nenter number : ");
                    double num7 = sc.nextDouble();
                    System.out.print("enter number : ");
                    double num8 = sc.nextDouble();

                    double div = num7/num8;
                    System.out.print("\ndivision of " +num7 + " and " +num8 + "is = ");
                    System.out.println(div);
                }
                else
                {
                    System.out.println("wrong");
                }
            }
        }
        else if ((start.equals("y")) || (start.equals("Y")))
        {
            System.out.println("\t\t RULE");
            System.out.println("\t\t-------");
            System.out.println("\n> You can operate between any two numbers");
        }
        else
        {
            System.out.println("wrong");
        }


    }
}