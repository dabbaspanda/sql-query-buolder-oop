public class SelectQuery implements  InterfaceSelectQuery{

    private final String prevQuery;
    private String selectClause;


    public SelectQuery(String selectQuery) { this.prevQuery = selectQuery; }

    public InterfaceJoinQuery from(String table){
        selectClause = String.format("FROM %s", table);
        return fromQuery();
    }

    private InterfaceJoinQuery fromQuery(){
        String finalQuery = String.format("%s %s", prevQuery, selectClause);
        return new JoinQuery(finalQuery);
    }
}
