public class BambinoCafe {
    static public void main(String [] args){
        double Coffee = 4.00;
        double Cookie = 1.99;
        double Croissant = 4.99;

        double subtotal = Coffee * 3 + Cookie * 4 + Croissant * 2;
        final double SALES_TAX = subtotal * 0.05;
        double totalSale = subtotal + SALES_TAX;

        System.out.println("Your total is " + totalSale);
    }
}
