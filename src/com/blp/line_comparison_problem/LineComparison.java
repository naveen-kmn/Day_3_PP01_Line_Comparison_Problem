package com.blp.line_comparison_problem;

import java.util.Scanner;

public class LineComparison
{
    public static void main(String[] args)
    {
        double x1,x2,x3,x4,y1,y2,y3,y4,len12,len34;

        Scanner n = new Scanner(System.in);

        System.out.println("Enter the value of x1: ");
        x1 = n.nextDouble();

        System.out.println("Enter the value of x2: ");
        x2 = n.nextDouble();

        System.out.println("Enter the value of y1: ");
        y1 = n.nextDouble();

        System.out.println("Enter the value of y2: ");
        y2 = n.nextDouble();

        System.out.println("Enter the value of x3: ");
        x3 = n.nextDouble();

        System.out.println("Enter the value of x4: ");
        x4 = n.nextDouble();

        System.out.println("Enter the value of y3: ");
        y3 = n.nextDouble();

        System.out.println("Enter the value of y4: ");
        y4 = n.nextDouble();

        len12 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

        len34 = Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));

        System.out.println("Length of first line "+len12);

        System.out.println("Length of first line "+len34);

        int d = Double.compare(len12, len34);

        if (d==0)
        {
            System.out.println("Length 1 and Length 2 are equal");
        }

        else if(d==1)
        {
            System.out.println("Length 1 is greater than Length 2");
        }

        else
        {
            System.out.println("Length 1 is less than Length 2");
        }
    }
}
