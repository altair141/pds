package ormsamples;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

import org.orm.PersistentException;

import utilitario.Transformar;
import capaNegocio.hospital.HoraMedica;
import capaNegocio.personas.Medico;
import capaServicio.Servicio;

public class Prueba {

	public static void main(String[] args) throws ParseException {
		/*DateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		String str1 = "2016-05-15";
		Date date1 = f.parse(str1);
		String str2 = "2016-06-19";
		Date date2 = f.parse(str2);
		Calendar cal1 = new GregorianCalendar();
		cal1.setTime(date1);
		Calendar cal2 = new GregorianCalendar();
		cal2.setTime(date2);
		String str3 = "2015-05-20'";
		Date date3 = f.parse(str3);
		Calendar cal3 = new GregorianCalendar();
		cal3.setTime(date3);

		if (cal3.after(cal1) && cal3.before(cal2)){
		System.out.println(" esta dentro del rango");
		}else{
		System.out.println("esta fuera del rango");
		}*/
		Transformar t=new Transformar();
		
		Servicio s=new Servicio();
		//System.out.println("dfs"+s.buscarHoraAPSPorRango("2015-05-10", "2015-05-15"));
		//	System.out.println("dfs"+s.buscarHoraAPSPorRango("2014-05-15", "2016-06-19"));
		
		
		/*HoraMedica h=new HoraMedica();
		
		System.out.println(h.obtenerFecha(date1));*/
		/*
		System.out.println(s.buscarSuDisponbilidadHoraPorFechaMedico("1","2015-05-17","2015-05-19"));
		System.out.println(s.buscarSuDisponbilidadHoraPorFechaMedico("1","2015-05-17","2015-05-21"));
		System.out.println(s.buscarSuDisponbilidadHoraPorFechaMedico("1","2015-05-17","2015-05-30"));
		System.out.println(s.buscarSuDisponbilidadHoraPorFechaMedico("1","2015-06-17","2015-06-21"));
		System.out.println(s.buscarSuDisponbilidadHoraPorFechaMedico("1","2015-04-17","2015-06-21"));*/
		
		//System.out.println(s.obtenerPacientesMasAtendido("2015-05-12","2015-05-28"));
		
		//System.out.println(s.obtenerPorcentajeOcupacionMedico("2015-05-01","2015-05-28"));
		System.out.println(s.obtenerMedicosMasSolicitado("2015-05-01","2015-05-28"));
	}

}
