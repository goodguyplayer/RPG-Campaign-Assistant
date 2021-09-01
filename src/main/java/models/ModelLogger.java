package models;

import org.apache.log4j.Logger;

//https://www.dariawan.com/tutorials/java/how-to-use-log4j-example/
// https://www.codejava.net/coding/how-to-configure-log4j-as-logging-mechanism-in-java
public class ModelLogger {

    private Logger logger;

    public ModelLogger(Class callerclass) {
        this.logger = Logger.getLogger(callerclass.getClass());
    }

    public void trace(String message) {
        logger.trace(message);
    }

    public void debug(String message) {
        logger.debug(message);
    }

    public void info(String message) {
        logger.info(message);
    }

    public void warn(String message) {
        logger.warn(message);
    }

    public void error(String message, Throwable e) {
        logger.error(message, e);
    }

    public void fatal(String message) {
        logger.fatal(message);
    }

}
