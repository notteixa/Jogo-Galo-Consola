package jogo;

import java.util.Scanner;


public class Players {
   
    public void VsPlayer(){
       
        Scanner ler = new Scanner(System.in);
     
      JV galo = new JV();
      String posicoes;
      int validar = 0 , Jogar = 0;


      System.out.println("Jogo Do Galo");
      galo.Mostrar();
      while(true){
         
          do {  
              System.out.print("Jogador 1, qual a posicao que quer jogar? ");
              posicoes = ler.next();
             
              while(!galo.Verificar(posicoes)){
                 
                  System.out.println("Jogada Inválida, tente novamente!");
                  System.out.print("Jogador 1, informe uma posição: ");
                  posicoes = ler.next();
                 
                  validar = 0;
                 
              }
             
              galo.joga(posicoes, "X");
              validar = 1;
             
          } while (validar == 0);
         
          Jogar++;
          validar = 0;
          galo.Mostrar();
         
          if(!galo.vencer(Jogar).equals("null")){
              break;
                 
          }
       
           do {  
              System.out.print("Jogador 2, qual a posicao que quer jogar? ");
              posicoes = ler.next();
             
              while(!galo.Verificar(posicoes)){
                 
                  System.out.println("Jogada Inválida, tente novamente!");
                  System.out.print("Jogador 2, informe uma posição: ");
                  posicoes = ler.next();
                 
                  validar = 0;
                 
              }
             
              galo.joga(posicoes, "O");
              validar = 1;
             
          } while (validar == 0);
         
          Jogar++;
          validar = 0;
          galo.Mostrar();
         
          if(!galo.vencer(Jogar).equals("null")){
              break;
                 
          }
          }
     
        System.out.print("O " +galo.vencer(Jogar)+ " venceu ");
       
    }
   
}
