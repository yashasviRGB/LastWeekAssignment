package Day5.Question6;

public class Main {
    public static void main(String[] args) {

        Printer printer = new Printer();
        Document doc = new Document("Hello, this is a test document.");

        doc.sendToPrinter(printer);
    }
}