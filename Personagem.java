public class Personagem {
    String nome;
    int nivel;
    int forca;

    // void => signigifa que não esta retornando nada 
    void mostrarStatus();{
    System.out.format("Personagem: %s (lvl %d) com %d do forca.", nome, nivel,forca);
}
int calcularDano(){
    Randon gerador = new Random();
    
    // 1....20
    // nextInt(): 0...19
    // nextInt(): 0 => 20

    int dado20Faces = 1 + gerador.nextInt()
    int dano = forca + dado20Faces;
    return dano;

} 

void atacar(String alvo, String habilitar){
    int danoCausado =0;
// "" o tamanha (.length) e igual 0    
    if(habilidade.length() > 0){
    System.out.format("%s atacou e causou %d de dano.\n", nome, alvo, forca );
    }else{
     System.out.format("%s usou '%s' contra 's'  e causou %d de dano.\n", nome, 
     habilidade, alvo, forca );   
    }

}
}