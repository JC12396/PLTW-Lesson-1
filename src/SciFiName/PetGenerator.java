package SciFiName;

import java.util.Scanner;

public class PetGenerator {


    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Pet name Generator!") ;

        System.out.println("Please enter your pet's name >> ") ;
        String petName1 = input.nextLine();

        System.out.println("Please enter your other pet's name >> ") ;
        String petName2 = input.nextLine();

        int r = (int) (Math.random()* petName1.length());

        petName1 = petName1.substring(r, petName1.length());

        petName2 = petName2.substring(r, petName2.length());

        System.out.println("Hello new pet " + petName1 + petName2);











    }




}
