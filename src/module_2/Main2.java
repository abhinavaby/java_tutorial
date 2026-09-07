package module_2;

class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class Technical extends Book {
    String subject;

    public Technical(String title, String author, String subject) {
        super(title, author);
        this.subject = subject;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Subject: " + subject);
    }
}

class Story extends Technical {
    String genre;

    public Story(String title, String author, String subject, String genre) {
        super(title, author, subject);
        this.genre = genre;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Genre: " + genre);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Book ref;

        ref = new Book("General Knowledge", "John Doe");
        System.out.println("--- General Book ---");
        ref.display();

        System.out.println();

        ref = new Technical("Core Java Programming", "James Gosling", "Computer Science");
        System.out.println("--- Technical Book ---");
        ref.display();

        System.out.println();

        ref = new Story("The Hobbit", "J.R.R. Tolkien", "Literature", "Fantasy");
        System.out.println("--- Story Book ---");
        ref.display();
    }
}