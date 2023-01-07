public class SecondTask {

    public static void main(String[] args) {

        final String NAME = "Вячеслав";
        String ourName = "Ольга"; // Здесь мы вводим имя
        boolean equal = ourName.equals(NAME);

        if (equal) {
            System.out.println("Привет, " + ourName);
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
