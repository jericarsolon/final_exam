public abstract class Customer {


    String name;
    double amount;

    public Customer (String name, double amount) {
        this.name = name;
        this.amount = amount;
    }


    abstract double calculateBill();

}
