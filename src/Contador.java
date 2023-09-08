import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt();

        try{
            if(parametroUm > parametroDois){
                throw new ParametrosInvalidosException("-> O segundo parametro deve ser maior que o primeiro");
            }
            for(int i = parametroUm; i <= parametroDois; i++){
                System.out.println("Imprimindo o número "+i);
            }
        }catch(NumberFormatException e){
            System.err.println("Os parâmetros fornecidos não são números inteiros válidos.");
        }catch(ParametrosInvalidosException e){
            System.err.println("Erro "+e.getMessage());
        }
    }
    
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if(parametroUm > parametroDois){

        }

    }
}   