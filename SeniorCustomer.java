public class SeniorCustomer extends Customer{

    double staticDiscount, finalDiscount;

    SeniorCustomer (String name, double amount) {
        super(name, amount);
    }

    double calculateBill() {
        staticDiscount = amount * 0.20;
        finalDiscount = amount - staticDiscount;
        return finalDiscount;
    }
}
