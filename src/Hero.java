public class Hero {
    String name;
    int hp;
    Sword sword;
    public void attack() {
        System.out.println(this.name + "は攻撃した！");
        System.out.println("敵に５ポイントのダメージをあたえた！");
    }
    public Hero(String name) {
        this.hp = 100;
        this.name = name;
    }
    public Hero() {
        //this.hp = 100;
        //this.name = "ダミー";
        this("ダミー");
    }
}
