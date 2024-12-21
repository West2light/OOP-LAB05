package hust.soict.dsai.aims.media;
import java.util.ArrayList;
import java.util.List;
public class TestPolymorphism {

	

	    public static void main(String[] args) {
	        // Create an ArrayList of Media
	        List<Media> mediaList = new ArrayList<>();

	        // Create some media (CD, DVD, Book)
	      // CompactDisc(int id, String title, String artist, String category, float cost)
	        Media cd = new  CompactDisc(201, "Thriller", "Pop", "Hello", 90.05f);
	        //Disc(int id, String title, String category, String director, int length, float cost)
	        Media dvd = new Disc(2, "The Godfather", "Crime", "Francis Ford Coppola", 175);
	        Media book = new Book(103, "The Great Gatsby", "Classic", 8.99f);

	        // Add media to the list
	        mediaList.add(cd);
	        mediaList.add(dvd);
	        mediaList.add(book);

	        // Iterate through the list and call toString()
	        for (Media media : mediaList) {
	            System.out.println(media.toString());
	        }
	    }
	


}
