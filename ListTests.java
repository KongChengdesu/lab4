import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;


public class ListTests {

    public class PalindromeChecker implements StringChecker {

        @Override
        public boolean checkString(String s) {
            return s.equals(new StringBuilder(s).reverse().toString());
        }

    }

    @Test
    public void testMultipleCheck(){

        List<String> input = new ArrayList<>();
        input.add("aba");
        input.add("acca");

        List<String> expected = new ArrayList<>();
        expected.add("aba");
        expected.add("acca");

        assertEquals(expected, ListExamples.filter(input, new PalindromeChecker()));

    }

    @Test
    public void testList2Later(){


        List<String> input = new ArrayList<>();
        input.add("aaron");
        input.add("brian");
        input.add("david");
        
        List<String> input2 = new ArrayList<>();
        input2.add("denice");
        input2.add("fred");

        List<String> expected = new ArrayList<>();
        expected.add("aaron");
        expected.add("brian");
        expected.add("david");
        expected.add("denice");
        expected.add("fred");

        assertEquals(expected, ListExamples.merge(input, input2));
    }
    
}
