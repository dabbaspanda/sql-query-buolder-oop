
public interface InterfaceOrderQuery extends InterfaceQuery {
    InterfaceQuery orderBy(String firstColumn, String... otherColumns);
}
