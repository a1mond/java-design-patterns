package operations;

import exceptions.MissingNextChainOperationException;
import operations.general.Operation;
import operations.general.OperationType;

public class AdditionOperation extends Operation {
    @Override
    public double perform(double x1, double x2, OperationType type) throws MissingNextChainOperationException {
        if (type.equals(OperationType.ADDITION)) return x1 + x2;
        if (super.getNext() != null) return super.getNext().perform(x1, x2, type);
        throw new MissingNextChainOperationException();
    }
}
