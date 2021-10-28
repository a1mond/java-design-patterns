import exceptions.MissingNextChainOperationException;
import operations.*;
import operations.general.OperationType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OperationTest {
    public AdditionOperation additionOperation;
    public SubtractionOperation subtractionOperation;
    public MultiplicationOperation multiplicationOperation;
    public DivisionOperation divisionOperation;

    @Before
    public void before() {
        additionOperation = new AdditionOperation();
        subtractionOperation = new SubtractionOperation();
        multiplicationOperation = new MultiplicationOperation();
        divisionOperation = new DivisionOperation();

        additionOperation.setNext(subtractionOperation);
        subtractionOperation.setNext(multiplicationOperation);
        multiplicationOperation.setNext(divisionOperation);
        divisionOperation.setNext(null);
    }
    @Test
    public void testAddition() throws MissingNextChainOperationException {
        Assert.assertEquals(30, additionOperation.perform(10, 20, OperationType.ADDITION), 0);
    }
    @Test
    public void testSubtraction() throws MissingNextChainOperationException {
        Assert.assertEquals(-10, additionOperation.perform(10, 20, OperationType.SUBTRACTION), 0);
    }
    @Test
    public void testMultiplication() throws MissingNextChainOperationException {
        Assert.assertEquals(200, additionOperation.perform(10, 20, OperationType.MULTIPLICATION), 0);
    }
    @Test
    public void testDivision() throws MissingNextChainOperationException {
        Assert.assertEquals(0.5, additionOperation.perform(10, 20, OperationType.DIVISION), 0);
    }

}
