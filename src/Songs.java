public class Songs {
    private String title;
    private int rating;
    private double price = 0.0;
    private boolean favorite;

    public Songs()
    {
        title = "";
        rating = 0;
    }
    public void setTitle(String t){
        title = t;
    }
    public String getTitle()
    {
        return title;
    }
    public void setRating(int t){
        rating = t;
    }
    public int getRating()
    {
        return rating;
    }
    public void setPrice(double p)
    {
        price = p;
    }
    public double getPrice()
    {
        return price;
    }
    public void addToFavorites()
    {
        favorite = true;
    }
    public Songs(String title, double price, int rating) {
        this.title = title;
        this.price = price;
        this.rating = rating;
    }


}
