package com.company;

import java.util.Scanner;

public class Practical3_2 {
static Scanner sc = new Scanner(System.in);
  static  class staff{
        String name;
        void codename(){
            System.out.println("Name of an teacher");
            name = sc.nextLine();

        }
    }

   static class Teacher extends staff{
        String sub,publication,code;
        void info(){
            System.out.println("code");
            code = sc.nextLine();
            System.out.println("Subject");
            sub = sc.nextLine();
            System.out.println("publication");
            publication = sc.nextLine();

        }

        void show(){
            System.out.println("About Teacher: ");
            System.out.print("Name: "+name+" ");
            System.out.print("Subject: "+sub+" ");
            System.out.print("Code: "+code+" ");
            System.out.print("Publication: "+publication);
            System.out.println(" ");
        }

    }

    static class officer extends staff{
            String name,code,category;
             void officer_info(){
                 System.out.println("Name of an Officer");
                 name = sc.nextLine();
                 System.out.println("code");
                 code = sc.nextLine();
                 System.out.println("Category");
                 category = sc.nextLine();
             }

             void officer_show(){
                 System.out.println("");
                 System.out.println("About Officer: ");
                 System.out.print("name: "+name+" ");
                 System.out.print("code: "+code+" ");
                 System.out.print("category: "+category+" ");
                 System.out.println("");
             }
    }

    static class typist extends staff{
        String name,speed;
            void Typist_info(){
                System.out.println("Name of an typist");
                name = sc.nextLine();
                System.out.println("speed");
                speed = sc.nextLine();

            }

            void Typist_show(){
                System.out.println("");
                System.out.println("About Typist: ");
                System.out.print("Name: "+name+" ");
                System.out.print("Speed: "+speed+" ");
                System.out.println("");
            }
    }

    static class Casual_Typist extends typist{
        String name,speed,wage;
            void Casual_Typist_info(){
                System.out.println("Name of an casual typist");
                name = sc.nextLine();
                System.out.println("speed");
                speed = sc.nextLine();
                System.out.println("Wages");
                wage = sc.nextLine();
            }

        void Casual_Typist_show(){
            System.out.println("");
            System.out.println("About Casual Typist: ");
            System.out.print("Name: "+name+" ");
            System.out.print("Speed: "+speed+" ");
            System.out.println("Wages: "+wage+" ");
        }
    }



    public static void main(String[] args) {
        Teacher obj = new Teacher();
        officer obj1 = new officer();
        typist obj2 = new typist();
        Casual_Typist obj3 = new Casual_Typist();
        obj.codename();
        obj.info();
        obj1.officer_info();
        obj2.Typist_info();
        obj3.Casual_Typist_info();

        obj.show();
        obj1.officer_show();
        obj2.Typist_show();
        obj3.Casual_Typist_show();
    }
}
