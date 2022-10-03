
public class Pilha{
  public int topo;
  public int tam_max;
  public Agenda[] itens;

  public Pilha(int n) {
    itens = new Agenda[n];
    tam_max = n;
    topo = 0;
  }

  public void push(String nome, long tel){
    //valor do item a ser adicionado na pilha
  itens[topo] = new Agenda(nome, tel);
  topo ++;
  }

  public void pop(){
  topo --;
  }

  public Boolean atingiuTamanhoMaximo(){
    if (topo == tam_max){
      Agenda[] itens2 = new Agenda[tam_max * 2];
      for(int i = 0; i == tam_max; i++){
        itens2[i] = itens[i];
      }
      itens = new Agenda[tam_max*2];
      for(int i = 0; i == tam_max; i++){
        itens[i] = itens2[i];
      }
      tam_max = tam_max * 2;
      return true;
    }
    return false;
  }

  public String top(){
    return itens[topo - 1].nome + " " + itens[topo - 1].tel;
  }

  public int size(){
    return topo;
  }

  public boolean empty(){
    return (topo == 0); 
  }
}
