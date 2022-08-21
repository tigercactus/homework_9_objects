import java.util.Objects;

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
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || this.getClass() != other.getClass()) return false;
        Author author = (Author) other;
        return Objects.equals(authorLastName, author.authorLastName) && Objects.equals(authorName, author.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorLastName, authorName);
    }

    @Override
    public String toString() {
        return "автор: " +
                 authorLastName +
                " " + authorName ;
    }
}


