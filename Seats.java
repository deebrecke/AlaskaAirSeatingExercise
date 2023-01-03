/**
 * Author: Dee Brecke
 * This class takes in a string of letter/number pairs representing seat numbers on an airplane
 * This ugly brute force way to solve this problem helped me organize my thoughts to get a
 * working solution before I refactored the code.
 * In this problem, there are three places to put a family in each row, with overlap in the middle,
 * so a maximum of two families can sit in each row:
 * Two families can be accomodated seated in BCDE and FGHJ, or DEFG can hold one family
 */
public class Seats {
    /**
     * This method takes in a string, parses it on the empty space, and puts it into an array.
     * Then it goes through each row one at a time to check which sections can accomodate a family
     * of four as described in the prompt.
     * @param reserved = string representation of reserved seats
     */
    public static void families(String reserved){
        //break apart the string into seat numbers and store in an array
        String[] seatsReserved = reserved.split(" ");
        //set a counter
        int count = 0;
        //is the first section available?
        if(!reserved.contains("1B") &&
                !reserved.contains("1C") &&
                !reserved.contains("1D") &&
                !reserved.contains("1E")){
            //if it is available, is the last section available?
            if(!reserved.contains("1F") &&
                    !reserved.contains("1G") &&
                    !reserved.contains("1H") &&
                    !reserved.contains("1J")){
                count +=2;//if it is, the row can hold 2 families
            }else{count +=1;}//otherwise, the row can only hold the first one

        //if the first section is not available, check for the middle section
        } else if (!reserved.contains("1D") &&
                !reserved.contains("1E") &&
                !reserved.contains("1F") &&
                !reserved.contains("1G")) {
            count ++;
        //if the middle section can hold them, we don't need to check for the last
            //section because of the overlap, but if it's not, we need to check the last section
        }else if(!reserved.contains("1F") &&
                !reserved.contains("1G") &&
                !reserved.contains("1H") &&
                !reserved.contains("1J")){
            count ++;
        }

//then I repeat the process for the rest of the rows, checking the 4 conditionals
        if(!reserved.contains("2B") &&
                !reserved.contains("2C") &&
                !reserved.contains("2D") &&
                !reserved.contains("2E")){

            if(!reserved.contains("2F") &&
                    !reserved.contains("2G") &&
                    !reserved.contains("2H") &&
                    !reserved.contains("2J")){
                count +=2;
            }else{count +=1;}

        } else if (!reserved.contains("2D") &&
                !reserved.contains("2E") &&
                !reserved.contains("2F") &&
                !reserved.contains("2G")) {
            count ++;
        }else if(!reserved.contains("2F") &&
                !reserved.contains("2G") &&
                !reserved.contains("2H") &&
                !reserved.contains("2J")){
            count ++;
        }

        if(!reserved.contains("3B") &&
                !reserved.contains("3C") &&
                !reserved.contains("3D") &&
                !reserved.contains("3E")){

            if(!reserved.contains("3F") &&
                    !reserved.contains("3G") &&
                    !reserved.contains("3H") &&
                    !reserved.contains("3J")){
                count +=2;
            }else{count +=1;}

        } else if (!reserved.contains("3D") &&
                !reserved.contains("3E") &&
                !reserved.contains("3F") &&
                !reserved.contains("3G")) {
            count ++;
        }else if(!reserved.contains("3F") &&
                !reserved.contains("3G") &&
                !reserved.contains("3H") &&
                !reserved.contains("3J")){
            count ++;
        }

        if(!reserved.contains("4B") &&
                !reserved.contains("4C") &&
                !reserved.contains("4D") &&
                !reserved.contains("4E")){

            if(!reserved.contains("4F") &&
                    !reserved.contains("4G") &&
                    !reserved.contains("4H") &&
                    !reserved.contains("4J")){
                count +=2;
            }else{count +=1;}

        } else if (!reserved.contains("4D") &&
                !reserved.contains("4E") &&
                !reserved.contains("4F") &&
                !reserved.contains("4G")) {
            count ++;
        }else if(!reserved.contains("4F") &&
                !reserved.contains("4G") &&
                !reserved.contains("4H") &&
                !reserved.contains("4J")){
            count ++;
        }

        if(!reserved.contains("5B") &&
                !reserved.contains("5C") &&
                !reserved.contains("5D") &&
                !reserved.contains("5E")){

            if(!reserved.contains("5F") &&
                    !reserved.contains("5G") &&
                    !reserved.contains("5H") &&
                    !reserved.contains("5J")){
                count +=2;
            }else{count +=1;}

        } else if (!reserved.contains("5D") &&
                !reserved.contains("5E") &&
                !reserved.contains("5F") &&
                !reserved.contains("5G")) {
            count ++;
        }else if(!reserved.contains("5F") &&
                !reserved.contains("5G") &&
                !reserved.contains("5H") &&
                !reserved.contains("5J")){
            count ++;
        }
        //print out the number of families we can accommodate
        System.out.println(count);
    }//end of families method
}//end of seats class
