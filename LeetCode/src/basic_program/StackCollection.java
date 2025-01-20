package basic_program;

import java.util.Iterator;
import java.util.Stack;

public class StackCollection {
    public static void main(String[] args) {
        // Create a Stack and push elements onto it
        Stack<String> g = new Stack<String>();
        g.push("hi");
        g.push("darsh");
        g.push("prasad");
        g.push("roshan");
        g.push("kunsh");
        
        // Pop two elements from the stack
    
        
        // Print the remaining elements in the stack
       //System.out.println("Stack after pops: " + g);
        
        Iterator<String> itr=g.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
      
    }
}
