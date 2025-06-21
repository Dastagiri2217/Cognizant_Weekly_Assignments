public class DocumentFactory {
    public static Document CreateDocument(String type) {
        if (type.equalsIgnoreCase("word")) {
            return new WordDocument();
        } else if (type.equalsIgnoreCase("pdf")) {
            return new PDFDocument();
        } else if (type.equalsIgnoreCase("excel")) {
            return new ExcelDocument();
        } else {
            throw new IllegalArgumentException("Unknown Document Type");
        }
    }
}
