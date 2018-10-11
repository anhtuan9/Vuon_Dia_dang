public class Apple {
    private int weight;

    public Apple() {
        this.weight = 10;
    }

    public Apple(int weight) {
        this.weight = weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public boolean isEmpty() {
        if (getWeight() == 0) {
            System.out.println("hết sạch táo");
            return true;
        }
        return false;
    }
}
