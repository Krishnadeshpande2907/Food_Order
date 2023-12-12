import java.util.Scanner;

public class details {
    private String password;

    public void getDetails(){
        System.out.println("What is your name sir?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("Welcome Mr." + name + "\nPlease enter your password");
        password = sc.nextLine();

        confirmingPassword(password);

        System.out.println("Your password is " + password);
    }

     void confirmingPassword(String password){
        System.out.println("Confirm your password: ");
        Scanner sc = new Scanner(System.in);
        String checkingPassword = sc.nextLine();

        while (!checkingPassword.equals(password)){
            System.out.println("Incorrect confirmation password entered");
            System.out.println("Please enter it again: ");
            checkingPassword = sc.nextLine();
        }
    }

    protected String getPassword(){
        return password;
    }

}
