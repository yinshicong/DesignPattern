package composite;

import composite.army.*;

/**
 * Created by Administrator on 2018/7/18 0018.
 */
public class Test {

    public static void main(String[] args) {

//            System.out.println("Making root entries...");
//            Directory rootdir = new Directory("root");
//            Directory bindir = new Directory("bin");
//            Directory tmpdir = new Directory("tmp");
//            Directory usrdir = new Directory("usr");
//            rootdir.add(bindir);
//            rootdir.add(tmpdir);
//            rootdir.add(usrdir);
//            bindir.add(new File("vi", 10000));
//            bindir.add(new File("latex", 20000));
//            rootdir.printList();
//
//            System.out.println("");
//            System.out.println("Making user entries...");
//            Directory yuki = new Directory("yuki");
//            Directory hanako = new Directory("hanako");
//            Directory tomura = new Directory("tomura");
//            usrdir.add(yuki);
//            usrdir.add(hanako);
//            usrdir.add(tomura);
//            yuki.add(new File("diary.html", 100));
//            yuki.add(new File("Composite.java", 200));
//            hanako.add(new File("memo.tex", 300));
//            tomura.add(new File("game.doc", 400));
//            tomura.add(new File("junk.mail", 500));
//            rootdir.printList();


            Commander commander = new Commander();
            SquadLeader squadLeader1 = new SquadLeader();
            Soldier soldier1 = new Soldier("张三");
            Soldier soldier2 = new Soldier("李四");
            squadLeader1.getWarriors().add(soldier1);
            squadLeader1.getWarriors().add(soldier2);
            SquadLeader squadLeader2 = new SquadLeader();

            Soldier soldier3 = new Soldier("王五");
            Soldier soldier4 = new Soldier("赵柳");
            Soldier soldier5 = new Soldier("烦啦");
            Soldier soldier6 = new Soldier("迷龙");
            squadLeader2.getWarriors().add(soldier3);
            squadLeader2.getWarriors().add(soldier4);
            squadLeader2.getWarriors().add(soldier5);
            squadLeader2.getWarriors().add(soldier6);

            Teacher teacher = new Teacher();
            teacher.getWarriors().add(squadLeader1);
            Head head = new Head();
            Soldier soldier7 = new Soldier("刘医生");
            head.getWarriors().add(soldier7);
            commander.getWarriors().add(teacher);
            commander.getWarriors().add(squadLeader2);
            commander.getWarriors().add(head);
            StringBuilder stringBuilder = new StringBuilder("   ");
            commander.printList("-->",stringBuilder);

    }

}
