 class Library {
    String[] books;
    int no_of_books;

    Library() {
        this.books = new String[100];
        this.no_of_books = 0;
    }

     void addBook(String bookname) {
        this.books[no_of_books] = bookname;
        no_of_books++;
        System.out.println(bookname + "book has been added");
    }

     void showAvailableBooks() {
        for (int i = 0; i < 100; i++) {
            if (this.books[i] == null)
                continue;
            else {
                System.out.println("#"+books[i]);
            }
        }
    }
    void issueBook (String bookname){
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i] == bookname)
                this.books[i]=null;
                System.out.println("your book has been issued");
                return;
        }
      System.out.println("no such type of book is found");
    }
    void returnBook (String bookname){
        addBook(bookname);
    }

}

public class libraryForMe {
    public static void main(String[] args) {
        Library talash = new Library();
        talash.addBook("wings of fire");
        talash.addBook("rich dad poor dad");
        talash.addBook("power fo smmn");
        talash.addBook("gita gyan");
        talash.showAvailableBooks();
        talash.issueBook("wings of fire");
        talash.showAvailableBooks();
        talash.returnBook("wings of fire");
        talash.showAvailableBooks();

    }
}
