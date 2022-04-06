public class App{
    public static void main(String[] args) throws Exception{
        Personagem heroi = new Personagem();
        heroi.nome = "goku";
        heroi.nivel = 2;
        heroi.forca = 16;

        heroi.mostrarStatus();
        // chamei um metodo atacar e passei como argumento uma string "Hidra"
        heroi.atacar ("Hydra", "");

        System.out.println(heroi.calcularDano());

    }
}