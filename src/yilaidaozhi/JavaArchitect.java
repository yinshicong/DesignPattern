package yilaidaozhi;

/**
 * Created by Administrator on 2018/7/23 0023.
 */
public class JavaArchitect implements Architect{

    private static final String JAVA = "JAVA";

    @Override
    public void say() {
        System.out.println("用java语言在编程。。。");
    }

    @Override
    public void architecture() {
        System.out.println("java的架构工作");
    }

}
