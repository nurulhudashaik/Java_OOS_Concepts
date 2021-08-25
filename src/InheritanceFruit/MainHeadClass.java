package InheritanceFruit;

public class MainHeadClass {

    public static void main(String args[]) {
        ParentFruitClass p = new ParentFruitClass();
        p.sweet();
        p.tangy();
        p.round();

        ChildFruitApple c = new ChildFruitApple();
        c.Greenapple();
        c.Redapple();
        c.tangy();
        c.sweet();
        c.round();

        ParentFruitClass p1 = new ChildFruitApple();
        p1.round();
        p1.tangy();
        p1.round();
        p1.sweet();

    }
}
