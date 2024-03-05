package lab3;

interface DocumentTemplate extends Cloneable {
	DocumentTemplate clone();

	void custom(String cont, String lay, String styl);
}

class Document implements DocumentTemplate {
	private String content;
	private String layout;
	private String styles;

	public Document(String cont, String lay, String styl) {
		content = cont;
		layout = lay;
		styles = styl;
	}

	@Override
	public DocumentTemplate clone() {
		try {
			return (DocumentTemplate) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void custom(String cont, String lay, String styl) {
		content = cont;
		layout = lay;
		styles = styl;
		System.out.println("the content " + content + ",the " + layout + ",the " + styles);
	}

}
