package tests;

public class Tests {

    @BeforSuite
    public void beforeMethod() {
    }

    public static void start(Object object) {
        if (object.equals("@tests.BeforSuite()")) {
            System.out.println("was started method with annotation @BeforSuite");
        }
        if (object.equals("@tests.Test()")) {
            System.out.println("was started method with annotation @Test");
        }
        if (object.equals("@tests.AfterSuite()")) {
            System.out.println("was started method with annotation @AfterSuite");
        }
    }

    @Test
    public void test() {

    }

    @AfterSuite
    public void afterMethod() {
    }

}