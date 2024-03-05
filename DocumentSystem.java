package lab3;

public class DocumentSystem {
	public static void main(String[] args) {

		DocumentTemplate Template = new Document("Default content", "Default layout", "Default styles");

		DocumentTemplate Document1 = Template.clone();
		Document1.custom(" are Animals", "the layout is 1", "and the styles is 1");

		DocumentTemplate Document2 = Template.clone();
		Document2.custom("is Ocean", "the layout is 2", "and the styles is 2");

	}
}