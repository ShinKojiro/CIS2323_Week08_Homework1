import java.util.*;
import java.io.*;

public class JavaLessonSix{

    static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args){
        //part 1
        // divideByZero(2);

        //part 2
        // System.out.print("How old are you?");
        // int age = checkValidAge();
        // if (age !=0){
        //     System.out.println("You are " + age + " years old");
        // }
        
        //part 3
        // getAFile("./somestuff.txt");
        
        //part 4
        try {
            getAFile("./somestuff.txt");
        } catch (IOException e) {
            //TODO: handle exception
            System.out.println("An IO Error Occured");
        }
    }

    //part 1
    // public static void divideByZero(int a){
    //     try {
    //          System.out.println(a/0);
    //     } catch (ArithmeticException e) {
    //         System.out.println("You cant do that");            
    //         System.out.println(e.getMessage());
    //         System.out.println(e.toString());
    //         e.printStackTrace();
    //     }
    //}
    
    //part 2
    // public static int checkValidAge(){
    //     try {
    //         return userInput.nextInt();
    //     } catch (InputMismatchException e) {
    //         userInput.next();
    //         System.out.print("That isn't a whole number");
    //         return 0;
    //     }
    // }
    
    //part 3
    // public static void getAFile(String fileName){
    //     try{
    //     FileInputStream file = new FileInputStream(fileName);
    //     }
    //     catch(FileNotFoundException e){
    //         //catches specific exception
    //         System.out.println("Sorry, can't find that file");
    //     }
    //     catch(IOException e){
    //         //catches other specific exception
    //         System.out.println("Unknown IO Error");
    //     }
    //     catch(ClassNotFoundException e){
    //         //ignores exception completely
    //     }
    //     catch(Exception e){
    //         //catches all/other exceptions
    //         System.out.println("Some error occored");
    //     }
    //     finally{
    //         //makes program run no matter the exception
    //         System.out.println("");
    //     }
    // }

    //part 4
    public static void getAFile(String fileName) throws IOException, FileNotFoundException{
        FileInputStream file = new FileInputStream(fileName);
    }
}