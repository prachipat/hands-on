public class WebDriverAdapter implements WebDriver {

    IEDriver ieDriver;

    public WebDriverAdapter(IEDriver driver){
        ieDriver = driver;
    }


    @Override
    public void getElement() {
        ieDriver.findElement();
    }

    @Override
    public void selectElement() {
ieDriver.clickElement();
    }
}
