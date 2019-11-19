public interface InterfaceHavingQuery extends InterfaceOrderQuery {
    InterfaceOrderQuery having(String firstColumn, String... otherColumns);
}