package javautil;

import java.util.logging.Level;
import java.util.logging.Logger;

// Tech notes about java.util.logging
// https://docs.oracle.com/javase/8/docs/technotes/guides/logging/overview.html
public class MainJul {

    private static Logger LOGGER = Logger.getLogger(MainJul.class.getName());

    public static void main(String[] args) {
        doSomeLogging();
    }

    public static void doSomeLogging() {
        LOGGER.setLevel(Level.FINEST);
        LOGGER.log(Level.FINE, "Fine level message" );
        LOGGER.severe("Severe message");
        LOGGER.info("Information message");
        LOGGER.fine("Information message");
        LOGGER.finest("Information message");
    }


}
