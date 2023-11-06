import org.junit.*;
import static org.junit.Assert.*;

import java.util.NoSuchElementException;

public class LinkedListTests {
    
    @Test
    public void appendInFilledList(){

        LinkedList l = new LinkedList();
        l.append(1);
        l.append(2);
        l.append(3);

        assertEquals("1 2 3 ", l.toString());
        assertEquals(3, l.length());
    }



}
