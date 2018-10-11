public class World {
    public static void main(String[] args) {
        Human adam = new Human("Adam", true, 20);
        Human eva = new Human("Eva", false, 18);
        God god = new God();
        adam.born();
        eva.born();
        god.Say("Không được ăn táo ăn sẽ chết");
        Snake snake = new Snake();
        snake.Say("Ăn táo đi ngon lắm không chết đâu");
        Apple apple = new Apple(10);
        while (apple.isEmpty()){
            adam.Eat(apple);
            eva.Eat(apple);
        }
        adam.sleep();
        eva.sleep();
        god.Say("Adam ngươi sẽ phải cuốc đất mà ăn \n eva ngươi sẽ phải vâng lời trồng và đau đớn sinh con");

    }
}