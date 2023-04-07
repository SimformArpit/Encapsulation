package com.simformsolutions.encapsulation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Company firstCompany = new Company();
        System.out.println("Enter your company name");
        String name = sc.next();
        firstCompany.setName(name);
        System.out.println("Enter your companies number of employ");

        int noOfEmploy = sc.nextInt();


        System.out.println("Company name: " + firstCompany.getName());

        firstCompany.setNoOfEmploy(noOfEmploy);

        if (noOfEmploy > 0) {
            System.out.println("number of employs are : " + firstCompany.getNoOfEmploy());
        }

        System.out.println(firstCompany.getCompanyLevel());
        firstCompany.setProfit(1000);
        System.out.println("Company is profitable: " + firstCompany.isProfitable());

    }


}