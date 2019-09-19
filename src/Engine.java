
public class Engine {
    String binaryAdd(String x, String y){

    }

    String binarySubtract(String x, String y){

    }

    String binaryMultiply(String x, String y){

    }

    String binaryDivide(String x, String y){

    }

    /**
     * Square a given binary input
     *
     * <p>
     *     This function accepts a single binary value as an argument
     *     and returns the square of that value in binary.
     * </p>
     *
     * @param input A binary number stored in a String as Java
     *              does not support bitwise math innately.
     * @return A string containing the squared integer in binary form
     */
    String binarySquare(String input){
        int base = Integer.valueOf(input, 2);
        int square = base*base;
        return Integer.toBinaryString(square);
    }

    /**
     * Calculate the square root of a binary integer.
     *
     * <p>
     *      This function accepts a single binary value as an argument
     *      and returns the square root of that value in binary
     * </p>
     *
     * @param input A binary number stored in a String as
     *              Java does not support bitwise math innately.
     * @return A string containing the square root, rounded down, in binary form.
     */
    String binaryRoot(String input){
        int base = Integer.valueOf(input, 2);
        int root = (int) Math.floor(Math.sqrt( base));
        return Integer.toBinaryString(root);
    }
}
