import java.util.Comparator;

public class OrderNotebookComparator implements Comparator<Notebook> {

    @Override
    public int compare(Notebook o1, Notebook o2) {
        return o1.getNotebookID()-o2.getNotebookID();
    }
}
