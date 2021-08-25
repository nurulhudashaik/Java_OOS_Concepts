package Abstraction;

public class CalculationClass extends AbstractClass {

    @Override
    public void add() {
        System.out.println("1+1=2");
    }

    @Override
    public void subtract() {
        System.out.println("1-1=0");
    }

    @Override
    public void multiply() {
        System.out.println("1*1=1");
    }
}
