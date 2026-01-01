import java.util.*;
public class ExceptionParameters
{
    static void checkEven(int n)
    {
        if(n%2!=0)
        {
            System.out.println("Number is odd");
        }else {
        System.out.println("Number is even");
    }}
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter number");
            int n = scanner.nextInt();
            checkEven(n);
        }catch (Exception e){
            System.out.println("Error:"+e.getMessage());
        }
    }
}