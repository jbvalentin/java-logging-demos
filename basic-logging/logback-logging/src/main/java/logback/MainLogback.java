package logback;


import org.slf4j.MarkerFactory;

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
        var npe = new NullPointerException("C'est nul !");

        LOGGER.error("This is an error message with exception - {}", npe.getMessage(), npe);
        LOGGER.warn("This is an warning message");
        LOGGER.info("This is an info message");
        LOGGER.debug("This is an debug message");
        LOGGER.trace("This is an trace message");

        var log2 = org.slf4j.LoggerFactory.getLogger("audit");
        var marker = MarkerFactory.getMarker("toto");

        log2.info(marker, "Coucou");

    }

}