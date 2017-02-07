/**
 * created by PoldiChen
 * date 2017年2月7日 下午9:44:29
 */
package factory.method;

/** 
 * Class: Test
 * date: 2017年2月7日 下午9:44:29
 * @author PoldiChen
 * @version  
 * @since JDK 1.8
 */
public class Test {
	
	public static void main(String[] args) {
		FactoryStudent factoryStudent = new FactoryStudent();
		Student student = factoryStudent.getPeople();
		System.out.println(student);
		FactoryTeacher factoryTeacher = new FactoryTeacher();
		Teacher teacher = factoryTeacher.getPeople();
		System.out.println(teacher);
	}
	
}
