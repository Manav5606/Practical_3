package com.company;

import java.util.Scanner;

public class practical3_3 {

    static class Employee{
        void Display(){
            Scanner sc = new Scanner(System.in);
            String name,address,age,Gender;
            System.out.println("Enter the name");
            name = sc.nextLine();
            System.out.println("Enter the address");
            address = sc.nextLine();
            System.out.println("Enter the age");
            age = sc.nextLine();
            System.out.println("Enter the Gender");
            Gender = sc.nextLine();
        }
    }

    static class FullTimeEmployee extends Employee{

        void Display(){
            Scanner sc = new Scanner(System.in);
            String salary,designation;
            System.out.println("Enter an Salary");
            salary = sc.nextLine();
            System.out.println("Enter an designation");
            designation = sc.nextLine();

        }
    }

    static class PartTimeEmployee extends FullTimeEmployee{
        void CalculatePay(){
            Scanner sc = new Scanner(System.in);

            int Workinghours,rateperhour,pay;

            System.out.println("Enter the working Hours");
            Workinghours = sc.nextInt();
            System.out.println("Enter the rates per hour");
            rateperhour = sc.nextInt();
            pay = Workinghours*rateperhour;
            System.out.println("Total Payable Amount Is: " + pay);

        }

        void Display(){
            CalculatePay();
        }
    }

    public static void main(String[] args) {
            Employee e = new Employee();
            FullTimeEmployee f = new FullTimeEmployee();
            PartTimeEmployee p = new PartTimeEmployee();

            e.Display();
            f.Display();
            p.Display();

    }
}
