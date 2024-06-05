package legacylog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Pour tester du logging sur une version plus ancienne de logback et log4j (sur du JDK 1.7)
 */
public class LegacyLog {

    private final static Logger LOGGER = LoggerFactory.getLogger(LegacyLog.class);

    public static void main(String[] args) {
        LOGGER.info("Salut les {} !", "courgettes");
    }
}
