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

    public String pegar(Usuario u, Objeto obj){
        String msg = "";
        if(u.Sala.lstObjetos.size() != null){
            u.lstObjetos.add(u.sala.lstObjetos.get(0));
            u.sala.lstObjetos.remove(0);
            msg = "Objeto Encontrado";
        }else{
            msg = "Nenhum objeto encontrado!";
        }
        return msg;
    }

    public String largar(Usuario u, Objeto obj){
        String msg = "";
        if(u.lstObjetos.size() == 0){
            msg = "Nenhum Objeto encontrado!";
        }else{
            u.sala.lstObjetos.add(u.sala.lstObjetos.get(0));
            u.lstObjetos.remove(0);
            msg = "O Objeto " + u.sala.lstObjetos.get(0).toString() + "foi largado!";
        }
        return msg;
    }

    public String mostrarInventario(Usuario u ){
        String msg = "Os objetos de " + u.nick + " : ";

        if(u.lstObjetos.size() == 0){
            msg = "Nenhum objeto em seu inventário!";
            return msg;
        }

        for (Objeto obj : u.lstObjetos) {
            msg = msg + obj.toString() + " ";
        }

        return msg;
    }

    // public String usar(Objeto obj){

    // }

    public String falar(String msg){
        return msg;
    }

    public String cochichar(String msg, Usuario alvo, Usuario remetente){
        String msgErro = "";
        if(alvo.sala == remetente.sala){
            return msg;
        }else{
            msgReturn = "Usuario " + alvo.nick + " não encontrado na sua sala";
        }

        return msgErro;
    }

    public String ajuda(){
        return 
        "Examinar [sala/objeto]" +
        "o Retorna a descrição da sala atual (sala) ou objeto mencionado. " +
        "o A descrição da sala também deve listar as salas adjacentes e suas " +
        "respectivas direções, objetos e demais jogadores presentes no " +
        "local. " +
        " Mover [N/S/L/O] " +
        "o O jogador deve mover-se para a direção indicada (norte, sul, leste " +
        "ou oeste). " +
        "o Ao entrar numa nova sala, o jogo deve executar automaticamente " +
        "o comando “examinar sala”, que descreve o novo ambiente ao " +
        "jogador. " +
        " Pegar [objeto] " +
        "o O jogador coleta um objeto que está na sala atual. " +
        "o Alguns objetos não podem ser coletados, como no caso de “porta”. " +
        " Largar [objeto] " +
        "o O jogador larga um objeto que está no seu inventório, na sala atual. " +
        " Inventório " +
        "o O jogo lista todos os objetos carregados atualmente pelo jogador. " +
        " Usar [objeto] {alvo} " +
        "o O jogador usa o objeto mencionado; " +
        "o Em alguns casos específicos, o objeto indicado necessitará de outro " +
        "(alvo) para ser ativado (ex: usar chave porta). " +
        " Falar [texto] " +
        "o O jogador envia um texto que será retransmitido para todos os " +
        "jogadores presentes na sala atual. " + 
        " Cochichar [texto] [jogador]" +
        "o O jogador envia uma mensagem de texto apenas para o jogador" +
        "especificado, se ambos estiverem na mesma sala. ";
    }
}