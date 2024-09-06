
package agecalculator;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public int calculateAge(LocalDate date_of_birth){
        LocalDate current_date=LocalDate.now();
        if((date_of_birth !=null)&&(current_date !=null)){
            return Period.between(date_of_birth,current_date).getYears();
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter date of birth in YYYY_MM_DD format:");
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        sc.close();
        AgeCalculator agecal=new AgeCalculator();
        LocalDate date_of_birth=LocalDate.parse(input);
        System.out.println("You are"+agecal.calculateAge(date_of_birth)+"years old.");
    }
    
    
}
