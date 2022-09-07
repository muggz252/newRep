import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Введите выражение: ");
        Scanner sc = new Scanner(System.in);


        String str = sc.nextLine();
        if (str.length() == 1){
            throw new IOException();
        }

        System.out.println(calc(str));

    }

    public static String calc(String input) throws IOException {
        String vvodUser = input.replace(" ", "");
        String[] rome = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
                "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
                "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
                "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
        String[] data;

        if (vvodUser.endsWith("+") || vvodUser.endsWith("-") || vvodUser.endsWith("*") || vvodUser.endsWith("/")) {
            throw new IOException();
        }
        if (!vvodUser.startsWith("I") && !vvodUser.startsWith("V") && !vvodUser.startsWith("X")) {
            if (vvodUser.contains("+")) {
                data = vvodUser.split("\\+");
                if (data.length > 2) {
                    throw new IOException();
                }
                if (Integer.parseInt(data[0]) <= 10 && Integer.parseInt(data[1]) <= 10) {
                    return (Integer.valueOf(data[0]) + Integer.valueOf(data[1]) + "");
                } else {
                    throw new IOException();
                }
            } else if (vvodUser.contains("-")) {
                data = vvodUser.split("-");
                if (data.length > 2) {
                    throw new IOException();
                }
                if (Integer.parseInt(data[0]) <= 10 && Integer.parseInt(data[1]) <= 10) {
                    return (Integer.parseInt(data[0]) - Integer.parseInt(data[1]) + "");
                } else {
                    throw new IOException();
                }
            } else if (vvodUser.contains("*")) {
                data = vvodUser.split("\\*");
                if (data.length > 2) {
                    throw new IOException();
                }
                if (Integer.parseInt(data[0]) <= 10 && Integer.parseInt(data[1]) <= 10) {
                    return (Integer.parseInt(data[0]) * Integer.parseInt(data[1]) + "");
                } else {
                    throw new IOException();
                }
            } else if (vvodUser.contains("/")) {
                data = vvodUser.split("/");
                if (data.length > 2) {
                    throw new IOException();
                }
                if (Integer.parseInt(data[0]) <= 10 && Integer.parseInt(data[1]) <= 10) {
                    return (Integer.parseInt(data[0]) / Integer.parseInt(data[1]) + "");
                } else {
                    throw new IOException();
                }
            }

        } else {
            if (vvodUser.endsWith("1")||vvodUser.endsWith("2")||vvodUser.endsWith("3")||vvodUser.endsWith("4")||
            vvodUser.endsWith("5")||vvodUser.endsWith("6")||vvodUser.endsWith("7")||vvodUser.endsWith("8")||
            vvodUser.endsWith("9")||vvodUser.endsWith("0")) {
                throw new IOException();
            }
            if (vvodUser.contains("+")) {
                data = vvodUser.split("\\+");
                if (data.length > 2) {
                    throw new IOException();
                }
                int sum1 = Arrays.asList(rome).indexOf(data[0]);
                int sum2 = Arrays.asList(rome).indexOf(data[1]);
                int sum = sum1 + sum2;
                if (sum2 < 0){
                    throw new IOException();
                }
                if (sum1<10 && sum2<10 ) {
                    return String.valueOf(rome[sum + 1]);
                } else {
                    throw new IOException();
                }
            }if (vvodUser.contains("-")) {
                data = vvodUser.split("-");
                if (data.length > 2) {
                    throw new IOException();
                }
                int sum1 = Arrays.asList(rome).indexOf(data[0]);
                int sum2 = Arrays.asList(rome).indexOf(data[1]);
                int diff = sum1 - sum2;
                if (sum2 < 0){
                    throw new IOException();
                }
                if (sum1<10 && sum2<10) {
                    return String.valueOf(rome[diff - 1]);
                } else {
                    throw new IOException();
                }
            }if (vvodUser.contains("*")) {
                data = vvodUser.split("\\*");
                if (data.length > 2) {
                    throw new IOException();
                }
                int sum1 = Arrays.asList(rome).indexOf(data[0]);
                int sum2 = Arrays.asList(rome).indexOf(data[1]);
                int comp = (sum1 + 1) * (sum2 + 1);
                if (sum1<10 && sum2<10) {
                    return String.valueOf(rome[comp - 1]);
                } else {
                    throw new IOException();
                }
            }if (vvodUser.contains("/")) {
                data = vvodUser.split("/");
                if (data.length > 2) {
                    throw new IOException();
                }
                int sum1 = Arrays.asList(rome).indexOf(data[0]);
                int sum2 = Arrays.asList(rome).indexOf(data[1]);
                int quot = (sum1 + 1) / (sum2 + 1);
                if (sum1<10 && sum2<10) {
                    return String.valueOf(rome[quot - 1]);
                } else {
                    throw new IOException();
                }
            }

      }
        return null;
   }
}

