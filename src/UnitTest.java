import java.util.ArrayList;
import java.util.List;

public class UnitTest {

    public static void main(String[] args){

        //FOR TESTING
        List<String> content = new ArrayList<>();
        content.add("fname");
        content.add("lname");
        content.add("location");
        String sql = SqlQuery.builder().select(content).from("asdasd").where("asdsad=xxx").groupBy("sadsa", "asdsd", "Aasd").having("ddd").orderBy("asd").build();

        System.out.println(sql);
    }
}
