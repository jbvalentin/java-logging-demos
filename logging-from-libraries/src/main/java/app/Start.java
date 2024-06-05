package app;

import org.slf4j.Logger;

public class Start {

	private static final Logger LOG = org.slf4j.LoggerFactory.getLogger(Start.class);

    public static void main(String[] args) {


    	LOG.debug("direct logging in debug");
    	LOG.info("direct logging in info");
    	LOG.warn("direct logging in warn");
    	LOG.error("direct logging in error");


        commonslogging.Main4CommonsLogging.main(args);
        logginglog4j.MainLog4j2.main(args);
        log4jv1.MainLog4jV1.main(args);


    }

}
