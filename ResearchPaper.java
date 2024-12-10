package ProjectB;
import java.util.List;

public class ResearchPaper {
    private String name;
    private int year;
    private int citations;
    private List<String> authors;

    public ResearchPaper(String name, int year, int citations, List<String> authors) {
        this.name = name;
        this.year = year;
        this.citations = citations;
        this.authors = authors;
    }

    public String getCitation(String format) {
        if ("PlainText".equalsIgnoreCase(format)) {
            return name + ", " + year;
        } else if ("BibTex".equalsIgnoreCase(format)) {
            return "@article{" + name + ", year=" + year + "}";
        }
        return "Invalid format";
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCitations() {
        return citations;
    }

    public void setCitations(int citations) {
        this.citations = citations;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }
}