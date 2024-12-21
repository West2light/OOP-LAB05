package hust.soict.dsai.test.disc;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle"); DigitalVideoDisc
	 * cinderellaDVD = new DigitalVideoDisc("Cinderella");
	 * 
	 * swap(jungleDVD, cinderellaDVD); System.out.println("jungle dvd title: " +
	 * jungleDVD.getTitle()); System.out.println("cinderella dvd title: " +
	 * cinderellaDVD.getTitle());
	 * 
	 * changeTitle(jungleDVD, cinderellaDVD.getTitle());
	 * System.out.println("jungle dvd title: " + jungleDVD.getTitle()); }
	 * 
	 * public static void swap(Object o1, Object o2) { Object tmp = o1; o1 = o2; o2
	 * = tmp; }
	 * 
	 * public static void changeTitle(DigitalVideoDisc dvd, String title) { String
	 * oldTitle = dvd.getTitle(); dvd.setTitle(title); dvd = new
	 * DigitalVideoDisc(oldTitle); }
	 */

    public static void main(String[] args) {
	      
	        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
	        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

	        
	        Object[] dvdArray = {jungleDVD, cinderellaDVD};

	        System.out.println("Before swap:");
	        System.out.println("jungle dvd title: " + ((DigitalVideoDisc) dvdArray[0]).getTitle());
	        System.out.println("cinderella dvd title: " + ((DigitalVideoDisc) dvdArray[1]).getTitle());

	        
	        swap(dvdArray[0], dvdArray[1]);

	        System.out.println("After swap:");
	        System.out.println("jungle dvd title: " + ((DigitalVideoDisc) dvdArray[0]).getTitle());
	        System.out.println("cinderella dvd title: " + ((DigitalVideoDisc) dvdArray[1]).getTitle());
	    }

	    
	    public static void swap(Object o1, Object o2) {
	        
	        Object tmp = o1;
	        o1 = o2;
	        o2 = tmp;

	        System.out.println("Inside swap method:");
	        System.out.println("o1: " + ((DigitalVideoDisc) o1).getTitle());
	        System.out.println("o2: " + ((DigitalVideoDisc) o2).getTitle());
	    }

	    public static void changeTitle(DigitalVideoDisc dvd, String title) {
	        String oldTitle = dvd.getTitle();
	        dvd.setTitle(title);
	        dvd = new DigitalVideoDisc(oldTitle);
	    }
  
}

