/**
 * created by PoldiChen
 * date 2017年2月7日 下午9:39:05
 */
package factory.method;

/** 
 * Class: FactoryTeacher
 * date: 2017年2月7日 下午9:39:05
 * @author PoldiChen
 * @version  
 * @since JDK 1.8
 */
public class FactoryTeacher implements IFactory {

	/* (non-Javadoc)
	 * @see factory.IFactory#getPeople()
	 */
	@Override
	public Teacher getPeople() {
		// TODO Auto-generated method stub
		return new Teacher();
	}

}
