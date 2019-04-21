/**
 * created by PoldiChen
 * date 2017年2月7日 下午9:47:39
 */
package factory.simple;

/** 
 * Class: Factory
 * date: 2017年2月7日 下午9:47:39
 * @author PoldiChen
 * @version  
 * @since JDK 1.8
 */
public class Factory {
	
	public People getPeople(String type) {
		switch (type) {
		case "student":
			return new Student();
		case "teacher":
			return new Teacher();
		default:
			return null;
		}
	}

}
