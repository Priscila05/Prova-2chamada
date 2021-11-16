package Principal;

import java.io.ObjectInputFilter.Status;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Classes.Livro;

public class Programa {    

     public static void main(String[] args, String titulo) {
            Integer opcao = -1;
            Scanner sc = new Scanner(System.in);
            List<Livro> livros = new ArrayList<>();
            DateTimeFormatter fd = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            do{
               System.out.println(" ****M E N U**** \n");
               System.out.println("1 - Cadastrar livro ");
               System.out.println("2 - Consultar livro ");
               System.out.println("3 - Listar todos os livros ");
               System.out.println("4 - Realizar locação ");
               System.out.println("5 - Realizar devolução ");
               System.out.println("6 - Relatório de livros com devolução em aberto ");
               System.out.println("7 - Relatório de livros alugados por período ");
               System.out.println("0 - Sair \n");
               System.out.println("Digite a sua opção: ");
               opcao = sc.nextInt();
               sc.nextLine();

               switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do livro: ");  
                    String nome = sc.nextLine();
                    System.out.println("Digite o nome do autor: ");
                    String autor = sc.nextLine();
                    System.out.println("Digite o codigo do livro: ");
                    String codigo= sc.nextLine();
                    System.out.println("Digite o número de páginas do livro: ");
                    String numeroPaginas = sc.nextLine();

                    Livro livro = new Livro(codigo, titulo, autor, numeroPaginas)
                    livro.add(livro);

                    break;
                case 2:
                       
                     break;
                case 3:
                    for (Livro l : livro) {
                        System.out.println(l);
                    }

                    for (int i = 0; i < livro.size(); i++) {
                         System.out.println(livro.get(i));  
                    }

                     break;
                case 4:
                    System.out.println("Digite o nome do livro: ");  
                    String nome = sc.nextLine();
                    System.out.println("Digite o nome do autor: ");
                    String autor = sc.nextLine();
                    System.out.println("Digite o codigo do livro: ");
                    String codigo= sc.nextLine();
                    System.out.println("Digite o número de páginas do livro: ");
                    String numeroPaginas = sc.nextLine();

                    Livro livro = new Livro(codigo, titulo, autor, numeroPaginas)
                    livro.add(livro);



                    break;
                case 5:
                    System.out.println("Digite o nome do livro: ");  
                    String nome = sc.nextLine();
                    System.out.println("Digite o nome do autor: ");
                    String autor = sc.nextLine();
                    System.out.println("Digite o codigo do livro: ");
                    String codigo= sc.nextLine();
                    System.out.println("Digite o número de páginas do livro: ");
                    String numeroPaginas = sc.nextLine();

                     break;
                case 6:
                    livro.stream()
                         .filter(l -> l.getStatus().equalsIgnoreCase("alugado"))
                         .forEach(System.out::println);
                     break;
                case 7:
                    System.out.println("Digite a data de locação do livro no formato dd/mm/aaaa: ");
                    String dataLocacao = sc.nextLine();
                    System.out.println("Digite o CPF do alugador: ");
                    String cpfCliente = sc.nextLine();
                    System.out.println("Digite o codigo do livro: ");
                    String codigo = sc.nextLine();
                    System.out.println("Digite a data de devolução do livro no formato dd/mm/aaaa: ");
                    String dataDevolucao = sc.nextLine();
                    System.out.println("Digite o status do livro: ");
                    String status = sc.nextLine();

                    livros.stream()
                          .filter(l -> l.getDataLocacao() >= %s  && l.getDataDevolucao() <= %s)
                          .forEach(System.out::println);

                     break;
                case 0:
               
                   default:
                       System.out.println("Opcao não encontrada. Por favor, digite outra opção!");
                       break;
               }
            } while (opcao !=0);
            sc.close();
      }
}