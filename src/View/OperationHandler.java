package View;

import Model.Engine;

import java.lang.reflect.Array;

class OperationHandler {
    protected static String currentOperationSymbol = "";
    protected static boolean currentOperationComplete = false;

    protected static String enterOperationIntoField(String currentText, String operationSymbol) {
        currentOperationSymbol = operationSymbol;
        String nonBinaryText = currentText.replace("0", "").replace("1", "");
        if (nonBinaryText.isEmpty()) {
            return currentText + " " + operationSymbol + " ";
        } else {
            int replacementStart = currentText.indexOf(" ");
            currentText = currentText.replace(" ", "");
            currentText = currentText.replaceAll("[^0-9]", "");
            StringBuilder sb = new StringBuilder(currentText);
            sb.insert(replacementStart, " " + operationSymbol + " ");
            return sb.toString();
        }

    }

    protected static String enterDigit(String currentText, String digit) {
        if (currentOperationComplete) {
            currentText = "";
            currentOperationComplete = false;
        }
        return currentText + digit;
    }

    protected static String enterSolution(String currentEquation) {
        String[] binaryInputs = new String[2];
        binaryInputs = parseBinaryElements(currentEquation);
        switch (currentOperationSymbol) {
            case "√":
                return Engine.binaryRoot(binaryInputs[0]);
            case "x^2":
                return Engine.binarySquare(binaryInputs[0]);
            case "+":
                return Engine.binaryAdd(binaryInputs[0], binaryInputs[1]);
            case "-":
                return Engine.binarySubtract(binaryInputs[0], binaryInputs[1]);
            case "*":
                return Engine.binaryMultiply(binaryInputs[0], binaryInputs[1]);
            case "/":
                return Engine.binaryDivide(binaryInputs[0], binaryInputs[1]);



        }
        currentOperationComplete = true;
        return "ERROR: Incorrect Input";
    }

    protected static String[] parseBinaryElements(String currentText) {
        String[] binaryInputs = new String[2];
        binaryInputs = currentText.split(" ", 2);
        if (binaryInputs[1] != null) {
            binaryInputs[1] = binaryInputs[1].replaceAll("[^0-9]", "");
        }
        return binaryInputs;
    }

    protected static String deleteLastCharacter(String currentEquation) {
        if (currentEquation.isEmpty()) {
            return currentEquation;
        }
        return currentEquation.substring(0, currentEquation.length() - 1);
    }
}
