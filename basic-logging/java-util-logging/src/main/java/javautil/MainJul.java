package javautil;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

// Tech notes about java.util.logging
// https://docs.oracle.com/javase/8/docs/technotes/guides/logging/overview.html
// Tutos
// https://koor.fr/Java/Tutorial/java_logging_util.wp

/**
 * Using the standard java.util.logging core logging alias JUL, bundled in JDK.
 */
public class MainJul {

    // Récupérarion d'un notre gestionnaire de logs.
    private static final LogManager logManager = LogManager.getLogManager();

    private static final Logger LOGGER = Logger.getLogger(MainJul.class.getPackage().getName());

    // Le bloc statique pour configurer le gestionnaire de logs
    static {
        System.out.println("Configuration JUL");
        try {
            logManager.readConfiguration(
                    MainJul.class.getClassLoader().getResourceAsStream("logging.properties")
            );
        } catch (IOException exception) {
            LOGGER.log(Level.SEVERE, "Cannot read configuration file", exception);
        }
    }

    public static void main(String[] args) {
        doSomeLogging();
    }

    public static void doSomeLogging() {
        LOGGER.setLevel(Level.FINEST);
        LOGGER.log(Level.FINE, "Fine level message", 10);
        LOGGER.severe("Severe message");
        LOGGER.warning("Warning message");
        LOGGER.info("Information message");
        LOGGER.config("Config message");
        LOGGER.fine("Fine message");
        LOGGER.finer("Finer message");
        LOGGER.finest("Finest message");
    }


}
