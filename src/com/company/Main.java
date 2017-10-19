package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        String Quit = "";
        ArrayList<Person> personlist = new ArrayList<Person>();
        Scanner scan = new Scanner(System.in);
        while (!Quit.equalsIgnoreCase("Yes"))
        {
            Person name1 = new Person();

            System.out.println("Enter your FirstName");
            name1.setFirstName(scan.nextLine());
            System.out.println("Enter your Lastname");
            name1.setLastName(scan.nextLine());
            System.out.println("Enter your address");
            name1.setAddress(scan.nextLine());
            System.out.println("Enter your phoneNumber");
            name1.setPhoneNumber(scan.nextLine());
            System.out.println("Enter your email");
            name1.setEmail(scan.nextLine());
            personlist.add(name1);

            System.out.println("Do you want to Quit: Yes/No");
            Quit = scan.nextLine();

        }
        //Personlist.foreach(eachperson->
        for(Person eachperson:personlist)
        {
            System.out.println("==================================================");
            System.out.println("Customer Full Information is");
            System.out.println("The FirstName is :" + eachperson.getFirstName());
            System.out.println("The LastName is :" + eachperson.getLastName());
            System.out.println("The address is :" + eachperson.getAddress());
            System.out.println("The phonenumber is :" + eachperson.getPhoneNumber());
            System.out.println("The email is :" + eachperson.getEmail());


            System.out.println("==================================================");

            if(eachperson.getFirstName().contains("B"))

            {
                System.out.println(eachperson.getFirstName()+" contains a B");
            }else
            {
                System.out.println("This is an item in an arraylist that uses lambda expressions:"+eachperson.getFirstName());
            }
        }


    }

}