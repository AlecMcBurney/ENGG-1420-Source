/**
 * Mackenzie Alec McBurney
 * 2023/02/01
 * Assignment 3 part
 * Implement a Date class for the concept of date. Each date object contains year, month and day.
 * Further, each date object must have the following methods:
 *  a. print, that prints the value of the date in the output.
 *  b. addDays, which takes a parameter n of type int and adds n days to the date.
 *  c. compare, which takes a parameter of type Date and calculates the number of days between the
 *      date of the current object and the input object.
 */
package assignment3;

/**
 *
 * @author kyure
 */
public class Date {

    private int year, month, day;
    final private int[] daysPerMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    /**
     * Constructor for class Date.
     *
     * @param year
     * @param month
     * @param day
     */
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;

    }

    /**
     * A method that prints the value of the date in the output.
     */
    public void print() {
        System.out.println("The date is" + this.year + "/" + this.month + "/" + this.day);
    }

    /**
     * A method that takes a parameter n of type int and adds n days to the
     * date.
     *
     * @param n
     * @param date
     */
    public void addDays(int n, int date[]) {
        // Increment the day in a controlled manor.
        for (int i = 0; i < n; i++) {
            this.day++;
            // Check if the days flow over into the next month
            if (this.day > daysPerMonth[this.month]) {
                this.day = 1;
                this.month++;
            }
            // Check if the months flow over into the next year.
            if (this.month > 12) {
                year++;
                this.month = 1;
            }
        }
    }

    /**
     * which takes a parameter of type Date and calculates the number of days
     * between the date of the current object and the input object.
     *
     * @param newDate
     * @return dayDiff
     */
    public int compare(Date newDate) {
        int days1 = 0;
        int days2 = 0;
        int dayDiff = 0;
        days1 += this.year * 365 + monthsToDays(this.month) + this.day;
        days2 += newDate.year * 365 + monthsToDays(newDate.month) + newDate.day;
        dayDiff = Math.abs(days1 - days2);
        return dayDiff;
    }

    /**
     * A method that determines the number of days in a number of months.
     *
     * @param month
     * @return
     */
    private int monthsToDays(int month) {
        int totalDays = 0;
        for (int i = month; i > 0; i--) {
            totalDays += daysPerMonth[i];
        }
        return totalDays;
    }

    //Setters and Getters
    /**
     * An accessor for the var year
     *
     * @return year
     */
    public int getYear() {
        return year;
    }

    /**
     * A mutator for the var year
     *
     * @param year
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * An accessor for the var month
     *
     * @return month
     */
    public int getMonth() {
        return month;
    }

    /**
     * A mutator for the var month
     *
     * @param month
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * An accessor for the var day
     *
     * @return day
     */
    public int getDay() {
        return day;
    }

    /**
     * A mutator for the var day
     *
     * @param day
     */
    public void setDay(int day) {
        this.day = day;
    }
}
/* Days and months notes
months with 31 days
1,3,5,7,8,10,12
months with 30 days
4,6,9,11
month 2 with 28 days
 */
//2000/4/30
