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
 * A class for the concept of a book.
 * @author kyure
 */
public class Book {

    // title, author names, number of pages, year of publication and price
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
    
    /**
     * A method that returns the title in title case.
     *
     * return titleCase
     */
    public String getTitleInTitleCase() {
        /*
        How long a for loop should loop.
        The title but with title case.
        The letter that is being added to the string.
        */
        int len = title.length();
        String titleCase = new String();
        char letter;
        for (int i = 0; i < len; i++) {
            letter = title.charAt(i);
            if (i == 0 // First letter of the title, Assumes the title doesn't start with a non char.
                    || title.charAt(i - 1) == 32) { // First char after a space. Also assuems a char.
                letter = capitalize(letter); // Calls capitalize method.
            }
            String str = String.valueOf(letter); // Convert the char to a string to be concatonated
            titleCase = titleCase.concat(str); // Add the letter to the string.
        }
        return titleCase;
    }
    
    /**
     * A method that checks if a given string is found within the title.
     * 
     * @param check
     * @return found
     */
    public boolean contains(String check) {
        boolean found = false;
        int titleLen = title.length();
        int checkLen = check.length();
        int similarity;
        for (int i = 0; i < titleLen; i++) {
            int j = 0;
            if (title.charAt(i) == check.charAt(j)) {
                similarity = 0;
                while (j < checkLen && i < titleLen && title.charAt(i) == check.charAt(j)) {
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
    
    /**
     * A method that prints off the authors of a book. One author per line.
     */
    public void printAuthors() {
        int authorLen = author.length();
        char tab = 10;
        for (int i = 0; i < authorLen; i++) {
            if (author.charAt(i) == ',') {
                System.out.print(tab);
            } else if (author.charAt(i) == ' ') {
            } else {
                System.out.print(author.charAt(i));

            }

        }
    }
    
    /**
     * A method that capitalizes letters.
     * 
     * @param changeCase
     * @return changeCase
     */
    private char capitalize(char changeCase) {
        if (changeCase < 123 && changeCase > 96) { // Check if the ASCII value is of a lower case letter.
            changeCase -= 32; // Change the ASCII value to that of an upper case letter.
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

    
}
