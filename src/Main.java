import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        details consumer = new details();
        consumer.getDetails();

        hungryQ askConsumerHungry = new hungryQ();
        if (askConsumerHungry.ask()) {
            askConsumerHungry.displayMenu();
            placingOrder consumerOrder = new placingOrder();
            boolean orderedCorrectly = false;
            while (!orderedCorrectly){
                orderedCorrectly = consumerOrder.order();
            }
            consumer.confirmingPassword(consumer.getPassword());
            billing bill = new billing();
            bill.totalBill(consumerOrder.getOrderOfCustomer());
        } else  System.out.println("Have a nice Day!!!");
        sc.close();
    }
}