public class Main {
    public static void main(String[] args) {

        String nomeCurso = "Programação Orientadad a Objetos";
        System.out.println("O nome do curso é: "+ nomeCurso);

        String a = "POO";
        String b = a;  //variável b recebe a, portanto b="POO"
        String c = "BD";
        String d = "POO";

        //Comparar Strings
        boolean iguais;
        iguais = a.equals(b); //retorna true
        iguais = a.equals(c); //retorna false
        iguais = a.equals(d); //retorna true


        // Concatenar Strings
        String primeiroNome = "Maria ";
        String segundoNome = "Silva";
        String nomeCompleto = primeiroNome.concat(segundoNome);
        System.out.println(nomeCompleto);

        //Tamanho da String
        String nomeFaculdade = "IFSP";
        int tamanhoString = nomeFaculdade.length(); //retorna 4

        

        //Veja o material EAD1


    }
}