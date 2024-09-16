public class Calendar {
    public static void main(String[] args) {
        int year = 2024;

        String[] colors = {"Green", "Red", "Yellow", "White", "Black"};
        String[] animals = {"Rat", "Cow", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Sheep", "Monkey", "Rooster", "Dog", "Pig"};

        int offset = year - 1984;

        String color =colors[(offset % 60) / 12 % 5];
        String animal =animals[offset % 12];

        System.out.printf("Year %d - its year %s %s.%n", year, color, animal);
    }
}
