

package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class Book extends Media {
    private ArrayList<String> authors = new ArrayList<String>();

    public Book() {
        super(0, null, null, 0f);
    }

    public Book(int id, String title, String category, float cost) {
        super(id, title, category, cost);
    }

    public void setTitle(String title) {
        super.setTitle(title);
    }

    public void setCategory(String category) {
        super.setCategory(category);
    }

    public void setCost(float cost) {
        super.setCost(cost);
    }

    public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            authors.add(authorName);
            System.out.println("Tác giả " + authorName + " đã được thêm vào sách.");
        } else {
            System.out.println("Tác giả " + authorName + " đã tồn tại trong sách.");
        }
    }

    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
            System.out.println("Tác giả " + authorName + " đã được xóa khỏi sách.");
        } else {
            System.out.println("Tác giả " + authorName + " không tồn tại trong sách.");
        }
    }

    @Override
    public String toString() {
        String baseInfo = super.toString();
        return baseInfo.replace(")", 
            String.format(", Authors: %s)", 
                authors.isEmpty() ? "N/A" : String.join(", ", authors)));
    }
} 