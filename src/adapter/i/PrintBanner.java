package adapter.i;

/**
 * 扮演适配器角色
 *
 * Created by Administrator on 2018/5/25 0025.
 */
public class PrintBanner implements Print {

    private Banner banner;

    private String string;

    public PrintBanner(String string) {
        banner = new Banner(string);
    }

    //对外暴露方法实现，实际是经由适配器调用真实的现有代码完成。
    @Override
    public void printWeak() { banner.showWithParen(); }

    //对外暴露方法实现，实际是经由适配器调用真实的现有代码完成。
    @Override
    public void printStrong() {
        banner.showWithAster();
    }

}
