package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ProductPage extends BasePage {

    private By products =
            By.className("inventory_item");

    private By cartIcon =
            By.className("shopping_cart_link");

    private By cartProduct =
            By.className("inventory_item_name");

    public void addProductToCart(String productName) {

        List<WebElement> productList =
                wait.until(
                        ExpectedConditions
                        .visibilityOfAllElementsLocatedBy(products));

        for (WebElement product : productList) {

            String name =
                    product.findElement(
                            By.className("inventory_item_name"))
                            .getText();

            if (name.equalsIgnoreCase(productName)) {

                product.findElement(
                        By.tagName("button"))
                        .click();

                break;
            }
        }
    }

    public void openCart() {

        wait.until(
                ExpectedConditions
                        .elementToBeClickable(cartIcon))
                .click();
    }

    public String getCartProductName() {

        return wait.until(
                ExpectedConditions
                        .visibilityOfElementLocated(cartProduct))
                .getText();
    }
}