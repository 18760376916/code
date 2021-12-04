package west2;

import java.util.LinkedList;
import java.util.List;

public class MyCatCafe implements CatCafe {
    protected double count = 1000;
    List<Cat> CatList = new LinkedList<>();
    List<Customer> CustomerList = new LinkedList<>();
    public static int ruaNum = 0;

    public void buy(Cat cat) {
        try {
            System.out.println("-----------------");
            System.out.println(count);
            System.out.println(cat.price);
            System.out.println("-----------------");
            if (count >= cat.price) {
                count -= cat.price;
                CatList.add(cat);
                System.out.println("购买成功!目前猫咖中有" + CatList.size() + "只猫，购买的新猫猫是：" + cat);
            } else {
                throw new InsufficientBalanceException("余额不足");
            }
        } catch (InsufficientBalanceException e) {
            System.out.println(e.toString());
        }
    }

    public void serve(Customer customer) {
        System.out.println();
        try {
            if (CatList.size() != 0) {
                CustomerList.add(customer);
                count += 15 * customer.rua;
                System.out.println(customer.name + "," + "您当前rua的猫为：");
                for (int i = 1; i <= customer.rua; i++) {
                    int number = (int) (Math.random() * CatList.size());
                    ruaNum++;
                    System.out.println(i + "." + CatList.get(number));
                }

            } else {
                throw new CatNotFoundException("抱歉，当前没有可以猫可以rua");
            }
        } catch (CatNotFoundException e) {
            System.out.println(e.toString());
        }
    }

    public void close() {
        System.out.println("今日光顾的顾客有：");
        for (Customer it : CustomerList) System.out.println(it.toString());
        System.out.print("今日的利润为：");
        System.out.println(15 * ruaNum);
    }
}
