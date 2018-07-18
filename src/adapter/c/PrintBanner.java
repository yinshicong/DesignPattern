package adapter.c;

/**
 * 扮演适配器角色
 *
 * Created by Administrator on 2018/5/25 0025.
 */
public class PrintBanner extends Banner implements Print {

    public PrintBanner(String string) {
        super(string);
    }

    //对外暴露方法实现，实际是经由适配器调用真实的现有代码完成。
    @Override
    public void printWeak() {
        showWithParen();
    }

    //对外暴露方法实现，实际是经由适配器调用真实的现有代码完成。
    @Override
    public void printStrong() {
        showWithAster();
    }
}
