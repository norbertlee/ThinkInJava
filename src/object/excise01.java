package object;
/**
 * 创建一个类，包含一个int域和一个char域，他们都没有被初始化，打印出来后，验证Java执行了默认的初始化
 * @author Norbert Lee
 */
public class excise01 {
	int i;
	char c;
	public excise01() {
		System.out.println("i="+i);
		System.out.println("c=["+c+"]");
	}
	
	public static void main(String[] args) {
		new excise01();
	}
}
