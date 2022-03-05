package Statements;
import java.util.Scanner;
public class ChineseZodiac {
    public static void main(String[] args) {
        int birthdate, year;
        String hrsc="";
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the year you were born: ");
        birthdate = input.nextInt();

        year = birthdate%12;

        switch (year){
            case 0:
                hrsc = "Monkey";
                break;
            case 1:
                hrsc = "Rooster";
                break;
            case 2:
                hrsc = "Dog";
                break;
            case 3:
                hrsc = "Pig";
                break;
            case 4:
                hrsc = "Rat";
                break;
            case 5:
                hrsc = "Ox";
                break;
            case 6:
                hrsc = "Tiger";
                break;
            case 7:
                hrsc = "Rabbit";
                break;
            case 8:
                hrsc = "Dragon";
            case 9:
                hrsc ="Snake";
                break;
            case 10:
                hrsc ="Horse";
                break;
            case 11:
                hrsc="Goat";
                break;
        }

        System.out.println("Your Chinese Zodiac Sign is: " +hrsc);


    }
}
