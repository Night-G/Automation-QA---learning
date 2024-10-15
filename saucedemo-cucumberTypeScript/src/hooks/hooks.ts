import {Before, After, Status, BeforeAll} from "@cucumber/cucumber";
import {Browser, Page} from "playwright";
import {pageFixture} from "./pageFixture";
import {formatedTimestamp} from "../utilities/formatedTime";
import {invokeBrowser} from "../helper/browserManager";
import {getEnv} from "../helper/env/env";

let browser: Browser;
let page: Page;


Before(async function(){
    getEnv();
    browser = await invokeBrowser();

    page = await browser.newPage();
    pageFixture.page = page;
});


After(async function(scenario){
    if(scenario.result?.status === Status.FAILED){
        let dateTime = formatedTimestamp(new Date());
        await page.screenshot({path:('src/screenshots/'+dateTime+'.png')})
    }

    await pageFixture.page.close();
    await browser.close();
});