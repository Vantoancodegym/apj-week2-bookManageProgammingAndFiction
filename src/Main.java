public class Main {
    public static void main(String[] args) {
        BookManage library=new BookManage();
        Book[] bookLists=library.getBookLists();
        bookLists[0]=new ProgammingBook(1001,"name1",15000,"author1","java","IE8");
        bookLists[1]=new ProgammingBook(1002,"name1",16000,"author2","php","IE8");
        bookLists[2]=new ProgammingBook(1003,"name1",17000,"author3","java","IE8");
        bookLists[3]=new ProgammingBook(1004,"name1",18000,"author4","php","IE8");
        bookLists[4]=new ProgammingBook(1005,"name1",19000,"author5","java","IE8");
        bookLists[5]=new FictionBook(2001,"name2",20000,"author5","IE9",0);
        bookLists[6]=new FictionBook(2002,"name2",21000,"author5","IE9",0);
        bookLists[7]=new FictionBook(2003,"name2",22000,"author5","IE9",0);
        bookLists[8]=new FictionBook(2004,"name2",23000,"author5","IE9",0);
        bookLists[9]=new FictionBook(2005,"name2",24000,"author5","IE9",0);
        double sumPrice=library.getSumPrice();
        double amoutOfJAVA=library.countBookOfLanguage("java");
        double sumPromotionalPrice=library.getSumPromotionalPrice(10);
        System.out.println("sum price = "+sumPrice+" amount of java language = "+amoutOfJAVA+" sum of promotinal price = "+sumPromotionalPrice);

    }
}
