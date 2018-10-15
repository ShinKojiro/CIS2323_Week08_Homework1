public class JavaLessonSix{
    public static void main(String[] args){
        divideByZero(2);
    }
    public static void divideByZero(int a){

        try {
             System.out.println(a/0);
        } catch (ArithmeticException e) {
            System.out.println("You cant do that");
        }
    }
}