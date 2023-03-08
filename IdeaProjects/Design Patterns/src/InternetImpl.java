public class InternetImpl implements Internet{
    @Override
    public void connectTo(String site) {
        System.out.println("Connecting to " + site);
    }
}
