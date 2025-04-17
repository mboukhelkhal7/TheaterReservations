package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    static Scanner input = new Scanner(System.in);


    public String fullName;
    public LocalDate showDate;
    public int numberOfTickets;


    public void getUserInfo(){
        System.out.println("Please enter your name: ");
        fullName = input.nextLine();


        System.out.println("What date will you be coming (MM/dd/yyyy): ");
        String dateInput = input.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        showDate = LocalDate.parse(dateInput, formatter);

        //showDate = LocalDate.parse(input.nextLine());

        System.out.println("How many tickets would you like? ");
        numberOfTickets= input.nextInt();

    }

    public void displayMessage(){
        if (numberOfTickets > 1){
            System.out.println(numberOfTickets + " tickets reserved for " + showDate + " under " + fullName);
        }else {
            System.out.println(numberOfTickets + " ticket reserved for " + showDate + " under " + fullName);
        }
    }





}


