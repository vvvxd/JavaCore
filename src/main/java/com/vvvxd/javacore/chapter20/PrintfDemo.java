package main.java.com.vvvxd.javacore.chapter20;

public class PrintfDemo {

    public static void main(String args[]) {
        System.out.println("Ниже приведены некоторые " + "числовые значения в разных форматах. In");
        System.out.printf("Разные целочисленные форматы:");
        System.out.printf("8d $(d 805d\n", 3, -3, 3, 3);
        System.out.println();
        System.out.printf("Формат чисел с плавающей точкой " +
                " по умолчанию: &f\n", 1234567.123);
        System.out.printf("Формат чисел с плавающей точкой разделяемых запятыми: f\n", 1234567.123);
        System.out.printf("Формат отрицательных чисел сплавающей точкой по умолчанию: 8,f\n", -1234564.123);
        System.out.printf("Другой Формат отрицательных чисел с " +
                "плавающей точкой: (f\n", -1234567.123);
        System.out.println();
        System.out.printf("Выравнивание положительных и " +
                "отрицательных числовых значений: \n");
        System.out.printf("8 ,.2f\n& , .2f\n");
    }
}