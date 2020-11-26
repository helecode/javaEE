package S1017DictionaryList;
class Point<T,V>{
	T x;
	V y;
	public Point(T x, V y) {
		this.x = x;
		this.y = y;}
	public T getX() {
		return x;}
	public void setX(T x) {
		this.x = x;}
	public V getY() {
		return y;}
	public void setY(V y) {
		this.y = y;}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}	
}
public class S1Dictionary {
	//泛型类的引用，指定为数据类型
		public static void fun1(Point<Double,String> p){
			System.out.println("fun1:"+p);
		}
		//泛型类的引用，使用通配符？表示
		public static void fun2(Point<?,?>p){
			System.out.println("fun2:"+p);
		}
	public static void main(String[] args) {
		Point<Integer,Integer> point1=new Point<Integer,Integer>(45,65);
		System.out.println("point1:"+point1);
		Point<Integer,String> point2=new Point<Integer,String>(14,"北纬73");
		System.out.println("point2:"+point2);
		fun1(new Point<Double,String>(45.0,"ooo"));
		fun2(new Point<Integer,String>(54,"ssss"));
	}
}
