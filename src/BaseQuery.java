public class BaseQuery {

	protected String prevQuery;

	protected String internalClause;

	protected String finalQuery(){
		return String.format("%s %s", prevQuery, internalClause);
	}


}
