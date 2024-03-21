package abb;
import java.util.Scanner;
public class Main {

    public static void main(String[] args ){
        ArvoreBinariaBusca arvore = new ArvoreBinariaBusca();
        ArvoreBinariaBusca arvoreAlfabetica = new ArvoreBinariaBusca();
        Scanner in = new Scanner(System.in);
        int option = 0;
        do {
            System.out.print("\nAtividade de ED2");
            System.out.print("\nSelecione uma das opções abaixo");
            System.out.print("\n1-Adicionar Contato a arvore");
            System.out.print("\n2-Pesquisar Contato por código");
            System.out.print("\n3-Listar contato em ordem alfabética");
            System.out.print("\n4-Remover contato existente por código");
            System.out.print("\n5-Sair do programa\n");
            option = in.nextInt();
            switch (option){
                case 1:
                    int codigo;
                    String telefone, nome;
                    System.out.print("\nDigite seu codigo: ");
                    codigo = in.nextInt();
                    in.nextLine();
                    System.out.print("\nDigite seu nome: ");
                    nome = in.nextLine();
                    System.out.print("\nDigite seu Telefone:");
                    telefone = in.nextLine();
                    arvore.adicionaNoContato(codigo, nome, telefone);
                    arvoreAlfabetica.adicionaNoContatoAlfabetica(codigo, nome, telefone);
                    break;

                case 2:
                    int cdg;
                    System.out.print("\nDigite o código: ");
                    cdg = in.nextInt();
                    No encontrado = arvore.pegarNoArvorePorValor(cdg);
                    System.out.print("\nCodigo: "+encontrado.getValor()+ "\nNome: "+encontrado.getNome()+"\nTelefone: "+encontrado.getTelefone());
                    break;

                case 3:
                    arvoreAlfabetica.imprimirInOrder();
                    break;


                case 4:
                    int c;
                    System.out.print("\nDigite o codigo do contato que deseja remover:");
                    c = in.nextInt();
                    arvore.removeNoPorValor(c);
                    No aux = arvore.pegarNoArvorePorValor(c);
                    arvoreAlfabetica.removeNoPorNome(aux.getNome(), c);
                    break;

                case 5:
                    System.out.print("\nSaindo do programa...");
                    break;

                default:
                    System.out.print("Opcao invalida, digite novamente");
                    break;
            }
        }while(option != 5);
    }

}
