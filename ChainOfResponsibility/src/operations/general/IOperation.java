package operations.general;

import exceptions.MissingNextChainOperationException;

public interface IOperation {
    void setNext(Operation next);

    Operation getNext();

    double perform(double x1, double x2, OperationType type) throws MissingNextChainOperationException;
}
