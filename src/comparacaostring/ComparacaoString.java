/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author eduar
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Eduardo";
        String nome2 = "Eduardo";
        String nome3 = new String("Eduardo");
        String res;
        res = (nome1==nome3)?"igual":"diferente";
        System.out.println(res);
        
        String nome11 = "Eduardo";
        String nome22 = "Eduardo";
        String nome33 = new String("Eduardo"); //Este obejto não tem a mesma estrutura dos dois nomes anteriores, por isso não são iguais. O conteudo deles é igual, mas a estrutura do objeto não.
        String res1;
        res1 = (nome11.equals(nome33))?"igual":"diferente";
        System.out.println(res1);
        
    }
    
}
