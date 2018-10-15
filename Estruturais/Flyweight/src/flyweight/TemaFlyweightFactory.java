package flyweight;

import java.util.HashMap;
import java.util.Map;

public class TemaFlyweightFactory {
	
	private static Map<Class<? extends TemaFlyweight>, TemaFlyweight> temas = new 
			HashMap<Class<? extends TemaFlyweight>, TemaFlyweight>();
	
	public static final Class<TemaAsterisco> ASTERICO = TemaAsterisco.class;
	public static final Class<TemaHifen> HIFEN = TemaHifen.class;
	public static final Class<TemaHash> HASH = TemaHash.class;
	
	public static TemaFlyweight getTema(Class<? extends TemaFlyweight> clazz) {
		if(!temas.containsKey(clazz)) {
			try {
				temas.put(clazz, clazz.getConstructor().newInstance());
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		
		return temas.get(clazz);
	}

}
