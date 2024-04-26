    public class User {
    private String email;
    private String password;
    private String fullName;
    private double balance;
    private String[] ticketList;
    //final int MAX_TICKET 20;
    
    public User() {
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getPassword() {
        return password;
    }
    
    public String getFullName() {
        return fullName;
    }
        
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public boolean addTicket(String Ticket[]){
        return true;
    }
        
    public User(String email, String password, String fullName, double balance){   
    }
    
    public void displayAllTicket(){
    }
    
    public boolean isMatch(String email, String password){
        return true;
    }
    
}
