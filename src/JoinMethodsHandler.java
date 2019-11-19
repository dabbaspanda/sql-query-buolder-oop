public class JoinMethodsHandler extends GroupQuery {

	private final String typeOfJoin;

	public JoinMethodsHandler(String build, String type) {
		super(build);
		this.typeOfJoin = type;
	}

	public InterfaceJoinQuery join(String table, String clause){
		internalClause = String.format("%s JOIN %s ON %s", typeOfJoin, table, clause);
		return joinQuery();
	}


	private InterfaceJoinQuery joinQuery(){
		return new JoinQuery(finalQuery());
	}
}