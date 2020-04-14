package View.Process;

import java.util.Scanner;

public abstract class Processor {
    protected static Scanner scanner;

    public static void setScanner(Scanner scanner) {
        Processor.scanner = scanner;
    }
}