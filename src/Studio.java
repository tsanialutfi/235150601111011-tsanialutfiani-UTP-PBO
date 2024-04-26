public class Studio extends Cinema {
    private String movie;
    private String type;
    private boolean[][] seats;
    private String studioInfo;

    public String getStudioInfo() {
        return studioInfo;
    }
    
    public void setSeats(boolean[][] seats) {
        this.seats = seats;
    }

    public String getType() {
        return type;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }
    
    public Studio(String type){
    }

    public int isBooked(char row,int col){
        return -1;
    }

    public boolean reserve(char row, int col){
        return true;
    }

    
}
