package slf4jbridge;

import org.apache.log4j.Logger;

/**
 * Utilisation du bridge Slf4j qui permet de rediriger Slf4j vers log4j
 * (vérifier quand même que c'est bien ce qui est fait)
 */
public class MainLog4jBridge {

    private static Logger logger = Logger.getLogger(MainLog4jBridge.class);

    public static void main(String[] args) {
        doSomeLogging();
    }

    public static void doSomeLogging() {
        logger.error("Error, that will be redirected to slf4j");
        logger.warn("Warning, that will be redirected to slf4j");
        logger.info("Info...");
        logger.debug("Debugging info... (not output");
        logger.trace("Won't be logged");
    }
}
