
public class DeluxPizza extends Pizza {
    public DeluxPizza(Boolean isVeg){
        super(isVeg);
    }

    @Override
    public void addExtraCheese() {

        this.price += extraCheesePrice;

    }

    @Override
    public void addExtraToppings() {

        this.price += extraToppingsPrice;

    }
}
