public class App {
    public static void main(String[] args) {
       try {
        String cep = formatarCEP("142401400");
        System.out.println(cep);
       } catch (CepInvalidoException e) {
        System.out.println("O CEP é inválido.");
        e.printStackTrace();
       }
    }

    static String formatarCEP (String cep) throws CepInvalidoException {
        if (cep.length() != 8) { // Se o CEP não tiver exatamente 8 caracteres
            throw new CepInvalidoException();
        }
        return "14240-140";
    }
}
