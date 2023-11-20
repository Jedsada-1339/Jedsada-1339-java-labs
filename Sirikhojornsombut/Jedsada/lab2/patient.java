package Sirikhojornsombut.Jedsada.lab2;

public class patient {
    public static void main(String[] args) {
        String name =  args[0];
        int age = Integer.parseInt(args[1]);
        String gender = args[2];
        if (args.length == 3){
            System.err.println("Patient's Name: "+name);
            System.err.println("Age: "+age);
            System.err.println("Gender: "+gender);
        }
        else{
            System.err.println("Error: Invaid number of argument. Please provide exactly three argument");
        }
    }
}