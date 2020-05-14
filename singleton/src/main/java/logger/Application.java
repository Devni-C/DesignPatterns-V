package logger;

public class Application {
    public static void main(String[] args) {
        MyLogger logger = MyLogger.getInstance();
        logger.log("Logger example works with Singleton!");
    }
}
