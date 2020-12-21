public class BookManage {
    private Book[] bookLists=new Book[10];

    public Book[] getBookLists() {
        return bookLists;
    }

    public double getSumPrice(){
        double sum=0;
        for (Book book:bookLists) {
            sum+=book.getPrice();
        }
        return sum;
    }
    public int countBookOfLanguage(String language){
        int count=0;
        for (Book book:bookLists) {
            if (book instanceof ProgammingBook){
                String langugeOfBook = ((ProgammingBook) book).getLanguage();
                if (langugeOfBook==language)count++;
            }
        }
        return count;
    }
    public double getSumPromotionalPrice(){
        double sum=0;
        for (Book book:bookLists) {
            if (book instanceof FictionBook){
                FictionBook fictionBook = (FictionBook) book;
                fictionBook.setDiscount(10);
                sum+=fictionBook.getPromotionalPrice();
            }
        }
        return sum;
    }
}
