package com.fardin.furniturecatalogue;

public class FCategory {

    private String categoryName;
    private int categoryPicUrl;

    public FCategory(String categoryName, int categoryPicUrl) {
        this.categoryName = categoryName;
        this.categoryPicUrl = categoryPicUrl;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getCategoryPicUrl() {
        return categoryPicUrl;
    }

    public void setCategoryPicUrl(int categoryPicUrl) {
        this.categoryPicUrl = categoryPicUrl;
    }
}
