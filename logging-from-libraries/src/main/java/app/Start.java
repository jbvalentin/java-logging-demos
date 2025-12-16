package app;

import org.slf4j.Logger;
import org.slf4j.bridge.SLF4JBridgeHandler;

public class Start {

    private static final Logger LOG = org.slf4j.LoggerFactory.getLogger(Start.class);

    static {
        System.out.println("Configuration SLF4JBridgeHandler");
        // Optionally remove existing handlers attached to j.u.l root logger
        SLF4JBridgeHandler.removeHandlersForRootLogger();  // (since SLF4J 1.6.5)

        // add SLF4JBridgeHandler to j.u.l's root logger, should be done once during
        // the initialization phase of your application
        SLF4JBridgeHandler.install();
        java.util.logging.Logger.getLogger("").setLevel(java.util.logging.Level.FINEST);

        // Others notes to consider https://www.slf4j.org/legacy.html#jul-to-slf4j
    }

    public static void main(String[] args) {

        LOG.debug("direct logging in debug");
        LOG.info("direct logging in info");
        LOG.warn("direct logging in warn");
        LOG.error("direct logging in error");

        // All logging here should be redirected to Slf4J
        commonslogging.Main4CommonsLogging.main(args);
        logginglog4j.MainLog4j2.main(args);
        log4jv1.MainLog4jV1.main(args);
        javautil.MainJul.main(args);

    }

}
