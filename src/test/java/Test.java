import com.app.util.LoggerUtil;

public class Test {
    public static void main(String[] args) {
        printSomeLog();
    }

    public static void printSomeLog(){
        LoggerUtil.printLogMessage(Test.class, "this is some additional Data");
        LoggerUtil.printLogMessage(Test.class, "this is some additional Data", new NullPointerException("Object is found as null"));
    }

}
