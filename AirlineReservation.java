package MyPackage;

import java.util.Scanner;

public class AirlineReservation {
    public static void main(String...args){

        boolean [] seat = new boolean[10];
        int firstClass = 1;
        int economy = 1;
        Scanner input = new Scanner(System.in);



        while (true) {
            System.out.print("What's Your Reservation Please(1 for First Class and 2 for Economy): ");
            int response = input.nextInt();
            if (response < 1 && response > 2) {
                break;
            }

            if (response == 1) {
                for (int i = 0; i < 5; i++) {
                    if (seat[i] == false) {
                        seat[i] = true;
                        firstClass++;
                        System.out.println("Reservation Successful[First Class and Seat Number]" + (i + 1));
                        break;
                    }
                    if (firstClass > 5) {
                        System.out.println("First Class is Full, Enter 1 for Economy:");
                        break;
                        // if (response != 1 ){
                        //  System.out.println("Next Flight Leaves in 3 Hours");
                        //  }

                    }

                }
            }
            else if (response == 2) {
                for (int j = 5; j < 10; j++){
                    if (seat[j] == false){
                        seat[j] = true;
                        economy++;
                        System.out.println("Reservation Successful[Economy and Seat Number]" + (j + 1));
                        break;
                    }
                    if (economy > 5) {
                        System.out.println("Economy is Full, Enter 1 for First Class:");
                        break;

                }
            }
        }
        if (economy>5 && economy > 5){
            System.out.print("No More Reservation");
            System.out.print("Next Flight Leaves in 3 Hours");
            break;
        }
        for(boolean seats : seat){
            System.out.print(seats + " ");
        }
        }


    }
}
