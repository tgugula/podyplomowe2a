public class ScopeTest {
    int test = 10;

    void printTest() {
        int test = 20;
        System.out.println("Test: " + test);
    }

    public static void main(String[] args) {
        ScopeTest st = new ScopeTest();
        st.printTest();
    }
}
