package Utilitario;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Transformar {
	public int StringToInt(String texto){		
		return Integer.parseInt(texto);				
	}
	public boolean validarNumero(String texto){
		if(texto.matches("[0-9]*")){
			return true;
		}
		return false;
	}
	public boolean validarFecha(String fecha){
		try {
			DateFormat f = new SimpleDateFormat("yyyy-MM-dd");
      		String str1 = fecha;
      		Date date = f.parse(str1);
      		return true;
        } catch (ParseException e) {
            return false;
        }catch(NullPointerException c){
			return false;
		}
	}
	public boolean compararTexto(String texto,String busqueda){
		if(texto.matches(busqueda)){
			return true;
		}
		return false;
	}
}
