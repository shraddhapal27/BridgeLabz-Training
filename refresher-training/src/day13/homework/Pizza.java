package day13.homework;

public class Pizza {



        String size;
        String crustType;
        int toppingsCount;
        double price;

        // 1. Only size
        Pizza(String size) {
            this(size, "Regular", 0);
        }

        // 2. Size + crust
        Pizza(String size, String crustType) {
            this(size, crustType, 0);
        }

        // 3. Size + crust + toppings
        // MASTER CONSTRUCTOR
        Pizza(String size, String crustType, int toppingsCount) {

            this.size = size;
            this.crustType = crustType;
            this.toppingsCount = toppingsCount;

            // ALL price calculation exists here
            if (size.equalsIgnoreCase("Small")) {
                price = 200;
            }
            else if (size.equalsIgnoreCase("Medium")) {
                price = 300;
            }
            else if (size.equalsIgnoreCase("Large")) {
                price = 400;
            }

            price += toppingsCount * 50;
        }

        // 4. All fields + explicit price
        Pizza(String size, String crustType, int toppingsCount, double price) {

            this.size = size;
            this.crustType = crustType;
            this.toppingsCount = toppingsCount;

            // Explicit price override
            this.price = price;
        }

        void printPizza() {
            System.out.println(
                    "Size: " + size +
                            ", Crust: " + crustType +
                            ", Toppings: " + toppingsCount +
                            ", Price: " + price
            );
        }

    public static void main(String[] args) {
        // Constructor 1
        Pizza p1 = new Pizza("Small");

        // Constructor 2
        Pizza p2 = new Pizza("Medium", "Thin");

        // Constructor 3
        Pizza p3 = new Pizza("Large", "Cheese Burst", 3);

        // Constructor 4
        Pizza p4 = new Pizza("Large", "Regular", 2, 999);

        p1.printPizza();
        p2.printPizza();
        p3.printPizza();
        p4.printPizza();
    }
}
