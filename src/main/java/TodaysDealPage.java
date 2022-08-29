import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TodaysDealPage extends PageBase{

    public TodaysDealPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "(//input[@type = 'submit']) [2]")
    WebElement DontChange;

@FindBy(xpath = "(//a[@class='nav-a  '])[1]")
    WebElement TodayDeal;

    @FindBy(xpath = "(//input[@class='CheckboxFilter-module__gridFilterCheckbox_9gZBKxneWNZMc30ac9ue7 Checkbox-module__checkBoxOutline_281PiTekJcpF_Pm5QDexLv']) [22]")
    WebElement Grocery;

    @FindBy(xpath = "(//input[@class = 'CheckboxFilter-module__gridFilterCheckbox_9gZBKxneWNZMc30ac9ue7 Checkbox-module__checkBoxOutline_281PiTekJcpF_Pm5QDexLv']) [24]")
    WebElement Headphones;

    @FindBy(xpath = "(//a[@class = 'LinkFilterOption-module__linkFilterOption_k3Xp4bgxEaBmcgTA0UAxc']) [17]")
    WebElement Discount;

    @FindBy(xpath = "(//a[@href = '#']) [29]")
    WebElement ThirdPage;

    @FindBy(xpath = "(//li[@class='a-normal']) [3]")
    WebElement Page;

    @FindBy(xpath = "(//div[@class = 'DealContent-module__truncate_sWbxETx42ZPStTc9jwySW']) [7]")
    WebElement Item;

    @FindBy(id = "add-to-cart-button")
    WebElement AddToCartSecond;

    @FindBy(xpath = "//a[@href='/gp/cart/view.html?ref_=nav_cart']")
    WebElement Cart;

     public void DontChangeSelect()
     {
         DontChange.click();
     }
    public void TodayDealSelect() {
        TodayDeal.click();

    }
    public void GrocerySelect()
    {
        Grocery.click();
    }
    public void HeadphonesSelect()
    {
        Headphones.click();
    }

    public void DiscountSelect()
    {
        Discount.click();
    }

    public void ThirdPageSelect()
    {
        ThirdPage.click();
    }
    public void PageSelect()
    {
        Page.click();
    }

    public void ItemSelect()
    {
        Item.click();
    }

    public void AddToCartSelect()
    {
        AddToCartSecond.click();
    }

    public void CartButton()
    {
        Cart.click();
    }



}

