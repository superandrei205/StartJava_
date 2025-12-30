public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();

        wolf.gender = 'M';
        wolf.name = "Серый";
        wolf.weight = 42.5;
        wolf.age = 5;
        wolf.color = "серо-бурый";

        System.out.println("Пол: " + wolf.gender);
        System.out.println("Кличка: " + wolf.name);
        System.out.println("Вес: " + wolf.weight + " кг");
        System.out.println("Возраст: " + wolf.age + " лет");
        System.out.println("Окрас: " + wolf.color);

        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}