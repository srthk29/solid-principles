package demo1;

public class AdvancedPrinter implements Printer {
    @Override
    public void printDocument() {
        System.out.println("The advanced printer prints a document.");
    }
    @Override
    public void sendFax() {
        System.out.println("The advanced printer sends a fax.");
    }
}
