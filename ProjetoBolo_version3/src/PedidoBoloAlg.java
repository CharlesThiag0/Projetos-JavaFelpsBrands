import java.util.Scanner;
public class PedidoBoloAlg {
    public int escolhaRecheio, escolhaMassa, confirm, confirmMassa, confirmTopper, confirmPedido;
    public String recheio, recheioMassa, temaTopper;
    double quantKg, valorT, valor, total = 0;
    public Scanner input = new Scanner(System.in);

    public void recheioOpcao() {
        escolhaRecheio = input.nextInt();
        while (escolhaRecheio <= 0 || escolhaRecheio >= 44) {
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
                    confirm = input.nextInt();
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
                    confirm = input.nextInt();
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
                    confirm = input.nextInt();
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
                if (escolhaRecheio == 12) {
                    System.out.printf("\nRecheio escolhido: %s\n\n", recheio);
                    System.out.println("Será com pedaços de chocolate ao (1)leite ou (2)amargo? 1/2");
                    System.out.print("Sua resposta: ");
                    confirm = input.nextInt();
                    if (confirm == 1) {
                        recheio = "Mousse de de chocolate com pedaços de Chocolate ao Leite";
                    } else if (confirm == 2) {
                        recheio = "Mousse de de chocolate com pedaços de Chocolate Amargo";
                    }
                    while (confirm > 2) {
                        System.out.println("Código inválido! Escreva novamente.");
                        confirm = input.nextInt();
                    }

                }
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
                    confirm = input.nextInt();
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
                    confirm = input.nextInt();
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
    }

    public void saborDaMassa() {
        do {

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
                    System.out.println("\nOkay! Qual a massa que você deseja?");
                    System.out.print("Sua resposta: ");
            }

        } while (confirmMassa == 2);
        System.out.printf("\nRecheio da massa escolhida: %s\n\n", recheioMassa);
    }

    public void escolhaQuilos() {
        quantKg = input.nextDouble();
        System.out.printf("\nOkay! seu bolo será de %.2f KG.\n", quantKg);
    }

    public void escolhaTopper() {

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
    }

    public void pedidoInfo(double valorKg, double valorTopper) {
        valorT = quantKg * valorKg + valorTopper;
        valor = quantKg * valorKg;

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
        System.out.printf("\nSeu pedido ficou no valor de: %.2fR$.\n\n", total);

        }

    }
