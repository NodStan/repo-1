package repo1;

import java.util.ArrayList;

public class RestaurantArray {
    ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {
        ArrayList<String> Menu = new ArrayList<>();
        Menu.add("Chicken");
        Menu.add("sweet");
        Menu.add("pizza");
        Menu.add("popcorn");
        Menu.clear();
        Menu.removeFirst();
        Menu.reversed();
        Menu.size();
        Menu.clone();

        for (String menu:Menu){
            System.out.println(menu);
        }
    }
}
