package nikolll77.com;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement(name = "results")
public class Results {
    @XmlElement(name = "rate")
    private ArrayList<Rate> rates = new ArrayList<>();

    @Override
    public String toString() {
        return "<Results>" +"\n"+
                rates +
                "\n</Results>";
    }
}