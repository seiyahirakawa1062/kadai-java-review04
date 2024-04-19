package animal;

public class Animal {
   //変数定義
    private String fullname; //名前
    private int age;//

    //引数ありコンストラクタ
    public Animal(String fullname,int age) {
        this.fullname = fullname;
        this.age = age;

    }

    public void say() {
        System.out.println(fullname + "です。" + age + "歳です。");
    }


}
