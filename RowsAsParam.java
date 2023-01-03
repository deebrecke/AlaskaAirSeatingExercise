/**
 * This is an additional refactor which makes it so that the client(driver) determines
 * the number of rows on the plane. Rather than making the number of rows a constant,
 * it is being passed in as a parameter, otherwise it is the same as the RefactoredSeats.java
 */
public class RowsAsParam {
    public static int checkSeats(String reservedSeats, int numRows){
        int availableSets = 0;

        for (int i = 1; i <= numRows; i++) {
            if (!reservedSeats.contains(i + "B")
                    && !reservedSeats.contains(i + "C")
                    && !reservedSeats.contains(i + "D ")
                    && !reservedSeats.contains(i + "E")){

                if (!reservedSeats.contains(i + "F")
                        && !reservedSeats.contains(i + "G")
                        && !reservedSeats.contains(i + "H")
                        && !reservedSeats.contains(i + "J")) {
                    availableSets +=2;
                }else {
                    availableSets ++;
                }
            }else if(!reservedSeats.contains(i + "D")
                    && !reservedSeats.contains(i + "E")
                    && !reservedSeats.contains(i + "F")
                    && !reservedSeats.contains(i + "G")) {
                availableSets ++;
            }else if(!reservedSeats.contains(i + "F")
                    && !reservedSeats.contains(i + "G")
                    && !reservedSeats.contains(i + "H")
                    && !reservedSeats.contains(i + "J")){
                availableSets ++;
            }
        }
        return availableSets;
    }
}


