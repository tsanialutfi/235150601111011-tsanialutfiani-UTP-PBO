public class Ticket extends User{
    private int studioNumber;
    private double price;
    private String seats;
    private String ticketInfo;

    public int getStudioNumber() {
        return studioNumber;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getSeats() {
        return seats;
    }

    public static double getTicketPrice(String type){

    }

    public Ticket(int studioNumber, String seats){
    }

    public String getTicketInfo(){
        return ticketInfo;
    }
    
}
