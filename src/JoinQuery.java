public class JoinQuery extends WhereQuery implements InterfaceJoinQuery {


	public JoinQuery(String build) {
		super(build);
	}

	private JoinMethodsHandler rightJoin(){
		return new JoinMethodsHandler(build(), "RIGHT");
	}

	private JoinMethodsHandler innerJoin(){
		return new JoinMethodsHandler(build(), "INNER");
	}

	private JoinMethodsHandler leftJoin(){ return new JoinMethodsHandler(build(), "LEFT"); }

	public InterfaceJoinQuery rightJoin(String table, String clause)
	{
		return rightJoin().join(table, clause);
	}

	public InterfaceJoinQuery innerJoin(String table, String clause)
	{
		return innerJoin().join(table, clause);
	}

	public InterfaceJoinQuery leftJoin(String table, String clause){

		return leftJoin().join(table, clause);
	}




}
