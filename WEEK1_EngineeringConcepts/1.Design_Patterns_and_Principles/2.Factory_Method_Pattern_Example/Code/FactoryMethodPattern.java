
public class FactoryMethodPattern {
	public static void main(String args[]) {
		Document doc1 = DocumentFactory.CreateDocument("word");
		doc1.open();

		Document doc2 = DocumentFactory.CreateDocument("pdf");
		doc2.open();

		Document doc3 = DocumentFactory.CreateDocument("excel");
		doc3.open();
// 		Document doc4 = DocumentFactory.CreateDocument("avl");
// 		doc4.open();
	}
}