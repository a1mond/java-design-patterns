package operations.general;

import exceptions.MissingNextChainOperationException;

public abstract class Operation implements IOperation {
    private Operation next;

    @Override
    public void setNext(Operation next) {
        this.next = next;
    }
    @Override
    public Operation getNext() {
        return next;
    }

    @Override
    public abstract double perform(double x1, double x2, OperationType type) throws MissingNextChainOperationException;
}
