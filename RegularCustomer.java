public class RegularCustomer extends Customer{


    RegularCustomer (String name, double amount) {
        super(name,amount);
    }
    double calculateBill() {
        return amount;
    }


}
