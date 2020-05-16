package encryptdecrypt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    private static boolean isExport = false;
    private static String exportFileName = "";
    private static boolean isDataPresent = false;
    private static int dataIndex = 0;
    private static boolean isInPresent = false;
    private static int inIndex = 0;
    private static String method = "enc";
    private static String text = "";
    private static int key = 0;

    private static String algorithm = "shift";

    public static void main(String[] args) throws IOException {
        String result = "";

        checkArguments(args);

        char[] textToChar = getText().toCharArray();
        //System.out.println("key: " + getKey());
        //System.out.println("text: " + getText());
        //System.out.println("method: " + getMethod());
        //System.out.println("algorithm: " + getAlgorithm());

        switch (getAlgorithm()) {
            case "shift":
                Algorithms shiftAlgorithm = new ShiftAlgorithm();
                if ("enc".equals(getMethod())) {
                    result = shiftAlgorithm.enc(getKey(), textToChar);
                } else {
                    result = shiftAlgorithm.dec(getKey(), textToChar);
                }
                break;
            case "unicode":
                Algorithms unicodeAlgorithm = new UnicodeAlgorithm();
                if ("enc".equals(getMethod())) {
                    result = unicodeAlgorithm.enc(getKey(), textToChar);
                } else {
                    result = unicodeAlgorithm.dec(getKey(), textToChar);
                }
                break;
        }

        System.out.println(result);

        if (isExport()) {
            exportToFile(getExportFileName(), result);
        }

    }

    private static String importFromFile(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        String output = "";
        if (!file.exists()) {
            System.out.println("File not found.");
        } else {
            Scanner scanFile = new Scanner(new File(filePath));
            while (scanFile.hasNext()) {
                output = scanFile.nextLine();
            }
            scanFile.close();
        }

        return output;
    }

    private static void exportToFile(String filePath, String text) throws IOException {
        PrintWriter printWriter = new PrintWriter(filePath);
        printWriter.println(text);
        printWriter.flush();
    }

    private static void checkArguments(String[] args) throws FileNotFoundException {

        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("-mode")) {
                setMethod(args[i + 1]);
            }
            if (args[i].equals("-data")) {
                setDataIndex(i + 1);
                setIsDataPresent(true);
            }
            if (args[i].equals("-in")) {
                setInIndex(i + 1);
                setIsInPresent(true);
            }
            if (args[i].equals("-key")) {
                setKey(Integer.parseInt(args[i + 1]));
            }
            if (args[i].equals("-out")) {
                setIsExport(true);
                setExportFileName(args[i + 1]);
            }
            if (args[i].equals("-alg")) {
                setAlgorithm(args[i + 1]);
            }
        }
        if (isDataPresent()) {
            setText(args[getDataIndex()]);
        } else if (isInPresent()) {
            setText(importFromFile(args[getInIndex()]));
        }
    }

    public static boolean isExport() {
        return isExport;
    }

    public static void setIsExport(boolean isExport) {
        Main.isExport = isExport;
    }

    public static String getExportFileName() {
        return exportFileName;
    }

    public static void setExportFileName(String exportFileName) {
        Main.exportFileName = exportFileName;
    }

    public static boolean isDataPresent() {
        return isDataPresent;
    }

    public static void setIsDataPresent(boolean isDataPresent) {
        Main.isDataPresent = isDataPresent;
    }

    public static int getDataIndex() {
        return dataIndex;
    }

    public static void setDataIndex(int dataIndex) {
        Main.dataIndex = dataIndex;
    }

    public static boolean isInPresent() {
        return isInPresent;
    }

    public static void setIsInPresent(boolean isInPresent) {
        Main.isInPresent = isInPresent;
    }

    public static int getInIndex() {
        return inIndex;
    }

    public static void setInIndex(int inIndex) {
        Main.inIndex = inIndex;
    }

    public static String getMethod() {
        return method;
    }

    public static void setMethod(String method) {
        Main.method = method;
    }

    public static String getText() {
        return text;
    }

    public static void setText(String text) {
        Main.text = text;
    }

    public static int getKey() {
        return key;
    }

    public static void setKey(int key) {
        Main.key = key;
    }

    public static String getAlgorithm() {
        return algorithm;
    }

    public static void setAlgorithm(String algorithm) {
        Main.algorithm = algorithm;
    }
}

