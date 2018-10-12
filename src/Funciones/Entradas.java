/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author AnX
 */
public class Entradas {
    
    /**
     *
     * @param rut
     * @return
     */
    public static boolean isRut(String rut) {
 
        rut = rut.toUpperCase();
        rut = rut.replace(".", "");
        rut = rut.replace("-", "");
        int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));
 
        char dv = rut.charAt(rut.length() - 1);
    
        if(!(rutAux>9 && rutAux<99999999)) return false;
        else if(!(Character.isDigit(dv)|| dv=='k')) return false;
        else return true;
    }
    
    /**
     *
     * @param Nom
     * @return
     */
    public boolean isNombre(String Nom){
        if(Nom.length()>39)return false;
        char[] chars = Nom.toCharArray();        
        for (char c : chars) {
        if(!(Character.isLetter(c) || c==' ' || c=='-' || c=='"' || Character.isDigit(c))) {
            return false;
        }
    }
    return true;
    }
    
    /**
     *
     * @param AP
     * @return
     */
    public boolean isApellido_Paterno(String AP){
        if(AP.length()>39)return false;
        char[] chars = AP.toCharArray();        
        for (char c : chars) {
        if(!(Character.isLetter(c) || c==' ' || c=='-' || c=='"' || Character.isDigit(c))) {
            return false;
        }
    }
    return true;
    }
    
    /**
     *
     * @param AM
     * @return
     */
    public boolean isApellido_Materno(String AM){
        if(AM.length()>39)return false;
        char[] chars = AM.toCharArray();        
        for (char c : chars) {
        if(!(Character.isLetter(c) || c==' ' || c=='-' || c=='"' || Character.isDigit(c))) {
            return false;
        }
    }
    return true;
    }
    
    /**
     *
     * @param em
     * @return
     */
    public boolean isEmail(String em){
        Pattern pattern = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}");
        Matcher mat = pattern.matcher(em);

        if(mat.matches()){
            return true;
        }else{
            return false;
        }
    }
    
    /**
     *
     * @param tel
     * @return
     */
    public boolean isTelefono(int tel){
        if(tel>0 && tel<999999999)return true;
        else return false;
    }
    
    /**
     *
     * @param money
     * @return
     */
    public boolean isMonto(int money){
        if(money>199999 && money<100000000)return true;
        else return false;
    }
    
    public static boolean isValidarFecha(String fecha) {
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            formatoFecha.setLenient(false);
            formatoFecha.parse(fecha);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }
    
}
