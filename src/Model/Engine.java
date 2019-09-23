package Model;

public class Engine {

     public static String binaryAdd(String x, String y) {
        int val1 = Integer.valueOf(x, 2);
        int val2 = Integer.valueOf(y, 2);
        int result = val1 + val2;
        return Integer.toBinaryString(result);
    }

    public static String binarySubtract(String x, String y) {
        int val1 = Integer.valueOf(x, 2);
        int val2 = Integer.valueOf(y, 2);
        int result = val1 - val2;
        return Integer.toBinaryString(result);
    }

    public static String binaryMultiply(String x, String y) {
        int val1 = Integer.valueOf(x, 2);
        int val2 = Integer.valueOf(y, 2);
        int result = val1 * val2;
        return Integer.toBinaryString(result);
    }

    //Takes the floor of the result
    public static String binaryDivide(String x, String y) {
        int val1 = Integer.valueOf(x, 2);
        int val2 = Integer.valueOf(y, 2);
        int result = (int) Math.floor(val1 / val2);
        return Integer.toBinaryString(result);
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
    public static String binarySquare(String input){
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
    public static String binaryRoot(String input){
        int base = Integer.valueOf(input, 2);
        int root = (int) Math.floor(Math.sqrt( base));
        return Integer.toBinaryString(root);
    }
}
