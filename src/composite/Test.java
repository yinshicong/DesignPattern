package composite;

import composite.army.*;

/**
 * Created by Administrator on 2018/7/18 0018.
 */
public class Test {

    public static void main(String[] args) {

            Commander commander = new Commander();
            SquadLeader squadLeader1 = new SquadLeader();
            Soldier soldier1 = new Soldier("死啦死啦");
            Soldier soldier2 = new Soldier("不辣");
            squadLeader1.getWarriors().add(soldier1);
            squadLeader1.getWarriors().add(soldier2);
            SquadLeader squadLeader2 = new SquadLeader();

            Soldier soldier3 = new Soldier("阿译");
            Soldier soldier4 = new Soldier("克虏伯");
            Soldier soldier5 = new Soldier("烦啦");
            Soldier soldier6 = new Soldier("迷龙");
            squadLeader2.getWarriors().add(soldier3);
            squadLeader2.getWarriors().add(soldier4);
            squadLeader2.getWarriors().add(soldier5);
            squadLeader2.getWarriors().add(soldier6);

            Teacher teacher = new Teacher();
            teacher.getWarriors().add(squadLeader1);
            Head head = new Head();
            Soldier soldier7 = new Soldier("郝兽医");
            head.getWarriors().add(soldier7);
            commander.getWarriors().add(teacher);
            commander.getWarriors().add(squadLeader2);
            commander.getWarriors().add(head);
            StringBuilder stringBuilder = new StringBuilder("   ");
            commander.printList("-->",stringBuilder);

    }

}
