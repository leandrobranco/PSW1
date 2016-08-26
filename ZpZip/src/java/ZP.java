

import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafa
 */
public class ZP {
   public static String converter(String texto) {
        
        Map<String, String> map = new HashMap<String, String>();
        map.put("z", "p");
        map.put("e", "o");
        map.put("n", "l");
        map.put("i", "a");
        map.put("t", "r");
        map.put("p", "z");
        map.put("o", "e");
        map.put("l", "n");
        map.put("a", "i");
        map.put("r", "t");
        
              
        String letras[] = texto.split("");
        
        
        String textoConvertido = "";
        
        for (String letra : letras) {
            String code = map.get(letra);
            if (code != null)
                textoConvertido = textoConvertido + code;
            else
                textoConvertido = textoConvertido + letra;
        }
        
        return textoConvertido;
    } 
}
