package west2;

public class Test {
    public static void main(String[] args) {
        MyCatCafe west2 = new MyCatCafe();
        Customer Jordan = new Customer("Jordan", 3);
        Customer John = new Customer("John", 4);
        OrangeCat catOne = new OrangeCat("CatOne", 1, true, true);
        BlackCat catTwo = new BlackCat("CatTwo", 2, false);
        OrangeCat catThree = new OrangeCat("CatThree", 3, false, false);
        BlackCat catFour = new BlackCat("CatFour", 4, true);
        west2.buy(catOne);
        west2.buy(catTwo);
        west2.buy(catThree);
        west2.buy(catFour);
        west2.serve(Jordan);
        west2.serve(John);
        west2.close();
    }
}
