public class Human {
    private String name;
    private boolean gender;
    private int age;

    public Human() {
    }

    public void born() {
        System.out.println(name + " sinh ra");
    }

    public Human(String name, boolean gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void Say(String words) {
        System.out.println(words);
    }

    public void Eat(Apple food) {
        System.out.println(name + " ăn một miếng");
        food = new Apple();
        int a = food.getWeight();
        a--;
        food.setWeight(a);
    }

    public void sleep() {
        System.out.println(name + " đi ngủ");
    }
}
