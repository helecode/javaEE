package S1016ExceptionHandle;

public class S2CustomException extends Exception{
	
	public String toString(){
		System.out.println("自定义异常类");
		return "CustomeException";
	}
	public static void main(String[] args) {
		
		try{
			throw new S2CustomException();
		}catch(Exception e){
			System.out.println("e:"+e);
			System.out.println("em:"+e.getMessage()+"\n");
			e.printStackTrace();
		}
	}
}
