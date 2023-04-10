
class Cor {
  // Cor pré-instanciada (objeto pré-existente)
  static final Cor VERMELHO = new Cor(255, 0, 0);
  static final Cor AZUL = new Cor(0, 255, 0);

  private final int r, g, b;

  // construtor não é visível fora da classe Cor
  private Cor(int r, int g, int b) {  
    this.r = r < 0 ? 0 : (r > 255 ? 255 : r);
    this.g = g < 0 ? 0 : (g > 255 ? 255 : g);
    this.b = b < 0 ? 0 : (b > 255 ? 255 : b);
  }

  static Cor rgb(int r, int g, int b) {
    if (r == 255 && g == 0 && b == 0) return VERMELHO;
    return new Cor(r, g, b);
  }

  int getRed() { return r; }
  int getGreen() { return g; }
  int getBlue() { return b; }

  public static Cor string(String str) { // str = "num num num"
    String[] split = str.split(" "); // "11 12 13" => {"11", "12", "13"}

    int r = Integer.parseInt(split[0]);
    int g = Integer.parseInt(split[1]);
    int b = Integer.parseInt(split[2]);

    return rgb(r, g, b);
  }

  public static Cor hsl(int h, double s, double l) {
    // conversão de hsl para rgb
    return null;
  }


  @Override
  public String toString() {
    // return "rgb(%d, %d, %d)".formatted(r, g, b); // Java 15+?
    return String.format("rgb(%d, %d, %d)", r, g, b);
  }

  public String toHexString() {
    return "#" + Integer.toString(r, 16)
      + Integer.toString(g, 16) 
      + Integer.toString(b, 16);
    
    // return String.format("#%x%x%x", r, g, b);
  }

  public static Cor red() {
    return rgb(255, 0, 0);
  }

  public Cor darking() {
    return new Cor(r - 1, g - 1, b - 1);
  }
}
