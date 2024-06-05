package commonslogging;

/**
 * Demo du logging avec Apache Commons logging.
 * <p>
 * Cette bibliothèque est similaire à Slf4j dans la mesure où le logging
 * effectif va être délégué à une autre bibliothèque (e.g. Log4j, JUL, ...)
 * </p>
 *
 * <p>
 * Par défaut c'est Log4J2 qui est utilisé
 * </p>
 *
 * <p>
 * <a href=
 * "https://commons.apache.org/proper/commons-logging/guide.html">Commons
 * logging user guide</a>
 * </p>
 */
public class Main4CommonsLogging {

	private static final org.apache.commons.logging.Log LOGGER = org.apache.commons.logging.LogFactory
			.getLog(Main4CommonsLogging.class);

	public static void main(String[] args) {
		// JCL is not a logging framework implementation itself. Rather, it is an
		// interface for other logging implementations.
		doSomeLogging();
	}

	public static void doSomeLogging() {
		LOGGER.trace("This a trace message");
		LOGGER.debug("Here is a debug message");
		LOGGER.info("This is an info message");
		LOGGER.warn("This is an warning message");
		LOGGER.error("This is an error message");
		LOGGER.fatal("This is a fatal message");
	}

}
