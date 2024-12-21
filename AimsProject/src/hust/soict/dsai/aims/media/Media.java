
package hust.soict.dsai.aims.media;

import java.util.Comparator;

public abstract class Media implements Comparable<Media> {
    private int id;
    private String title;
    private String category;
    private float cost;

    // Comparator để sắp xếp theo title, nếu title giống nhau thì sắp xếp theo cost giảm dần
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    
    // Comparator để sắp xếp theo cost giảm dần, nếu cost giống nhau thì sắp xếp theo title
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

    public Media() {
        this(0, null);
    }

    public Media(int id, String title) {
        this(id, title, null, 0.0f);
    }

    public Media(int id, String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public float getCost() {
        return cost;
    }

    @Override
    public boolean equals(Object obj) {
        // Kiểm tra nếu obj là null hoặc không phải instance của Media
        if (obj == null || !(obj instanceof Media)) {
            return false;
        }
        
        // Ép kiểu obj thành Media
        Media media = (Media) obj;
        
        // So sánh title (cả hai đều null hoặc giống nhau)
        if (this.title == null) {
            return media.title == null;
        }
        return this.title.equals(media.title);
    }

    @Override
    public String toString() {
        return String.format("%s - %s - %s: %.2f $ (ID: %d)",
            this.getClass().getSimpleName(), // Lấy tên class (DVD, CD, hoặc Book)
            title != null ? title : "N/A",
            category != null ? category : "N/A",
            cost,
            id);
    }

    // Thêm các setter methods
    protected void setTitle(String title) {
        this.title = title;
    }

    protected void setCategory(String category) {
        this.category = category;
    }

    protected void setCost(float cost) {
        this.cost = cost;
    }

    @Override
    public int compareTo(Media other) {
        // So sánh chính theo title
        if (this.title != null && other.title != null) {
            int titleCompare = this.title.compareToIgnoreCase(other.title);
            if (titleCompare != 0) {
                return titleCompare;
            }
            // Nếu title giống nhau, so sánh theo cost giảm dần
            if (this.cost > other.cost) return -1;
            if (this.cost < other.cost) return 1;
            return 0;
        }
        
        // Xử lý các trường hợp title null
        if (this.title == null && other.title != null) return 1;
        if (this.title != null && other.title == null) return -1;
        
        // Nếu cả hai title đều null, so sánh theo cost giảm dần
        if (this.cost > other.cost) return -1;
        if (this.cost < other.cost) return 1;
        return 0;
    }
} 