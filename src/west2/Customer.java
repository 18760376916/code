package west2;

import java.time.LocalDate;

public class Customer {
    protected String name;
    protected int rua;
    protected LocalDate time;

    Customer(String name, int rua) {
        this.name = name;
        this.rua = rua;
        this.time = LocalDate.now();
    }

    @Override
    public String toString() {
        return "**************\n" + "名字：" + name + "\n想要rua猫的次数:" +
                rua + "\n到店时间：" + time + "\n**************";
    }
}

interface CatCafe {
    void buy(Cat cat);

    void serve(Customer customer);

    void close();
}

