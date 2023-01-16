import java.util.Scanner;

public class T002_InvoiceDetail {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Double productPrice1 = 0d;
        Double productPrice2 = 0d;

        System.out.println("***Welcome to the invoice system!***");
        System.out.println("Please, enter the invoice description: ");
        String inputInvoiceName = scanner.nextLine();

        System.out.println("Please, enter the product 1, and then the product 2 price");

        try {
            System.out.println("Product 1 price: ");
            productPrice1 = scanner.nextDouble();
            System.out.println("Product 2 price: ");
            productPrice2 = scanner.nextDouble();

            double invoiceTotalBeforeTaxes = productPrice1 + productPrice2;
            double taxes = invoiceTotalBeforeTaxes * 0.19;
            double invoiceTotalAfterTaxes = invoiceTotalBeforeTaxes + taxes;

            System.out.println("Invoice: " + inputInvoiceName + "\nTotal before taxes: " +
                    invoiceTotalBeforeTaxes + "\nTaxes: " + taxes + "\nTotal: " + invoiceTotalAfterTaxes);
        } catch (Exception e) {
            System.out.println("Only double numbers admitted \n");
            main(args);
            System.exit(0);
        }

    }
}
