package Abstraction;

public class EntryClass {

    public static void main(String[] args) {
        //AbstractClass a = new AbstractClass(); --cant instantiate abstract class

        CalculationClass c = new CalculationClass();
        c.add();
        c.subtract();
        c.multiply();
        c.CalcUI();

        AbstractClass a =new CalculationClass();
        a.add();
        a.multiply();
        a.CalcUI();
        a.subtract();
    }
}
