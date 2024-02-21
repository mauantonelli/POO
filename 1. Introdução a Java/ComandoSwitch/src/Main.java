import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

       int diaSemana = 3;
  ;
        switch (diaSemana) {
            case 1: {
                System.out.println("Segunda-feira");
                break;
            }
            case 2:
                System.out.println("Terça-feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            case 5:
                System.out.println("Sexta-feira");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }

        //Outro exemplo
        int mes = 2;
        switch (mes){
            case 1: {
                System.out.println("Janeiro");
                break;
            }
            case 2: {
                System.out.println("Fevereiro");
                break;
            }
            case 3: {
                System.out.println("Março");
                break;
            }
            case 4: {
                System.out.println("Abril");
                break;
            }
            case 5: {
                System.out.println("Maio");
                break;
            }
            case 6: {
                System.out.println("Junho");
                break;
            }
            case 7: {
                System.out.println("Julho");
                break;
            }
            case 8: {
                System.out.println("Agosto");
                break;
            }
            case 9: {
                System.out.println("Setembro");
                break;
            }
            case 10: {
                System.out.println("Outubro");
                break;
            }
            case 11: {
                System.out.println("Novembro");
                break;
            }
            case 12: {
                System.out.println("Dezembro");
                break;
            }
            default: {
                System.out.println("Inválido");
            }
        }


    }
}