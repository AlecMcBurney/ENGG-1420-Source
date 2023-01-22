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

    int year, month, day, date[];

    void print(int date[]) {
        System.out.println(date[0] + "/" + date[1] + "/" + date[2]);
    }

    int[] addDays(int add, int date[]) {
        date[2] += add;

        if (date[1] == 1
                || date[1] == 3
                || date[1] == 5
                || date[1] == 7
                || date[1] == 8
                || date[1] == 10
                || date[1] == 12) {

            if (date[2] > 31) {
                date[1] += 1;
                while (date[2] > 31) {
                    date[2] = date[2] - 31;
                }
            }
        } else if (date[1] == 4
                || date[1] == 6
                || date[1] == 9
                || date[1] == 11) {

            if (date[2] > 30) {
                date[1] += 1;
                while (date[2] > 30) {
                    date[2] = date[2] - 30;
                }
            }

        } else if (date[1] == 2) {
            if (date[0] % 4 == 0) {

                if (date[2] > 29) {
                    date[1] += 1;
                    while (date[2] > 29) {
                        date[2] = date[2] - 29;
                    }
                }
            } else {
                if (date[2] > 28) {
                    date[1] += 1;
                    while (date[2] > 28) {
                        date[2] = date[2] - 28;
                    }
                }
            }
            return date;
        } else {
            System.out.println("Error: that is not a correct month number.");
        }

        Date compare(){
            
    }
}
    

    

    public static void main(String args) {

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
