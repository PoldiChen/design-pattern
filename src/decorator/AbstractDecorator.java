package decorator;

/**
 * @author poldi.chen
 * @className AbstractDecorator
 * @description TODO
 * @date 2019/4/21 16:40
 **/
public class AbstractDecorator extends AbstractCake {

    private AbstractCake cake;

    public AbstractDecorator(AbstractCake cake) {
        this.cake = cake;
    }

    protected String getDesc() {
        return cake.getDesc();
    }

    protected int getPrice() {
        return cake.getPrice();
    }

}
