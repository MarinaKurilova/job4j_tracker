package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book b1 = new Book("Clean code", 464);
        Book b2 = new Book("Idiot", 321);
        Book b3 = new Book("Winnie the Pooh", 115);
        Book b4 = new Book("Encyclopedia", 577);
        Book[] books = new Book[4];
        books[0] = b1;
        books[1] = b2;
        books[2] = b3;
        books[3] = b4;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + ", " + bk.getCount());
        }
        System.out.println("Replace \"Clean code\" to \"Encyclopedia\":");
        Book tmp;
        tmp = b1;
        books[0] = b4;
        books[3] = tmp;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + ", " + bk.getCount());
        }
        System.out.println("Shown only \"Clean code\":");
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            if (bk.getName().equals("Clean code")) {
                System.out.println(bk.getName() + ", " + bk.getCount());
            }
        }
    }
}
