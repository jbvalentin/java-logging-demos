package logback;


/**
 * Démo d'utilisation de Logback.
 * <p>Logback utilise "de base" les APIs Slf4j</p>
 */
class MainLogback {

    private static final org.slf4j.Logger LOGGER = org.slf4j.LoggerFactory.getLogger(MainLogback.class);

    public static void main(String[] args) {
        doSomeLogging();
    }

    public static void doSomeLogging() {
        LOGGER.error("This is an error message");
        LOGGER.warn("This is an warning message");
        LOGGER.info("This is an info message");
        LOGGER.debug("This is an debug message");
        LOGGER.trace("This is an trace message");
    }

}