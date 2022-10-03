class Main {
  public static void main(String[] args) {
    Pilha p = new Pilha(2);
    p.push("Víctor", 121116739);
    p.push("Matheus", 12554789);
    System.out.println(p.atingiuTamanhoMaximo());
    }
}
