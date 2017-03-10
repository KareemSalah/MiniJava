package project;

public class Token {
	
	private String type;
	private String value;
	private Integer offset;
	
	public Token(int offset, String type, String value) {
		super();
		this.offset = offset;
		this.type = type;
		this.value = value;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

}
