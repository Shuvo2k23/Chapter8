import java.util.Scanner;

public class LogInRunner {
    public static void main(String[] args) {
            LogInForm form = new LogInForm("Sajib", "bangladesh");
        Scanner in = new Scanner(System.in);

        while(!form.loggedIn())
        {
            System.out.println("Login Form");

            System.out.print("Username: ");
            String userName = in.next();
            form.input("Username", userName);

            System.out.print("Password: ");
            String password = in.next();

            form.input("Password", password);

            // Click "Submit"
            form.click("Submit");
        }

        System.out.println("Login Successful !!");

        in.close();
    }
}
