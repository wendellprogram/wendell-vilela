import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Floricultura {
    private List<Flor> flores;

    public Floricultura() {
        flores = new ArrayList<Flor>();
    }

    public void adicionarFlor(Flor l) {
        flores.add(l);
    }

    public List<Flor> obterListaCliente(String nome) {
        List<Flor> floresPorCliente = new ArrayList<>();

        for (Flor l : flores) {
            if (l.getCliente().equals(nome)) {
                floresPorCliente.add(l);
            }
        }
        return floresPorCliente;

    }
}








