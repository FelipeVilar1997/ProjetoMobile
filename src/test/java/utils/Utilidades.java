package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class Utilidades {

	private AndroidDriver<WebElement> driver = Driver.getDriver();

//	public void scrollUp(double inicio, double fim) {
//		TouchAction touchAction = new TouchAction(driver);
//		touchAction.tap(PointOption.point(1600, 660)).perform();
//	}

	public void testeScroll() {
		TouchAction touchAction = new TouchAction(driver).press(PointOption.point(526, 1430))
				.moveTo(PointOption.point(526, 550)).release().perform();
	}

	public WebElement buscaElemento(By by) {
		return driver.findElement(by);
	}

	public String obtemAtributo(By by, String atributo) {
		return obtemAtributo(buscaElemento(by), atributo);
	}

	public String obtemAtributo(WebElement element, String atributo) {
		return element.getAttribute(atributo);
	}

	public void clicaSimples(By by) {
		clicaSimples(buscaElemento(by));
	}

	public void clicaSimples(WebElement element) {
		element.click();
	}

	public void escreve(By by, String texto) {
		escreve(buscaElemento(by), texto);
	}

	public void escreve(WebElement element, String texto) {
		element.sendKeys(texto);
	}

	public void espera(final int milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException x) {
			System.err.println(x);
		}
	}

	public String leSimples(By by) {
		return leSimples(buscaElemento(by));
	}

	public String leSimples(WebElement element) {
		return element.getText();
	}

	public void geradorDados() throws FileNotFoundException {
		PrintStream out = new PrintStream(new FileOutputStream(new File("relatorio/RelatorioPesquisa.txt"), true));
		System.setOut(out);
	}

	public boolean evidencia(final String name) {
		String screenshotDirectory = System.getProperty("appium.screenshots.dir",
				System.getProperty("java.io.tmpdir", ""));
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		return screenshot.renameTo(new File(screenshotDirectory, String.format("%s.png", name)));
	}
}
