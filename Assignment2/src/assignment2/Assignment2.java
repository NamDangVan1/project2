package assignment2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;

public class Assignment2 
{   
    public static void main(String[] args) throws ParseException 
    {
        Scanner keyBoard = new Scanner( System.in );
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.print("1. Name: ");
        System.out.println("String? " + keyBoard.hasNext());
        System.out.println("Interger? " + keyBoard.hasNextInt());
        String name = keyBoard.nextLine();
        
        
        System.out.print("2. Date ( dd/MM/yyyy ): ");
        String dateString = keyBoard.nextLine();
        Date date = sdf.parse(dateString);
        
        System.out.print("3. Age: ");
        System.out.println("Interger? " + keyBoard.hasNextInt());
        int age = keyBoard.nextInt();
        
        System.out.print("4. Sex: ");
        System.out.println("Interger? " + keyBoard.hasNextInt());
        String sex = keyBoard.next();
        keyBoard.nextLine();
        
        System.out.print("5. Major: ");
        System.out.println("Interger? " + keyBoard.hasNextInt());
        String maJor = keyBoard.nextLine();
        
        System.out.print("6. GPA: ");
        System.out.println("Interger? " + keyBoard.hasNextInt());
        float GPA = keyBoard.nextFloat();
        keyBoard.nextLine();
        
        System.out.print("7. Hometown: ");
        System.out.println("Interger? " + keyBoard.hasNextInt());
        String homeTown = keyBoard.nextLine();
        
        System.out.println("1. Name: " + name + "\t2. Date: " + sdf.format(date) + "\n3. Age: " + age + "\t4. Sex: " + sex + "\n5. Major:" + maJor + "\t6. GPA: " + GPA + "\n7. Hometown: " + homeTown );
    }
    
}
