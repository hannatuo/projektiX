package fi.academy;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Topic topic = new Topic("Java");
        TopicienTulostaja turbo = new TopicienTulostaja();

        turbo.tulostaTopicit();
    }
}
