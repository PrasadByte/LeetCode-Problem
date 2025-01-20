package basic_program;

import java.util.Stack;

public class StackCollection {
	
	public static void main(String[] args) {
		Stack<String>g=new Stack<String>();
		g.push("hi");
		g.push("darsh");
		g.push("prasad");
		g.push("roshan");
		g.push("kunsh");
		//System.out.println(g.get(1));
		g.pop();
		g.pop();
		System.out.println(g);
		
	}

}
