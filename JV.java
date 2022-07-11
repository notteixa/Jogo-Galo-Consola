package jogo;

public class JV {
    String[][] m  = {{"1","2","3"},{"4","5","6"},{"7","8","9"}};
   
    public String Mostrar(){
       
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3; j++) {
                System.out.printf(" " + m[i][j]);
            }
            System.out.println("\n");
        }
        return null;
    }

   
    public boolean Verificar(String p){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(m[i][j].equals(p))
                    return true;
            }
           
        }
        return false;
    }

       
    public void joga(String p, String j){
           
        if (p.equals("1"))
                m[0][0] = j ;
            else if (p.equals("2"))
                m[0][1] = j ;
            else if (p.equals("3"))
                m[0][2] = j ;
            else if (p.equals("4"))
                m[1][0] = j ;
            else if (p.equals("5"))
                m[1][1] = j ;
            else if (p.equals("6"))
                m[1][2] = j ;
            else if (p.equals("7"))
                m[2][0]= j ;
            else if (p.equals("8"))
                m[2][1] = j ;
            else if (p.equals("9"))
                m[2][2] = j ;
     
    }
       
    public String vencer(int jogar){
           
        String[] L = new String[8];
        String vencer = "null";
           
        if(jogar == 9){
           
            vencer = "Empate";
               
        }
       
        L[0] = m[0][0] + m[0][1] + m[0][2];
        L[1] = m[1][0] + m[1][1] + m[1][2];
        L[2] = m[2][0] + m[2][1] + m[2][2];    

        L[3] = m[0][0] + m[1][0] + m[2][0];
        L[4] = m[0][1] + m[1][1] + m[2][1];
        L[5] = m[0][2] + m[1][2] + m[2][2];  
       
        L[6] = m[0][0] + m[1][1] + m[2][2];
        L[7] = m[0][2] + m[1][1] + m[2][0];
       
        for (int i= 0; i<L.length; i++) {
            if (L[i].equals("XXX")) {
                vencer = "Jogador 1";
            }else if(L[i].equals("OOO")){
                vencer = "Jogador 2";
            }
        }
        return vencer ;

    }
                 
}
