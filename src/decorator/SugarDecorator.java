package decorator;

import sun.java2d.SunGraphics2D;

/**
 * @author poldi.chen
 * @className SugarDecorator
 * @description TODO
 * @date 2019/4/21 16:47
 **/
public class SugarDecorator extends AbstractDecorator {

    public SugarDecorator(AbstractCake cake) {
        super(cake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + "+sugar";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 2;
    }

}
