import learn.java.cookbook.string.StringFunctions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringFunctionTest {
    StringFunctions sf = new StringFunctions();
    @Test
    public void testCharAt() {
        Assertions.assertEquals('a', sf.testCharAt("Satyesh", 1));
    }
    @Test
    public void testCharAtException() {
        Assertions.assertThrows(IndexOutOfBoundsException.class,
                () -> sf.testCharAt("Satyesh", 10));
    }
    @Test
    public void testUpperCase()
    {
        Assertions.assertEquals("SATYESH",
        sf.toUpperCase("satyesh"));
    }
    @Test
    public void testLowerCase(){
        Assertions.assertEquals("satyesh",sf.toLowerCase("SATYESH"));
    }
    @Test
    public void byteArrayTest(){
        Assertions.assertArrayEquals(new byte[]{(byte) 's', (byte) 'i', (byte) 'x'},sf.toByteArray("six"));
    }
    @Test
    public void byteArrayToStringTest(){
        Assertions.assertEquals("six",sf.byteArrayToString(new byte[]{(byte)'s',(byte)'i',(byte)'x'}));
    }

    @Test
    public void checkStartsWith() {
        Assertions.assertTrue(sf.startsWith("Satyesh","Sat"));
        Assertions.assertFalse(sf.startsWith("Satyesh","sat"));
    }
}
