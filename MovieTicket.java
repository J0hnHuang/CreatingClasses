public class MovieTicket{
  private String movieName;
  private int movieLength;
  private double cost;

  public MovieTicket(){
    this.movieName = "";
    this.movieLength = 0;
    this.cost = 0;
  }

  public MovieTicket(String movieName, int movieLength){
    this.movieName = movieName;
    this.movieLength = movieLength;
  }

  public String getName(){
    return this.movieName;
  }

  public int getLength(){
    return this.movieLength;
  }

  public double getCost(){
    return this.cost;
  }

  public String toString(){
    return this.movieName + " is " + this.movieLength + " minutes long.";
  }
}