import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter your birth day: ");
        int birthDay= myScanner.nextInt();

        System.out.println("Enter your birth month: ");
        int birthMonth= myScanner.nextInt();

        System.out.println("Enter your birth year : ");
        int birthYear= myScanner.nextInt();


        // For the current date
        Calendar currentDate = Calendar.getInstance();
        // modified date ( the user age date)
        Calendar birthDate = Calendar.getInstance();
        birthDate.set(birthYear,birthMonth-1,birthDay);

        int age = currentDate.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);
        if (currentDate.get(Calendar.MONTH) < birthDate.get(Calendar.MONTH) ||
                (currentDate.get(Calendar.MONTH) == birthDate.get(Calendar.MONTH) && currentDate.get(Calendar.DAY_OF_MONTH) < birthDate.get(Calendar.DAY_OF_MONTH))) {
            //Decrement age until we break the if condition and get the age number
            age--;
        }




        System.out.println("Your age is "+age+ " in Today's Date: "+currentDate.get(Calendar.DATE)+"/"+(currentDate.get(Calendar.MONTH)+1)+"/"+currentDate.get(Calendar.YEAR));

        myScanner.close();
    }
}