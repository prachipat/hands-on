public class Youtube {
    public static void main(String[] args) {
        /*https://www.youtube.com/watch?v=98DiwRp-KZk */
        Channel ch = new Channel();

        Subscriber sub1 = new Subscriber("sub1");
        Subscriber sub2 = new Subscriber("sub2");
        Subscriber sub3 = new Subscriber("sub3");
        Subscriber sub4 = new Subscriber("sub4");

        sub1.subscribeChannel(ch);
        sub2.subscribeChannel(ch);
        sub3.subscribeChannel(ch);
        sub4.subscribeChannel(ch);

        ch.subscribe(sub1);
        ch.subscribe(sub2);
        ch.subscribe(sub3);
        ch.subscribe(sub4);

        ch.upload("Music");
    }
}