import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchItemPage extends  PageBase{
    public SearchItemPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "twotabsearchtextbox")
    WebElement SearchField;

    @FindBy(id = "nav-search-submit-button")
    WebElement SearchButton;

    @FindBy(xpath = "(//span[@class = 'a-size-base-plus a-color-base a-text-normal'])[1]")
    WebElement FirstItem;

    @FindBy(id = "add-to-cart-button")
    WebElement AddToCartButton;

    @FindBy(xpath = "//span[@class = 'a-size-medium-plus a-color-base sw-atc-text a-text-bold' ]")
    WebElement AddedToCart;

    @FindBy(xpath = "(//span[@class = 'a-size-base-plus a-color-base a-text-normal'])[2]")
    WebElement AddToCartSecond;
    
         public void CarAccessories (String a)
        {
            SearchField.sendKeys(a);
            SearchButton.click();
        }

        public void FirstItemSelect()
        {
            FirstItem.click();
        }

        public void AddToCartButton()
        {
            AddToCartButton.click();
        }
   public void SecondItemSelect(){AddToCartSecond.click();}
    public void FirstItem(String first_item) {
    }


    public void AddToCartSecond() {
             AddToCartButton.click();
    }
}
