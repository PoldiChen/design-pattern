/**
 * created by PoldiChen
 * date 2017年2月7日 下午9:48:50
 */
package factory.simple;

/** 
 * Class: Test
 * date: 2017年2月7日 下午9:48:50
 * @author PoldiChen
 * @version  
 * @since JDK 1.8
 */
public class Test {
	
	public static void main(String[] args) {
		Factory factory = new Factory();
		People student = factory.getPeople("student");
		People teacher = factory.getPeople("teacher");
		System.out.println(student);
		System.out.println(teacher);
	}

}
