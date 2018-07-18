package strategy;

/**
 * Created by Administrator on 2018/5/31 0031.
 */
public class Player {

    private String name;

    private Strategy strategy;

    private int wincount;

    private int losecount;

    private int gamecount;

    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public Hand nextHand(){
        return strategy.nextHand();
    }

    public void lose() {                // 负
        strategy.study(false);
        losecount++;
        gamecount++;
    }

    public void win(){
        strategy.study(true);
        wincount ++;
        gamecount++;
    }

    public void even(){
        gamecount++;
    }

    public String toString(){
        return "["+name+"]:"+":"+gamecount+" games, " + wincount + " win, "+wincount + " losecount " + losecount+"]";
    }

}
