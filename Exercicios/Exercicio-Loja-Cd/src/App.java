public class App {
    public static void main(String[] args) throws Exception {

        int i;

        //CONSTRUTOR VETOR LISTA DE PRODUTOS
        Produtos[] listaDeProdutos = new Produtos[10];
        
        //DECLARACAO DOS OBJETOS
        listaDeProdutos[0] = new CDs("a", 50, 414, 1);
        listaDeProdutos[1] = new CDs("b", 5680, 174, 1); 
        listaDeProdutos[2] = new CDs("c", 560, 1454, 3);
        listaDeProdutos[3] = new DVDs("d", 5860, 714, 4);
        listaDeProdutos[4] = new DVDs("e", 5410, 174, 5);
        listaDeProdutos[5] = new DVDs("f", 500, 714, 6);
        listaDeProdutos[6] = new Livros("g", 5860, "jdudw", 7);
        listaDeProdutos[7] = new Livros("h", 5410, "jw", 8);
        listaDeProdutos[8] = new Livros("i", 50, "j011w", 9);
        listaDeProdutos[9] = new Livros("j", 510, "jadw", 10);

        
        //IMPRIMIR PRODUTOS
        System.out.println("==========================");
        for (i = 0; i < listaDeProdutos.length; i++) {
            listaDeProdutos[i].ListarProdutos();
        }

        VerificarCodigo(listaDeProdutos);
    }
     
    //COMPARAR CODIGO DE 2 OBJETOS
    public static void VerificarCodigo(Produtos[] listaDeProdutos){
        int i, y;
        boolean check, check2 = false;
        
        System.out.println("\n\nPRODUTOS COM CODIGOS REPETIDOS: \n");

        for (i = 0; i < listaDeProdutos.length - 1; i++) {
            y = 0;
            
            do {
                //CHECK RECEBE O RETORNO DA FUNCAO EQUALS
                check = listaDeProdutos[i].Equals(listaDeProdutos[y]);

                if (y != i) {
                    if (check == true) {
                        listaDeProdutos[i].ListarProdutos();
                        //SE CHECK2 RECEBER TRUE, SAI DO DO-WHILE
                        check2 = true;
                    }
                }

                y++;

            } while (y <= listaDeProdutos.length - 1 && check2 == false);
        }

        if (check2 == false) {
            System.out.println("SEM PRODUTOS COM CODIGOS REPETIDOS!");
        }
    } 
}