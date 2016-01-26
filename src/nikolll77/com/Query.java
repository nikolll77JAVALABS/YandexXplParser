package nikolll77.com;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "query")
public class Query {

    private int count=0;
    private String created;
    private String lang;
    Results results;

    public int getCount() {
        return count;
    }

    @XmlAttribute(name="count", namespace="http://www.yahooapis.com/v1/base.rng")
 //   @XmlAttribute(name="yahoo:count")
    public void setCount(int count) {
        this.count = count;
    }

    public String getCreated() {
        return created;
    }

    @XmlAttribute(name="created", namespace="http://www.yahooapis.com/v1/base.rng")
    public void setCreated(String created) {
        this.created = created;
    }

    public String getLang() {
        return lang;
    }
    @XmlAttribute(name="lang", namespace="http://www.yahooapis.com/v1/base.rng")
    public void setLang(String lang) {
        this.lang = lang;
    }

    public Results getResults() {
        return results;
    }

    @XmlElement
    public void setResults(Results results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return
        "<Query>"+"\n"+
                "count="+getCount() +"\n"+
                "created="+getCreated() +"\n"+
                "lang="+getLang() +"\n"+
        results+"\n"+
        "</Query>";
    }
}