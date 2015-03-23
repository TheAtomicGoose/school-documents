public class Book implements Comparable {
    private String title;
    private String author;

    private int year;

    public Book()
    {
        this("none", "unknown", 1450);
    }

    public Book(String t)
    {
        this(t, "unknown", 1450);
    }

    public Book(String t, String a, int y)
    {
        setTitle(t);
        setAuthor(a);
        setYear(y);
    }

    public int compareTo(Object b) {
        Book temp = (Book) b;
        if (author.compareTo(temp.author) == 0) {
            return title.compareTo(temp.title);
        }

        return author.compareTo(temp.author);
    }

    public String toString()
    {
        return title + "\n\t" + author + "\n\t" + year;
    }

    public void setTitle(String t)
    {
        title = t;
    }

    public void setAuthor(String a)
    {
        author = a;
    }

    public void setYear(int y)
    {
        year = y;
    }
}
