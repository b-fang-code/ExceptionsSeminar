package ExceptionsSeminar3_2;

//class DivisionByZeroException extends Exception {
//    public DivisionByZeroException(String message) {
//        super(message);
//    }
//}
//
//class InvalidOperatorException extends Exception {
//    public InvalidOperatorException(String message) {
//        super(message);
//    }
//}
//
//class Calculator {
//    public static void main(String[] args) {
//        try {
//            double result = calculate(5, '/', 0);
//            System.out.println(result);
//        } catch (DivisionByZeroException e) {
//            System.out.println("Ошибка: Деление на ноль недопустимо");
//        } catch (InvalidOperatorException e) {
//            System.out.println("Ошибка: Недопустимая операция");
//        }
//    }
//
//    public static double calculate(double num1, char operator, double num2) throws DivisionByZeroException,
//            InvalidOperatorException {
//        if (num2 == 0 && operator == '/') {
//            throw new DivisionByZeroException("Деление на ноль недопустимо");
//        }
//        if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
//            throw new InvalidOperatorException("Недопустимая операция");
//        }
//// остальной код
//    }
//}





//class CalculatorException extends Exception {
//    public CalculatorException(String message) {
//        super(message);
//    }
//}
//
//class DivisionByZeroException extends CalculatorException {
//    public DivisionByZeroException(String message) {
//        super(message);
//    }
//}
//
//class InvalidOperatorException extends CalculatorException {
//    public InvalidOperatorException(String message) {
//        super(message);
//    }
//}
//
//class Calculator {
//    public static void main(String[] args) {
//        try {
//            double result = calculate(5, '/', 0);
//            System.out.println(result);
//        } catch (CalculatorException e) {
//            System.out.println("Ошибка калькулятора: " + e.getMessage());
//        }
//    }
//
//    public static double calculate(double num1, char operator, double num2) throws CalculatorException {
//        if (num2 == 0 && operator == '/') {
//            throw new DivisionByZeroException("Деление на ноль недопустимо");
//        }
//        if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
//            throw new InvalidOperatorException("Недопустимая операция");
//        }
//// остальной код
//    }
//}






//try (Scanner scanner = new Scanner(new File("file.txt"))) {
//// ваш код здесь
//        } catch (FileNotFoundException e) {
//// обработка исключения
//        }





//import java.io.BufferedReader;
//        import java.io.FileReader;
//        import java.io.IOException;
//
//public class ReadFromFile {
//    public static void main(String[] args) {
//        String fileName = "file.txt"; // Имя файла, который вы хотите прочитать
//
//        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
//            String line;
//
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            System.err.format("IOException: %s%n", e);
//        }
//    }
//}