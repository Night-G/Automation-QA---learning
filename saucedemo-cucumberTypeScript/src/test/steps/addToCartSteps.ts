import {pageFixture} from "../../hooks/pageFixture";
import {Given, Then, When} from "@cucumber/cucumber";

Given('User adds a {string}', async function (product:string){
    const xpathLocator:string = "//div[descendant::a[descendant::div[text()='"
        +product
        +"']] and @class='inventory_item_description']//button[text()='Add to cart']"
    await pageFixture.page.locator(xpathLocator).click();
});
//
When('User goes to cart', async function (){
    await pageFixture.page.locator("//a[@class='shopping_cart_link']").click();
});

Then('In cart should be the {string}', async function (product:string){
    const actualItem = await pageFixture.page.locator("//div[@class='cart_item']//div[@class='inventory_item_name']").textContent()
    console.log(actualItem);
});
