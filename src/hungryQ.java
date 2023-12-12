import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class hungryQ {
    public void displayMenu(){
        LinkedHashMap<String, Integer> menu = new LinkedHashMap<>();
        menu.put("\nVada Pav", 15);
        menu.put("\nPohe", 20);
        menu.put("\nBread & Jam", 15);
        menu.put("\nMisal Pav", 40);
        menu.put("\nAloo Paratha", 40);
        menu.put("\nSada Dosa", 35);
        menu.put("\nMasala Dosa", 40);
        menu.put("\nMysore Dosa", 40);
        menu.put("\nMysore Masala Dosa", 45);
        menu.put("\nCold Coffee", 15);
        menu.put("\nCoffee", 10);
        menu.put("\nTea", 10);
        menu.put("\nChocolate Milkshake", 20);
        menu.put("\nHot Chocolate", 20);
        menu.put("\nCutlet", 25);
        menu.put("\nMomo", 25);
        menu.put("\nBurger", 30);
        menu.put("\nShwarma", 35);
        menu.put("\nVeg roll", 30);
        menu.put("\nNon-Veg roll", 40);

        System.out.println("Here is the Menu: ");
        System.out.printf("%-4s%-20s%s\n", "", "Item", "Price");
        int i = 1;
        for (Map.Entry<String, Integer> x : menu.entrySet()) {
            String item = x.getKey();
            int price = x.getValue();
            System.out.printf("%-2d%-20s-->\t%d\n", i, item, price);
                i++;
        }
    }
    boolean ask(){
        System.out.println("Are you hungry?");
        Scanner sc = new Scanner(System.in);
        String hungry = sc.nextLine();
        return hungry.equals("yes") || hungry.equals("yeah") || hungry.equals("Yes") || hungry.equals("yup");
    }
}
