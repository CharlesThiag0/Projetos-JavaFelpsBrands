import java.util.Scanner;

public class PedidoBolo {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        // Declarações de variávis
        String massa, Não, confirm2, confirm1, temaTopper = null;
        int confirm, recheio, topper, valorKg;
        double quantidadeKg, totalT, total;
        // Declarações de variávis

        // Atribuição de Variáveis
        topper = 10;
        valorKg = 60;
        // Atribuição de Variáveis

        // Introducão
        System.out.println("\n\u001B[33m" + "Olá!" + "\u001B[0m");
        System.out.println("\u001B[33m" + "Sou Edna, criadora da rede de bolos Edna Bolos, vamos fazer um pedido?"
                + "\u001B[0m\n");

        // Introducão

        // Tabela de preços
        System.out.println("\u001B[31m" + "-Tabela de preços" + "\u001B[0m\n");
        System.out.println("-Kg do bolo = R$60 ");
        System.out.println("-Valor do Topper = R$10\n");
        // Tabela de preços

        // Recheio do bolo
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
        recheio = input.nextInt();

        if (recheio == 1) {
            System.out.printf("\n\u001B[32m" + "Recheio escolhido: CHOCOLATE" + "\u001B[0m\n");
        } else if (recheio == 2) {
            System.out.printf("\n\u001B[32m" + "Recheio escolhido: CHANDELLE (CREME DE CHOCOLATE)" + "\u001B[0m\n");
        } else if (recheio == 3) {
            System.out.printf("\n\u001B[32m" + "Recheio escolhido: MORANGO" + "\u001B[0m\n");
        } else if (recheio == 4) {
            System.out.printf("\n\u001B[32m" + "Recheio escolhido: DOCE DE LEITE" + "\u001B[0m\n");
        } else if (recheio == 5) {
            System.out.printf("\n\u001B[32m" + "Recheio escolhido: MOUSSE DE MARACUJÁ TRADICIONAL" + "\u001B[0m\n");
        } else if (recheio == 6) {
            System.out.printf(
                    "\n\u001B[32m" + "Recheio escolhido: MOUSSE DE MARACUJÁ AO LEITE OU AMARGO" + "\u001B[0m\n");
        } else if (recheio == 7) {
            System.out.printf("\n\u001B[32m" + "Recheio escolhido: MOUSSE DE MORANGO TRADICIONAL" + "\u001B[0m\n");
        } else if (recheio == 8) {
            System.out.printf(
                    "\n\u001B[32m" + "Recheio escolhido: MOUSSE DE MORANGO COM PEDAÇOS DE FRUTA" + "\u001B[0m\n");
        } else if (recheio == 9) {
            System.out.printf(
                    "\n\u001B[32m" + "Recheio escolhido: MOUSSE DE MORANGO COM PEDAÇOS DE CHOCOLATE" + "\u001B[0m\n");
        } else if (recheio == 10) {
            System.out.printf("\n\u001B[32m"
                    + "Recheio escolhido: MOUSSE DE LIMÃO TRADICIONAL COM PEDAÇOS DE CHOCOLATE AO LEITE/AMARGO"
                    + "\u001B[0m\n");
        } else if (recheio == 11) {
            System.out.printf("\n\u001B[32m" + "Recheio escolhido: MOUSSE DE CHOCOLATE TRADICIONAL" + "\u001B[0m\n");
        } else if (recheio == 12) {
            System.out.printf(
                    "\n\u001B[32m" + "Recheio escolhido: MOUSSE DE CHOCOLATE COM PEDAÇOS DE CHOCOLATE AO LEITE/AMARGO"
                            + "\u001B[0m\n");
        } else if (recheio == 13) {
            System.out.printf(
                    "\n\u001B[32m" + "Recheio escolhido: MOUSSE DE CHOCOLATE COM PEDAÇOS DE MORANGO" + "\u001B[0m\n");
        } else if (recheio == 14) {
            System.out.printf("\n\u001B[32m" + "Recheio escolhido: MOUSSE DE NINHO" + "\u001B[0m\n");
        } else if (recheio == 15) {
            System.out.printf("\n\u001B[32m" + "Recheio escolhido: NINHO COM PEDAÇO DE MORANGO" + "\u001B[0m\n");
        } else if (recheio == 16) {
            System.out.printf("\n\u001B[32m" + "Recheio escolhido: NINHO COM PEDAÇO DE CHOCOLATE AO LEITE OU AMARGO"
                    + "\u001B[0m\n");
        } else if (recheio == 17) {
            System.out
                    .printf("\n\u001B[32m" + "Recheio escolhido: NINHO COM PEDAÇO DE CHOCOLATE BRANCO" + "\u001B[0m\n");
        } else if (recheio == 18) {
            System.out.printf("\n\u001B[32m" + "Recheio escolhido: BRIGADEIRO GOURMET OU TRADICIONAL" + "\u001B[0m\n");
        } else if (recheio == 19) {
            System.out.printf("\n\u001B[32m" + "Recheio escolhido: BRIGADEIRO GOURMET COM MORANGO" + "\u001B[0m\n");
        } else if (recheio == 20) {
            System.out.printf("\n\u001B[32m" + "Recheio escolhido: BRIGADEIRO GOURMET COM CHOCOLATE AO LEITE OU AMARGO"
                    + "\u001B[0m\n");
        } else if (recheio == 21) {
            System.out.printf("\n\u001B[32m" + "Recheio escolhido: BRIGADEIRO BRANCO" + "\u001B[0m\n");
        } else if (recheio == 22) {
            System.out.printf("\n\u001B[32m" + "Recheio escolhido: BRIGADEIRO BRANCO COM ABACAXI" + "\u001B[0m\n");
        } else if (recheio == 23) {
            System.out.printf("\n\u001B[32m" + "Recheio escolhido: BRIGADEIRO BRANCO COM MORANGO" + "\u001B[0m\n");
        } else if (recheio == 24) {
            System.out.printf(
                    "\n\u001B[32m" + "Recheio escolhido: BRIGADEIRO BRANCO COM CHOCOLATE BRANCO" + "\u001B[0m\n");
        } else if (recheio == 25) {
            System.out.printf("\n\u001B[32m" + "Recheio escolhido: BEIJINHO" + "\u001B[0m\n");
        } else if (recheio == 26) {
            System.out.printf("\n\u001B[32m" + "Recheio escolhido: PRESTÍGIO" + "\u001B[0m\n");
        } else if (recheio == 27) {
            System.out.printf("\n\u001B[32m" + "Recheio escolhido: DOCE DE LEITE CREMOSO" + "\u001B[0m\n");
        } else if (recheio == 28) {
            System.out.printf("\n\u001B[32m" + "Recheio escolhido: DOCE DE LEITE COM AMEIXA" + "\u001B[0m\n");
        } else if (recheio == 29) {
            System.out.printf("\n\u001B[32m" + "Recheio escolhido: DOCE DE LEITE COM COCO" + "\u001B[0m\n");
        } else if (recheio == 30) {
            System.out.printf("\n\u001B[32m" + "Recheio escolhido: DOCE DE LEITE COM ABACAXI" + "\u001B[0m\n");
        } else if (recheio == 31) {
            System.out.printf("\n\u001B[32m" + "Recheio escolhido: BRIGADEIRO DE DOCE DE LEITE" + "\u001B[0m\n");
        } else if (recheio == 32) {
            System.out.printf("\n\u001B[32m" + "Recheio escolhido: CREME COM COCO" + "\u001B[0m\n");
        } else if (recheio == 33) {
            System.out.printf(
                    "\n\u001B[32m" + "Recheio escolhido: CREME COM ABACAXI TRADICIONAL E COM COCO" + "\u001B[0m\n");
        } else if (recheio == 34) {
            System.out.printf("\n\u001B[32m" + "Recheio escolhido: CREME COM MORANGO" + "\u001B[0m\n");
        } else if (recheio == 35) {
            System.out.printf("\n\u001B[32m" + "Recheio escolhido: CREME COM PÊSSEGO" + "\u001B[0m\n");
        } else if (recheio == 36) {
            System.out.printf("\n\u001B[32m" + "Recheio escolhido: BRIGADEIRO DE PAÇOCA" + "\u001B[0m\n");
        } else if (recheio == 37) {
            System.out.printf("\n\u001B[32m" + "Recheio escolhido: BRIGADEIRO DE MORANGO" + "\u001B[0m\n");
        } else if (recheio == 38) {
            System.out.printf("\n\u001B[32m" + "Recheio escolhido: BRIGADEIRO DE MARACUJÁ" + "\u001B[0m\n");
        } else if (recheio == 39) {
            System.out.printf("\n\u001B[32m" + "Recheio escolhido: BRIGADEIRO DE ABACAXI" + "\u001B[0m\n");
        } else if (recheio == 40) {
            System.out.printf("\n\u001B[32m" + "Recheio escolhido: BRIGADEIRO DE LIMÃO" + "\u001B[0m\n");
        } else if (recheio == 41) {
            System.out.printf(
                    "\n\u001B[32m" + "Recheio escolhido: DOIS AMORES (BRIGADEIRO BRANCO E CHOCOLATE)" + "\u001B[0m\n");
        } else if (recheio == 42) {
            System.out.printf("\n\u001B[32m" + "Recheio escolhido: SENSAÇÃO" + "\u001B[0m\n");
        } else if (recheio == 43) {
            System.out.printf("\n\u001B[32m" + "Recheio escolhido: FLORESTA NEGRA" + "\u001B[0m\n");
        }
        // Recheio do bolo

        // Sabor da Massa
        System.out.println("\n\u001B[33m" + "Qual será a massa do bolo?" + "\u001B[0m");
        System.out.println("\n\u001B[33m" + "Opções de massas" + "\u001B[0m");
        System.out.println("Branca");
        System.out.println("Pão de ló");
        System.out.println("Chocolate");
        System.out.println("\n\u001B[33m" + "Digite o sabor." + "\u001B[0m");
        confirm1 = input.next();

        if (confirm1.equalsIgnoreCase("Branca")) {
            System.out.printf("\n\u001B[32m" + "Ok! Sua massa será Branca." + "\u001B[0m\n");
        } else if (confirm1.equalsIgnoreCase("Chocolate")) {
            System.out.printf("\n\u001B[32m" + "Ok! Sua massa será Chocolate" + "\u001B[0m\n");
        } else {
            System.out.printf("\n\u001B[32m" + "Ok! Sua massa será Pão de ló." + "\u001B[0m\n");
        }
        // Sabor da Massa

        // Quantidade de Kg
        System.out.println("\n\u001B[33m" + "Digite Quantos Kg no formato= 0,00" + "\u001B[0m");
        quantidadeKg = input.nextDouble();
        System.out.printf("\n\u001B[32m" + "Ok! seu bolo será de = %.2f" + "\u001B[0m\n", quantidadeKg);
        // Quantidade de Kg

        // Topper
        System.out.println("\nSerá com topper? (Confirme com SIM(1) ou NãO(2))");
        confirm = input.nextInt();

        if (confirm == 1) {
            System.out.println("\n\u001B[32m" + "Ok! Será com Topper." + "\u001B[0m\n");
            System.out.println("\u001B[33m" + "Qual o tema do topper? Digite o tema." + "\u001B[0m");
            temaTopper = input.nextLine();
            System.out.format("\n\u001B[32m" + "Ok! Seu topper será do = %s" + "\u001B[0m\n", temaTopper);
        } else {
            System.out.println("\n\u001B[32m" + "Ok! não terá Topper." + "\u001B[0m\n");
        }
        // Topper

        // Variáveis de soma
        totalT = (quantidadeKg * valorKg) + topper;
        total = (quantidadeKg * valorKg);
        // Variáveis de soma

        // Informações do pedido
        if (confirm == 1 && recheio == 1) {
            System.out.printf("\nSeu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: CHOCOLATE" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", totalT);
        } else if (confirm == 2 && recheio == 1) {
            System.out.printf("\nSeu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: CHOCOLATE" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", total);
        } else if (confirm == 1 && recheio == 2) {
            System.out.printf("Seu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: CHANDELLE (CREME DE CHOCOLATE)" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", totalT);
        } else if (confirm == 2 && recheio == 2) {
            System.out.printf("\nSeu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: CHANDELLE (CREME DE CHOCOLATE)" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", total);
        } else if (confirm == 1 && recheio == 3) {
            System.out.printf("Seu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: MORANGO" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", totalT);
        } else if (confirm == 2 && recheio == 3) {
            System.out.printf("\nSeu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: MORANGO" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", total);
        } else if (confirm == 1 && recheio == 4) {
            System.out.printf("Seu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: DOCE DE LEITE" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", totalT);
        } else if (confirm == 2 && recheio == 4) {
            System.out.printf("\nSeu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: DOCE DE LEITE" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", total);
        } else if (confirm == 1 && recheio == 5) {
            System.out.printf("Seu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: MOUSSE DE MARACUJÁ TRADICIONAL" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", totalT);
        } else if (confirm == 2 && recheio == 5) {
            System.out.printf("\nSeu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: MOUSSE DE MARACUJÁ TRADICIONAL" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", total);
        } else if (confirm == 1 && recheio == 6) {
            System.out.printf("Seu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: MOUSSE DE MARACUJÁ AO LEITE OU AMARGO" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", totalT);
        } else if (confirm == 2 && recheio == 6) {
            System.out.printf("\nSeu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: MOUSSE DE MARACUJÁ AO LEITE OU AMARGO" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", total);
        } else if (confirm == 1 && recheio == 7) {
            System.out.printf("Seu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: MOUSSE DE MORANGO TRADICIONAL" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", totalT);
        } else if (confirm == 2 && recheio == 7) {
            System.out.printf("\nSeu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: MOUSSE DE MORANGO TRADICIONAL" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", total);
        } else if (confirm == 1 && recheio == 8) {
            System.out.printf("\nSeu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: MOUSSE DE MORANGO COM PEDAÇOS DE FRUTA" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", totalT);
        } else if (confirm == 2 && recheio == 8) {
            System.out.printf("\nSeu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: MOUSSE DE MORANGO COM PEDAÇOS DE FRUTA" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", total);
        } else if (confirm == 1 && recheio == 9) {
            System.out.printf("Seu pedido é:\n");
            System.out
                    .format("\n\u001B[33m" + "Recheio de: MOUSSE DE MORANGO COM PEDAÇOS DE CHOCOLATE" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", totalT);
        } else if (confirm == 2 && recheio == 9) {
            System.out.printf("\nSeu pedido é:\n");
            System.out
                    .format("\n\u001B[33m" + "Recheio de: MOUSSE DE MORANGO COM PEDAÇOS DE CHOCOLATE" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", total);
        } else if (confirm == 1 && recheio == 10) {
            System.out.printf("Seu pedido é:\n");
            System.out.format(
                    "\n\u001B[33m" + "Recheio de: MOUSSE DE LIMÃO TRADICIONAL COM PEDAÇOS DE CHOCOLATE AO LEITE/AMARGO"
                            + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", totalT);
        } else if (confirm == 2 && recheio == 10) {
            System.out.printf("\nSeu pedido é:\n");
            System.out.format(
                    "\n\u001B[33m" + "Recheio de: MOUSSE DE LIMÃO TRADICIONAL COM PEDAÇOS DE CHOCOLATE AO LEITE/AMARGO"
                            + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", total);
        } else if (confirm == 1 && recheio == 11) {
            System.out.printf("Seu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: MOUSSE DE CHOCOLATE TRADICIONAL" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", totalT);
        } else if (confirm == 2 && recheio == 11) {
            System.out.printf("\nSeu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: MOUSSE DE CHOCOLATE TRADICIONAL" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", total);
        } else if (confirm == 1 && recheio == 12) {
            System.out.printf("Seu pedido é:\n");
            System.out.format("\n\u001B[33m"
                    + "Recheio de: MOUSSE DE CHOCOLATE COM PEDAÇOS DE CHOCOLATE AO LEITE/AMARGO" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", totalT);
        } else if (confirm == 2 && recheio == 12) {
            System.out.printf("\nSeu pedido é:\n");
            System.out.format("\n\u001B[33m"
                    + "Recheio de: MOUSSE DE CHOCOLATE COM PEDAÇOS DE CHOCOLATE AO LEITE/AMARGO" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", total);
        } else if (confirm == 1 && recheio == 13) {
            System.out.printf("Seu pedido é:\n");
            System.out
                    .format("\n\u001B[33m" + "Recheio de: MOUSSE DE CHOCOLATE COM PEDAÇOS DE MORANGO" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", totalT);
        } else if (confirm == 2 && recheio == 13) {
            System.out.printf("\nSeu pedido é:\n");
            System.out
                    .format("\n\u001B[33m" + "Recheio de: MOUSSE DE CHOCOLATE COM PEDAÇOS DE MORANGO" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", total);
        } else if (confirm == 1 && recheio == 14) {
            System.out.printf("Seu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio escolhido: MOUSSE DE NINHO" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", totalT);
        } else if (confirm == 2 && recheio == 14) {
            System.out.printf("\nSeu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio escolhido: MOUSSE DE NINHO" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", total);
        } else if (confirm == 1 && recheio == 15) {
            System.out.printf("Seu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio escolhido: NINHO COM PEDAÇO DE MORANGO" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", totalT);
        } else if (confirm == 2 && recheio == 15) {
            System.out.printf("\nSeu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio escolhido: NINHO COM PEDAÇO DE MORANGO" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", total);
        } else if (confirm == 1 && recheio == 16) {
            System.out.printf("\nSeu pedido é:\n");
            System.out.format(
                    "\n\u001B[33m" + "Recheio de: NINHO COM PEDAÇO DE CHOCOLATE AO LEITE OU AMARGO" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", totalT);
        } else if (confirm == 2 && recheio == 16) {
            System.out.printf("\nSeu pedido é:\n");
            System.out.format(
                    "\n\u001B[33m" + "Recheio de: NINHO COM PEDAÇO DE CHOCOLATE AO LEITE OU AMARGO" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", total);
        } else if (confirm == 1 && recheio == 17) {
            System.out.printf("Seu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: NINHO COM PEDAÇO DE CHOCOLATE BRANCO" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", totalT);
        } else if (confirm == 2 && recheio == 17) {
            System.out.printf("\nSeu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: NINHO COM PEDAÇO DE CHOCOLATE BRANCO" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", total);
        } else if (confirm == 1 && recheio == 18) {
            System.out.printf("Seu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO GOURMET OU TRADICIONAL" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", totalT);
        } else if (confirm == 2 && recheio == 18) {
            System.out.printf("\nSeu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO GOURMET OU TRADICIONAL" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", total);
        } else if (confirm == 1 && recheio == 19) {
            System.out.printf("Seu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO GOURMET COM MORANGO" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", totalT);
        } else if (confirm == 2 && recheio == 19) {
            System.out.printf("\nSeu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO GOURMET COM MORANGO" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", total);
        } else if (confirm == 1 && recheio == 20) {
            System.out.printf("Seu pedido é:\n");
            System.out.format(
                    "\n\u001B[33m" + "Recheio de: BRIGADEIRO GOURMET COM CHOCOLATE AO LEITE OU AMARGO" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", totalT);
        } else if (confirm == 2 && recheio == 20) {
            System.out.printf("\nSeu pedido é:\n");
            System.out.format(
                    "\n\u001B[33m" + "Recheio de: BRIGADEIRO GOURMET COM CHOCOLATE AO LEITE OU AMARGO" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", total);
        } else if (confirm == 1 && recheio == 21) {
            System.out.printf("Seu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO BRANCO" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", totalT);
        } else if (confirm == 2 && recheio == 21) {
            System.out.printf("\nSeu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO BRANCO" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", total);
        } else if (confirm == 1 && recheio == 22) {
            System.out.printf("Seu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO BRANCO COM ABACAXI" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", totalT);
        } else if (confirm == 2 && recheio == 22) {
            System.out.printf("\nSeu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO BRANCO COM ABACAXI" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", total);
        } else if (confirm == 1 && recheio == 23) {
            System.out.printf("Seu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO BRANCO COM MORANGO" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", totalT);
        } else if (confirm == 2 && recheio == 23) {
            System.out.printf("\nSeu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO BRANCO COM MORANGO" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", total);
        } else if (confirm == 1 && recheio == 24) {
            System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO BRANCO COM CHOCOLATE BRANCO" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", totalT);
        } else if (confirm == 2 && recheio == 24) {
            System.out.printf("\nSeu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO BRANCO COM CHOCOLATE BRANCO" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", total);
        } else if (confirm == 1 && recheio == 25) {
            System.out.printf("Seu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: BEIJINHO" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", totalT);
        } else if (confirm == 2 && recheio == 25) {
            System.out.printf("\nSeu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: BEIJINHO" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", total);
        } else if (confirm == 1 && recheio == 26) {
            System.out.printf("Seu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: PRESTÍGIO" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", totalT);
        } else if (confirm == 2 && recheio == 26) {
            System.out.printf("\nSeu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: PRESTÍGIO" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", total);
        } else if (confirm == 1 && recheio == 27) {
            System.out.printf("Seu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: DOCE DE LEITE CREMOSO" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", totalT);
        } else if (confirm == 2 && recheio == 27) {
            System.out.printf("\nSeu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: DOCE DE LEITE CREMOSO" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", total);
        } else if (confirm == 1 && recheio == 28) {
            System.out.printf("Seu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: DOCE DE LEITE COM AMEIXA" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", totalT);
        } else if (confirm == 2 && recheio == 28) {
            System.out.printf("\nSeu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: DOCE DE LEITE COM AMEIXA" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", total);
        } else if (confirm == 1 && recheio == 29) {
            System.out.printf("Seu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: DOCE DE LEITE COM COCO" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", totalT);
        } else if (confirm == 2 && recheio == 29) {
            System.out.printf("\nSeu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: DOCE DE LEITE COM COCO" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", total);
        } else if (confirm == 1 && recheio == 30) {
            System.out.printf("Seu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: DOCE DE LEITE COM ABACAXI" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", totalT);
        } else if (confirm == 2 && recheio == 30) {
            System.out.printf("\nSeu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: DOCE DE LEITE COM ABACAXI" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", total);
        } else if (confirm == 1 && recheio == 31) {
            System.out.printf("Seu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO DE DOCE DE LEITE" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", totalT);
        } else if (confirm == 2 && recheio == 31) {
            System.out.printf("\nSeu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO DE DOCE DE LEITE" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", total);
        } else if (confirm == 1 && recheio == 32) {
            System.out.printf("\nSeu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: CREME COM COCO" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", totalT);
        } else if (confirm == 2 && recheio == 32) {
            System.out.printf("\nSeu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: CREME COM COCO" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", total);
        } else if (confirm == 1 && recheio == 33) {
            System.out.printf("Seu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: CREME COM ABACAXI TRADICIONAL E COM COCO" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", totalT);
        } else if (confirm == 2 && recheio == 33) {
            System.out.printf("\nSeu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: CREME COM ABACAXI TRADICIONAL E COM COCO" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", total);
        } else if (confirm == 1 && recheio == 34) {
            System.out.printf("Seu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: CREME COM MORANGO" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", totalT);
        } else if (confirm == 2 && recheio == 34) {
            System.out.printf("\nSeu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: CREME COM MORANGO" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", total);
        } else if (confirm == 1 && recheio == 35) {
            System.out.printf("Seu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: CREME COM PÊSSEGO" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", totalT);
        } else if (confirm == 2 && recheio == 35) {
            System.out.printf("\nSeu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: CREME COM PÊSSEGO" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", total);
        } else if (confirm == 1 && recheio == 36) {
            System.out.printf("Seu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO DE PAÇOCA" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", totalT);
        } else if (confirm == 2 && recheio == 36) {
            System.out.printf("\nSeu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO DE PAÇOCA" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", total);
        } else if (confirm == 1 && recheio == 37) {
            System.out.printf("Seu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO DE MORANGO" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", totalT);
        } else if (confirm == 2 && recheio == 37) {
            System.out.printf("\nSeu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO DE MORANGO" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", total);
        } else if (confirm == 1 && recheio == 38) {
            System.out.printf("Seu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO DE MARACUJÁ" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", totalT);
        } else if (confirm == 2 && recheio == 38) {
            System.out.printf("\nSeu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO DE MARACUJÁ" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", total);
        } else if (confirm == 1 && recheio == 39) {
            System.out.printf("Seu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO DE ABACAXI" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", totalT);
        } else if (confirm == 2 && recheio == 39) {
            System.out.printf("\nSeu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO DE ABACAXI" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", total);
        } else if (confirm == 1 && recheio == 40) {
            System.out.printf("\nSeu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO DE LIMÃO" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", totalT);
        } else if (confirm == 2 && recheio == 40) {
            System.out.printf("\nSeu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO DE LIMÃO" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", total);
        } else if (confirm == 1 && recheio == 41) {
            System.out.printf("Seu pedido é:\n");
            System.out
                    .format("\n\u001B[33m" + "Recheio de: DOIS AMORES (BRIGADEIRO BRANCO E CHOCOLATE)" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", totalT);
        } else if (confirm == 2 && recheio == 41) {
            System.out.printf("\nSeu pedido é:\n");
            System.out
                    .format("\n\u001B[33m" + "Recheio de: DOIS AMORES (BRIGADEIRO BRANCO E CHOCOLATE)" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", total);
        } else if (confirm == 1 && recheio == 42) {
            System.out.printf("Seu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: SENSAÇÃO" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", totalT);
        } else if (confirm == 2 && recheio == 42) {
            System.out.printf("\nSeu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: SENSAÇÃO" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", total);
        } else if (confirm == 1 && recheio == 43) {
            System.out.printf("\nSeu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: FLORESTA NEGRA" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", total);
        } else if (confirm == 2 && recheio == 43) {
            System.out.printf("\nSeu pedido é:\n");
            System.out.format("\n\u001B[33m" + "Recheio de: FLORESTA NEGRA" + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
            System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
            System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
            System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n", total);
        }
        // Informações do pedido

        // Confirmação de pedido
        System.out.println("\n\u001B[32m" + "Confirma o pedido?" + "\u001B[0m\n");
        System.out.println("(Digite Sim para confirma, Cancelar (Para cancelar) e não para refazer o pedido.)");
        confirm2 = input.next();

        if (confirm2.equalsIgnoreCase("Sim")) {
            System.out.println("\n\u001B[32m" + "Seu pedido está finalizado, e será preparado." + "\u001B[0m\n");
            System.out.println("Obrigada pela confiança!\n");
        } else if (confirm2.equalsIgnoreCase("Cancelar")) {
            System.out.println("\n\u001B[32m" + "Tem certeza de quer cancelar?" + "\u001B[0m");
            String Confirmar;
            Confirmar = input.next();
            if (Confirmar.equalsIgnoreCase("Sim")) {
                System.out.println("Ok, pedido cancelado");
            } else if (confirm2.equalsIgnoreCase("Não")) {
                System.out.println("\nOk! refaça o seu pedio.\n");
                // Confirmação de pedido

                // Tabela de preços 3
                System.out.println("\u001B[31m" + "-Tabela de preços" + "\u001B[0m\n");
                System.out.println("-Kg do bolo = R$60 ");
                System.out.println("-Valor do Topper = R$10\n");
                // Tabela de preços 3

                // Recheio do bolo 3
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
                System.out.println("\n\u001B[33m" + "Digite o código do bolo (Ex: 1 = Chocolate):" + "\u001B[0m");
                recheio = input.nextInt();

                if (recheio == 1) {
                    System.out.printf("\n\u001B[32m" + "Recheio escolhido: CHOCOLATE" + "\u001B[0m\n");

                } else if (recheio == 2) {
                    System.out.printf(
                            "\n\u001B[32m" + "Recheio escolhido: CHANDELLE (CREME DE CHOCOLATE)" + "\u001B[0m\n");
                } else if (recheio == 3) {
                    System.out.printf("\n\u001B[32m" + "Recheio escolhido: MORANGO" + "\u001B[0m\n");
                } else if (recheio == 4) {
                    System.out.printf("\n\u001B[32m" + "Recheio escolhido: DOCE DE LEITE" + "\u001B[0m\n");
                } else if (recheio == 5) {
                    System.out.printf(
                            "\n\u001B[32m" + "Recheio escolhido: MOUSSE DE MARACUJÁ TRADICIONAL" + "\u001B[0m\n");
                } else if (recheio == 6) {
                    System.out.printf("\n\u001B[32m" + "Recheio escolhido: MOUSSE DE MARACUJÁ AO LEITE OU AMARGO"
                            + "\u001B[0m\n");
                } else if (recheio == 7) {
                    System.out.printf(
                            "\n\u001B[32m" + "Recheio escolhido: MOUSSE DE MORANGO TRADICIONAL" + "\u001B[0m\n");
                } else if (recheio == 8) {
                    System.out.printf("\n\u001B[32m" + "Recheio escolhido: MOUSSE DE MORANGO COM PEDAÇOS DE FRUTA"
                            + "\u001B[0m\n");
                } else if (recheio == 9) {
                    System.out.printf("\n\u001B[32m" + "Recheio escolhido: MOUSSE DE MORANGO COM PEDAÇOS DE CHOCOLATE"
                            + "\u001B[0m\n");
                } else if (recheio == 10) {
                    System.out.printf("\n\u001B[32m"
                            + "Recheio escolhido: MOUSSE DE LIMÃO TRADICIONAL COM PEDAÇOS DE CHOCOLATE AO LEITE/AMARGO"
                            + "\u001B[0m\n");
                } else if (recheio == 11) {
                    System.out.printf(
                            "\n\u001B[32m" + "Recheio escolhido: MOUSSE DE CHOCOLATE TRADICIONAL" + "\u001B[0m\n");
                } else if (recheio == 12) {
                    System.out.printf("\n\u001B[32m"
                            + "Recheio escolhido: MOUSSE DE CHOCOLATE COM PEDAÇOS DE CHOCOLATE AO LEITE/AMARGO"
                            + "\u001B[0m\n");
                } else if (recheio == 13) {
                    System.out.printf("\n\u001B[32m" + "Recheio escolhido: MOUSSE DE CHOCOLATE COM PEDAÇOS DE MORANGO"
                            + "\u001B[0m\n");
                } else if (recheio == 14) {
                    System.out.printf("\n\u001B[32m" + "Recheio escolhido: MOUSSE DE NINHO" + "\u001B[0m\n");
                } else if (recheio == 15) {
                    System.out
                            .printf("\n\u001B[32m" + "Recheio escolhido: NINHO COM PEDAÇO DE MORANGO" + "\u001B[0m\n");
                } else if (recheio == 16) {
                    System.out.printf("\n\u001B[32m"
                            + "Recheio escolhido: NINHO COM PEDAÇO DE CHOCOLATE AO LEITE OU AMARGO" + "\u001B[0m\n");
                } else if (recheio == 17) {
                    System.out.printf(
                            "\n\u001B[32m" + "Recheio escolhido: NINHO COM PEDAÇO DE CHOCOLATE BRANCO" + "\u001B[0m\n");
                } else if (recheio == 18) {
                    System.out.printf(
                            "\n\u001B[32m" + "Recheio escolhido: BRIGADEIRO GOURMET OU TRADICIONAL" + "\u001B[0m\n");
                } else if (recheio == 19) {
                    System.out.printf(
                            "\n\u001B[32m" + "Recheio escolhido: BRIGADEIRO GOURMET COM MORANGO" + "\u001B[0m\n");
                } else if (recheio == 20) {
                    System.out.printf("\n\u001B[32m"
                            + "Recheio escolhido: BRIGADEIRO GOURMET COM CHOCOLATE AO LEITE OU AMARGO" + "\u001B[0m\n");
                } else if (recheio == 21) {
                    System.out.printf("\n\u001B[32m" + "Recheio escolhido: BRIGADEIRO BRANCO" + "\u001B[0m\n");
                } else if (recheio == 22) {
                    System.out.printf(
                            "\n\u001B[32m" + "Recheio escolhido: BRIGADEIRO BRANCO COM ABACAXI" + "\u001B[0m\n");
                } else if (recheio == 23) {
                    System.out.printf(
                            "\n\u001B[32m" + "Recheio escolhido: BRIGADEIRO BRANCO COM MORANGO" + "\u001B[0m\n");
                } else if (recheio == 24) {
                    System.out.printf("\n\u001B[32m" + "Recheio escolhido: BRIGADEIRO BRANCO COM CHOCOLATE BRANCO"
                            + "\u001B[0m\n");
                } else if (recheio == 25) {
                    System.out.printf("\n\u001B[32m" + "Recheio escolhido: BEIJINHO" + "\u001B[0m\n");
                } else if (recheio == 26) {
                    System.out.printf("\n\u001B[32m" + "Recheio escolhido: PRESTÍGIO" + "\u001B[0m\n");
                } else if (recheio == 27) {
                    System.out.printf("\n\u001B[32m" + "Recheio escolhido: DOCE DE LEITE CREMOSO" + "\u001B[0m\n");
                } else if (recheio == 28) {
                    System.out.printf("\n\u001B[32m" + "Recheio escolhido: DOCE DE LEITE COM AMEIXA" + "\u001B[0m\n");
                } else if (recheio == 29) {
                    System.out.printf("\n\u001B[32m" + "Recheio escolhido: DOCE DE LEITE COM COCO" + "\u001B[0m\n");
                } else if (recheio == 30) {
                    System.out.printf("\n\u001B[32m" + "Recheio escolhido: DOCE DE LEITE COM ABACAXI" + "\u001B[0m\n");
                } else if (recheio == 31) {
                    System.out
                            .printf("\n\u001B[32m" + "Recheio escolhido: BRIGADEIRO DE DOCE DE LEITE" + "\u001B[0m\n");
                } else if (recheio == 32) {
                    System.out.printf("\n\u001B[32m" + "Recheio escolhido: CREME COM COCO" + "\u001B[0m\n");
                } else if (recheio == 33) {
                    System.out.printf("\n\u001B[32m" + "Recheio escolhido: CREME COM ABACAXI TRADICIONAL E COM COCO"
                            + "\u001B[0m\n");
                } else if (recheio == 34) {
                    System.out.printf("\n\u001B[32m" + "Recheio escolhido: CREME COM MORANGO" + "\u001B[0m\n");
                } else if (recheio == 35) {
                    System.out.printf("\n\u001B[32m" + "Recheio escolhido: CREME COM PÊSSEGO" + "\u001B[0m\n");
                } else if (recheio == 36) {
                    System.out.printf("\n\u001B[32m" + "Recheio escolhido: BRIGADEIRO DE PAÇOCA" + "\u001B[0m\n");
                } else if (recheio == 37) {
                    System.out.printf("\n\u001B[32m" + "Recheio escolhido: BRIGADEIRO DE MORANGO" + "\u001B[0m\n");
                } else if (recheio == 38) {
                    System.out.printf("\n\u001B[32m" + "Recheio escolhido: BRIGADEIRO DE MARACUJÁ" + "\u001B[0m\n");
                } else if (recheio == 39) {
                    System.out.printf("\n\u001B[32m" + "Recheio escolhido: BRIGADEIRO DE ABACAXI" + "\u001B[0m\n");
                } else if (recheio == 40) {
                    System.out.printf("\n\u001B[32m" + "Recheio escolhido: BRIGADEIRO DE LIMÃO" + "\u001B[0m\n");
                } else if (recheio == 41) {
                    System.out.printf("\n\u001B[32m" + "Recheio escolhido: DOIS AMORES (BRIGADEIRO BRANCO E CHOCOLATE)"
                            + "\u001B[0m\n");
                } else if (recheio == 42) {
                    System.out.printf("\n\u001B[32m" + "Recheio escolhido: SENSAÇÃO" + "\u001B[0m\n");
                } else if (recheio == 43) {
                    System.out.printf("\n\u001B[32m" + "Recheio escolhido: FLORESTA NEGRA" + "\u001B[0m\n");
                }
                // Recheio do bolo 3

                // Sabor da Massa 3
                System.out.println("\n\u001B[33m" + "Qual será a massa do bolo?" + "\u001B[0m");
                System.out.println("\n\u001B[33m" + "Opções de massas" + "\u001B[0m");
                System.out.println("Branca");
                System.out.println("Pão de ló");
                System.out.println("Chocolate");
                System.out.println("\n\u001B[33m" + "Digite o sabor." + "\u001B[0m");
                confirm1 = input.next();

                if (confirm1.equalsIgnoreCase("Branca")) {
                    System.out.printf("\n\u001B[32m" + "Ok! Sua massa será Branca." + "\u001B[0m\n");
                } else if (confirm1.equalsIgnoreCase("Chocolate")) {
                    System.out.printf("\n\u001B[32m" + "Ok! Sua massa será Chocolate" + "\u001B[0m\n");
                } else {
                    System.out.printf("\n\u001B[32m" + "Ok! Sua massa será Pão de ló." + "\u001B[0m\n");
                }
                // Sabor da Massa 3

                // Quantidade de Kg 3
                System.out.println("\n\u001B[33m" + "Digite Quantos Kg no formato= 0,00" + "\u001B[0m");
                quantidadeKg = input.nextDouble();
                System.out.printf("\n\u001B[32m" + "Ok! seu bolo será de = %.2f" + "\u001B[0m\n", quantidadeKg);
                // Quantidade de Kg 3

                // Topper 3
                System.out.println("\nSerá com topper? (confirme com SIM(1) ou NãO(2)");
                confirm = input.nextInt();

                if (confirm == 1) {
                    System.out.println("\n\u001B[32m" + "Ok! Será com Topper." + "\u001B[0m\n");
                    System.out.println("\u001B[33m" + "Qual o tema do topper? Digite o tema." + "\u001B[0m");
                    temaTopper = input.next();
                    System.out.format("\n\u001B[32m" + "Ok! Seu topper será do = %s" + "\u001B[0m\n", temaTopper);
                } else {
                    System.out.println("\n\u001B[32m" + "Ok! não terá Topper." + "\u001B[0m\n");
                }
                // Topper 3

                // Variáveis de soma 3
                totalT = (quantidadeKg * valorKg) + topper;
                total = (quantidadeKg * valorKg);
                // Variáveis de soma 3

                // Informações do pedido 3
                if (confirm == 1 && recheio == 1) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: CHOCOLATE" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 1) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: CHOCOLATE" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 2) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: CHANDELLE (CREME DE CHOCOLATE)" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 2) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: CHANDELLE (CREME DE CHOCOLATE)" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 3) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: MORANGO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 3) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: MORANGO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 4) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: DOCE DE LEITE" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 4) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: DOCE DE LEITE" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 5) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: MOUSSE DE MARACUJÁ TRADICIONAL" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 5) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: MOUSSE DE MARACUJÁ TRADICIONAL" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 6) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format(
                            "\n\u001B[33m" + "Recheio de: MOUSSE DE MARACUJÁ AO LEITE OU AMARGO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 6) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format(
                            "\n\u001B[33m" + "Recheio de: MOUSSE DE MARACUJÁ AO LEITE OU AMARGO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 7) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: MOUSSE DE MORANGO TRADICIONAL" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 7) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: MOUSSE DE MORANGO TRADICIONAL" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 8) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format(
                            "\n\u001B[33m" + "Recheio de: MOUSSE DE MORANGO COM PEDAÇOS DE FRUTA" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 8) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format(
                            "\n\u001B[33m" + "Recheio de: MOUSSE DE MORANGO COM PEDAÇOS DE FRUTA" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 9) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format(
                            "\n\u001B[33m" + "Recheio de: MOUSSE DE MORANGO COM PEDAÇOS DE CHOCOLATE" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 9) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format(
                            "\n\u001B[33m" + "Recheio de: MOUSSE DE MORANGO COM PEDAÇOS DE CHOCOLATE" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 10) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format("\n\u001B[33m"
                            + "Recheio de: MOUSSE DE LIMÃO TRADICIONAL COM PEDAÇOS DE CHOCOLATE AO LEITE/AMARGO"
                            + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 10) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m"
                            + "Recheio de: MOUSSE DE LIMÃO TRADICIONAL COM PEDAÇOS DE CHOCOLATE AO LEITE/AMARGO"
                            + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 11) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: MOUSSE DE CHOCOLATE TRADICIONAL" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 11) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: MOUSSE DE CHOCOLATE TRADICIONAL" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 12) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format(
                            "\n\u001B[33m" + "Recheio de: MOUSSE DE CHOCOLATE COM PEDAÇOS DE CHOCOLATE AO LEITE/AMARGO"
                                    + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 12) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format(
                            "\n\u001B[33m" + "Recheio de: MOUSSE DE CHOCOLATE COM PEDAÇOS DE CHOCOLATE AO LEITE/AMARGO"
                                    + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 13) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format(
                            "\n\u001B[33m" + "Recheio de: MOUSSE DE CHOCOLATE COM PEDAÇOS DE MORANGO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 13) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format(
                            "\n\u001B[33m" + "Recheio de: MOUSSE DE CHOCOLATE COM PEDAÇOS DE MORANGO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 14) {
                    System.out.printf("Seu pedido é:\n");
                    System.out
                            .format("\n\u001B[33m" + "Recheio de: Recheio escolhido: MOUSSE DE NINHO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 14) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out
                            .format("\n\u001B[33m" + "Recheio de: Recheio escolhido: MOUSSE DE NINHO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 15) {
                    System.out.printf("Seu pedido é:\n");
                    System.out
                            .format("\n\u001B[33m" + "Recheio escolhido: NINHO COM PEDAÇO DE MORANGO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 15) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out
                            .format("\n\u001B[33m" + "Recheio escolhido: NINHO COM PEDAÇO DE MORANGO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 16) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: NINHO COM PEDAÇO DE CHOCOLATE AO LEITE OU AMARGO"
                            + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 16) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: NINHO COM PEDAÇO DE CHOCOLATE AO LEITE OU AMARGO"
                            + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 17) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format(
                            "\n\u001B[33m" + "Recheio de: NINHO COM PEDAÇO DE CHOCOLATE BRANCO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 17) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format(
                            "\n\u001B[33m" + "Recheio de: NINHO COM PEDAÇO DE CHOCOLATE BRANCO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 18) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO GOURMET OU TRADICIONAL" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 18) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO GOURMET OU TRADICIONAL" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 19) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO GOURMET COM MORANGO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 19) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO GOURMET COM MORANGO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 20) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO GOURMET COM CHOCOLATE AO LEITE OU AMARGO"
                            + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 20) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO GOURMET COM CHOCOLATE AO LEITE OU AMARGO"
                            + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 21) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO BRANCO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 21) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO BRANCO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 22) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO BRANCO COM ABACAXI" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 22) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO BRANCO COM ABACAXI" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 23) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO BRANCO COM MORANGO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 23) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO BRANCO COM MORANGO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 24) {
                    System.out.format(
                            "\n\u001B[33m" + "Recheio de: BRIGADEIRO BRANCO COM CHOCOLATE BRANCO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 24) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format(
                            "\n\u001B[33m" + "Recheio de: BRIGADEIRO BRANCO COM CHOCOLATE BRANCO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 25) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: BEIJINHO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 25) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: BEIJINHO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 26) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: PRESTÍGIO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 26) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: PRESTÍGIO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 27) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: DOCE DE LEITE CREMOSO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 27) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: DOCE DE LEITE CREMOSO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 28) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: DOCE DE LEITE COM AMEIXA" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 28) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: DOCE DE LEITE COM AMEIXA" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 29) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: DOCE DE LEITE COM COCO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 29) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: DOCE DE LEITE COM COCO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 30) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: DOCE DE LEITE COM ABACAXI" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 30) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: DOCE DE LEITE COM ABACAXI" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 31) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO DE DOCE DE LEITE" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 31) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO DE DOCE DE LEITE" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 32) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: CREME COM COCO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 32) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: CREME COM COCO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 33) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format(
                            "\n\u001B[33m" + "Recheio de: CREME COM ABACAXI TRADICIONAL E COM COCO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 33) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format(
                            "\n\u001B[33m" + "Recheio de: CREME COM ABACAXI TRADICIONAL E COM COCO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 34) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: CREME COM MORANGO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 34) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: CREME COM MORANGO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 35) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: CREME COM PÊSSEGO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 35) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: CREME COM PÊSSEGO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 36) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO DE PAÇOCA" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 36) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO DE PAÇOCA" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 37) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO DE MORANGO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 37) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO DE MORANGO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 38) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO DE MARACUJÁ" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 38) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO DE MARACUJÁ" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 39) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO DE ABACAXI" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 39) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO DE ABACAXI" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 40) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO DE LIMÃO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 40) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO DE LIMÃO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 41) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format(
                            "\n\u001B[33m" + "Recheio de: DOIS AMORES (BRIGADEIRO BRANCO E CHOCOLATE)" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 41) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format(
                            "\n\u001B[33m" + "Recheio de: DOIS AMORES (BRIGADEIRO BRANCO E CHOCOLATE)" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 42) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: SENSAÇÃO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 42) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: SENSAÇÃO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 43) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: FLORESTA NEGRA" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 2 && recheio == 43) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: FLORESTA NEGRA" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                }
                // Informações do pedido 3

                // Confirmação de pedido = 3
                System.out.println("\n\u001B[32m" + "Confirma o pedido?" + "\u001B[0m\n");
                System.out.println("(Digite Sim para confirma e não para cancelar.)");
                confirm2 = input.next();

                if (confirm2.equalsIgnoreCase("Sim")) {
                    System.out
                            .println("\n\u001B[32m" + "Seu pedido está finalizado, e será preparado." + "\u001B[0m\n");
                    System.out.println("Obrigada pela confiança!\n");
                } else {
                    System.out.println("\nPedido cancelado!\n");

                }
            } else {// 3
                System.out.println("\nErrou em algo? Refaça seu pedido!\n");
                // Confirmação de pedido 3

                // ReIntrodução

                // Tabela de preços 2
                System.out.println("\u001B[31m" + "-Tabela de preços" + "\u001B[0m\n");
                System.out.println("-Kg do bolo = R$60 ");
                System.out.println("-Valor do Topper = R$10\n");
                // Tabela de preços 2

                // Recheio do bolo 2
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
                System.out.println("\n\u001B[33m" + "Digite o código do bolo (Ex: 1 = Chocolate):" + "\u001B[0m");
                recheio = input.nextInt();

                if (recheio == 1) {
                    System.out.printf("\n\u001B[32m" + "Recheio escolhido: CHOCOLATE" + "\u001B[0m\n");

                } else if (recheio == 2) {
                    System.out.printf(
                            "\n\u001B[32m" + "Recheio escolhido: CHANDELLE (CREME DE CHOCOLATE)" + "\u001B[0m\n");
                } else if (recheio == 3) {
                    System.out.printf("\n\u001B[32m" + "Recheio escolhido: MORANGO" + "\u001B[0m\n");
                } else if (recheio == 4) {
                    System.out.printf("\n\u001B[32m" + "Recheio escolhido: DOCE DE LEITE" + "\u001B[0m\n");
                } else if (recheio == 5) {
                    System.out.printf(
                            "\n\u001B[32m" + "Recheio escolhido: MOUSSE DE MARACUJÁ TRADICIONAL" + "\u001B[0m\n");
                } else if (recheio == 6) {
                    System.out.printf("\n\u001B[32m"
                            + "Recheio escolhido: MOUSSE DE MARACUJÁ COM PEDAÇOS DE CHOCOLATE AO LEITE OU AMARGO"
                            + "\u001B[0m\n");
                } else if (recheio == 7) {
                    System.out.printf(
                            "\n\u001B[32m" + "Recheio escolhido: MOUSSE DE MORANGO TRADICIONAL" + "\u001B[0m\n");
                } else if (recheio == 8) {
                    System.out.printf("\n\u001B[32m" + "Recheio escolhido: MOUSSE DE MORANGO COM PEDAÇOS DE FRUTA"
                            + "\u001B[0m\n");
                } else if (recheio == 9) {
                    System.out.printf("\n\u001B[32m" + "Recheio escolhido: MOUSSE DE MORANGO COM PEDAÇOS DE CHOCOLATE"
                            + "\u001B[0m\n");
                } else if (recheio == 10) {
                    System.out.printf("\n\u001B[32m"
                            + "Recheio escolhido: MOUSSE DE LIMÃO TRADICIONAL COM PEDAÇOS DE CHOCOLATE AO LEITE/AMARGO"
                            + "\u001B[0m\n");
                } else if (recheio == 11) {
                    System.out.printf(
                            "\n\u001B[32m" + "Recheio escolhido: MOUSSE DE CHOCOLATE TRADICIONAL" + "\u001B[0m\n");
                } else if (recheio == 12) {
                    System.out.printf("\n\u001B[32m"
                            + "Recheio escolhido: MOUSSE DE CHOCOLATE COM PEDAÇOS DE CHOCOLATE AO LEITE/AMARGO"
                            + "\u001B[0m\n");
                } else if (recheio == 13) {
                    System.out.printf("\n\u001B[32m" + "Recheio escolhido: MOUSSE DE CHOCOLATE COM PEDAÇOS DE MORANGO"
                            + "\u001B[0m\n");
                } else if (recheio == 14) {
                    System.out.printf("\n\u001B[32m" + "Recheio escolhido: MOUSSE DE NINHO" + "\u001B[0m\n");
                } else if (recheio == 15) {
                    System.out
                            .printf("\n\u001B[32m" + "Recheio escolhido: NINHO COM PEDAÇO DE MORANGO" + "\u001B[0m\n");
                } else if (recheio == 16) {
                    System.out.printf("\n\u001B[32m"
                            + "Recheio escolhido: NINHO COM PEDAÇO DE CHOCOLATE AO LEITE OU AMARGO" + "\u001B[0m\n");
                } else if (recheio == 17) {
                    System.out.printf(
                            "\n\u001B[32m" + "Recheio escolhido: NINHO COM PEDAÇO DE CHOCOLATE BRANCO" + "\u001B[0m\n");
                } else if (recheio == 18) {
                    System.out.printf(
                            "\n\u001B[32m" + "Recheio escolhido: BRIGADEIRO GOURMET OU TRADICIONAL" + "\u001B[0m\n");
                } else if (recheio == 19) {
                    System.out.printf(
                            "\n\u001B[32m" + "Recheio escolhido: BRIGADEIRO GOURMET COM MORANGO" + "\u001B[0m\n");
                } else if (recheio == 20) {
                    System.out.printf("\n\u001B[32m"
                            + "Recheio escolhido: BRIGADEIRO GOURMET COM CHOCOLATE AO LEITE OU AMARGO" + "\u001B[0m\n");
                } else if (recheio == 21) {
                    System.out.printf("\n\u001B[32m" + "Recheio escolhido: BRIGADEIRO BRANCO" + "\u001B[0m\n");
                } else if (recheio == 22) {
                    System.out.printf(
                            "\n\u001B[32m" + "Recheio escolhido: BRIGADEIRO BRANCO COM ABACAXI" + "\u001B[0m\n");
                } else if (recheio == 23) {
                    System.out.printf(
                            "\n\u001B[32m" + "Recheio escolhido: BRIGADEIRO BRANCO COM MORANGO" + "\u001B[0m\n");
                } else if (recheio == 24) {
                    System.out.printf("\n\u001B[32m" + "Recheio escolhido: BRIGADEIRO BRANCO COM CHOCOLATE BRANCO"
                            + "\u001B[0m\n");
                } else if (recheio == 25) {
                    System.out.printf("\n\u001B[32m" + "Recheio escolhido: BEIJINHO" + "\u001B[0m\n");
                } else if (recheio == 26) {
                    System.out.printf("\n\u001B[32m" + "Recheio escolhido: PRESTÍGIO" + "\u001B[0m\n");
                } else if (recheio == 27) {
                    System.out.printf("\n\u001B[32m" + "Recheio escolhido: DOCE DE LEITE CREMOSO" + "\u001B[0m\n");
                } else if (recheio == 28) {
                    System.out.printf("\n\u001B[32m" + "Recheio escolhido: DOCE DE LEITE COM AMEIXA" + "\u001B[0m\n");
                } else if (recheio == 29) {
                    System.out.printf("\n\u001B[32m" + "Recheio escolhido: DOCE DE LEITE COM COCO" + "\u001B[0m\n");
                } else if (recheio == 30) {
                    System.out.printf("\n\u001B[32m" + "Recheio escolhido: DOCE DE LEITE COM ABACAXI" + "\u001B[0m\n");
                } else if (recheio == 31) {
                    System.out
                            .printf("\n\u001B[32m" + "Recheio escolhido: BRIGADEIRO DE DOCE DE LEITE" + "\u001B[0m\n");
                } else if (recheio == 32) {
                    System.out.printf("\n\u001B[32m" + "Recheio escolhido: CREME COM COCO" + "\u001B[0m\n");
                } else if (recheio == 33) {
                    System.out.printf("\n\u001B[32m" + "Recheio escolhido: CREME COM ABACAXI TRADICIONAL E COM COCO"
                            + "\u001B[0m\n");
                } else if (recheio == 34) {
                    System.out.printf("\n\u001B[32m" + "Recheio escolhido: CREME COM MORANGO" + "\u001B[0m\n");
                } else if (recheio == 35) {
                    System.out.printf("\n\u001B[32m" + "Recheio escolhido: CREME COM PÊSSEGO" + "\u001B[0m\n");
                } else if (recheio == 36) {
                    System.out.printf("\n\u001B[32m" + "Recheio escolhido: BRIGADEIRO DE PAÇOCA" + "\u001B[0m\n");
                } else if (recheio == 37) {
                    System.out.printf("\n\u001B[32m" + "Recheio escolhido: BRIGADEIRO DE MORANGO" + "\u001B[0m\n");
                } else if (recheio == 38) {
                    System.out.printf("\n\u001B[32m" + "Recheio escolhido: BRIGADEIRO DE MARACUJÁ" + "\u001B[0m\n");
                } else if (recheio == 39) {
                    System.out.printf("\n\u001B[32m" + "Recheio escolhido: BRIGADEIRO DE ABACAXI" + "\u001B[0m\n");
                } else if (recheio == 40) {
                    System.out.printf("\n\u001B[32m" + "Recheio escolhido: BRIGADEIRO DE LIMÃO" + "\u001B[0m\n");
                } else if (recheio == 41) {
                    System.out.printf("\n\u001B[32m" + "Recheio escolhido: DOIS AMORES (BRIGADEIRO BRANCO E CHOCOLATE)"
                            + "\u001B[0m\n");
                } else if (recheio == 42) {
                    System.out.printf("\n\u001B[32m" + "Recheio escolhido: SENSAÇÃO" + "\u001B[0m\n");
                } else if (recheio == 43) {
                    System.out.printf("\n\u001B[32m" + "Recheio escolhido: FLORESTA NEGRA" + "\u001B[0m\n");
                }
                // Recheio do bolo 2

                // Sabor da Massa 2
                System.out.println("\n\u001B[33m" + "Qual será a massa do bolo?" + "\u001B[0m");
                System.out.println("\n\u001B[33m" + "Opções de massas" + "\u001B[0m");
                System.out.println("Branca");
                System.out.println("Pão de ló");
                System.out.println("Chocolate");
                System.out.println("\n\u001B[33m" + "Digite o sabor." + "\u001B[0m");
                confirm1 = input.next();

                if (confirm1.equalsIgnoreCase("Branca")) {
                    System.out.printf("\n\u001B[32m" + "Ok! Sua massa será Branca." + "\u001B[0m\n");
                } else if (confirm1.equalsIgnoreCase("Chocolate")) {
                    System.out.printf("\n\u001B[32m" + "Ok! Sua massa será Chocolate" + "\u001B[0m\n");
                } else {
                    System.out.printf("\n\u001B[32m" + "Ok! Sua massa será Pão de ló." + "\u001B[0m\n");
                }
                // Sabor da Massa 2

                // Quantidade de Kg 2
                System.out.println("\n\u001B[33m" + "Digite Quantos Kg no formato= 0,00" + "\u001B[0m");
                quantidadeKg = input.nextDouble();
                System.out.printf("\n\u001B[32m" + "Ok! seu bolo será de = %.2f" + "\u001B[0m\n", quantidadeKg);
                // Quantidade de Kg 2

                // Topper 2
                System.out.println("\nSerá com topper? (confirme com SIM(1) ou NãO(2)");
                confirm = input.nextInt();

                if (confirm == 1) {
                    System.out.println("\n\u001B[32m" + "Ok! Será com Topper." + "\u001B[0m\n");
                    System.out.println("\u001B[33m" + "Qual o tema do topper? Digite o tema." + "\u001B[0m");
                    temaTopper = input.next();
                    System.out.format("\n\u001B[32m" + "Ok! Seu topper será do = %s" + "\u001B[0m\n", temaTopper);
                } else {
                    System.out.println("\n\u001B[32m" + "Ok! não terá Topper." + "\u001B[0m\n");
                }
                // Topper 2

                // Variáveis de soma 2
                totalT = (quantidadeKg * valorKg) + topper;
                total = (quantidadeKg * valorKg);
                // Variáveis de soma 2

                // Informações do pedido 2
                if (confirm == 1 && recheio == 1) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: CHOCOLATE" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 1) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: CHOCOLATE" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 2) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: CHANDELLE (CREME DE CHOCOLATE)" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 2) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: CHANDELLE (CREME DE CHOCOLATE)" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 3) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: MORANGO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 3) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: MORANGO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 4) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: DOCE DE LEITE" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 4) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: DOCE DE LEITE" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 5) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: MOUSSE DE MARACUJÁ TRADICIONAL" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 5) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: MOUSSE DE MARACUJÁ TRADICIONAL" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 6) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format(
                            "\n\u001B[33m" + "Recheio de: MOUSSE DE MARACUJÁ AO LEITE OU AMARGO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 6) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format(
                            "\n\u001B[33m" + "Recheio de: MOUSSE DE MARACUJÁ AO LEITE OU AMARGO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 7) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: MOUSSE DE MORANGO TRADICIONAL" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 7) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: MOUSSE DE MORANGO TRADICIONAL" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 8) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format(
                            "\n\u001B[33m" + "Recheio de: MOUSSE DE MORANGO COM PEDAÇOS DE FRUTA" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 8) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format(
                            "\n\u001B[33m" + "Recheio de: MOUSSE DE MORANGO COM PEDAÇOS DE FRUTA" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 9) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format(
                            "\n\u001B[33m" + "Recheio de: MOUSSE DE MORANGO COM PEDAÇOS DE CHOCOLATE" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 9) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format(
                            "\n\u001B[33m" + "Recheio de: MOUSSE DE MORANGO COM PEDAÇOS DE CHOCOLATE" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 10) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format("\n\u001B[33m"
                            + "Recheio de: MOUSSE DE LIMÃO TRADICIONAL COM PEDAÇOS DE CHOCOLATE AO LEITE/AMARGO"
                            + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 10) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m"
                            + "Recheio de: MOUSSE DE LIMÃO TRADICIONAL COM PEDAÇOS DE CHOCOLATE AO LEITE/AMARGO"
                            + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 11) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: MOUSSE DE CHOCOLATE TRADICIONAL" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 11) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: MOUSSE DE CHOCOLATE TRADICIONAL" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 12) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format(
                            "\n\u001B[33m" + "Recheio de: MOUSSE DE CHOCOLATE COM PEDAÇOS DE CHOCOLATE AO LEITE/AMARGO"
                                    + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 12) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format(
                            "\n\u001B[33m" + "Recheio de: MOUSSE DE CHOCOLATE COM PEDAÇOS DE CHOCOLATE AO LEITE/AMARGO"
                                    + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 13) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format(
                            "\n\u001B[33m" + "Recheio de: MOUSSE DE CHOCOLATE COM PEDAÇOS DE MORANGO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 13) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format(
                            "\n\u001B[33m" + "Recheio de: MOUSSE DE CHOCOLATE COM PEDAÇOS DE MORANGO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 14) {
                    System.out.printf("Seu pedido é:\n");
                    System.out
                            .format("\n\u001B[33m" + "Recheio de: Recheio escolhido: MOUSSE DE NINHO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 14) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out
                            .format("\n\u001B[33m" + "Recheio de: Recheio escolhido: MOUSSE DE NINHO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 15) {
                    System.out.printf("Seu pedido é:\n");
                    System.out
                            .format("\n\u001B[33m" + "Recheio escolhido: NINHO COM PEDAÇO DE MORANGO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 15) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out
                            .format("\n\u001B[33m" + "Recheio escolhido: NINHO COM PEDAÇO DE MORANGO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 16) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: NINHO COM PEDAÇO DE CHOCOLATE AO LEITE OU AMARGO"
                            + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 16) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: NINHO COM PEDAÇO DE CHOCOLATE AO LEITE OU AMARGO"
                            + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 17) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format(
                            "\n\u001B[33m" + "Recheio de: NINHO COM PEDAÇO DE CHOCOLATE BRANCO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 17) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format(
                            "\n\u001B[33m" + "Recheio de: NINHO COM PEDAÇO DE CHOCOLATE BRANCO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 18) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO GOURMET OU TRADICIONAL" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 18) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO GOURMET OU TRADICIONAL" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 19) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO GOURMET COM MORANGO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 19) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO GOURMET COM MORANGO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 20) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO GOURMET COM CHOCOLATE AO LEITE OU AMARGO"
                            + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 20) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO GOURMET COM CHOCOLATE AO LEITE OU AMARGO"
                            + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 21) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO BRANCO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 21) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO BRANCO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 22) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO BRANCO COM ABACAXI" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 22) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO BRANCO COM ABACAXI" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 23) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO BRANCO COM MORANGO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 23) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO BRANCO COM MORANGO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 24) {
                    System.out.format(
                            "\n\u001B[33m" + "Recheio de: BRIGADEIRO BRANCO COM CHOCOLATE BRANCO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 24) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format(
                            "\n\u001B[33m" + "Recheio de: BRIGADEIRO BRANCO COM CHOCOLATE BRANCO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 25) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: BEIJINHO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 25) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: BEIJINHO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 26) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: PRESTÍGIO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 26) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: PRESTÍGIO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 27) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: DOCE DE LEITE CREMOSO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 27) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: DOCE DE LEITE CREMOSO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 28) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: DOCE DE LEITE COM AMEIXA" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 28) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: DOCE DE LEITE COM AMEIXA" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 29) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: DOCE DE LEITE COM COCO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 29) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: DOCE DE LEITE COM COCO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 30) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: DOCE DE LEITE COM ABACAXI" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 30) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: DOCE DE LEITE COM ABACAXI" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 31) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO DE DOCE DE LEITE" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 31) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO DE DOCE DE LEITE" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 32) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: CREME COM COCO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 32) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: CREME COM COCO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 33) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format(
                            "\n\u001B[33m" + "Recheio de: CREME COM ABACAXI TRADICIONAL E COM COCO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 33) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format(
                            "\n\u001B[33m" + "Recheio de: CREME COM ABACAXI TRADICIONAL E COM COCO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 34) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: CREME COM MORANGO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 34) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: CREME COM MORANGO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 35) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: CREME COM PÊSSEGO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 35) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: CREME COM PÊSSEGO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 36) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO DE PAÇOCA" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 36) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO DE PAÇOCA" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 37) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO DE MORANGO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 37) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO DE MORANGO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 38) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO DE MARACUJÁ" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 38) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO DE MARACUJÁ" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 39) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO DE ABACAXI" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 39) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO DE ABACAXI" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 40) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO DE LIMÃO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 40) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: BRIGADEIRO DE LIMÃO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 41) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format(
                            "\n\u001B[33m" + "Recheio de: DOIS AMORES (BRIGADEIRO BRANCO E CHOCOLATE)" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 41) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format(
                            "\n\u001B[33m" + "Recheio de: DOIS AMORES (BRIGADEIRO BRANCO E CHOCOLATE)" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 42) {
                    System.out.printf("Seu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: SENSAÇÃO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            totalT);
                } else if (confirm == 2 && recheio == 42) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: SENSAÇÃO" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 1 && recheio == 43) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: FLORESTA NEGRA" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Terá topper com o tema: %s" + "\u001B[0m\n", temaTopper);
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                } else if (confirm == 2 && recheio == 43) {
                    System.out.printf("\nSeu pedido é:\n");
                    System.out.format("\n\u001B[33m" + "Recheio de: FLORESTA NEGRA" + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "Sabor da massa: %s" + "\u001B[0m\n", confirm1);
                    System.out.format("\n\u001B[33m" + "Quantidade de: %.2fKG" + "\u001B[0m\n", quantidadeKg);
                    System.out.format("\n\u001B[33m" + "Não terá topper." + "\u001B[0m\n");
                    System.out.format("\n\u001B[33m" + "E o valor total do pedido será:\nR$%.2f" + "\u001B[0m\n",
                            total);
                }
                // Informações do pedido 2

                // Confirmação de pedido = 2
                System.out.println("\n\u001B[32m" + "Confirma o pedido?" + "\u001B[0m\n");
                System.out.println("(Digite Sim para confirma e não para cancelar.)");
                confirm2 = input.next();

                if (confirm2.equalsIgnoreCase("Sim")) {
                    System.out
                            .println("\n\u001B[32m" + "Seu pedido está finalizado, e será preparado." + "\u001B[0m\n");
                    System.out.println("Obrigada pela confiança!\n");
                } else {
                    System.out.println("\nPedido cancelado!\n");
                    // Confirmação de pedido = 2

                }

            } // 3

        } // 2

    }// 1
}