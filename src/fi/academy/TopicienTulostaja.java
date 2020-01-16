package fi.academy;
import java.util.ArrayList;
import java.util.List;

public class TopicienTulostaja {

    public TopicienTulostaja () {
    }

    List<String> topicit = new ArrayList<String>();

    


    public void tulostaTopicit() {
        for (String title : topicit) {
            System.out.println(title);
        }
    }
}
