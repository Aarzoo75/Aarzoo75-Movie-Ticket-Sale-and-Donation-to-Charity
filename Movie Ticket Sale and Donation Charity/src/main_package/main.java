package main_package;

import java.util.Scanner;
public class main
{
    public static void main(String args[])
    {
        int AdultTicketPrice, NoOfAdultTicketsSold, ChildTicketPrice, NoOfChildTicketsSold, GrossAmount, percentDonation, DonatedCharity, NetSale;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Adult Ticket Price: ");
        AdultTicketPrice = sc.nextInt();

        System.out.print("Enter No of Adult Ticket Sold: ");
        NoOfAdultTicketsSold = sc.nextInt();

        System.out.print("Enter Child Ticket Price: ");
        ChildTicketPrice = sc.nextInt();

        System.out.print("Enter No of Child Ticket Sold: ");
        NoOfChildTicketsSold = sc.nextInt();

        System.out.print("Enter No of Percent Donation: ");
        percentDonation = sc.nextInt();

        GrossAmount = GA(AdultTicketPrice, NoOfAdultTicketsSold, ChildTicketPrice, NoOfChildTicketsSold);
        DonatedCharity = DC(percentDonation, GrossAmount);
        NetSale = NS(GrossAmount, DonatedCharity);

        System.out.println(" ");

        System.out.println("-- The Gross Amount is: " + GrossAmount);
        System.out.println("-- The Donated to the Charity is: " + DonatedCharity);
        System.out.println("-- The Net Sale is: " + NetSale);
    }


    //method that calculates the Gross Amount
    public static int GA(int a, int b, int c, int d)
    {
        int GA = a * b + c * d;
        return GA;
    }

    //method that calculates the Donated to the Charity
    public static int DC(int a, int b)
    {
        int DC = b * a / 100;
        return DC;
    }

    //method that calculates the Net Sale
    public static int NS(int a, int b)
    {
        int NS = a - b;
        return NS;
    }
}