package logginglog4j;

public class MainLog4j2 {
    // https://logging.apache.org/log4j/2.x/
    // https://www.baeldung.com/java-system-out-println-vs-loggers

    private static final org.apache.logging.log4j.Logger LOGGER = org.apache.logging.log4j.LogManager.getLogger(MainLog4j2.class);

    public static void main(String[] args) {
        // Log4j version 2.X
        doSomeLogging();
    }


    public static void doSomeLogging() {
        LOGGER.trace("Here is a trace message");
        LOGGER.debug("Here is a debug message");
        LOGGER.info("This is an info message");
        LOGGER.warn("Here is a warning message");
        LOGGER.error("This is an error message");
        LOGGER.fatal("Here is a fatal message");

        LOGGER.info(() -> "With a supplier");
    }

}
