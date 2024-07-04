import java.util.Scanner;

public class Main {
    public static final String CORRECT_ROW = " АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдеёжзийклмнопрстуфхцчшщъыьэюя-";
    static boolean isValid = true;
    static int spaceCount = 0;

    public static void main(String[] args) {
        //todo код писать тут. По желанию(рекомендуется) вынести код в методы.
        String input = inputPrint();
        validation(input);
    }

    public static String inputPrint() {
        System.out.println("Введите ФИО: ");
        return new Scanner(System.in).nextLine().trim();
    }

    public static void validation(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                spaceCount++;
            }
            if (!CORRECT_ROW.contains(String.valueOf(input.charAt(i)))) {
                isValid = false;
                break;
            }
        }

        if (isValid && spaceCount == 2) {
            System.out.println("Фамилия: " + input.substring(0, input.indexOf(' ')).trim() + "\nИмя: "
                    + input.substring(input.indexOf(' '), input.lastIndexOf(' ')).trim() + "\nОтчество: "
                    + input.substring(input.lastIndexOf(' ')).trim());
        } else {
            System.out.println("Введенная строка не является ФИО");
        }
    }

}