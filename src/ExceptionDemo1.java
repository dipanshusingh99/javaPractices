import java.util.Scanner;
public class ExceptionDemo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter number:");
            int num = scanner.nextInt();
            if(num<0){
                throw new Exception("Negative number not allowed");
                //khud se exception throw kiya
            }
            System.out.println("Valid numbers:"+num);
        }
        catch (Exception e){
            System.out.println("Error:"+e.getMessage());
        }
    }
}