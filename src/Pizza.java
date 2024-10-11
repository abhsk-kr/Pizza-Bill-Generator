
import java.util.Scanner;
public class Pizza {
    protected int price;
    private Boolean veg;

    protected int extraCheesePrice = 100;
    protected int extraToppingsPrice = 150;
    protected int backPackPrice = 20;

  protected int basePizzaPrice;
   private boolean isExtraCheeseAdded = false;
   private boolean isExtraToppingsAdded = false;
   private boolean isOptedForTakeaway = false;

   Scanner in = new Scanner(System.in);


    public Pizza(Boolean isVeg)
    {
            this.veg = veg;

        if(this.veg != null)
        {
            this.price = 300;
        }else{
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }


    public void addExtraCheese(){
        System.out.println("Extra Cheese (y/n)? =>");
        char ch = in.next().charAt(0);
        switch (ch)
        {
            case ('y'):
                isExtraCheeseAdded = true;
                this.price += extraCheesePrice;
                break;
            case ('n'):
                isExtraCheeseAdded = false;
                break;
        }
    }

    public void addExtraToppings(){

        System.out.println("Want Extra Topping(y/n)? =>");
        char ch = in.next().charAt(0);
        switch (ch)
        {
            case ('y'):
                isExtraToppingsAdded = true;
                this.price += extraToppingsPrice;
                break;
            case ('n'):
                isExtraToppingsAdded = false;
                break;
        }
    }
    public void takeAway()
    {
        System.out.println("Want Takeaway (y/n)? =>");
        char ch = Character.toLowerCase(in.next().charAt(0));
        switch (ch)
        {
            case ('y'):
                isOptedForTakeaway = true;
                this.price += backPackPrice;
                break;
            case ('n'):
                isOptedForTakeaway = false;
                break;
        }

    }
    public void getBill() {
        String bill = " ";
        System.out.println("Pizza :  " + basePizzaPrice);
        if (isExtraCheeseAdded) {
            bill += "Extra Cheese :  " + extraCheesePrice + "\n";
        }
        if (isExtraToppingsAdded) {
            bill += "Extra Toppings :   " + extraToppingsPrice + "\n";
        }
        if (isOptedForTakeaway) {
            bill += "Take away :  " + backPackPrice + "\n";
        }
        bill += "\nTotal Amount: " + this.price + "\n";

        System.out.println(bill);
        System.out.println("\n\n\nThanks You!!!!! Visit Again.......");
        System.out.println("------------------------------------------------------");


    }

}
