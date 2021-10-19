package net.valorweb.ecommerce;
import net.valorweb.ecommerce.model.Produto;
import org.junit.Assert;
import org.junit.Test;

public class ConsultandoRegistrosTest extends EntityManagerTest{

    @Test
    public void bustarPorId() {

        //Produto produto = entityManager.find(Produto.class, 1);

        Produto produto = entityManager.getReference(Produto.class, 1);

        Assert.assertNotNull(produto);
        Assert.assertEquals("Kindle", produto.getNome());
    }

    @Test
    public void atualizarReferencia() {
        Produto produto = entityManager.getReference(Produto.class, 1);
        produto.setNome("Galaxy Tab A7");
        entityManager.refresh(produto);

        Assert.assertEquals("Kindle", produto.getNome());
    }


}
