//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        System.out.println("Задание №1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("Задание №2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Задание №3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }
        System.out.println("Задание №4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println("Задание №5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println("Задание №6");
        for (int i = 0; i < 100; i = i + 7) {
            System.out.println(i);
        }
        System.out.println("Задание №7");
        for (int i = 1; i < 1000; i = i * 2) {
            System.out.println(i);
        }
        System.out.println("Задание №8");
        int savings = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + savings;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total);
        }
        System.out.println("Задание №9");
        int savingsReplay = 29000;
        int totalReplay = 0;
        for (int i = 0; i < 12; i++) {
            totalReplay = totalReplay + totalReplay /100;
            totalReplay = totalReplay + savingsReplay;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalReplay);
        }
        System.out.println("Задание №10");
        int multiplier1 = 2;
        int result = 0;
        for (int i = 1; i <= 10; i++) {
            result = multiplier1 * i;
            System.out.println(multiplier1 + "*" + i + "=" + result);

        }
    }

}