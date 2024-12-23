package hust.soict.dsai.aims.media;

import hust.soict.dsai.aims.exception.PlayerException;

public class DigitalVideoDisc extends Disc implements Playable{

    public DigitalVideoDisc(int id, String title) {
        super(id, title);
    }

    public DigitalVideoDisc(int id, String title, String category, float cost) {
        super(id, title, category, cost);
    }

    public DigitalVideoDisc(int id, String title, String category, String director, float cost) {
        super(id, title, category, director, cost);
    }

    public DigitalVideoDisc(int id, String title, String category, String director, int length, float cost) {
        super(id, title, category, director, length, cost);
    }



    // id - DVD - title - category - director - length - cost
	@Override
	public String toString() {
		String result = this.getId() + ". DVD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + this.getLength() + ": " + this.getCost() + "$";
		return result;
	}

	// public boolean isMatch(String title){
	// 	if (this.getTitle().toLowerCase().equals(title.toLowerCase())) {
	// 		return true;
	// 	}
	// 	return false;
	// }
	// public boolean isMatch(int id){
	// 	if (this.getId() == id) {
	// 		return true;
	// 	}
	// 	return false;
	// }

	@Override
	/*
	 * public void play() { if (this.getLength() <= 0) { System.out.println("DVD " +
	 * this.getTitle() + " can't be played!"); } else {
	 * System.out.println("Playing DVD: " + this.getTitle());
	 * System.out.println("DVD length: " + this.getLength()); } }
	 */

	/*
	 * public boolean isMatch(String title){ if
	 * (this.getTitle().toLowerCase().equals(title.toLowerCase())) { return true; }
	 * return false; } public boolean isMatch(int id){ if (this.getId() == id) {
	 * return true; } return false; }
	 */

			public void play() throws PlayerException {
				if (this.getLength() > 0) {
					System.out.println("Playing DVD: " + this.getTitle());
					System.out.println("DVD length: " + this.getLength());	
				}else {
					throw new PlayerException("ERROR: DVD length is non-positive!");
				}
			}
			
			public String playMedia() throws PlayerException{
				if (this.getLength() > 0) {
					String out = "Playing DVD: " + this.getTitle() + "\n" + "DVD length: " + this.getLength();
					return out;
				}else {
					throw new PlayerException("ERROR: DVD length is non-positive!");
				}
			}
		
}