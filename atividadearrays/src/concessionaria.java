import java.util.ArrayList;
import java.util.List;

public class concessionaria {
    private List<veiculo> veiculos;

    public concessionaria() {
        veiculos = new ArrayList<veiculo>();
    }

    public void adicionarveiculo(veiculo v) {
        veiculos.add(v);
    }

    public veiculo obterVeiculoMaisBarato() {
        double menorpreco = Double.MAX_VALUE;
        veiculo veiculoMenosCaro = null;

        for (veiculo v : veiculos) {
            if (v.getPreco() < menorpreco) {
                menorpreco = v.getPreco();
                veiculoMenosCaro = v;
            }

        }
        return veiculoMenosCaro;
    }
}
