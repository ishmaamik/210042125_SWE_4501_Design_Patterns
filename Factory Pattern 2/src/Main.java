public class Main {
    public static void main(String[] args) {

        TicketFactory tf= new TicketFactory();

        Airlines ar= tf.bookTicket("Bangladesh-Palestine");
        ar.ticket();
    }
}