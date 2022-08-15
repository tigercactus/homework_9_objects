public class Author {
    private String authorLastName;
    private String authorName;

    public Author(String authorLastName, String authorName) {
        this.authorLastName = authorLastName;
        this.authorName = authorName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public String getAuthorName() {
        return authorName;
    }

    @Override
    public String toString() {
        return "автор: " +
                 authorLastName +
                " " + authorName ;
    }
}


