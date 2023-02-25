import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // introductory price
        int introPrice = 10;
        // price that is going to be added to the introductory per km
        double pricePerKm = 2.20;
        Scanner km = new Scanner(System.in);
        System.out.print("How many kilometers you've just came ? : ");
        int way = km.nextInt();
        System.out.println();
        km.close();
        int minimumP = 20;
       if(pricePerKm * way < 11){
            System.out.println("Your last price to pay is : " + minimumP);

        }else if (pricePerKm * way >= 11){
            double lastPrice = introPrice + (way * pricePerKm);
            System.out.println("Your final debt is : " + lastPrice);
        }else if (pricePerKm * way == 0)
            System.out.println("Please be sure you've entered your data well.");

         // there is also another way that you can use
        /* int lastPrice = way <= 4 ? minimumP : (int)(introPrice + (pricePerKm * way));
        System.out.println("Your debt is : " + lastPrice + "\n" +
                "Thank you for choosing us.");*/

    }
}