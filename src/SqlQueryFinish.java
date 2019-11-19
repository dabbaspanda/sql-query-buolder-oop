public class SqlQueryFinish extends BaseQuery implements InterfaceQuery {

	public SqlQueryFinish(String build) {
		this.prevQuery = build;
	}

	@Override
	public String build() {
		return prevQuery;
	}

}
