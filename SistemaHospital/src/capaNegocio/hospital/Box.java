package capaNegocio.hospital;

import java.io.IOException;
import java.io.StringWriter;

import org.json.simple.JSONObject;
import org.orm.PersistentException;

public class Box {
	private int idBox;
	private String numeroBox;

	public Box(int idBox, String numeroBox) {
		super();
		this.idBox = idBox;
		this.numeroBox = numeroBox;
	}

	public Box() {
		// TODO Auto-generated constructor stub
	}

	public int getIdBox() {
		return idBox;
	}

	public void setIdBox(int idBox) {
		this.idBox = idBox;
	}

	public String getNumeroBox() {
		return numeroBox;
	}

	public void setNumeroBox(String numeroBox) {
		this.numeroBox = numeroBox;
	}

	// ----------------------------------------------------------------------------------
	public String buscarBox() {
		JSONObject obj = new JSONObject();
		StringWriter out = new StringWriter();
		String jsonText = "";
		try {
			orm.Box[] listaBox = orm.BoxDAO.listBoxByQuery(null, null);
			if (listaBox.length > 0) {

				for (orm.Box box : listaBox) {
					obj.put("id", box.getIdHabitacion());
					obj.put("nombre", box.getNroHabitacion());
					obj.writeJSONString(out);
					jsonText = out.toString();
				}

			}
		} catch (PersistentException e) {
			jsonText = null;
			e.printStackTrace();
		} catch (IOException e) {
			jsonText = null;
			e.printStackTrace();
		}

		return jsonText;
	}

	public String buscarBoxPorId() {
		JSONObject obj = new JSONObject();
		StringWriter out = new StringWriter();
		String jsonText = "";
		try {
			orm.Box box = orm.BoxDAO.getBoxByORMID(this.idBox);

			obj.put("id", box.getIdHabitacion());
			obj.put("nombre", box.getNroHabitacion());
			obj.writeJSONString(out);
			jsonText = out.toString();

		} catch (PersistentException e) {
			jsonText = null;
			e.printStackTrace();
		} catch (IOException e) {
			jsonText = null;
			e.printStackTrace();
		}

		return jsonText;
	}

}
