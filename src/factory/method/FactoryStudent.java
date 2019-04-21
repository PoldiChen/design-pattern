/**
 * created by PoldiChen
 * date 2017年2月7日 下午9:38:31
 */
package factory.method;

/** 
 * Class: FactoryStudent
 * date: 2017年2月7日 下午9:38:31
 * @author PoldiChen
 * @version  
 * @since JDK 1.8
 */
public class FactoryStudent implements IFactory {

	/* (non-Javadoc)
	 * @see factory.IFactory#getPeople()
	 */
	@Override
	public Student getPeople() {
		// TODO Auto-generated method stub
		return new Student();
	}

}
