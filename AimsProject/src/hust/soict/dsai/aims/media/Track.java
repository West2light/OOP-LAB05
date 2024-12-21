
package hust.soict.dsai.aims.media;

public class Track implements Playable {
    private String title;
    private int length;
    
    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }
    
    public String getTitle() {
        return title;
    }
    
    public int getLength() {
        return length;
    }

    //@Override
    public void play() {
        System.out.println("Playing track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
    }

    @Override
    public boolean equals(Object obj) {
        // Kiểm tra nếu obj là null hoặc không phải instance của Track
        if (obj == null || !(obj instanceof Track)) {
            return false;
        }
        
        // Ép kiểu obj thành Track
        Track track = (Track) obj;
        
        // So sánh title và length
        if (this.title == null) {
            return track.title == null && this.length == track.length;
        }
        return this.title.equals(track.title) && this.length == track.length;
    }
} 