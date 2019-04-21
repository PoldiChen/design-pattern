package decorator;

/**
 * @author poldi.chen
 * @className EggDecorator
 * @description TODO
 * @date 2019/4/21 16:41
 **/
public class EggDecorator extends AbstractDecorator {

    public EggDecorator(AbstractCake cake) {
        super(cake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + "+egg";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 1;
    }

}
