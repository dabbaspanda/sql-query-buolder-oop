	public interface InterfaceGroupQuery extends InterfaceHavingQuery {
		InterfaceHavingQuery groupBy(String firstColumn, String... otherColumns);
}
