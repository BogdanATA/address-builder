package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();

        //billing info
        System.out.println("Enter your name: ");
        String fullName = scanner.nextLine();

        System.out.println("Billing Street: ");
        String billingStreet = scanner.nextLine();

        System.out.println("Billing City: ");
        String billingCity = scanner.nextLine();

        System.out.println("Billing State: ");
        String billingState = scanner.nextLine();

        System.out.println("Billing Zip: ");
        String billingZip = scanner.nextLine();


        //shipping info
        System.out.println("Shipping Street: ");
        String shippingStreet = scanner.nextLine();

        System.out.println("Shipping City: ");
        String shippingCity = scanner.nextLine();

        System.out.println("Shipping State: ");
        String shippingState = scanner.nextLine();

        System.out.println("Shipping Zip: ");
        String shippingZip = scanner.nextLine();


        //string builder output
        sb.append(fullName).append("\n\n");

        sb.append("Billing Address:\n");
        sb.append(billingStreet).append("\n");
        sb.append(billingCity).append(", ");
        sb.append(billingState).append(" ");
        sb.append(billingZip).append("\n\n");

        sb.append("Shipping Address:\n");
        sb.append(shippingStreet).append("\n");
        sb.append(shippingCity).append(", ");
        sb.append(shippingState).append(" ");
        sb.append(shippingZip).append("\n\n");

        System.out.println("\n" + sb.toString());

        scanner.close();
    }
}
