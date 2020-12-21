public class FictionBook extends Book implements Discount{
    private String category;
    private double promotionalPrice;
    public FictionBook(){};

    public FictionBook(String category, double promotionalPrice) {
        this.category = category;
        this.promotionalPrice = promotionalPrice;
    }

    public FictionBook(int bookCode, String name, int price, String author, String category, double promotionalPrice) {
        super(bookCode, name, price, author);
        this.category = category;
        this.promotionalPrice = promotionalPrice;
    }

    public String getCategory() {
        return category;
    }

    public double getPromotionalPrice() {
        return promotionalPrice;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPromotionalPrice(double promotionalPrice) {
        this.promotionalPrice = promotionalPrice;
    }

    @Override
    public void setDiscount(int percent) {
        this.promotionalPrice=this.getPrice()*(100-percent)/100;
    }
}
