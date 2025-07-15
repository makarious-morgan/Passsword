import java.util.Scanner;
public class Password {
    public static void main (String[] args)
    {
        Scanner scanner =new Scanner(System.in);
        String Pass = "Makarious";
        String pass="asd" ;
        while (!pass.equals(Pass))
        {
            System.out.println("Enter the password");
             pass =scanner.nextLine();
            System.out.println("Incorrect Pass ");

        }
        System.out.println("Correct Pass");
    }
}
