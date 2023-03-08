public class Subscriber {
    private String name;
    private Channel channel;

    public Subscriber(String name) {
        this.name = name;

    }

    public void update(){
        System.out.println("New video uploaded!!!!");
    }

    public void subscribeChannel(Channel ch){
        channel=ch;
    }
}
