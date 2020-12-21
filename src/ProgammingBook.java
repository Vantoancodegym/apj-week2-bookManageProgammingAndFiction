public class ProgammingBook extends Book{
    private String language;
    private String framework;
    public ProgammingBook(){};

    public ProgammingBook(String language, String framework) {
        this.language = language;
        this.framework = framework;
    }

    public ProgammingBook(int bookCode, String name, int price, String author, String language, String framework) {
        super(bookCode, name, price, author);
        this.language = language;
        this.framework = framework;
    }

    public String getLanguage() {
        return language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
