public class Main {
    public static void main(String[] args) {

    Customer c;
    RegularCustomer rc = new RegularCustomer("Max", 20000);
    SeniorCustomer sc = new SeniorCustomer("Dennis ", 20000);

    c = rc;
    System.out.println(rc.name + " who is a regular customer has a total bill of " + rc.calculateBill());

    c = sc;
    System.out.println(sc.name + " who is a senior customer has a total bill of " + sc.calculateBill());



    }
}