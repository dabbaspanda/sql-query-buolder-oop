import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class SqlQuery {

    private SqlQuery(){ }



    public static SqlQueryBuilder builder(){ return new SqlQueryBuilder(); }



    public static class SqlQueryBuilder{

        private SqlQuery sqlQuery;
        private String tableName;
        private List<String> columns;

        private SqlQueryBuilder(){
            this.sqlQuery = new SqlQuery();
        }



        public InterfaceSelectQuery select(List<String> collection){
            String listString = "";
            String columnQuery = "";

            if(collection.isEmpty()){
                columnQuery = "*";
            }else{
                for (int index = 0; index < collection.size(); index++ ) {
                    if(collection.size()-1 == index){
                        listString += collection.get(index);
                        continue;
                    }
                    listString += collection.get(index) + ", ";
                }
                columnQuery = listString;
            }
            String finalQuery = String.format("SELECT %s", columnQuery);
            return new SelectQuery(finalQuery);
        }

    }

}
