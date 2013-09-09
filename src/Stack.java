import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * User: Sholtun
 * Date: 09.09.13
 * Time: 1:55
 * To change this template use File | Settings | File Templates.
 */

public class Stack<E> {
    private LinkedList<E> dataContainer = new LinkedList<E>();
    private int topIndex = -1;

    public static final int StackDepth = 5;

    public Stack(){ }

    public void push(E newElement){
        if (topIndex + 1 == StackDepth){
            throw new StackOverflowError();
        }
        dataContainer.push(newElement);
        topIndex++;
    }
    public E pop(){
        if (topIndex < 0){
            return null;
        }
        topIndex--;
        return dataContainer.poll() ;
    }
}
