public class MediaLib
{
    public static void main(String[] args)
    {
        double totalCost = 0.0;
        int songAmount = 0;
        double averageTotalCost = 0.0;
        double averageRating = 0.0;
        int hoursM;
        int minutesM;
        // Songs
        Songs rating1 = new Songs();
        Songs price1 = new Songs();
        Songs song1 = new Songs("Johnny B. Goode", 0.99, 4);
        Songs song2 = new Songs("Polaroid", 01.28, 10);
        Songs song3 = new Songs("Paid My Dues", 1.19, 9);
        Songs song4 = new Songs("Through the Fire and the Flames", 0.97, 7);
        Songs song5 = new Songs("Thunderstruck", 1.07, 8);
        Songs song6 = new Songs("Fortunate Son", 1.09, 10);
        Songs song7 = new Songs("When I grow up", 1.29, 7);
        System.out.println("Welcome to your Media Library\n");
        System.out.println("Your Songs\nSong Title: " + song1.getTitle() + "\nRating is: " + song1.getRating() + "\nPrice: $" + song1.getPrice());
        ++songAmount;
        System.out.println("Song Title: " + song2.getTitle() + "\nRating is: " + song2.getRating() + "\nPrice: $" + song2.getPrice());
        ++songAmount;
        System.out.println("Song Title: " + song3.getTitle() + "\nRating is: " + song3.getRating() + "\nPrice: $" + song3.getPrice());
        ++songAmount;
        System.out.println("Song Title: " + song4.getTitle() + "\nRating is: " + song4.getRating() + "\nPrice: $" + song4.getPrice());
        ++songAmount;
        System.out.println("Song Title: " + song5.getTitle() + "\nRating is: " + song5.getRating() + "\nPrice: $" + song5.getPrice());
        ++songAmount;
        System.out.println("Song Title: " + song6.getTitle() + "\nRating is: " + song6.getRating() + "\nPrice: $" + song6.getPrice());
        ++songAmount;
        System.out.println("Song Title: " + song7.getTitle() + "\nRating is: " + song7.getRating() + "\nPrice: $" + song7.getPrice());
        ++songAmount;
        totalCost = song1.getPrice() + song2.getPrice() + song3.getPrice() + song4.getPrice() + song5.getPrice() + song6.getPrice()+ song7.getPrice();
        averageTotalCost = (song1.getPrice() + song2.getPrice() + song3.getPrice() + song4.getPrice() + song5.getPrice() + song6.getPrice()+ song7.getPrice())/songAmount;
        averageRating = (song1.getRating() + song2.getRating() + song3.getRating() + song4.getRating() + song5.getRating() + song6.getRating()+ song7.getRating())/songAmount;
        System.out.println("Total price for your songs: $" + totalCost);
        System.out.println("The average price for your songs: $" + averageTotalCost);
        System.out.println("The average rating for your songs: " + averageRating  + "\n");

        // Books
//        Books rating2 = new Books();
//        Books book1 = new Books();
//        book1.setTitle2("The Adventures of Tom Sawyer");
//        rating2.setRating2(3);
//        System.out.println("Your Books\nBook Title: " + book1.getTitle2() + "\nRating is: " + rating2.getRating2() + "\n");
//
        // Movies
        Movies rating3 = new Movies();
        Movies movie1 = new Movies();
        Movies time = new Movies();
        movie1.setTitle3("Men in Black 3");
        rating3.setRating3(7);
        time.setDuration(139);
        hoursM = time.getDuration()/60;
        minutesM = time.getDuration()%60;
        System.out.println("Your Movies\nMovie Title: " + movie1.getTitle3() + "\nRating is: " + rating3.getRating3());
        System.out.println("Your Movie's length: " + hoursM + "H " + minutesM + "M\n");

    }
}
