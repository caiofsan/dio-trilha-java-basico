public class App {
    public static void main(String[] args) {
        try {
            String novoCep = formatarCEP("12345678");
            System.out.println(novoCep);
        } catch (CEPInvalidoException e) {
            System.out.println("CEP inválido.");
            e.printStackTrace();
        }
    }

    // método de formatação do CEP com tratamento de exceções
    static String formatarCEP(String cep) throws CEPInvalidoException {
        if (cep.length() != 8) { // Se o CEP não tiver 8 caracteres...
            throw new CEPInvalidoException(); // lance uma exceção de CEP inválido
        }
        return "12345-678";
    }
}
