import java.util.ArrayList;
import java.util.List;

public class BoyZeroWeekChildListWeight extends ChildList {
    private List<ChildResult> list;
    public BoyZeroWeekChildListWeight(){
        this.list = new ArrayList<>();
        ChildResult result1 = new ChildResult(2.8, 3.8);
        result1.setNorma();
        list.add(result1);

        ChildResult result2 = new ChildResult(2.5, 2.9);
        result2.setLowNorma();
        list.add(result2);

        ChildResult result3 = new ChildResult(0, 2.5);
        result3.setBelowNorm();
        list.add(result3);

        ChildResult result4 = new ChildResult(3.9, 4.4);
        result4.setHighNorm();
        list.add(result4);

        ChildResult result5 = new ChildResult(4.4, 6);
        result5.setAboveNorm();
        list.add(result5);
    }
}
