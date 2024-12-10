package ProjectB;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public abstract class Researcher {
    private int hIndex;
    private List<ResearchPaper> papers = new ArrayList<>();

    public Researcher(int hIndex) {
        this.hIndex = hIndex;
    }

    public void printPapers(Comparator<ResearchPaper> comparator) {
        papers.stream().sorted(comparator).forEach(System.out::println);
    }

    public void calculateHIndex() {
        this.hIndex = (int) papers.stream().filter(p -> p.getCitations() >= hIndex).count();
    }

    // Getters and setters
    public int getHIndex() {
        return hIndex;
    }

    public void setHIndex(int hIndex) {
        this.hIndex = hIndex;
    }

    public List<ResearchPaper> getPapers() {
        return papers;
    }

    public void setPapers(List<ResearchPaper> papers) {
        this.papers = papers;
    }
}