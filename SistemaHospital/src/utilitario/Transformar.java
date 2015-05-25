package utilitario;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Transformar {
	public int StringToInt(String texto) {
		return Integer.parseInt(texto);
	}

	public Date StringToDate(String fecha) {
		if (validarFecha(fecha)) {
			try {

				DateFormat f = new SimpleDateFormat("yyyy-MM-dd");
				String str1 = fecha;
				Date date = f.parse(str1);
				return date;

			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}catch(NullPointerException c){
				return null;
			}
		}

		return null;
	}

	/*
	 * @return true si es que la comparacion es incorrecta y false si es
	 * correcta
	 */
	public boolean compararFechas(String fechaInicio, String fechaFin,
			String fecha) {
		try{
		DateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		String str1 = fechaInicio;
		Date date1 = f.parse(str1);
		String str2 = fechaFin;
		Date date2 = f.parse(str2);
		Calendar cal1 = new GregorianCalendar();
		cal1.setTime(date1);
		Calendar cal2 = new GregorianCalendar();
		cal2.setTime(date2);
		String str3 = fecha;
		Date date3 = f.parse(str3);
		Calendar cal3 = new GregorianCalendar();
		cal3.setTime(date3);

		if (cal3.after(cal1) && cal3.before(cal2)) {
			return true;
		} else {
			return false;
		}
	 } catch (ParseException e) {
         return false;
     }catch(NullPointerException c){
			return false;
		}
	}
/*
	public String compararFechass(String fechaInicio, String fechaFin,String fecha) {
		try{
		DateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		String str1 = fechaInicio;
		Date date1 = f.parse(str1);
		String str2 = fechaFin;
		Date date2 = f.parse(str2);
		Calendar cal1 = new GregorianCalendar();
		cal1.setTime(date1);
		Calendar cal2 = new GregorianCalendar();
		cal2.setTime(date2);
		String str3 = fecha;
		Date date3 = f.parse(str3);
		Calendar cal3 = new GregorianCalendar();
		cal3.setTime(date3);

		if (cal3.after(cal1) && cal3.before(cal2)){
		return " esta dentro del rango";
		}else{
		return "esta fuera del rango";
		}
	 } catch (ParseException e) {
         return "error";
     }
	}
	*/
	public boolean validarNumero(String texto) {
		if (texto.matches("[0-9]*")) {
			return true;
		}
		return false;
	}

	public boolean validarFecha(String fecha) {
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

	// imitacion de Algoritmo Knuth-Morris-Pratt
	public boolean busquedaPorLetra(String texto, String palabra) {
		if (texto.length() < palabra.length()) {
			return false;
		} else if (texto.length() == palabra.length()) {
			if (texto.equals(palabra)) {
				return true;
			}
		} else {
			char[] charTexto = texto.toCharArray();
			char[] charPalabra = palabra.toCharArray();
			boolean esta = false;
			int i = 0, puntero = 0;

			for (char letraTexto : charTexto) {
				for (i = puntero; i < charPalabra.length; i++) {
					if (letraTexto == charPalabra[i]) {
						puntero = i;
						esta = true;
						break;
					}
				}
				if (esta && i == charPalabra.length) {
					return true;
				}
			}

		}

		return false;
	}
}
