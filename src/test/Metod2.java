package test;

/**
 * Created by IT on 18.04.2016.
 */
public class Metod2 extends Metod1 {

    public void testSuper() {
        super.name2();
        System.out.println("Метод2 testSuper()");
    }


    @Override
    public void name1() {
        //super.name1();
        System.out.println("Переопределенное значение метода1");
    }
}
