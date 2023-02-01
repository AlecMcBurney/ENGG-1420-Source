/**
 * Mackenzie Alec McBurney
 * 2023/01/21
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

    private int year, month, day, newYear, newMonth, newDay;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void addDays(int add, int date[]) {
        this.day += add;
        while (this.day > 28) {

            //Checks if entered the month has 31 days.
            if (this.month == 1 // January.
                    || this.month == 3 // March
                    || this.month == 5 // May
                    || this.month == 7 // July
                    || this.month == 8 // August
                    || this.month == 10 // October
                    || this.month == 12) { // December
                if(this.day > 31){
                    this.month++;
                    this.day -= 31;
                } 
                else break;
            } // Checks if the entered month has 30 days.
            else if (this.month == 4
                    || this.month == 6
                    || this.month == 9
                    || this.month == 11) {
                if(this.day > 30){
                    this.month++;
                    this.day -= 30;
                }
                else break;
            } // Checks if the entered month has 28 days.
            else if (this.month == 2) {
                if(this.day > 28){
                    this.month++;
                    this.day -= 28;
                }
                else break;
            } else {
                System.out.println("Error: that is not a correct month number.");
            }
            if (this.month > 12) {
                year++;
                this.month = 1;
            }
        }
    }

    Date compare() {
        int days1, days2;

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
     * A mutator for the var month
     *
     * @param month
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * A mutator for the var day
     *
     * @param day
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * An accessor for the var year
     *
     * @return year
     */
    public int getYear() {
        return year;
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
     * An accessor for the var month
     *
     * @return day
     */
    public int getDay() {
        return day;
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
