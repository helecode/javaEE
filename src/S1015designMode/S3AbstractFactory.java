package S1015designMode;

interface FruitFactory{//创建抽象产品接口
	public abstract void eat();
}
class Apple implements FruitFactory{//创建具体产品实现抽象产品接口

	public void eat() {
		System.out.println("工厂生产苹果");		
	}
}
public class S3AbstractFactory {
	public FruitFactory createFruit(String type){//创建工厂，创建通过具体传入生产具体产品对象实例方法
		if(type.equals("apple")){
			return new Apple();
		}else return new Apple();
	}
	public static void main(String[] args) {
		System.out.println(new S3AbstractFactory().createFruit("apple"));//创建使用者，调用工厂创建对象类
		}
}
