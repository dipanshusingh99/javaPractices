 import java.io.File;
 import java.io.FileNotFoundException;
 import java.util.Scanner;
public class filesException
{
    //first git commit

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        try
        {
            System.out.println("Enter the file name:");
            String fname=sc.nextLine();
            File file=new File(fname);
            Scanner fileReader=new Scanner(file);

            while(fileReader.hasNextLine())
            {
                System.out.println(fileReader.hasNextLine());
            }
        }catch (FileNotFoundException e){
            System.out.println("File not found!");
        }
    }
}