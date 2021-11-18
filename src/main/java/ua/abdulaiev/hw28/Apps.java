package ua.abdulaiev.hw28;

import java.util.Scanner;

public class Apps {
    public static void main(String[] args) {
        System.out.println("---- Trigonometric functions calculator ----");
        System.out.println("Write 'help' for help" + System.lineSeparator()
                + "Write 'exit' for exit" + System.lineSeparator());
        String input;
        while (true) {
            System.out.println("Enter function:");
            input = new Scanner(System.in).nextLine();
            if (input.trim().equals("exit")) {
                break;
            }
            if (input.trim().equals("help")) {
                System.out.println("--------Begin help--------");
                System.out.println("Available functions:" + System.lineSeparator() +
                        "sin, cos, tan, sec, cosec, ctan, asin, acos, atan, sinh, cosh, tanh"
                        + System.lineSeparator()
                        + System.lineSeparator() + "If your value is in degrees, type 'deg' in the end"
                        + System.lineSeparator() + "e.g. 'sin 21 deg' 'cos(30) deg' 'tan 5.6' 'sec(78.42)'");
                System.out.println("--------End help--------" + System.lineSeparator());
                continue;
            }
            try {
                double value = Double.parseDouble(input
                        .replaceAll(",+", ".")
                        .replaceAll("[^.0-9]", " "));
                if (input.trim().toLowerCase().endsWith("deg")) {
                    value = Math.toRadians(value);
                }
                if (input.toLowerCase().startsWith("sin")) {
                    System.out.printf("= %.9f" + System.lineSeparator(), Math.sin(value));
                } else if (input.toLowerCase().startsWith("sec")) {
                    System.out.printf("= %.9f" + System.lineSeparator(), 1 / Math.cos(value));
                } else if (input.toLowerCase().startsWith("cos")) {
                    System.out.printf("= %.9f" + System.lineSeparator(), Math.cos(value));
                } else if (input.toLowerCase().startsWith("cosec")) {
                    System.out.printf("= %.9f" + System.lineSeparator(), 1 / Math.sin(value));
                } else if (input.toLowerCase().startsWith("tan")) {
                    System.out.printf("= %.9f" + System.lineSeparator(), Math.tan(value));
                } else if (input.toLowerCase().startsWith("ctan")) {
                    System.out.printf("= %.9f" + System.lineSeparator(), 1 / Math.tan(value));
                } else if (input.toLowerCase().startsWith("asin")) {
                    System.out.printf("= %.9f" + System.lineSeparator(), Math.asin(value));
                } else if (input.toLowerCase().startsWith("acos")) {
                    System.out.printf("= %.9f" + System.lineSeparator(), Math.acos(value));
                } else if (input.toLowerCase().startsWith("atan")) {
                    System.out.printf("= %.9f" + System.lineSeparator(), Math.atan(value));
                } else if (input.toLowerCase().startsWith("sinh")) {
                    System.out.printf("= %.9f" + System.lineSeparator(), Math.sinh(value));
                } else if (input.toLowerCase().startsWith("cosh")) {
                    System.out.printf("= %.9f" + System.lineSeparator(), Math.cosh(value));
                } else if (input.toLowerCase().startsWith("tanh")) {
                    System.out.printf("= %.9f" + System.lineSeparator(), Math.tanh(value));
                } else {
                    System.out.println("Error: unknown function" + System.lineSeparator() + "Type 'exit' for exit");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: incorrect value" + System.lineSeparator() + "Type 'exit' for exit");
            }
        }
    }
}
