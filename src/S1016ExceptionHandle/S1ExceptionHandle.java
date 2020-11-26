package S1016ExceptionHandle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class S1ExceptionHandle {
	public static void function()throws Exception{
		throw new Exception();
	}
	public static void main(String[] args) throws InputMismatchException {
		Scanner input=new Scanner(System.in);
		new InputMismatchException();
		try{
			throw new ArithmeticException();
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch(ArithmeticException e){
			System.out.println("哈哈，是我的异常");
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch(Exception e){
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}finally{
			System.out.println("异常出口信息");
		}
	}
}
