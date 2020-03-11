

public class MainBook {
    public static void main(String[] args) {
        Book book1= new Book();
        Book book2 = new Book();
        Book book3= new Book();

        book1.setName("The little prince");
        book1.setpage("136");
        book1.setISBN("9781909621565");
        book1.setPrice("439");
        book1.setPublishing house("Macmillan UK");

        book2.setName("Harry Potter and the Sorcerer’s Stone");
        book2.setpage("312");
        book2.setISBN("9780590353427");
        book2.setPrice("385");
        book2.setPublishing house("Scholastic Paperbacks");

        book3.setName("Aladdin");
        book3.setpage("136");
        book3.setISBN("9781368037112");
        book3.setPrice("276");
        book3.setPublishing house("Disney Pr");

        System.out.println("Book1 for The little prince ");
        book1.showInfo();
        System.out.println("Book2 for Harry Potter and the Sorcerer’s Stone ");
        book2.showInfo();
        System.out.println("Book3 for Aladdin ");
        book3.showInfo();
    }
}

