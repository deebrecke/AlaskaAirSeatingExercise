/**
 * Author: Dee Brecke
 * This class is a refactored version of Seats.java (which takes in a string of reserved seat numbers and
 * prints out how many families of four can be accommodated)
 * I realized that I didn't need to use an array because if I use java's ".contains" method,
 * I can just check the string.
 */
public class RefactoredSeats {
    //Constant for number of rows. By using a constant here, this is scalable for any number of rows on the plane
    public static final int NUM_ROWS = 5;

    /**
     * This method takes in a string of reserved seat numbers and iterates through them using a for-i loop,
     * checking the four conditionals.
     * @param reservedSeats = string representation of reserved seats
     */
    public static void checkSeats(String reservedSeats){
        //start with an empty counter
        int availableSets = 0;

        //iterate through each row to check conditionals
        for (int i = 1; i <= NUM_ROWS; i++) {
            //is the first section (BCDE) available?
            if (!reservedSeats.contains(i + "B")
                    && !reservedSeats.contains(i + "C")
                    && !reservedSeats.contains(i + "D ")
                    && !reservedSeats.contains(i + "E")){

                //if it is, is the third section available?
                if (!reservedSeats.contains(i + "F")
                        && !reservedSeats.contains(i + "G")
                        && !reservedSeats.contains(i + "H")
                        && !reservedSeats.contains(i + "J")) {
                    //if it is, it can fit two families, so increment count by 2
                    availableSets +=2;
                }else {//if the third section is not available, increment the count by only 1
                    availableSets ++;
                }
            //if the first section is not available, check the second/middle section (DEFG)
            //if it is, no need to check for the third section because of overlap, just increment by 1
            }else if(!reservedSeats.contains(i + "D")
                    && !reservedSeats.contains(i + "E")
                    && !reservedSeats.contains(i + "F")
                    && !reservedSeats.contains(i + "G")) {
                availableSets ++;

            //if middle section isn't available, check last section and increment by 1 if available
            }else if(!reservedSeats.contains(i + "F")
                    && !reservedSeats.contains(i + "G")
                    && !reservedSeats.contains(i + "H")
                    && !reservedSeats.contains(i + "J")){
                availableSets ++;
            }
        }//end of for loop

        //print to console, how many families of four can be accommodated
        System.out.println(availableSets);
    }//end of checkSeats method
}//end of class
