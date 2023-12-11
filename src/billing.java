import java.util.HashMap;

public class billing {

    private HashMap<Integer, Integer> hashMapForCalculating(){
        HashMap<Integer, Integer> numName = new HashMap<>();
        numName.put(1, 15);
        numName.put(2, 20);
        numName.put(3, 15);
        numName.put(4, 40);
        numName.put(5, 40);
        numName.put(6, 35);
        numName.put(7, 40);
        numName.put(8, 40);
        numName.put(9, 45);
        numName.put(10, 15);
        numName.put(11, 10);
        numName.put(12, 10);
        numName.put(13, 20);
        numName.put(14, 20);
        numName.put(15, 25);
        numName.put(16, 25);
        numName.put(17, 30);
        numName.put(18, 35);
        numName.put(19, 30);
        numName.put(20, 40);

        return numName;
    }

    public void totalBill(int[] orderFromCustomer){
        int sum = 0;
        HashMap<Integer, Integer> calculatingOrderMenu = hashMapForCalculating();

        for (int order : orderFromCustomer) sum += calculatingOrderMenu.get(order);

        System.out.println("Your total bill is: " + sum);
    }
}
