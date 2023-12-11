import java.util.Objects;
import java.util.Scanner;

public class placingOrder extends details {

    private String order;

     protected boolean order() {
        System.out.println("What would you like to order?");
        System.out.println("Please type the index of the meal you want with a space in between each order:");
        Scanner sc = new Scanner(System.in);
        order = sc.nextLine();

        System.out.println("Hey! \nYou have ordered " + order + ".");
        System.out.println("Please confirm with 'yes' or 'no'.");

        return Objects.equals(sc.nextLine(), "yes");
    }

    protected int[] getOrderOfCustomer(){
        String[] strArray = order.split(" ");
        int[] orderArr = new int[strArray.length];

        for (int i = 0; i < strArray.length; i++) {
            orderArr[i] = Integer.parseInt(strArray[i]);
        }

        return orderArr;
    }
}
