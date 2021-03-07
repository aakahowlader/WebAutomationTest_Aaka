import org.openqa.selenium.By;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.testng.Assert;


public class Test extends AmazonTest2 {


    @org.testng.annotations.Test()

    public void testCheckSearchBox1() {
        checkSearchBox();
        String expectedText = "\"Mask\"";
        String ActualText = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]")).getText();
        Assert.assertEquals(ActualText, expectedText, "product does not match");
    }

    @org.testng.annotations.Test()
    public void testPageTitle2() {
        String expectedText = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    //find a mario game
    @org.testng.annotations.Test
    public void findVideoGame() {
        driver.get("https://www.amazon.com/");
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(2)")).click();
        driver.findElement(By.cssSelector("#zg_tabs > ul > li:nth-child(2) > div > a")).click();
        driver.findElement(By.cssSelector("#zg_left_col1 > div:nth-child(1) > div:nth-child(3) > div > div.a-section.a-spacing-none.p13n-asin > a > div.p13n-sc-truncate-desktop-type2.p13n-sc-truncated")).click();
        String expectedText = "Amazon.com: Super Mario 3D World + Bowser's Fury - Nintendo Switch: Nintendo of America: Video Games";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    //Add mario game to cart and make sure it directs you to sign in
    @org.testng.annotations.Test
    public void addGametoCart() {
        driver.get("https://www.amazon.com/");
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(2)")).click();
        driver.findElement(By.cssSelector("#zg_tabs > ul > li:nth-child(2) > div > a")).click();
        driver.findElement(By.cssSelector("#zg_left_col1 > div:nth-child(1) > div:nth-child(3) > div > div.a-section.a-spacing-none.p13n-asin > a > div.p13n-sc-truncate-desktop-type2.p13n-sc-truncated")).click();
        driver.findElement(By.cssSelector("#add-to-cart-button")).click();
        driver.findElement(By.cssSelector("#hlb-ptc-btn-native")).click();
        String expectedText = "Amazon Sign-In";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    //check to see if you can add to cart
    @org.testng.annotations.Test
    public void addToCart() {
        checkSearchBox();
        String expectedText = "\"Mask\"";
        driver.findElement(By.cssSelector("#search > div.s-desktop-width-max.s-desktop-content.sg-row > div.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span:nth-child(4) > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(3) > div > span > div > div > div > div > div:nth-child(3) > h2 > a > span")).click();

    }

    //check that the logo takes you back to homepage
    @org.testng.annotations.Test
    public void homepageLogo() throws InterruptedException {
        checkSearchBox();
        String expectedText = "\"Mask\"";
        driver.findElement(By.cssSelector("#search > div.s-desktop-width-max.s-desktop-content.sg-row > div.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span:nth-child(4) > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(3) > div > span > div > div > div > div > div:nth-child(3) > h2 > a > span")).click();
        driver.findElement(By.cssSelector("#add-to-cart-button")).click();
        driver.findElement(By.cssSelector("#nav-cart-text-container")).click();
        //driver.findElement(By.cssSelector("#hlb-view-cart-announce")).click();
        driver.findElement(By.cssSelector("#sc-buy-box-ptc-button > span > input")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#a-page > div.a-section.a-padding-medium.auth-workflow > div.a-section.a-spacing-none.auth-navbar > div > a > i")).click();
        String ExpectedText = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, ExpectedText, "Page title not match");
    }


    @org.testng.annotations.Test
    public void Checkout() throws InterruptedException {
        checkSearchBox();
        String expectedText = "\"Mask\"";
        driver.findElement(By.cssSelector("#search > div.s-desktop-width-max.s-desktop-content.sg-row > div.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span:nth-child(4) > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(3) > div > span > div > div > div > div > div:nth-child(3) > h2 > a > span")).click();
        driver.findElement(By.cssSelector("#add-to-cart-button")).click();
        driver.findElement(By.cssSelector("#nav-cart-text-container")).click();
        //driver.findElement(By.cssSelector("#hlb-view-cart-announce")).click();
        driver.findElement(By.cssSelector("#sc-buy-box-ptc-button > span > input")).click();
        Thread.sleep(5000);
    }


    @org.testng.annotations.Test
    public void todaysDeal3() throws InterruptedException {
        driver.get("https://www.amazon.com/");
        driver.findElement(By.linkText("Today's Deals")).click();
        String expectedText = "Gold Box Deals | Today's Deals - Amazon.com";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "error");
        Thread.sleep(5000);

        driver.close();

    }

    @org.testng.annotations.Test
    public void bestSellers4() {
        driver.get("https://www.amazon.com/");
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]")).click();
        String expectedText = "Amazon.com Best Sellers: The most popular items on Amazon";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");

    }

    @org.testng.annotations.Test
    public void amazonPrime5() {
        driver.get("https://www.amazon.com/");
        driver.findElement(By.id("nav-link-prime")).click();
        String expectedText = "Amazon.com: Amazon Prime";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");

    }

    @org.testng.annotations.Test
    public void newReleases6() {
        driver.get("https://www.amazon.com/");
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(6)")).click();
        String expectedText = "Amazon.com New Releases: The best-selling new & future releases on Amazon";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @org.testng.annotations.Test
    public void fashion6() {
        driver.get("https://www.amazon.com/");
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(7)")).click();
        String expectedText = "Amazon Fashion | Clothing, Shoes & Jewelry | Amazon.com";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @org.testng.annotations.Test
    public void books7() {
        driver.get("https://www.amazon.com/");
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(7)")).click();
        String expectedText = "Amazon.com: Books";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @org.testng.annotations.Test
    public void kindle() {
        driver.get("https://www.amazon.com/");
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[8]")).click();
        String expectedText = "Amazon.com: Kindle eBooks: Kindle Store: Nonfiction, Literature & Fiction, Foreign Languages, Business & Money & More";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @org.testng.annotations.Test
    public void kindleFindTheAlchemist() {
        driver.get("https://www.amazon.com/");
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[8]")).click();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("The alchemist");
        driver.findElement(By.id("nav-search-submit-button")).click();
        String expectedText = "Amazon.com : The alchemist";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @org.testng.annotations.Test
    public void giftCards() {
        driver.get("https://www.amazon.com/");
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(10)")).click();
        String expectedText = "Amazon.com Gift Cards";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @org.testng.annotations.Test
    public void findAGift() {
        driver.get("https://www.amazon.com/");
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(11)")).click();
        String expectedText = "Gifts for Everyone | Amazon.com Gift Finder";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    //AmazonPrime music visibility
    @org.testng.annotations.Test
    public void primeMusic() throws InterruptedException {
        driver.get("https://www.amazon.com/");
        driver.findElement(By.cssSelector("#nav-hamburger-menu > span")).click();
        driver.findElement(By.cssSelector("#hmenu-content > ul.hmenu.hmenu-visible > li:nth-child(8) > a > div")).click();
        driver.findElement(By.cssSelector("#hmenu-content > ul.hmenu.hmenu-visible.hmenu-translateX > li:nth-child(5) > a")).click();
        Thread.sleep(5000);
    }

    //see that returns takes you to sign in page
    @org.testng.annotations.Test
    public void returns() {
        driver.get("https://www.amazon.com/");
        driver.findElement(By.cssSelector("#nav-orders")).click();
        String expectedText = "Amazon Sign-In";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @org.testng.annotations.Test
    public void searchForHelloKitty() throws InterruptedException {
        driver.get("https://www.amazon.com/");
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("hello kitty");
        driver.findElement(By.cssSelector("#nav-search-submit-button"));
        Thread.sleep(2000);

    }

    @org.testng.annotations.Test
    public void searchForAnime() throws InterruptedException {
        driver.get("https://www.amazon.com/");
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Anime");
        driver.findElement(By.cssSelector("#nav-search-submit-button"));
        Thread.sleep(2000);

    }
    @org.testng.annotations.Test
    public void AmazonFooterWareHouse() {
        driver.get("https://www.amazon.com/");
        driver.findElement(By.cssSelector("#navFooter > div.navFooterLine.navFooterLinkLine.navFooterDescLine > table > tbody > tr:nth-child(9) > td:nth-child(1) > a")).click();
        String expectedText = "Amazon Warehouse | Great deals on quality used products";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @org.testng.annotations.Test
    public void Audible() {
        driver.get("https://www.amazon.com/");
        driver.findElement(By.cssSelector("#navFooter > div.navFooterLine.navFooterLinkLine.navFooterDescLine > table > tbody > tr:nth-child(5) > td:nth-child(1) > a")).click();
        String expectedText = "Audible.com | Unlock a listen for every moment";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @org.testng.annotations.Test
    public void Careers() {
        driver.get("https://www.amazon.com/");
        driver.findElement(By.cssSelector("#navFooter > div.navFooterVerticalColumn.navAccessibility > div > div:nth-child(1) > ul > li.nav_first > a")).click();
        String expectedText = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @org.testng.annotations.Test
    public void TypeInCareers() {
        driver.get("https://www.amazon.com/");
        driver.findElement(By.cssSelector("#search_typeahead")).sendKeys("transportation");
        driver.findElement(By.cssSelector("#search-button > span")).click();
    }

    @org.testng.annotations.Test
    public void Careersfield() {
        driver.get("https://www.amazon.com/");
        driver.findElement(By.cssSelector("")).click();
        String expectedText = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }


}






