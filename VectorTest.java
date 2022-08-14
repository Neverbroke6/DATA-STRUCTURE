package dataStructure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VectorTest {
    Vector israel;

    @BeforeEach
    public void doThisBefore(){
        israel = new Vector();
    }

    @Test
    public void testThatListIsEmpty(){
        assertTrue(israel.isEmpty());
    }

    @Test
    public void testToAddAnItem(){
       israel.add("soccer boot");
       assertFalse(israel.isEmpty());
    }

    @Test
    public void testToGetAnItemFromTheList(){
        israel.add("soccer boot");
        assertEquals("soccer boot", israel.get(0));
    }

    @Test
    public void testToRemoveAnItemFromListByIndex(){
        israel.add("soccer boot");
         israel.remove(0);
        assertNull(israel.get(0));
    }

    @Test
    public void testToRemoveAnItemFromListByString(){
        israel.add("soccer boot");
        israel.remove("soccer boot");
        assertNull(israel.get(0));
    }

    @Test
    public void testToSetItemAtAnIndex(){
        israel.add("soccer boot");
        israel.set(1, "fridge");
        assertEquals("fridge", israel.get(1));
    }

    @Test
    public void testToGetSize(){
        israel.add("soccer boot");
        israel.set(1, "fridge");
        assertEquals(2, israel.size());
        israel.remove("soccer boot");
        assertEquals(1, israel.size());
    }


    @Test
    public void testToClearAllElements(){
        israel.add("soccer boot");
        israel.set(1, "fridge");
        israel.clear();
        assertEquals(0,israel.size());
    }



}
