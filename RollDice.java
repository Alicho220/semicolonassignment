package MyPackage;

import java.security.SecureRandom;

public class RollDice {
    public static void main(String...args){
        int noOfRolls[] = new int[11];
        // int frequency [] = new int[6];

        int counter = 1;
        //int value;

        SecureRandom randomValue = new SecureRandom();
        SecureRandom randomValue2 = new SecureRandom();






        for(int i = 1; i< 10; i++){
            int die1 = randomValue.nextInt(6) + 1;
            int die2 = randomValue2.nextInt(6) + 1;
            int sum = die1 + die2;


            if(sum == 2)
                noOfRolls[0]++;

            else if(sum == 3)
                noOfRolls[1]++;

            else if(sum == 4)
                noOfRolls[2]++;

            else if(sum == 5)
                noOfRolls[3]++;

            else if(sum == 6)
                noOfRolls[4]++;

            else if(sum == 7)
                noOfRolls[5]++;

            else if(sum == 8)
                noOfRolls[6]++;

            else if(sum == 9)
                noOfRolls[7]++;

            else if(sum == 10)
                noOfRolls[8]++;

            else if(sum == 11)
                noOfRolls[9]++;

            else if(sum == 12)
                noOfRolls[10]++;


        }
        int count = 2;
        for(int i: noOfRolls){
            System.out.printf("%5d %33d %n", count, i );
            count++;
        }
















    }
}
