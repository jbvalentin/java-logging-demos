package log4jv1;

import org.apache.log4j.Logger;
import org.apache.log4j.Priority;

import java.util.ArrayList;
import java.util.List;

/**
 * Démo de logging avec Log4j (version 1).
 */
public class MainLog4jV1 {
    // Patterns pour ce logger https://logging.apache.org/log4j/1.2/apidocs/org/apache/log4j/PatternLayout.html
    private static Logger logger = Logger.getLogger(MainLog4jV1.class);

    public static void main(String[] args) {
        doSomeLogging();
    }

    public static void doSomeLogging() {

        Throwable t = null;
        try {
            List<String> s = new ArrayList<>();
            s.get(5); // Va générer une IndexOutOfBoundsException
        } catch (Exception e) {
            t = e;
        }



        // Logging with log4j v1
        logger.trace("Trace");
        logger.debug("Debug");
        logger.info("Information");
        logger.warn("Warning", t);
        logger.error("Error", t);
        logger.fatal("Fatal");
        logger.log(Priority.FATAL, "Fatal");
    }

}
