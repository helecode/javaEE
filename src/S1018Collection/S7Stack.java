package S1018Collection;

import java.util.Stack;

public class S7Stack {
	public static void main(String[] args) {
		Stack<String> stack=new Stack<String>();
		System.out.println("�ж��Ƿ�Ϊ�գ�"+stack.empty());
		stack.add("sss");
		stack.add("aaa");
		System.out.println("ջ��Ԫ�أ�"+stack.pop());
		System.out.println(stack.peek());
		
	}
}
