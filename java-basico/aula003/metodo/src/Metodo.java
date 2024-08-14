public class Metodo {
    public static void main(String[] args)
    {
        String primeiroNome = "Filipe";
        String segundoNome = "Pinto Vicentini";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }
        // Obs: os métodos com nomes com verbos são colocados no infinitivo
    public static String nomeCompleto(String primeiroNome, String segundoNome)
    {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}