package org.example;

public class Main {

    private static final byte byteType = 127;
    private static final short shortType = 32767;
    private static final int intType = 5;
    private static final double doubleType = 7.5;
    private static final long longType = 10000000;
    private static final float floatType = 9.5F;
    private static final char charType = 97;
    private static final String stringType = "Результат выполнения операция с переменными разных типов данных";
    private static final boolean booleanType = true;

    public static void main(String[] args) {
        overflowForDataTypes();
        operations();
        booleanTypeOperations();
    }

    private static void overflowForDataTypes(){
        System.out.println("Примеры с переполнением");
        System.out.println("Перепполнение с типом данных byte");
        byte result = (byte) (byteType + 1);
        System.out.println(result);

        System.out.println("Перепполнение с типом данных short");
        short resultS = (short) (shortType + 1);
        System.out.println(resultS);
    }

    private static void operations(){
        System.out.println(stringType);

        System.out.println("Сложение intType + doubleType");
        var resultAddition = intType + doubleType;
        System.out.println(resultAddition);

        System.out.println("Вычитание longType - doubleType");
        var resultSubtraction = longType - doubleType;
        System.out.println(resultSubtraction);

        System.out.println("Умноежение и деление");
        var resultS = floatType * doubleType / intType;
        System.out.println(resultS);

        System.out.println("Вывод буквы (а) с использованием char: " + charType);

        System.out.println("Сравнение");
        if (intType > doubleType){
            System.out.println("intType больше doubleType");
        } else {
            System.out.println("intType меньше doubleType");
        }
    }

    private static void booleanTypeOperations(){
        System.out.println("Примеры с boolean");
        if (booleanType){
            System.out.println("booleanType = true");
        } else {
            System.out.println("booleanType = false");
        }
    }
}