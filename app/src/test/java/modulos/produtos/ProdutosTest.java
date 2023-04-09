package modulos.produtos;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@DisplayName("Testes Web do Modulo Produtos")
public class ProdutosTest {
    @Test
    @DisplayName("Nao e permitido registrar um produto com valor igual a zero")
    public void testNaoEPermitidoRegistrarProdutoComValorIgualAZero() {
        //Abrir o navegador
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();

        //Maximizar a tela
        navegador.manage().window().maximize();

        //Navegar para pagina da Lojinha Web
        navegador.get("http://165.227.93.41/lojinha-web/v2/");

        //Fazer login

        //Vou para tela de registro de produto

        //Vou preencher dados do produto e o valor sera igual a zero

        //Vou submeter o formulario

        //Vou validar que a mensagem de erro foi apresentada
    }
}