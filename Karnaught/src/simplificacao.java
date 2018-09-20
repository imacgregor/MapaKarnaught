
import java.util.ArrayList;


public class simplificacao {
    
    String[] a = new String[4];
    String[] b = new String[4];
    String[] s = new String[4];
    
    String transfereDados(String[] a,String[] b,String[] s,int quantidadeBits)
    {
        this.a = a;
        this.b = b;
        this.s = s;
        
        return a[0];
    }
    
    ArrayList<String> separarMinitermos(String[] a,String[] b,String[] s){
        
        int j = 0, cont = 1, repeticaoDo1 = 0;
        ArrayList <String> grupoMinitermos = new ArrayList<String>();
        
        for(int i = 0; i < s.length; i++){
            if(!s.equals("0")){
                j++;
            }
        }
        
        String minitermos[] = new String[j];
        
        for(int i = 0; i < a.length; i++){
            if(!s[i].equals("0")){ 
                minitermos[i] = a[i]+b[i];
            }
        }
        
        for(int k = 0; k < Math.log(a.length)/Math.log(2); k++){
            for(int i = 0; i < j; i++){
                repeticaoDo1 = minitermos[i].length() - minitermos[i].replaceAll("1","").length();
                if(repeticaoDo1 == cont){
                    grupoMinitermos.add(minitermos[i]);
                }
            }
            cont++;
        }
        
        
        return grupoMinitermos;
    }
    
    ArrayList<String> implicantesPrimos (ArrayList grupoMinitermos){
       
        String[] grupoMini = grupoMinitermos.toArray(new String[grupoMinitermos.size()]);
        
        int j = 0, cont = 1, repeticaoDo1 = 0;
        ArrayList <String> primos = new ArrayList<String>();
        
        for(int k = 0; k < Math.log(a.length)/Math.log(2); k++){
            for(int i = 0; i < j; i++){
                repeticaoDo1 = grupoMinitermos.indexOf(i).length() - grupoMinitermos.indexOf(i).replaceAll("1","").length();
                if(repeticaoDo1 == cont){
                    primos.add(grupoMinitermos.indexOf(i));
                }
            }
            cont++;
        }
        
        return primos;
    }
    
}
