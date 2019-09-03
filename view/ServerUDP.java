import model.Sala;
import controller.AcoesController;

public class ServerUDP{
    public static void main(String args[]){
        Sala sala = new Sala();
        sala.nome = "1";

        AcoesController cont = new AcoesController();
        cont.examinar(sala);

    }
    
}