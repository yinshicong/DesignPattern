package prototype.other;

import prototype.framework.Product;

/**
 * Created by Administrator on 2018/5/15 0015.
 */
public class UnderlinePen extends Product {

    private char ulchar;

    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    @Override
    public void user(String s) {
        int len = s.getBytes().length;
        System.out.println("\""+s+"\"");
        System.out.print(" ");
        for (int i = 0 ; i < len ; i ++){
            System.out.print(ulchar);
        }
        System.out.println();
    }

}
