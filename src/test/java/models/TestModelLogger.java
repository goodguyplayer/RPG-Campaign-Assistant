package models;
import models.ModelLogger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestModelLogger {
    ModelLogger logger = new ModelLogger(this.getClass());

    @BeforeEach
    void setUp() {

    }

    @Test
    void testLog() {
        logger.debug("This is but a test");
    }

}
