import java.util.ArrayList;
import java.util.List;

public class InternetProxy extends InternetImpl implements Internet{
    private static final List<String> banned = new ArrayList<>();

    static {
        banned.add("danger.com");
    }
    @Override
    public void connectTo(String site) {
        for(String ban : banned){
            if (site.equalsIgnoreCase(ban)){
                System.out.println("Blocked!!!!");
            }
            super.connectTo(site);
        }
    }
}
