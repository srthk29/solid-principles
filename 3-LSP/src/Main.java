import demo1.GuestUserPayment;
import demo1.PaymentHelper;
import demo1.RegisteredUserPayment;

public class Main {
    public static void main(String[] args) {
        System.out.println("*** A demo without LSP ***\n");

        PaymentHelper helper = new PaymentHelper();

        RegisteredUserPayment robinPayment =
                new RegisteredUserPayment("Robin");

        RegisteredUserPayment jackPayment =
                new RegisteredUserPayment("Jack");

        helper.addUser(robinPayment);
        helper.addUser(jackPayment);

        helper.showPreviousPayments();
        helper.processNewPayments();

        //GuestUserPayment guestUser = new GuestUserPayment();
        //helper.addUser(guestUser);

        //helper.showPreviousPayments();
        //helper.processNewPayments();

        System.out.println("***A demo that follows the LSP.***\n");
        demo2.PaymentHelper paymentHelper = new demo2.PaymentHelper();
        // Instantiating two registered users.
        demo2.RegisteredUserPayment robin = new
                demo2.RegisteredUserPayment("Robin");
        demo2.RegisteredUserPayment jack = new
                demo2.RegisteredUserPayment("Jack");
        // Instantiating a guest user's payment.
        demo2.GuestUserPayment guestUser1 = new demo2.GuestUserPayment();
        // Consolidating the previous payment's info to
        // the helper.
        paymentHelper.addPreviousPayment(robin);
        paymentHelper.addPreviousPayment(jack);
        // Consolidating new payment requests to
        // the helper
        paymentHelper.addNewPayment(robin);
        paymentHelper.addNewPayment(jack);
        paymentHelper.addNewPayment(guestUser1);
        // Retrieve all the previous payments
        // of registered users.
        paymentHelper.showPreviousPayments();
        // Process all new payment requests
        // from all users.
        paymentHelper.processNewPayments();
    }
}