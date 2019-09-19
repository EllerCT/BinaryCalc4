
public class Engine {
    String binaryAdd(String input){

    }

    String binarySubtract(String input){

    }

    String binaryMultiply(String input){

    }

    String binaryDivide(String input){

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

    String binaryRoot(String input){

    }
}
