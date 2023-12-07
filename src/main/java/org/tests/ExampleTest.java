package org.tests;

import org.testng.annotations.Test;
import com.microsoft.playwright.*;

public class ExampleTest {
    @Test
    public void shouldNavigateToPlaywrightHomepage() {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium()
                    .launch(new BrowserType.LaunchOptions().setHeadless(false));
            Page page = browser.newPage();
            page.navigate("https://playwright.dev");
            page.pause();
            page.getByText("Getting Started").click();
        }
    }
}