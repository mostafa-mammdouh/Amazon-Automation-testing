import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class SearchItemTest extends TestBase{
    SearchItemPage searchItemPage;
    @Test (priority = 1)
    public void ValidAddToCart ()
    {
        searchItemPage = new SearchItemPage(driver);
        searchItemPage.CarAccessories("car accessories");
        searchItemPage.FirstItemSelect();
        searchItemPage.AddToCartButton();
        Assert.assertTrue(driver.findElement(By.xpath("//span[@class = 'a-size-medium-plus a-color-base sw-atc-text a-text-bold']")).getText().contains("Added to Cart"));
     }
   @Test (priority = 2)
    public void InvalidAddToCart()
   {
        searchItemPage = new SearchItemPage(driver);
       searchItemPage.SearchField.clear();
       searchItemPage.CarAccessories("car");
       searchItemPage.FirstItemSelect();
       searchItemPage.AddToCartButton();
   }
 @Test (priority = 3)
    public void InvalidLink()
 {
     searchItemPage = new SearchItemPage(driver);
     searchItemPage.SearchField.clear();
     Assert.assertFalse(driver.findElement(By.id("nav-logo-sprites")).getText().contains("Amazon"));
 }
@Test (priority = 4)
    public void InvalidInputSearch()
{
     searchItemPage = new SearchItemPage(driver);
    searchItemPage.SearchField.clear();
    searchItemPage.CarAccessories("car");
    Assert.assertFalse(driver.findElement(By.id("twotabsearchtextbox")).getText().contains("car"));
}
  @Test(priority = 5)
    public void InvalidSearchButton()
  {
       searchItemPage = new SearchItemPage(driver);
      searchItemPage.SearchField.clear();
      searchItemPage.CarAccessories("phones");
      Assert.assertFalse(driver.findElement(By.id("nav-search-submit-button")).getText().contains("amon"));
  }
@Test(priority = 6)
    public void InvalidRedirection()
{
     searchItemPage = new SearchItemPage(driver);
    searchItemPage.SearchField.clear();
    searchItemPage.CarAccessories("car accessories");
    Assert.assertFalse(driver.findElement(By.xpath("(//span[@class = 'a-size-base-plus a-color-base a-text-normal']) [1]")).getText().contains("Best Seller"));
}
   @Test(priority = 7)
    public void InvalidRedirectionToItem()
   {
       searchItemPage = new SearchItemPage(driver);
       searchItemPage.SearchField.clear();
       searchItemPage.CarAccessories("car accessories");
       searchItemPage.FirstItemSelect();
       Assert.assertFalse(driver.findElement(By.xpath("(//input[@class = 'a-button-input']) [7]")).getText().contains("xcasaf"));
   }
  @Test(priority = 8)
    public void InvalidAddedToCart()
  {
      //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
       searchItemPage = new SearchItemPage(driver);
      searchItemPage.SearchField.clear();
      searchItemPage.CarAccessories("car accessories");
      searchItemPage.FirstItemSelect();
      searchItemPage.AddToCartButton();
      Assert.assertFalse(driver.findElement(By.xpath("//span[@class = 'a-size-medium-plus a-color-base sw-atc-text a-text-bold']")).getText().contains("sdfaf"));
      driver.quit();
  }

}
