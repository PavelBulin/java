import tests.Tests;
import java.util.List;
import static tests.Tests.start;

public class Reflection {

    public static void main(String[] args) {
        Tester tester = new Tester();
        Tests test = new Tests();
        List<String> al;
        al = tester.al;

        tester.getMethoddAnnotations(test);

        for (String o : al)
            start(o);

    }
}