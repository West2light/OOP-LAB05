package hust.soict.dsai.aims.cart;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;

public class Cart {
    public static int maxDvD=20;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    public void addMedia(Media media){
        if(!itemsOrdered.contains(media)){
            itemsOrdered.add(media);
            System.out.println("Added to cart: " + media.getTitle());
        }
    }
    public void removeMedia(Media media){
        if(itemsOrdered.remove(media)){
            System.out.println("Removed from cart: " + media.getTitle());
        } else {
            System.out.println("Media not found in cart.");
        }
    }
    public double calculateTotalCost() {
        double total = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost(); 
        }
        return total;
    }
    public void print() {
        System.out.println("\n***********************CART***********************\nOrdered Items:");
        double total = 0;
        for (Media media : itemsOrdered) {
            System.out.printf("%d. %s\n", media.getId(), media.toString());
            total += media.getCost();
        }
        System.out.printf("Total cost: %.2f\n", total);
        System.out.println("***************************************************");
    }
    public void searchById(int id) {
        boolean a=false;
        for (Media media : itemsOrdered) {
            if (id == media.getId()) {
                System.out.printf("%d. %s\n", media.getId(), media.toString());
                a=true;
                break;
            }
        }
        if(!a) System.out.println("No match is found!\n");
    }
    public ArrayList<Media> getItemsOrdered() {
        return itemsOrdered;
    }
    
    public Media searchByTitle(String title) {
        for (Media media : itemsOrdered) {
            if (title.equals(media.getTitle())) {
                return media;
            }
        }
        System.out.println("No match is found!"); 
        return null;
    }
    public void sortByTitle(){
        Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
    }
    public void sortByCost(){
        Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
    }
    public void clear() {
        itemsOrdered.clear();  
        System.out.println("The cart has been cleared.");
    }
}