package gestionDatos;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.JSONValue;
import org.json.simple.parser.ParseException;
import org.json.simple.parser.JSONParser;



public class TransformarJSon {

	
	public static void main(String[] args){
		 JSONParser parser=new JSONParser();
	      String s = "[{\"balance\": 1000.21, \"num\":100, \"is_vip\":true, \"name\":\"foo\"},{\"balance\": 1002.21, \"num\":100, \"is_vip\":true, \"name\":\"foo\"}]";
	      try{
	         Object obj = parser.parse(s);
	         JSONArray array = (JSONArray)obj;
	         System.out.println("The 2nd element of array");
	         System.out.println(array.get(0));
	         System.out.println();

	         JSONObject obj2 = (JSONObject)array.get(1);
	         System.out.println("Field \"1\"");
	         System.out.println(obj2.get("balance"));    
	         String asd=obj2.get("balance").toString();
	         System.out.println("por mi");
	         System.out.println(asd);
	         s = "{}";
	         obj = parser.parse(s);
	         System.out.println(obj);

	         s= "[5,]";
	         obj = parser.parse(s);
	         System.out.println(obj);

	         s= "[5,,2]";
	         obj = parser.parse(s);
	         System.out.println(obj);
	      }catch(ParseException pe){
	         System.out.println("position: " + pe.getMessage());
	         System.out.println(pe);
	      }
	        
	}
	
	public static String[][] box(String lista){
		 JSONParser parser=new JSONParser();
	      String s="["+lista+"]";
	      try{
	         Object obj = parser.parse(s);
	         JSONArray array = (JSONArray)obj;
	         String [][]matriz=new String[2][array.size()];
	         for(int i=0;i<array.size();i++){	        	 
	        	 JSONObject obj2 = (JSONObject)array.get(i);
	        	 String id=obj2.get("id").toString();
	        	 String nombre=obj2.get("nombre").toString();	        	 	        			
	        	 matriz[0][i]=id;
	        	 matriz[1][i]=nombre;	        	 
	         }
	         return matriz;	         	       
	      }catch(ParseException pe){
	         System.out.println("position: " + pe.getMessage());
	         System.out.println(pe);
	      }
		return null;
	}
	public static String[][] especialidad(String lista){

		  JSONParser parser=new JSONParser();
	      String s="["+lista+"]";
	      try{
	         Object obj = parser.parse(s);
	         JSONArray array = (JSONArray)obj;
	         String [][]matriz=new String[5][array.size()];
	         for(int i=0;i<array.size();i++){	        	 
	        	 JSONObject obj2 = (JSONObject)array.get(i);
	        	 String id=obj2.get("id").toString();
	        	 String nombre=obj2.get("nombre").toString();
	        	 
	        			 
	        	 matriz[0][i]=id;
	        	 matriz[1][i]=nombre;

	        	 
	         }
	         return matriz;
	         
	         
	      }catch(ParseException pe){
	         System.out.println("position: " + pe.getMessage());
	         System.out.println(pe);
	      }
	        
	     
	         
		
		return null;
	}
	public static String[][] datosMedico(String lista){
		  
		  JSONParser parser=new JSONParser();
	      String s="["+lista+"]";
	      try{
	         Object obj = parser.parse(s);
	         JSONArray array = (JSONArray)obj;
	         String [][]matriz=new String[5][array.size()];
	         for(int i=0;i<array.size();i++){	        	 
	        	 JSONObject obj2 = (JSONObject)array.get(i);
	        	 String id=obj2.get("id").toString();
	        	 String nombre=obj2.get("nombre").toString();
	        	 String apellido=obj2.get("apellido").toString();
	        	 String idEspecialidad=obj2.get("idEspecialidad").toString();
	        	 String nombreEspecialidad=obj2.get("nombreEspecialidad").toString();
	        			 
	        	 matriz[0][i]=id;
	        	 matriz[1][i]=nombre;
	        	 matriz[2][i]=apellido;
	        	 matriz[3][i]=idEspecialidad;
	        	 matriz[4][i]=nombreEspecialidad;
	        	 
	         }
	         return matriz;
	         
	         
	      }catch(ParseException pe){
	         System.out.println("position: " + pe.getMessage());
	         System.out.println(pe);
	      }
	        
	     
	         
		
		return null;
	}
	public static String [][] datosPaciente(String texto){
		JSONParser parser=new JSONParser();
	      String s="["+texto+"]";
	      try{
	         Object obj = parser.parse(s);
	         JSONArray array = (JSONArray)obj;
	         String [][]matriz=new String[2][array.size()];
	         for(int i=0;i<array.size();i++){	        	 
	        	 JSONObject obj2 = (JSONObject)array.get(i);
	        	 String id=obj2.get("idPaciente").toString();
	        	 String nombre=obj2.get("nombre").toString();
	        	
	        	 matriz[0][i]=id;
	        	 matriz[1][i]=nombre;
	        	
	         }
	         return matriz;
	         
	         
	      }catch(ParseException pe){
	         System.out.println("position: " + pe.getMessage());
	         System.out.println(pe);
	      }
	
		return null;
	}
	public String[][] datosLogin(String texto){

		  JSONParser parser=new JSONParser();
	      String s="["+texto+"]";
	      try{
	         Object obj = parser.parse(s);
	         JSONArray array = (JSONArray)obj;
	         String [][]matriz=new String[4][array.size()];
	         for(int i=0;i<array.size();i++){	        	 
	        	 JSONObject obj2 = (JSONObject)array.get(i);
	        	 String id=obj2.get("id").toString();
	        	 String nombre=obj2.get("nombre").toString();
	        	 String nombreUsuario=obj2.get("nombreUsuario").toString();
	        	 String tipoUsuario=obj2.get("tipoUsuario").toString();
	        	 matriz[0][i]=id;
	        	 matriz[1][i]=nombre;
	        	 matriz[2][i]=nombreUsuario;
	        	 matriz[3][i]=tipoUsuario;
	         }
	         return matriz;
	         
	         
	      }catch(ParseException pe){
	         System.out.println("position: " + pe.getMessage());
	         System.out.println(pe);
	      }
	
		return null;
	}
	public static String[][] horasMedicasDisponible(String texto){
		JSONParser parser=new JSONParser();
	      String s="["+texto+"]";
	      try{
	         Object obj = parser.parse(s);
	         JSONArray array = (JSONArray)obj;
	         String [][]matriz=new String[6][array.size()];
	         for(int i=0;i<array.size();i++){	        	 
	        	 JSONObject obj2 = (JSONObject)array.get(i);
	        	 String id=obj2.get("idHoraMedica").toString();
	        	 String fecha=obj2.get("fechaHoraMedica").toString();
	        	 String hora=obj2.get("horaHoraMedica").toString();
	        	 String nombreMedico=obj2.get("nombreMedico").toString();
	        	 String apellidoMedico=obj2.get("apellidoMedico").toString();
	        	 String tipoHora=obj2.get("tipoHora").toString();
	        	 matriz[0][i]=id;
	        	 matriz[1][i]=fecha;
	        	 matriz[2][i]=hora;
	        	 matriz[3][i]=nombreMedico;
	        	 matriz[4][i]=apellidoMedico;
	        	 matriz[5][i]=tipoHora;
	         }
	         return matriz;
	         
	         
	      }catch(ParseException pe){
	         System.out.println("position: " + pe.getMessage());
	         System.out.println(pe);
	      }
	
		
		return null;
	}
	public static String[][] horasMedicas(String texto){
		JSONParser parser=new JSONParser();
	      String s="["+texto+"]";
	      try{
	         Object obj = parser.parse(s);
	         JSONArray array = (JSONArray)obj;
	         String [][]matriz=new String[5][array.size()];
	         for(int i=0;i<array.size();i++){	        	 
	        	 JSONObject obj2 = (JSONObject)array.get(i);
	        	 String id=obj2.get("idHoraMedica").toString();
	        	 String fecha=obj2.get("fechaHoraMedica").toString();
	        	 String hora=obj2.get("horaHoraMedica").toString();
	        	 String nombreMedico=obj2.get("nombreMedico").toString();
	        	 String apellidoMedico=obj2.get("apellidoMedico").toString();
	        	 
	        	 matriz[0][i]=id;
	        	 matriz[1][i]=fecha;
	        	 matriz[2][i]=hora;
	        	 matriz[3][i]=nombreMedico;
	        	 matriz[4][i]=apellidoMedico;
	         }
	         return matriz;
	         
	         
	      }catch(ParseException pe){
	         System.out.println("position: " + pe.getMessage());
	         System.out.println(pe);
	      }
	
		
		return null;
	}
	
	public static String[][] datosReporte(String texto){
		JSONParser parser=new JSONParser();
	      String s="["+texto+"]";
	      try{
	         Object obj = parser.parse(s);
	         JSONArray array = (JSONArray)obj;
	         String [][]matriz=new String[4][array.size()];
	         for(int i=0;i<array.size();i++){	        	 
	        	 JSONObject obj2 = (JSONObject)array.get(i);
	        	 String id=obj2.get("idReporte").toString();
	        	 String fecha=obj2.get("fechaReporte").toString();
	        	 String hora=obj2.get("horaReporte").toString();
	        	 String tipoReporte=obj2.get("tipoReporte").toString();
	        	 
	        	 
	        	 matriz[0][i]=id;
	        	 matriz[1][i]=fecha;
	        	 matriz[2][i]=hora;
	        	 matriz[3][i]=tipoReporte;
	         }
	         return matriz;
	         
	         
	      }catch(ParseException pe){
	         System.out.println("position: " + pe.getMessage());
	         System.out.println(pe);
	      }
	
		
		return null;
		
		
	}
	public static String[][] datosBox(String texto){
		JSONParser parser=new JSONParser();
	      String s="["+texto+"]";
	      try{
	         Object obj = parser.parse(s);
	         JSONArray array = (JSONArray)obj;
	         String [][]matriz=new String[4][array.size()];
	         for(int i=0;i<array.size();i++){	        	 
	        	 JSONObject obj2 = (JSONObject)array.get(i);
	        	 String id=obj2.get("idBox").toString();
	        	 String fecha=obj2.get("porcentaje").toString();	        	 
	        	 matriz[0][i]=id;
	        	 matriz[1][i]=fecha;
	        	
	         }
	         return matriz;
	         
	         
	      }catch(ParseException pe){
	         System.out.println("position: " + pe.getMessage());
	         System.out.println(pe);
	      }
	
		
		return null;
	}
	
	public static String[][] pacientes(String texto){
		JSONParser parser=new JSONParser();
	      String s="["+texto+"]";
	      try{
	         Object obj = parser.parse(s);
	         JSONArray array = (JSONArray)obj;
	         String [][]matriz=new String[3][array.size()];
	         for(int i=0;i<array.size();i++){	        	 
	        	 JSONObject obj2 = (JSONObject)array.get(i);
	        	 String id=obj2.get("id").toString();
	        	 String nombre=obj2.get("nombre").toString();	        	 	        	
	        	 matriz[0][i]=id;
	        	 matriz[1][i]=nombre;	        		        	 
	         }
	         return matriz;
	         
	         
	      }catch(ParseException pe){
	         System.out.println("position: " + pe.getMessage());
	         System.out.println(pe);
	      }
	
		
		return null;
	}
	
}
