package decorator;

/**
 * @author poldi.chen
 * @className Test
 * @description TODO
 * @date 2019/4/21 16:49
 **/
public class Test {

    public static void main(String[] args) {
        AbstractCake cake = new Cake();
        cake = new EggDecorator(cake);
        cake = new EggDecorator(cake);
        cake = new SugarDecorator(cake);
        System.out.println(cake.getDesc());
        System.out.println(cake.getPrice());
    }

}
