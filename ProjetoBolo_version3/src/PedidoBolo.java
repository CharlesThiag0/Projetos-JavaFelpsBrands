import java.util.Scanner;
public class PedidoBolo {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        PedidoBoloAlg pedidoBolo = new PedidoBoloAlg();
        boolean confirm = true;

        // Introducão
        System.out.println("\n\u001B[33m" + "Olá!" + "\u001B[0m");

        System.out.println("\u001B[33m" + "Sou Edna, criadora da rede de bolos Edna Bolos, vamos fazer um pedido?"
                + "\u001B[0m\n");
        // Introducão

        // Tabela de preços

        System.out.println("\u001B[31m" + "-Tabela de preços" + "\u001B[0m\n");

        System.out.println("-Valor do Kg do bolo = R$60 ");

        System.out.println("-Valor do Topper (Adicional) = R$10\n");
        // Tabela de preços

        do{
        // Recheio do bolo
        System.out.println("\u001B[33m" + "-Qual será o recheio do bolo?" + "\u001B[0m\n");

        System.out.println("\u001B[33m" + "-Opções de Recheio" + "\u001B[0m\n");

        System.out.println("(1) Chocolate");

        System.out.println("(2) Chandelle (creme de chocolate)");

        System.out.println("(3) Morango");

        System.out.println("(4) Doce de leite");

        System.out.println("(5) Mousse de Maracujá tradicional");

        System.out.println("(6) Mousse de Maracujá com pedaços de chocolate ao leite ou amargo");

        System.out.println("(7) Mousse de Morango tradicional");

        System.out.println("(8) Mousse de Morango com pedaços da fruta");

        System.out.println("(9) Mousse Morango com pedaços de chocolate ao leite ou amargo");

        System.out.println("(10) Mousse de Limão tradicional com pedaços de chocolate ao leite ou amargo");

        System.out.println("(11) Mousse de Chocolate tradicional");

        System.out.println("(12) Mousse de Chocolate com pedaços de chocolate ao leite ou amargo");

        System.out.println("(13) Mousse de Chocolate com pedaços de morango");

        System.out.println("(14) Mousse de Ninho");

        System.out.println("(15) Ninho com pedaços de morango");

        System.out.println("(16) Ninho com pedaços de chocolate ao leite ou amargo");

        System.out.println("(17) Ninho com pedaços de chocolate branco");

        System.out.println("(18) Brigadeiro Gourmet ou tradicional");

        System.out.println("(19) Brigadeiro Gourmet com morango");

        System.out.println("(20) Brigadeiro gourmet com chocolate ao leite ou amargo");

        System.out.println("(21) Brigadeiro Branco");

        System.out.println("(22) Brigadeiro Branco com abacaxi");

        System.out.println("(23) Brigadeiro Branco com morango ");

        System.out.println("(24) Brigadeiro Branco com chocolate Branco");

        System.out.println("(25) Beijinho");

        System.out.println("(26) Prestígio");

        System.out.println("(27) Doce de leite cremoso");

        System.out.println("(28) Doce de leite com ameixa");

        System.out.println("(29) Doce de leite com coco");

        System.out.println("(30) Doce de leite com abacaxi");

        System.out.println("(31) Brigadeiro de Doce de leite");

        System.out.println("(32) Creme com coco");

        System.out.println("(33) Creme com abacaxi tradicional e com coco");

        System.out.println("(34) Creme com morango");

        System.out.println("(35) Creme com pêssego");

        System.out.println("(36) Brigadeiro de Paçoca");

        System.out.println("(37) Brigadeiro de morango");

        System.out.println("(38) Brigadeiro de maracujá");

        System.out.println("(39) Brigadeiro de abacaxi");

        System.out.println("(40) Brigadeiro de limão");

        System.out.println("(41) Dois amores(brigadeiro Branco e chocolate");

        System.out.println("(42) Sensação");

        System.out.println("(43) Floresta negra");

        System.out.print("\n\u001B[33m" + "Digite o código do bolo (Ex: 1 = Chocolate): " + "\u001B[0m");
        pedidoBolo.recheioOpcao();
        //Sabor Massa
        System.out.println("Opções: ");
        System.out.println("(1) Branca\n(2) Chocolate\n(3) Pão de ló");
        System.out.print("Digite a opção conforme o código da massa: ");
        pedidoBolo.saborDaMassa();
        // Quantidade de Kg
        System.out.print("Qual a quantidade de Quilos o bolo terá? (Digite no formato 0,00).\nSua resposta: ");
        pedidoBolo.escolhaQuilos();
        // Topper
        System.out.print("\nO bolo terá topper?\n(1) Sim\n(2) Não\nSua resposta: ");
        pedidoBolo.escolhaTopper();
        // Pedido
        System.out.println("Pedido criado! Segue o pedido montado por você.");
        pedidoBolo.pedidoInfo(60, 10);

        System.out.println("Deseja Confirmar/Cancelar/Refazer pedido?\n(1) Confirmar\n(2) Cancelar\n(3) Refazer\n");
        System.out.print("Sua resposta: ");
        int confirmPedido = input.nextInt();
        switch (confirmPedido) {
            case 1:
                System.out.println("\nPedido confirmado, obrigado pela preferência!!\n");
                break;
            case 2:
                System.out.println("\nSinto muito por qualquer transtorno, ou dificuldade em montar o pedido... Mas agradecemos, volte sempre!");
                break;
            case 3:
                System.out.println("\nOkay, refaça seu pedido!\n");
        }
        if (confirmPedido == 3){
            confirm = true;
        }else{
            confirm = false;
        }
    }while(confirm);
    }
}