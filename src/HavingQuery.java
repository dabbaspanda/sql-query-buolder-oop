public class HavingQuery extends OrderQuery implements InterfaceHavingQuery {

	protected HavingQuery(String build) {
	    super(build);
	}

    public InterfaceOrderQuery having(String firstColumn, String... otherColumns){
        String columnQuery = columnQuery(firstColumn, otherColumns);
        internalClause = String.format("HAVING %s", columnQuery);
        return groupByQuery();
    }

    private InterfaceOrderQuery groupByQuery(){
            return new OrderQuery(finalQuery());
        }

    }
