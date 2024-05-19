import java.util.Scanner;

interface Food{
    String getType();
}

class Cake implements Food{

    @Override
    public String getType() {
        return "Someone ordered a Dessert!";
    }
}

class Pizza implements Food{

    @Override
    public String getType() {
        return "Someone ordered Fast Food!";
    }
}

class FoodFactory{
    public Food getFood(String order){
        if("cake".equalsIgnoreCase(order)){
            return new Cake();
        } else if ("pizza".equalsIgnoreCase(order)) {
            return new Pizza();
        }
        else {
            return null;
        }
    }
}


public class Solution {


    public static void main(String Args[]){

        System.out.println("Enter Input");
        Scanner scan = new Scanner(System.in);
        FoodFactory foodFactory = new FoodFactory();
        String order = scan.nextLine().trim();
        scan.close();
        Food food = foodFactory.getFood(order);

        if (food !=null){
            System.out.println("The factory returned " +food.getClass());
            System.out.println(food.getType());
        }
        else {
            System.out.println("Invalid order");
        }

    }
}
