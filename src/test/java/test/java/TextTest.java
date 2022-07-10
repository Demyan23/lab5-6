package test.java;

import ua.lviv.iot.manager.Text;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TextTest {



@BeforeEach
void setUp() {
    Text tex = new Text();
    tex.deleteWordsWithDigitsNumberLessThen5("");
}
@AfterEach
void tearDown() {
    }

@Test
    void deleteWordsWithDigitsNumberLessThen5(){
    String actual = "b12345b   bas1-2-3-4-5bas blasdA12-12Asbdf Adfda12-47-56basdA";
    String expected = "b12345b   bas1-2-3-4-5bas blasdA12-12Asbdf Adfda12-47-56basdA";
    Assertions.assertEquals(expected, actual);
  }
}

