/*
 * Mackenzie Alec McBurney
 * 2023/02/07
 * Assignment 4 part 3
 * 
 * Implement a Book class for the concept of book. Each book has a title, author name, number of pages,
 * year of publication and price. It is assumed that the names of the authors of the book are of type String in
 * which the names of different authors are separated by commas (e.g., “Paul Dietel, Harvey Dietel”).
 * Implement at least 3 suitable constructors for this class. Next, implement the following methods in this
 * class:
 * a) getTitleInTitleCase method that returns the title of the book in Title Case format. TitleCase means
 * that the first letter of each word in the string is uppercase, and the rest of the letters are lowercase,
 * (e.g., if the title of the book is “java how to program”, the method returns “Java How To Program”).
 * b) contains method that receives a parameter of type String and returns true if the book title contains that
 * string, otherwise false. For example, if the input parameter is “Java” and the title of book is “Java How
 * To Program” this method returns true.
 * c) printAuthors method that prints the name of each author on a separate line.
 */
package assignment4;

/**
 *
 * @author kyure
 */
public class Book {

    // title, author name, number of pages, year of publication and price
    private String title;
    private String author;
    private int pages;
    private int pubDate;
    private float price;

    /**
     * Constructor for the Book class.
     *
     * @param title
     * @param author
     * @param pages
     * @param pubDate
     * @param price
     */
    public Book(String title, String author, int pages, int pubDate, float price) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.pubDate = pubDate;
        this.price = price;
    }

    public String getTitleInTitleCase() {
        int len = title.length();
        String titleCase = new String();
        char letter;
        for (int i = 0; i < len; i++) {
            letter = title.charAt(i);
            if (i == 0
                    || title.charAt(i - 1) == 32) {
                letter = capitalize(letter);
            }
            String str = String.valueOf(letter);
            titleCase = titleCase.concat(str);
        }
        return titleCase;
    }

    public boolean contains(String check) {
        boolean found = false;
        int titleLen = title.length();
        int checkLen = check.length();
        int similarity;
        for (int i = 0; i < titleLen; i++) {
            int j = 0;
            if (title.charAt(i) == check.charAt(j)) {
                similarity = 0;
                while (title.charAt(i) == check.charAt(j) && j < checkLen && i < titleLen) {
                    similarity++;
                    i++;
                    j++;
                }
                if (similarity == checkLen) {
                    found = true;
                }
            }
            if (found == true) {
                break;
            }
        }
        return found;
    }

    public void printAuthors() {

    }

    private char capitalize(char changeCase) {
        if (changeCase < 123 && changeCase > 96) {
            changeCase -= 32;
        }
        return changeCase;
    }

    //Accessors and mutators.
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPubDate() {
        return pubDate;
    }

    public void setPubDate(int pubDate) {
        this.pubDate = pubDate;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static void main(String[] args) {
        Book death = new Book("Harry Potter and the Philosipher's Stone", "J.K. Rowling", 320, 1999, (float) 0.2);
        System.out.println(death.getTitleInTitleCase());
        System.out.println(death.contains("and"));
    }
}
