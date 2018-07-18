package prototype.other;

import prototype.framework.Product;

/**
 * Created by Administrator on 2018/5/15 0015.
 */
public class MessageBox extends Product {

    private char decochar;


    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void user(String s) {

        int len = s.getBytes().length;
        for (int i = 0 ; i < len + 4;i++){
            System.out.print(decochar);
        }
        System.out.println();
        System.out.println(decochar+s+decochar);
        for (int i = 0 ; i < len + 4;i++){
            System.out.print(decochar);
        }
        System.out.println();

    }

}
