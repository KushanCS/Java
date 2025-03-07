public class LibraryManagement {
    public static void main(String[] args){

        Book book1 =  new Book("Java The Complete References", "Herbert Schildt");
        Book book2 = new Book("Python Essential Reference","David M Beazely","9758");
        Book book3 = new Book("Java Programming for Kids", "R. Chandler Thompson ","1998");

        //Displaying book details
        System.out.println(book1.getBookDetails());
        System.out.println(book2.getBookDetails("978-0-672-32916-6"));
        System.out.println(book2.getBookDetails("978-0-672-32916-2"));
        System.out.println(book3.getBookDetails());
    }
}
