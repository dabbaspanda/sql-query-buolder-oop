public class WhereQuery extends GroupQuery implements InterfaceWhereQuery {

	protected WhereQuery(String build) {
		super(build);
	}

	public InterfaceGroupQuery where(String clause){
		internalClause = String.format("WHERE %s", clause);
		return whereQuery();
	}

	private InterfaceGroupQuery whereQuery(){
		return new GroupQuery(finalQuery());
	}

}
