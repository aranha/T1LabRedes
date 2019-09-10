import model.Sala;
import model.Objeto;
import model.Usuario;
import model.Objeto;

public class AcoesController{

    public void examinar(Object obj){
        if(obj instanceof Sala || obj instanceof Objeto){
            System.out.println(obj.toString());
        }else{
            System.out.println("Erro");
        }
    }

    public Sala mover(char c, Sala s){
        Sala aux = new Sala();
        if(c == 'N'){
            examinar(s.norte);
            aux = s.norte();
        }else if(c == 'L'){
            examinar(s.leste);
            aux = s.leste();
        }else if(c == 'O'){
            examinar(s.oeste);
            aux = s.oeste();
        }else if(c == 'S'){
            examinar(s.sul);
            aux = s.sul();
        }

        return aux;
    }

    public Objeto pegar(Usuario u, Objeto obj){
        if(u.Sala.o
    }
}