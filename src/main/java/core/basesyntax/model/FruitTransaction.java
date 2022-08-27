package core.basesyntax.model;

import java.util.Arrays;

public class FruitTransaction {
    private Operation operation;
    private String fruit;
    private int quantity;

    public FruitTransaction(Operation operation, String fruit, int quantity) {
        this.operation = operation;
        this.fruit = fruit;
        this.quantity = quantity;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public enum Operation {
        BALANCE("b"),
        SUPPLY("s"),
        PURCHASE("p"),
        RETURN("r");

        private final String abbreviationOperation;

        Operation(String abbreviationOperation) {
            this.abbreviationOperation = abbreviationOperation;
        }

        public static FruitTransaction.Operation getOperation(String abbreviationOperation) {
            return Arrays.stream(FruitTransaction.Operation.values())
                    .filter(a -> a.getAbbreviationOperation().equals(abbreviationOperation))
                    .findFirst()
                    .get();
        }

        public String getAbbreviationOperation() {
            return abbreviationOperation;
        }
    }

    @Override
    public String toString() {
        return "FruitTransaction{"
                + "operation=" + operation
                + ", fruit='" + fruit + '\''
                + ", quantity=" + quantity + '}';
    }
}
