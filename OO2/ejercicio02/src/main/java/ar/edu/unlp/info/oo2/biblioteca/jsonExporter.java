package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.google.gson.JsonParser;

public class jsonExporter extends VoorheesExporter {
	
	private String exportar(Socio socio) {
		JSONObject o = new JSONObject();
		o.put("x", socio);
		
		System.out.print(o.toJSONString());
		
		return o.toJSONString();
	}

	public String exportar(List<Socio> socios) {
		String separator = System.lineSeparator();
		List<JSONObject> JSONsocios = new JSONArray();
		
		for ( int i = 0; i < socios.size(); i++ ) {
			JSONObject o = new JSONObject();
			o.put("Nombre" ,socios.get(i).getNombre());
			o.put("Email" ,socios.get(i).getEmail());
			o.put("Legajo" ,socios.get(i).getLegajo());
			
			JSONsocios.add(o);
		}
		
		return JSONsocios.toString();
	}

}
