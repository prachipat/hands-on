import java.util.ArrayList;
import java.util.List;

public class Channel {

    private String title;
    private List<Subscriber> subs = new ArrayList<>();

    public void subscribe(Subscriber sub){
        this.subs.add(sub);
    }

    public void unsubscribe(Subscriber sub){
        subs.remove(sub);
    }

    public void notifySub(){
        for(Subscriber sub : subs){
            sub.update();
        }
    }

    public void upload(String title){
        this.title=title;
        notifySub();
    }
}
