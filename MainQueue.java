package Latihan_Modul3;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Rudi
 */
public class MainQueue {

    /**
     * @param args the command line arguments
     */
    public void queueExample() {
        Queue queue = new LinkedList();
        queue.add("Java");
        queue.add("DotNet");
        queue.add("PHP");
        queue.add("HTML");
        System.out.println("remove : " +queue.remove());
        System.out.println("element : " +queue.element());
        System.out.println("poll : " +queue.poll());
        System.out.println("peek : " +queue.peek());
    }
    
    public static void main(String[]args){
        new MainQueue().queueExample();
    }
}
