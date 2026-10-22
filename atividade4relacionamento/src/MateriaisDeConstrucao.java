
import java.util.ArrayList;
import java.util.List;

public class MateriaisDeConstrucao {
    private List<Produto> produtos;

    public MateriaisDeConstrucao() {
        produtos = new ArrayList<Produto>();
    }

    public void adicionarProduto(Produto p) {
        produtos.add(p);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public Produto obterMarcaMaisCara(String marca) {
        Produto maisCaro = null;
        for (Produto p : produtos) {

            if (p.getMarca().equalsIgnoreCase(marca)) {
                if (maisCaro == null || p.getPreco() > maisCaro.getPreco()) {
                    maisCaro = p;
                }
            }

        }
        return maisCaro;
    }
}






