public class Author {
	private String name;

	private String email;

	public Author(String authorName, String authorEmail) {
		this.name = authorName;
		this.email = authorEmail;
	}

	public Author() {
		email = "";
	}

	public String getName() { 
		return name;
	}

	public String getEmail() {
		return email;
	}


	@Override
    public String toString() {
    	return "Author: Name=" + this.name + " Email=" + this.email;
    }
}