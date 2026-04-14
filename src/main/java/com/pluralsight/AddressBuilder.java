package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();

        //billing info
        System.out.print("Enter your name: ");
        String fullName = scanner.nextLine();

        System.out.print("Billing Street: ");
        String billingStreet = scanner.nextLine();

        System.out.print("Billing City: ");
        String billingCity = scanner.nextLine();

        System.out.print("Billing State: ");
        String billingState = scanner.nextLine();

        System.out.print("Billing Zip: ");
        String billingZip = scanner.nextLine();


        //shipping info
        System.out.print("Shipping Street: ");
        String shippingStreet = scanner.nextLine();

        System.out.print("Shipping City: ");
        String shippingCity = scanner.nextLine();

        System.out.print("Shipping State: ");
        String shippingState = scanner.nextLine();

        System.out.print("Shipping Zip: ");
        String shippingZip = scanner.nextLine();


        //string builder output
        sb.append(fullName).append("\n\n");

        /*sb.append("Billing Address:\n");
        sb.append(billingStreet).append("\n");
        sb.append(billingCity).append(", ");
        sb.append(billingState).append(" ");
        sb.append(billingZip).append("\n\n");

        sb.append("Shipping Address:\n");
        sb.append(shippingStreet).append("\n");
        sb.append(shippingCity).append(", ");
        sb.append(shippingState).append(" ");
        sb.append(shippingZip).append("\n\n");*/

        formatAddress(sb, "Billing Address:", billingStreet, billingCity, billingState, billingZip);
        formatAddress(sb, "Shipping Address", shippingStreet, shippingCity, shippingState, shippingZip);

        System.out.println("\n" + sb.toString());

        scanner.close();
    }

    public static void formatAddress(StringBuilder sb, String title, String street, String city, String state, String zip){
        sb.append(title).append("\n");
        sb.append(street).append("\n");
        sb.append(city).append(", ");
        sb.append(state).append(" ");
        sb.append(zip).append("\n\n");


    }
}
