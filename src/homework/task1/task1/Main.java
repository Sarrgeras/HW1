package homework.task1.task1;

public class Main {
    public static void main(String args[]){
        Numbers numbers = new Numbers(10, 1.5, 1.54f, 4544445,(short) 127, (byte) 1,
                'c', "Hello!", 11, 12.5, 123.5f,
                (long) 45243532, (short) 122, (byte) 2, 'b');
        int a = numbers.intValue;
        System.out.println("Результат выполнения калкулятора: ");
        numbers.calculate();
        System.out.println("Вывод всех переменных.");
        System.out.println(numbers.toString());
    }

}
