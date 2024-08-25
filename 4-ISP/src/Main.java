import demo1.AdvancedPrinter;
import demo1.BasicPrinter;
import demo1.Printer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("***A demo without ISP.***");
        Printer printer = new AdvancedPrinter();
        printer.printDocument();
        printer.sendFax();

        printer = new BasicPrinter();
        printer.printDocument();
        // printer.sendFax(); // Will throw error

        List<Printer> printers = new ArrayList<>();
        printers.add(new AdvancedPrinter());
        printers.add(new BasicPrinter());
        for (Printer device : printers) {
            device.printDocument();
            // device.sendFax(); // Will throw error
        }

        System.out.println("***A demo that follows ISP.***");

        demo2.Printer p = new  demo2.BasicPrinter();
        p.printDocument();
        p = new  demo2.AdvancedPrinter();
        p.printDocument();

        demo2.FaxDevice faxDevice = new  demo2.AdvancedPrinter();
        faxDevice.sendFax();
    }
}
