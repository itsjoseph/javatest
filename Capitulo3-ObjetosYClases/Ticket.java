public class Ticket {

    private int serialNumber;
    private static int countTicket;


    public Ticket() {
        System.out.println("Calling constructor");
        serialNumber = ++countTicket;
    }

    public int getSerialNumber() {
        return this.serialNumber;
    }

    public String getString() {
        return "Ticket#: " + this.getSerialNumber();
    }

    public static int GetTicketCount() {
        return countTicket;
    }

    public static void main(String[] args) {
        Ticket t1;
        Ticket t2;

        System.out.println("Ticket count is: " + Ticket.GetTicketCount());

        t1 = new Ticket();
        t2 = new Ticket();

        System.out.println("Ticket count is: " + Ticket.GetTicketCount());

        System.out.println(t2.getSerialNumber());
        System.out.println(t1.getSerialNumber());
    }
}