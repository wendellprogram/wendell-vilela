import java.util.ArrayList;
import java.util.List;

public class Arrayretangulo {

    private List<Retangulo> retangulos;

    public Arrayretangulo() {
        retangulos = new ArrayList<Retangulo>();
    }

    public void adicionarRetangulo(Retangulo r) {
        retangulos.add(r);
    }

    public Retangulo obterMaiorArea() {
        double menorretangulo = Double.MIN_VALUE;
        Retangulo retangulomaior = null;

        for (Retangulo r : retangulos) {
            if (r.obterArea() > menorretangulo) {
                menorretangulo = r.obterArea();
                retangulomaior = r;

            }
        }
        return retangulomaior;

    }
    public Retangulo obterMaiorPerimetro(){
        double menorperimetro= 0;
        Retangulo perimetromaior = null;
        for (Retangulo r : retangulos){
            if (r.obterPerimetro()>menorperimetro){
                menorperimetro = r.obterPerimetro();
                perimetromaior=r;
            }
        }
        return perimetromaior;
    }






}
















