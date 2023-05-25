package metodos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import runner.Executa;

public class Metodos {
	
	WebDriver driver ;	
	Executa ex = new Executa(); 
	
	public void abrirNavegador() {
		String url = "https://www.original.com.br";
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
;		System.out.println("Entramos no " + url);
	}
	
	public void clicar(String campo ) {
		System.out.println("Clicamos no " + campo);
	}
	
    public void escrever(String campo, String texto) {
    	System.out.println("Escrever no " + campo + "o texto" + texto);
    }
    
    public void validarTexto(String texto) {
    	System.out.println("Validamos o " + texto);
    }
    
    public void fecharNavegador() {
    	driver.quit();
    }
}
