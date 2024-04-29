import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class validTest {
    @Test
     void testvalidzipCode(){

        String[] list = {"17701","22066", "17705", "22101", "22065"};

        for (String s: list) {
            boolean isvalid = valid.zipCode(s);

            assertTrue(isvalid);
        }

    }

    @Test
    void testvalidzipCodeBad(){

        String[] list = {"1234s","@1293", "1093$", "2210*", "1347^"};

        for (String s: list) {
            boolean isvalid = valid.zipCode(s);

            assertFalse(isvalid);
        }

    }

}