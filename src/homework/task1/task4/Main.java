package homework.task1.task4;

import java.util.Arrays;

public class Main {
    private static final int SIZE = 10;

    public  static void pull(String[][] matrix){

        Symbols symbols = new Symbols();
        int k = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (k % 3 == 0){
                    matrix[i][j] = symbols.getNumber();
                }
                else {
                    matrix[i][j] = symbols.getWords();
                }

                k++;

            }
        }

    }

    public static void main(String[] args){
        String[][] matrix = new String[SIZE][SIZE];
        Symbols symbols = new Symbols();
        pull(matrix);
        String[] mainDiagonal = new String[SIZE];
        String[] secondaryDiagonal = new String[SIZE];

        //Сравнение диагоналей

        for (int i = 0; i < matrix.length; i++) {
            mainDiagonal[i] = matrix[i][i];
        }
        int length = matrix.length - 1;
        for (int i = 0; i < matrix.length; i++) {
            secondaryDiagonal[i] = matrix[i][length - i];
        }
        boolean result = Arrays.equals(mainDiagonal,secondaryDiagonal);
        System.out.println(result);

        System.out.println("==================================");

        String[] allDiagonal = new String[mainDiagonal.length + secondaryDiagonal.length];
        int count = 0;
        for (int i = 0; i < mainDiagonal.length; i++) {
            allDiagonal[i] = mainDiagonal[i];
            count++;
        }
        for (int i = 0; i < secondaryDiagonal.length; i++) {
            allDiagonal[count++] = secondaryDiagonal[i];
        }

        int valueNumbers = 0;
        int valueWords = 0;

        String[] clearWords = new String[allDiagonal.length];
        double[] clearNumbers = new double[allDiagonal.length];
        char[] numbers = symbols.dig.toCharArray();
        char[] symbol = symbols.symbols.toCharArray();

        //Работа с округлением

        for (int i = 0; i < allDiagonal.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (allDiagonal[i].startsWith(String.valueOf(numbers[j]))){
                    double number = Double.parseDouble(allDiagonal[i]);
                    if (number - (int)number >= 0.7){
                        clearNumbers[valueNumbers++] = (int) number + 1;

                    }
                    else{
                        clearNumbers[valueNumbers++] = (int)number;

                    }
                }

            }
        }

        //Работа с символами

        for (int i = 0; i < allDiagonal.length; i++) {
            for (int j = 0; j < symbol.length; j++) {
                if(allDiagonal[i].startsWith(String.valueOf(symbol[j]))){

                    clearWords[valueWords] = "";
                    StringBuffer stringBuffer = new StringBuffer(allDiagonal[i]);
                    int startIndex = 1;
                    int endIndex = 3;
                    char[] bufferWord = new char[endIndex - startIndex];
                    stringBuffer.getChars(startIndex,endIndex,bufferWord,0);
                    for (int k = 0; k < bufferWord.length; k++) {
                        clearWords[valueWords] += bufferWord[k];

                    }
                    valueWords++;

                }
            }
        }
        System.out.println("Вывод массива округленных чисел.");
        for (int i = 0; i < valueNumbers; i++) {
            System.out.print(clearNumbers[i] + "_");
        }
        System.out.println();
        System.out.println("Вывод финального массива строк.");
        for (int i = 0; i < valueWords; i++) {
            System.out.print(clearWords[i] + ",");
        }
        System.out.println();
        System.out.println("Вывод двух диагоналей в одном массиве.");

        for (int i = 0; i < allDiagonal.length; i++) {
            System.out.print(allDiagonal[i] + " ");
        }
        System.out.println();
        System.out.println("Вывод всей матрицы.");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


    }


}
