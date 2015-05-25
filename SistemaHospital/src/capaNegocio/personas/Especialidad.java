package capaNegocio.personas;

import java.io.IOException;
import java.io.StringWriter;

import org.json.simple.JSONObject;
import org.orm.PersistentException;

public class Especialidad {
	private int id;
	private String nombre;

	public Especialidad() {
		// TODO Auto-generated constructor stub
	}

	public Especialidad(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// ---------------------------------------------------------------------------------------
	public String buscarTodasEspecilidades() {
		JSONObject obj = new JSONObject();
		StringWriter out = new StringWriter();
		String jsonText = "";
		

		try {
			orm.Especialidad[] ormEspecialidads = orm.EspecialidadDAO.listEspecialidadByQuery(
					null, null);
			if (ormEspecialidads.length > 0) {
				for (orm.Especialidad especialidad : ormEspecialidads) {
					obj.put("id", especialidad.getId());
					obj.put("nombre", especialidad.getNombreEspecialidad());
					obj.writeJSONString(out);
					jsonText = out.toString();
				}
				
				
			}
		} catch (PersistentException e) {

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return jsonText;
	}
	// ---------------------------------------------------------------------------------------
}
