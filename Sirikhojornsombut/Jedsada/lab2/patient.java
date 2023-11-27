package sirikhojornsombut.jedsada.lab2;

/**
 * The Patient Program:
 * This program accepts three arguments
 * and displays patient information.
 * The output should be
 * Patient's name : cpatient_name>. 
 * Nationality : <patient_age>.
 * Gender : <patient_genden> .
 * Author: Jedsada Sirikhojornsombut
 * ID:663040133-9
 * sec 1
 */
public class patient {
    public static void main(String[] args) {
        if (args.length == 3){
            String name =  args[0];
            int age = Integer.parseInt(args[1]);
            String gender = args[2];
            System.err.println("Patient's Name: "+name);
            System.err.println("Age: "+age);
            System.err.println("Gender: "+gender);
        }
        else{
            System.err.println("Error: Invaid number of argument. Please provide exactly three argument");
        }
    }
}