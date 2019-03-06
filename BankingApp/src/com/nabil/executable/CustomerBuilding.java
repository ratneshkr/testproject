/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nabil.executable;

import com.nabil.banking.Accounts;
import com.nabil.customer.CustomerReg;
import com.nabil.successcodes.SuccessCodes;
import java.util.Scanner;

/**
 *
 * @author rdhee
 */
public class CustomerBuilding {

    Scanner sc = new Scanner(System.in);
    CustomerReg cr = new CustomerReg();
    SuccessCodes success = new SuccessCodes();
    Accounts a = new Accounts();

    public void TestCustomer() {

        System.out.print("Enter Customer Name");
        String name = sc.next();

        System.out.print("Enter Gender ");
        String gender = sc.next();

        System.out.print("Enter Customer Address");
        String address = sc.next();

        cr.setName(name);
        cr.setGender(gender);
        cr.setAddress(address);

        System.out.println(success.getCustomerRegistered());

        a.setCustomerId(CustomerReg.getCustomerId());
        int customerId = a.getCustomerId();

        System.out.println("System will generate account number automatically... please wait");
        a.setAccountNumber((customerId * 212 - 1));
        System.out.println("Account Number generated automatically");

        System.out.println("Enter Minimum account balance------");
        a.setAccountBalance(sc.nextInt());
    }

    public void displayCustomerDetails() {
        System.out.println("---------------------------------------");
        System.out.println("Customer Information");
        System.out.println("Name: " + cr.getName());
        System.out.println("Gender: " + cr.getGender());
        System.out.println("Address: " + cr.getAddress());

        System.out.println("-------------Account Details---------");
        System.out.println("Account Number: " + a.getAccountNumber());
        System.out.println("Customer Id: " + a.getCustomerId());
        System.out.println("Account Balance" + a.getAccountBalance());
        System.out.println("---------------------------------------");
    }
}
