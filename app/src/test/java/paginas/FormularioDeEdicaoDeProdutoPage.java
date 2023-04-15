package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormularioDeEdicaoDeProdutoPage {
    private WebDriver navegador;

    public FormularioDeEdicaoDeProdutoPage(WebDriver navegador) {
        this.navegador = navegador;
    }

    public String capiturarMensagemApresentada() {
        //Vou validar que a mensagem com sucesso foi apresentada
        return navegador.findElement(By.cssSelector(".toast.rounded")).getText();
    }
}
