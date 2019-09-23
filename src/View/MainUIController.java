package View;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MainUIController {

    @FXML
    private Button subtractButton;
    @FXML
    private Button addButton;
    @FXML
    private Button multiplyButton;
    @FXML
    private Button divideButton;
    @FXML
    private Button squareRootButton;
    @FXML
    private Button squareButton;
    @FXML
    private Button clearButton;
    @FXML
    private Button backspaceButton;
    @FXML
    private Button equalsButton;
    @FXML
    private Button oneButton;
    @FXML
    private Button zeroButton;
    @FXML
    private TextArea mainDisplay;


     @FXML
    private void add(Event event)
    {
        String equationWithNewOperation = OperationHandler.enterOperationIntoField(mainDisplay.getText(), "+");
        mainDisplay.setText(equationWithNewOperation);
    }

    @FXML
    private void subtract(Event event)
    {
        String equationWithNewOperation = OperationHandler.enterOperationIntoField(mainDisplay.getText(), "-");
        mainDisplay.setText(equationWithNewOperation);
    }

    @FXML
    private void multiply(Event event)
    {
        String equationWithNewOperation = OperationHandler.enterOperationIntoField(mainDisplay.getText(), "*");
        mainDisplay.setText(equationWithNewOperation);
    }

    @FXML
    private void divide(Event event)
    {
        String equationWithNewOperation = OperationHandler.enterOperationIntoField(mainDisplay.getText(), "/");
        mainDisplay.setText(equationWithNewOperation);
    }

    @FXML
    private void squareRoot(Event event)
    {
        String equationWithNewOperation = OperationHandler.enterOperationIntoField(mainDisplay.getText(), "√");
        String completedOperationText = OperationHandler.enterSolution(equationWithNewOperation);
        mainDisplay.setText(completedOperationText);
    }

    @FXML
    private void square(Event event)
    {
        String equationWithNewOperation = OperationHandler.enterOperationIntoField(mainDisplay.getText(), "x^2");
        String completedOperationText = OperationHandler.enterSolution(equationWithNewOperation);
        mainDisplay.setText(completedOperationText);
    }

    @FXML
    private void completeOperation(Event event){
        String completedOperationText = OperationHandler.enterSolution(mainDisplay.getText());
        mainDisplay.setText(completedOperationText);
    }

    @FXML
    private void enterOne(Event event)
    {
        String equationWithNewDigit =OperationHandler.enterDigit(mainDisplay.getText(),"1");
        mainDisplay.setText(equationWithNewDigit);
    }

    @FXML
    private void enterZero(Event event)
    {
        String equationWithNewDigit =OperationHandler.enterDigit(mainDisplay.getText(),"0");
        mainDisplay.setText(equationWithNewDigit);
    }
    @FXML
    private void backspace(Event event)
    {
        String equationMinusLastCharacter = OperationHandler.deleteLastCharacter(mainDisplay.getText());
        mainDisplay.setText(equationMinusLastCharacter);
    }

    @FXML
    private void clear(Event event)
    {
        mainDisplay.setText("");
    }

}
