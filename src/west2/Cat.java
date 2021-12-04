package west2;

public abstract class Cat {
    protected String name;
    protected int age;
    protected boolean sex;//公（true）母（false）
    protected double price;

    public Cat(String name, int age, boolean sex, double price) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.price = price;
    }

    public abstract String toString();
}

class OrangeCat extends Cat {
    protected boolean isFat;

    public OrangeCat(String name, int age, boolean sex, boolean isFat) {
        super(name, age, sex, 200);
        this.isFat = isFat;
    }

    @Override
    public String toString() {
        return "OrangeCat{" + "name:'" + name +
                ", age:" + age +
                ", isMale:" + sex +
                ", price:" + price +
                ", isFat:" + isFat + "}";
    }
}

class BlackCat extends Cat {
    double price = 350;

    public BlackCat(String name, int age, boolean sex) {
        super(name, age, sex, 350);
    }

    @Override
    public String toString() {
        return "OrangeCat{" + "name:'" + name +
                ", age:" + age +
                ", isMale:" + sex +
                ", price:" + price + "}";
    }
}