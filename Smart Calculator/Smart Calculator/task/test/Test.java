import calculator.Main;
import org.hyperskill.hstest.stage.StageTest;
import org.hyperskill.hstest.testcase.SimpleTestCase;

import java.util.List;

public class Test extends StageTest {

    public Test() {
        super(Main.class);
    }

    @Override
    public List<SimpleTestCase> generate() {
        return List.of(
                new SimpleTestCase(
                        "100 + 200 - 300\n/exit",
                        "0\nBye!"
                ),
                new SimpleTestCase(
                        "4 + 6 - 8\n2 - 3 - 4\n/exit",
                        "2\n-5\nBye!"
                ),
                new SimpleTestCase(
                        "8\n\n-2 + 4 - 5 + 6\n9 +++ 10 -- 8\n3 --- 5\n14     -  12\n/exit",
                        "8\n3\n27\n-2\n2\nBye!"
                )
        );
    }

}
