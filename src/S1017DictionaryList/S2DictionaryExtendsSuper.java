package S1017DictionaryList;
class PointES<T,V>{
	T x;
	V y;
	public PointES(T x, V y) {
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
		return "PointES [x=" + x + ", y=" + y + "]";
	}	
	public  void funExtendsSuper(PointES<? extends Number,? super Number>p){
		System.out.println("f:"+p);
	}
}
public class S2DictionaryExtendsSuper {
	public static void main(String[] args) {
		new PointES<Object,Number>("sss",323).funExtendsSuper(new PointES<Integer,Object>(34,"eee"));
	}
}
