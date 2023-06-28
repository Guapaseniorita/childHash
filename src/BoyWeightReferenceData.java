import org.apache.commons.lang.math.DoubleRange;
import org.apache.commons.lang.math.Range;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BoyWeightReferenceData {
    private ChildList childList;
    private HashMap<Integer, ChildList> references;
    public BoyWeightReferenceData() {
        this.references = new HashMap<Integer, ChildList>();
        references.put(0, new BoyZeroWeekChildListWeight());
    }
//    public String getResult(double weight, int ageIntWeek) {
//        for (references.get(ageIntWeek));//создаем список
//    }
}
