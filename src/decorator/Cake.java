package decorator;

/**
 * @author poldi.chen
 * @className Cake
 * @description TODO
 * @date 2019/4/21 16:40
 **/
public class Cake extends AbstractCake {

    protected String getDesc() {
        return "cake";
    }

    protected int getPrice() {
        return 10;
    }

}
