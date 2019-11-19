
import java.util.ArrayList;
import java.util.Arrays;

public class OrderQuery extends SqlQueryFinish implements InterfaceOrderQuery {

    protected OrderQuery(String build) {
        super(build);
    }

    public InterfaceQuery orderBy(String firstColumn, String... otherColumns){
        internalClause = String.format("ORDER BY %s", columnQuery(firstColumn, otherColumns));
        return orderByQuery();
    }


    private InterfaceQuery orderByQuery(){
        return new SqlQueryFinish(finalQuery());
    }

    protected String columnQuery(String firstColumn, String... otherColumns){
        ArrayList<String> columns = new ArrayList<>(Arrays.asList(otherColumns));
        columns.add(0, firstColumn);
        String listString = "";
        for (int index = 0; index < columns.size(); index++ ) {
            if(columns.size()-1 == index){
                listString += columns.get(index);
                continue;
            }
            listString += columns.get(index) + ", ";
        }
        return listString;
    }
}