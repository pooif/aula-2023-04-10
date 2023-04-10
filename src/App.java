import java.awt.Color;

class App {
  public static void main(String[] args) {

    Color c123 = Color.ORANGE;
    
    // Value Object: Representação e Formato
    // método: do objeto (da instância) e da classe (coletivo)

    // método fábrica (método estático/classe)
    Cor c = Cor.rgb(15, 100, 23); // construindo Cor

    System.out.println(c.getRed()); // 120
    System.out.println(c.getGreen()); // 100
    System.out.println(c.getBlue()); // 23

    Cor c2 = Cor.string("23 43 123"); // convenção do formato

    System.out.println(c2.getBlue()); // 123

    Cor c3 = Cor.hsl(200, 0.8, 0.3);

    // método fábrica (factory method)

    // representação string do objeto
    System.out.println(c.toString());
    System.out.println(c2.toString());
    System.out.println(c.toHexString()); // 

    // métodos from (fabrica) e to (converte)

    Cor red1 = Cor.VERMELHO;
    Cor red2 = Cor.VERMELHO;

    Cor red3 = Cor.rgb(255, 0, 0);

    System.out.println(red1 == red2);
    System.out.println(red1 == red3);

    Cor darkerRed = red1.darking();

    Cor darkerRed2 = Cor.VERMELHO.darking().darking().darking().darking();

    System.out.println(darkerRed2.getRed()); // 251
    System.out.println(darkerRed2.getBlue()); // 0
  }
}