import java.util.Scanner;

public class PedidoBolo {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        // Declarações de variáveis
        int escolhaRecheio, escolhaMassa, confirmMassa, confirmTopper, confirmPedido = 0;

        String recheio = null, recheioMassa = null, temaTopper = null;

        double valorKg = 60, valorTopper = 10, quantKg, valorT, valor, total = 0;
        // Declarações de variáveis

        // Introducão
        System.out.println("\n\u001B[33m" + "Olá!" + "\u001B[0m");

        System.out.println("\u001B[33m" + "Sou Edna, criadora da rede de bolos Edna Bolos, vamos fazer um pedido?" + "\u001B[0m\n");
        // Introducão

        // Tabela de preços
        do {
            System.out.println("\u001B[33m" + "-Qual será o recheio do bolo?" + "\u001B[0m\n");
            System.out.println("\u001B[33m"+ "-Opções de Recheio" +"\u001B[0m\n");
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
                                System.out.println("(20) Brigadeiro gourmet com chocolate ao leite ou amargo ");
                                 System.out.println("(21) Brigadeiro Branco");
                               System.out.println("(22) Brigadeiro Branco com abacaxi");
                                 System.out.println("(23) Brigadeiro Branco com morango ");
                                System.out.println("(24) Brigadeiro Branco com chocolate Branco");
                               System.out.println("(25) Beijinho");
                              System.out.println("(26) Prestígio");
                             System.out.println("(27) Doce de leite cremoso ");
                            System.out.println("(28) Doce de leite com ameixa ");
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
               System.out.println("(41) Dois amores( brigadeiro Branco e chocolate");
              System.out.println("(42) Sensação");
             System.out.println("(43) Floresta negra");
            System.out.println("\n\u001B[33m"+"Digite o código do bolo (Ex: 1 = Chocolate):" + "\u001B[0m");

            escolhaRecheio = input.nextInt();
            while (escolhaRecheio > 43) {
                System.out.println("Código inserido inválido! Digite novamente.");
                escolhaRecheio = input.nextInt();
            }
            switch (escolhaRecheio) {

                case 1:
                    recheio = "Chocolate";
                    break;

                case 2:
                    recheio = "Chandelle (creme de chocolate)";
                    break;

                case 3:
                    recheio = "Morango";
                    break;

                case 4:
                    recheio = "Doce de leite";
                    break;

                case 5:
                    recheio = "Mousse de Maracujá tradicional";
                    break;

                case 6:
                    recheio = "Mousse de Maracujá com pedaços de chocolate ao leite ou amargo";

                    if (escolhaRecheio == 6) {
                        System.out.printf("\nRecheio escolhido: %s\n\n", recheio);
                        System.out.println("Será com pedaços de chocolate ao (1)leite ou (2)amargo? 1/2");
                        System.out.print("Sua resposta: ");
                        int confirm = input.nextInt();
                        if (confirm == 1) {

                            recheio = "Mousse de Maracujá com pedaços de chocolate ao leite";

                        } else {
                            recheio = "Mousse de Maracujá com pedaços de chocolate Amargo";
                        }
                    }

                    break;

                case 7:

                    recheio = "Mousse de Morango tradicional";

                    break;

                case 8:

                    recheio = "Mousse de Morango com pedaços da fruta";

                    break;

                case 9:

                    recheio = "Mousse Morango com pedaços de chocolate ao leite ou amargo";

                    if (escolhaRecheio == 9) {
                        System.out.printf("\nRecheio escolhido: %s\n\n", recheio);
                        System.out.println("Será com pedaços de chocolate ao (1)leite ou (2)amargo? 1/2");
                        System.out.print("Sua resposta: ");
                        int confirm = input.nextInt();
                        if (confirm == 1) {

                            recheio = "Mousse de Morango com pedaços de Chocolate ao Leite";

                        } else {
                            recheio = "Mousse de Morango com pedaços de Chocolate Amargo";
                        }
                    }

                    break;

                case 10:

                    recheio = "Mousse de Limão tradicional com pedaços de chocolate ao leite ou amargo";
                    if (escolhaRecheio == 10) {
                        System.out.printf("\nRecheio escolhido: %s\n\n", recheio);
                        System.out.println("Será com pedaços de chocolate ao (1)leite ou (2)amargo? 1/2");
                        System.out.print("Sua resposta: ");
                        int confirm = input.nextInt();
                        if (confirm == 1) {
                            recheio = "Mousse de Limão tradicional com pedaços de Chocolate ao Leite";
                        } else if (confirm == 2) {
                            recheio = "Mousse de Limão tradicional com pedaços de Chocolate Amargo";
                        }
                        while (confirm > 2) {
                            System.out.println("Código inválido! Escreva novamente.");
                            confirm = input.nextInt();
                        }

                    }
                    break;
                case 11:
                    recheio = "Mousse de Chocolate tradicional";
                    break;
                case 12:
                    recheio = "Mousse de Chocolate com pedaços de chocolate ao leite ou amargo";
                    break;
                case 13:
                    recheio = "Mousse de Chocolate com pedaços de morango";
                    break;
                case 14:
                    recheio = "Mousse de Ninho";
                    break;
                case 15:
                    recheio = "Ninho com pedaços de morango";
                    break;
                case 16:
                    recheio = "Ninho com pedaços de chocolate ao leite ou amargo";
                    if (escolhaRecheio == 16) {
                        System.out.printf("\nRecheio escolhido: %s\n\n", recheio);
                        System.out.println("Será com pedaços de chocolate ao (1)leite ou (2)amargo? 1/2");
                        System.out.print("Sua resposta: ");
                        int confirm = input.nextInt();
                        if (confirm == 1) {
                            recheio = "Ninho com pedaços de Chocolate ao Leite";
                        } else if (confirm == 2) {
                            recheio = "Ninho com pedaços de Chocolate Amargo";
                        }
                        while (confirm > 2) {
                            System.out.println("Código inválido! Digite novamente.");
                            confirm = input.nextInt();
                        }
                    }
                    break;
                case 17:
                    recheio = "Ninho com pedaços de chocolate branco";
                    break;
                case 18:
                    recheio = "Brigadeiro Gourmet ou tradicional";
                    break;
                case 19:
                    recheio = "Brigadeiro Gourmet com morango";
                    break;
                case 20:
                    recheio = "Brigadeiro gourmet com chocolate ao leite ou amargo";
                    if (escolhaRecheio == 20) {
                        System.out.printf("\nRecheio escolhido: %s\n\n", recheio);
                        System.out.println("Será com pedaços de chocolate ao (1)leite ou (2)amargo? 1/2");
                        System.out.print("Sua resposta: ");
                        int confirm = input.nextInt();
                        if (confirm == 1) {
                            recheio = "Ninho com pedaços de Chocolate ao Leite";
                        } else if (confirm == 2) {
                            recheio = "Ninho com pedaços de Chocolate Amargo";
                        }
                        while (confirm > 2) {
                            System.out.println("Código inválido! Digite novamente.");
                            confirm = input.nextInt();
                        }
                    }
                    break;
                case 21:
                    recheio = "Brigadeiro Branco";
                    break;
                case 22:
                    recheio = "Brigadeiro Branco com abacaxi";
                    break;
                case 23:
                    recheio = "Brigadeiro Branco com morango";
                    break;
                case 24:
                    recheio = "Brigadeiro Branco com chocolate Branco";
                    break;
                case 25:
                    recheio = "Beijinho";
                    break;
                case 26:
                    recheio = "Prestígio";
                    break;
                case 27:
                    recheio = "Doce de leite cremoso";
                    break;
                case 28:
                    recheio = "Doce de leite com ameixa";
                    break;
                case 29:
                    recheio = "Doce de leite com coco";
                    break;
                case 30:
                    recheio = "Doce de leite com abacaxi";
                    break;
                case 31:
                    recheio = "Brigadeiro de Doce de leite";
                    break;
                case 32:
                    recheio = "Creme com coco";
                    break;
                case 33:
                    recheio = "Creme com abacaxi tradicional e com coco";
                    break;
                case 34:
                    recheio = "Creme com morango";
                    break;
                case 35:
                    recheio = "Creme com pêssego";
                    break;
                case 36:
                    recheio = "Brigadeiro de Paçoca";
                    break;
                case 37:
                    recheio = "Brigadeiro de morango";
                    break;
                case 38:
                    recheio = "Brigadeiro de maracujá";
                    break;
                case 39:
                    recheio = "Brigadeiro de abacaxi";
                    break;
                case 40:
                    recheio = "Brigadeiro de limão";
                    break;
                case 41:
                    recheio = "Dois amores (brigadeiro Branco e chocolate)";
                    break;
                case 42:
                    recheio = "Sensação";
                    break;
                case 43:
                    recheio = "Floresta negra";
                    break;

            }
            System.out.printf("\nO recheio escolhido é: %s\n\n", recheio);
            // Recheio do bolo

            // Sabor da Massa
            System.out.println("Qual o recheio da massa de bolo?");
            do {
                System.out.println("Opções: ");
                System.out.println("(1) Branca\n(2) Chocolate\n(3) Pão de ló");
                System.out.print("Digite a opção conforme o código da massa: ");
                escolhaMassa = input.nextInt();
                switch (escolhaMassa) {
                    case 1:
                        recheioMassa = "Branca";
                        break;
                    case 2:
                        recheioMassa = "Chocolate";
                        break;
                    case 3:
                        recheioMassa = "Pão de ló";
                        break;
                }
                while (escolhaMassa > 3 || escolhaMassa == 0) {
                    System.out.println("Código Inválido! Insira novamente.");

                    escolhaMassa = input.nextInt();
                }
                System.out.printf("\nRecheio de massa escolhida: %s\n", recheioMassa);
                System.out.println("\nConfirma a escolha?\n(1) Sim\n(2) Não");
                System.out.print("Sua resposta: ");

                confirmMassa = input.nextInt();

                while (confirmMassa > 2 || confirmMassa < 1) {
                    System.out.println("Código Inválido! Insira novamente.");
                    escolhaMassa = input.nextInt();
                }
                switch (confirmMassa) {
                    case 2:
                        System.out.println("\nOkay! Qual a massa que você deseja?\n");
                }

            } while (confirmMassa == 2);
            System.out.printf("\nRecheio da massa escolhida: %s\n\n", recheioMassa);
            // Sabor da Massa

            // Quantidade de Kg
            System.out.print("Qual a quantidade de Quilos o bolo terá? (Digite no formato 0,00).\nSua resposta: ");
            quantKg = input.nextDouble();
            System.out.printf("\nOkay! seu bolo será de %.2f KG.\n", quantKg);
            // Quantidade de Kg

            // Topper
            System.out.print("\nO bolo terá topper?\n(1) Sim\n(2) Não\nSua resposta: ");
            confirmTopper = input.nextInt();
            switch (confirmTopper) {
                case 1:
                    System.out.print("\nOkay! Qual será o tema do topper?\nSua resposta: ");
                    input.nextLine();
                    temaTopper = input.nextLine();
                    System.out.printf("\n\nO tema do topper escolhido é: %s\n\n", temaTopper);
                    break;
                case 2:
                    System.out.println("\nOkay! Seu bolo não terá topper.\n");
            }
            // Topper

            // Variáveis de calculo
            valorT = quantKg * valorKg + valorTopper;
            valor = quantKg * valorKg;
            // Variáveis de calculo

            // Informações do pedido
            System.out.println("Pedido criado! Segue o pedido montado por você.");
            System.out.printf("\nRecheio Escolhido: %s.\n", recheio);
            System.out.printf("\nRecheio da massa escolhida: %s.\n", recheioMassa);
            System.out.printf("\nQuantidade de Quilo escolhida: %.2fKG.\n", quantKg);
            switch (confirmTopper) {
                case 1:
                    System.out.printf("\nTopper confirmado. tema escolhido: %s.\n", temaTopper);
                    total = valorT;
                    break;
                case 2:
                    total = valor;
            }
            // Informações do pedido

            // Confirmação de pedido
            System.out.printf("\nSeu pedido ficou no valor de: %.2fR$.\nDeseja Confirmar/Cancelar/Refazer pedido?\n(1) Confirmar\n(2) Cancelar\n(3) Refazer\n", total);
            System.out.print("Sua resposta: ");
            confirmPedido = input.nextInt();
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

        } while (confirmPedido == 3);
        // Confirmação de pedido
    }
}