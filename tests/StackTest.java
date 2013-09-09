import com.sun.org.apache.xpath.internal.operations.Equals;
import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.*;

/**
 * Created with IntelliJ IDEA.
 * User: Sholtun
 * Date: 09.09.13
 * Time: 9:40
 * To change this template use File | Settings | File Templates.
 */
public class StackTest {

    @Test
    public void testPush01() {
        Stack<Integer> stackTest = new Stack<Integer>();
        for(int i = 0; i < Stack.StackDepth; i++){
            stackTest.push(i);
        }
    }

    @Test(expected=StackOverflowError.class)
    public void testPush02(){
        Stack<Integer> stackTest = new Stack<Integer>();
        for(int i = 0; i < Stack.StackDepth + 1; i++){
            stackTest.push(i);
        }
    }

    @Test
    public void testPop01() {
        Stack<Integer> stackTest = new Stack<Integer>();
        for(int i = 0; i < Stack.StackDepth; i++){
            stackTest.push(i);
        }
        assertEquals(Integer.valueOf(Stack.StackDepth - 1), stackTest.pop());
    }

    @Test
    public void testPop02() {
        Stack<Integer> stackTest = new Stack<Integer>();
        assertNull(stackTest.pop());
    }
}
