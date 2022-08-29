import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TodaysDealTest extends TestBase{
    TodaysDealPage todaysDealPage;
    @Test(priority = 1)
    public void HappyScenario()
    {
        todaysDealPage = new TodaysDealPage(driver);
        todaysDealPage.DontChangeSelect();
        todaysDealPage.TodayDealSelect();
        todaysDealPage.GrocerySelect();
        todaysDealPage.HeadphonesSelect();
        todaysDealPage.DiscountSelect();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        todaysDealPage.ThirdPageSelect();
        todaysDealPage.PageSelect();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        todaysDealPage.ItemSelect();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        todaysDealPage.AddToCartSelect();
        todaysDealPage.CartButton();
        Assert.assertFalse(driver.findElement(By.xpath("//span[@class = 'a-truncate-cut']")).getText().contains("Apple"));

    }
    @Test(priority = 2)
    public void InvalidCheckbox()
    {
        todaysDealPage = new TodaysDealPage(driver);
        todaysDealPage.DontChangeSelect();
        todaysDealPage.TodayDealSelect();
        todaysDealPage.GrocerySelect();
        todaysDealPage.HeadphonesSelect();
        todaysDealPage.DiscountSelect();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        todaysDealPage.ThirdPageSelect();
        todaysDealPage.PageSelect();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        todaysDealPage.ItemSelect();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        todaysDealPage.AddToCartSelect();
        Assert.assertFalse(driver.findElement(By.xpath("//span[@class = 'a-size-medium-plus a-color-base sw-atc-text a-text-bold']")).getText().contains("bete"));
    }
      @Test(priority = 3)
    public void InvalidRedirectDiscount()
      {
          todaysDealPage = new TodaysDealPage(driver);
         // todaysDealPage.DontChangeSelect();
          todaysDealPage.TodayDealSelect();
          todaysDealPage.GrocerySelect();
          todaysDealPage.HeadphonesSelect();
          todaysDealPage.DiscountSelect();
          Assert.assertFalse(driver.findElement(By.xpath("(//div[@class = 'DealContent-module__truncate_sWbxETx42ZPStTc9jwySW']) [1]")).getText().contains("Best Seller"));
      }
      @Test(priority = 4)
    public void InvalidRedirectTHirdPage()
      {
          todaysDealPage = new TodaysDealPage(driver);
          todaysDealPage.DontChangeSelect();
          todaysDealPage.TodayDealSelect();
          todaysDealPage.GrocerySelect();
          todaysDealPage.HeadphonesSelect();
          todaysDealPage.DiscountSelect();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
          todaysDealPage.ThirdPageSelect();
          Assert.assertFalse(driver.findElement(By.xpath("(//div[@class='DealContent-module__truncate_sWbxETx42ZPStTc9jwySW']) [1]")).getText().contains("Best Seller"));
      }
      @Test(priority = 5)
    public void InvalidRedirectPageFour()
      {
          todaysDealPage = new TodaysDealPage(driver);
          todaysDealPage.DontChangeSelect();
          todaysDealPage.TodayDealSelect();
          todaysDealPage.GrocerySelect();
          todaysDealPage.HeadphonesSelect();
          todaysDealPage.DiscountSelect();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
          todaysDealPage.ThirdPageSelect();
          todaysDealPage.PageSelect();
          Assert.assertFalse(driver.findElement(By.xpath("(//div[@class='DealContent-module__truncate_sWbxETx42ZPStTc9jwySW']) [1]")).getText().contains("Best Seller"));
      }
      @Test(priority = 6)
    public void InvalidRedirectItem()
      {
          todaysDealPage = new TodaysDealPage(driver);
          todaysDealPage.DontChangeSelect();
          todaysDealPage.TodayDealSelect();
          todaysDealPage.GrocerySelect();
          todaysDealPage.HeadphonesSelect();
          todaysDealPage.DiscountSelect();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
          todaysDealPage.ThirdPageSelect();
          todaysDealPage.PageSelect();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
          todaysDealPage.ItemSelect();
          Assert.assertFalse(driver.findElement(By.xpath("(//input[@class='a-button-input']) [1]")).getText().contains("Best Seller"));
      }

}
