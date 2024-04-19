package animal;

public class Human extends Animal implements Thinkable {

    //変数フィールド
    private String hobby; //趣味

    public Human(String fullname, int age, String hobby) {
        super(fullname, age);
        this.hobby = hobby;
    }

    public void think() {
        System.out.println("私は" + hobby + "について考えています。");
    }

}
