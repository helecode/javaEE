package S1018Collection;

import java.util.Stack;

public class S7Stack {
	public static void main(String[] args) {
		Stack<String> stack=new Stack<String>();
		System.out.println("ÅÐ¶ÏÊÇ·ñÎª¿Õ£º"+stack.empty());
		stack.add("sss");
		stack.add("aaa");
		System.out.println("Õ»¶¥ÔªËØ£º"+stack.pop());
		System.out.println(stack.peek());
		
	}
}
