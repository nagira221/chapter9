public class Main {
    public static void main(String[] args) {
        Sword s = new Sword();
        s.name = "炎の剣";
        s.damage = 10;

        Hero h1;
        h1 = new Hero("ミナト");
        System.out.println(h1.name);
        //h1.name = "ミナト";
        h1.hp = 100;
        h1.sword = s;
        System.out.println("現在の武器は" + h1.sword.name);
        Hero h2 = new Hero();
        System.out.println(h2.name);
        //h2.name = "アサカ";
        h2.hp = 100;
        h2 = h1;
        h2.hp = 200;
        System.out.println(h1.hp);
        Wizard w = new Wizard();
        w.name = "スガワラ";
        w.hp = 50;
        w.heal(h1);
        w.heal(h2);
        w.heal(h2);

        String str = new String("こんにちは");
        System.out.println(str);

        System.out.println(h1.hp);

    }
}
