public class JaegerTest {
    public static void main(String[] args) {
        Jaeger gipsy = new Jaeger();
        gipsy.setName("Gipsy Danger");
        gipsy.setMark(3);
        gipsy.setHeight(79.25);
        gipsy.setWeight(1980.0);
        gipsy.setStatus("destroyed");

        System.out.println("=== Jaeger 1 (через сеттеры) ===");
        System.out.println("Имя: " + gipsy.getName());
        System.out.println("Марка: Mark-" + gipsy.getMark());
        System.out.println("Рост: " + gipsy.getHeight() + " м");
        System.out.println("Вес: " + gipsy.getWeight() + " тонн");
        System.out.println("Статус: " + gipsy.getStatus());
        gipsy.launch();

        Jaeger cherno = new Jaeger("Cherno Alpha", 1, 85.34, 2412.0, "destroyed");

        System.out.println("\n=== Jaeger 2 (через конструктор) ===");
        System.out.println("Имя: " + cherno.getName());
        System.out.println("Марка: Mark-" + cherno.getMark());
        System.out.println("Рост: " + cherno.getHeight() + " м");
        System.out.println("Вес: " + cherno.getWeight() + " тонн");
        System.out.println("Статус: " + cherno.getStatus());
        cherno.launch();
    }
}