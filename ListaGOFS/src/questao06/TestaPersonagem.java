package questao06;

public class TestaPersonagem {
	
	public static void main(String[] args) {
		
		Monstro monstroAgua = new MonstroAgua("Aquarius", 3);
		
		Personagem superGirl = new Personagem("Super Girl", "super força", monstroAgua);
		
		superGirl.recebeAtaque();
	}

}
