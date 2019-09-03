import model.Sala;
import model.Objeto;

public class AcoesController{

    public void examinar(Object obj){
        if(obj instanceof Sala || obj instanceof Objeto){
            System.out.println(obj.toString());
        }else{
            System.out.println("Erro");
        }
    }
}