import java.util.Comparator;

public class OrderPhoneComparator implements Comparator<Phone> {

    @Override
    public int compare(Phone o1, Phone o2) {
        return o1.getPhoneID() - o2.getPhoneID();
    }
}
