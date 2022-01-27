import java.util.Scanner;

public class Lesson_8 {
    public static void main(String[] args) {
        System.out.println("Введите строку слов:");
        Scanner sc = new Scanner(System.in);
        String enterString = sc.nextLine().trim();
        int cout = 0;
        char[] ch = enterString.toCharArray();
        for (char c : ch) {
            if (c == ' ')
                cout++;
        }
        String[] myStringArray = new String[cout+1];
        cout = 0;
        for (String s : enterString.split(" ")) {
            myStringArray[cout] = s;
            cout++;
        }

        System.out.println("1. Вводится строка слов. Вывести слова в обратном порядке.");
        for (int i = myStringArray.length - 1; i >= 0; i--) {
            System.out.print(myStringArray[i].concat(" "));
        }

        System.out.println("\n\n2. Удалить из строки все слова, длина которых меньше пяти символов. В строке не используются знаки препинания.");
        for (String s : myStringArray) {
            if (s.length() > 4)
                System.out.print(s.concat(" "));
        }

        System.out.println("\n\n3. Дан массив слов. Заменить последние три символа слов, имеющих выбранную длину на символ \"$\".");
        int stringLength = 5;
        for (String s : myStringArray) {
            if (s.length() == stringLength) {
                char[] chars;
                chars = s.toCharArray();
                chars[stringLength - 3] = '$';
                chars[stringLength - 2] = ' ';
                chars[stringLength - 1] = ' ';
                System.out.print(chars);
                continue;
            }
            System.out.print(s + " ");
        }

        System.out.println("\n\n4. Добавить в строку пробелы после знаков препинания, если они там отсутствуют.");
        System.out.println("Введите текст:");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        for (int i = 0; i < sb.length(); i++) {
            if ((sb.charAt(i) == ',' || sb.charAt(i) == '.' ||
                    sb.charAt(i) == '!' || sb.charAt(i) == '?')
                    && sb.charAt(i+1) != ' ')
                sb.insert(i+1, ' ');
        }
        System.out.println(sb);
    }
}
