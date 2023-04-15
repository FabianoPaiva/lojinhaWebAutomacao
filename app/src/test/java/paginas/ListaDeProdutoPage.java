package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListaDeProdutoPage {
    private WebDriver navegador;

    public ListaDeProdutoPage(WebDriver navegador) {
        this.navegador = navegador;
    }

    public FormularioDeAdicaoDeProdutoPage acessarFormularioAdicaoNovoProduto() {
        //Vou para tela de registro de produto
        navegador.findElement(By.linkText("ADICIONAR PRODUTO")).click();

        return new FormularioDeAdicaoDeProdutoPage(navegador);
    }

    public String capiturarMensagemApresentada() {
        //Vou validar que a mensagem de erro foi apresentada
        return navegador.findElement(By.cssSelector(".toast.rounded")).getText();
    }
}
