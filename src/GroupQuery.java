public class GroupQuery extends HavingQuery implements InterfaceGroupQuery {

	protected GroupQuery(String build) {
		super(build);
	}

	public InterfaceHavingQuery groupBy(String firstColumn, String... otherColumns){
		String columnQuery = columnQuery(firstColumn, otherColumns);
		internalClause = String.format("GROUP BY %s", columnQuery);
		return groupByQuery();
	}

	private InterfaceHavingQuery groupByQuery(){
		return new HavingQuery(finalQuery());
	}

}
