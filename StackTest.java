package dataStructure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
        Stack stack;

        @BeforeEach
        public void doThisBefore() {
            stack = new Stack();
        }
        @Test
        public void testingThatStackIsEmpty(){
            assertTrue(stack.isEmpty());
        }
        @Test
        public void testingThatStackIsNotEmpty(){
            stack.push("dog");
            assertFalse(stack.isEmpty());
        }
        @Test
        public void testToSetStackAtASpecificIndex(){
            stack.set(1,"rat");
            assertEquals("rat",stack.get(1));
        }
        @Test
        public void testingToAddValuesToStack() {
            stack.push("dog");
            assertEquals("dog", stack.get(0));
        }
        @Test
        public void testForStackSize(){
            stack.push("dog");
            stack.push("cat");
            stack.push("goat");
            assertEquals(3,stack.size());
        }
        @Test
        public void testToReduceStackWithTheLastInFirstOutTechnic(){
            stack.push("dog");
            stack.push("cat");
            stack.push("goat");
            assertEquals("goat",stack.pop());
        }
        @Test
        public void testToGetValueAtTheTopOfTheStack(){
            stack.push("dog");
            stack.push("cat");
            stack.push("goat");
            assertEquals("goat",stack.peek());
        }
        @Test
        public void testToSearchForAnElementInStack(){
            stack.push("dog");
            stack.push("cat");
            stack.push("goat");
            assertEquals(1,stack.search("dog"));
        }


}
