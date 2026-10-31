package semana05_revisao.banco1;

public class BancoDeDados {
    public static BancoDeDados criar(int opcao){
        if(opcao == 1){
            return new MySql(1);
        }
        else if(opcao == 2){
            return new Oracle(2);
        }
        else{
            return new MongoDb(3);
        }
    }
}