import org.apache.commons.lang.math.DoubleRange;
public class ChildResult {
    private DoubleRange range;
    private String message;
    public ChildResult(double start, double end) {
        this.range = new DoubleRange(start, end);
        this.message = "";
    }
    public void setNorma() {
         this.message = "Заключение: Норма";
    }
    public void setLowNorma() {
        this.message = "Заключение: Низкая норма";
    }
    public void setBelowNorm () {
        this.message = "Заключение: ниже нормы";
    }
    public void setAboveNorm() {
        this.message = "Заключение: выше нормы";
    }
    public void setHighNorm() {
        this.message = "Заключение: высокая норма";
    }

    public String getMessage() {
        return message;
    }

    public DoubleRange getRange() {
        return range;
    }
}
