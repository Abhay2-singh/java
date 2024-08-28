public class book {
    static int totalNOBook;
    String author;
    String title;
    String isbn;
    boolean isBorrowed;
    static {
        totalNOBook=0;
    }
    {
        totalNOBook++; //object intitilizer
    }
    book(String isbn,String title,String author){
        this.isbn=isbn;
        this.title=title;
        this.author=author;
    }
    book(String isbn){
        this("isbn" ,"unknow","unknow");

    }
    static int getTotalNOBook(){
        return totalNOBook;
    }
    void borrowedBook(){
        if (isBorrowed){
            System.out.println("the book is already borrowed");
        }
        else {
            this.isBorrowed = true;
            System.out.println("enjoy the book");
        }
    }
     void returnBook(){
        if (isBorrowed){
            this.isBorrowed=false;
            System.out.println("hope you enjoy the book");
        }
        else {
            System.out.println("this book is already in library");
        }
     }

    public static void main(String[] args) {

        book designOfThings = new book("1","design","author");
        book myBook = new book("2");
        System.out.println(book.getTotalNOBook());
        myBook.borrowedBook();
        designOfThings.borrowedBook();
        designOfThings.returnBook();
        designOfThings.returnBook();
    }

}
