import {Given, When,Then} from "@cucumber/cucumber";
import {pageFixture} from "../../hooks/pageFixture";
import {expect} from "playwright/test";


//----- common -----
Given(/^User goes to the site's main page$/,  async function () {
    if(typeof process.env.BASEURL ==='undefined'){ throw new Error("end var 'BASEURL' is undef.")}
    else
        await pageFixture.page.goto(process.env.BASEURL);
});


Given('User enters first username from the page as {string}', async function (username:string) {
    await pageFixture.page.locator("//input[@id='user-name']").fill(username);
});


Given('User enters password from the page as {string}', async function (pwd:string) {
    await pageFixture.page.locator("//input[@id='password']").fill(pwd);

});


When('User click on the login button', async function () {
    await pageFixture.page.locator("//*[@id='login-button']").click();
});


Then('Login should be successful', async function () {
    const expectedText="Products";
     await expect(pageFixture.page.locator("//span[text()='Products']")).toContainText(expectedText);

});
