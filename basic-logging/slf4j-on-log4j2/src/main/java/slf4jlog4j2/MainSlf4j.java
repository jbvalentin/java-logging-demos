package slf4jlog4j2;

import java.nio.charset.StandardCharsets;

import org.slf4j.Marker;

public class MainSlf4j {

    private static final org.slf4j.Logger LOGGER = org.slf4j.LoggerFactory.getLogger(MainSlf4j.class);

    public static void main(String[] args) {
        LOGGER.trace("Trace.... 👣");
        LOGGER.debug("Debug");
        LOGGER.info("Hello");
        LOGGER.warn("Attention");
        LOGGER.error("Ach!");

        Exception e = new Exception("Exception !!!!");

        System.out.println("---------------------");
        LOGGER.warn("Logger seulement l'erreur {}", e.getMessage());
        LOGGER.error(e.getMessage(), e);
        System.out.println("---------------------");
        LOGGER.error("Houston, we have a problem", e);
        System.out.println("---------------------");
        LOGGER.error("Incorrect parameter -> {} {}", -1, e);

        LOGGER.warn("Charset {}", StandardCharsets.UTF_8.name());


    }
}
