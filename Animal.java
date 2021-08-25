public abstract class Animal {
  //atributos de Animal
  protected float peso;
  protected int idade;
  protected int membros;

  //metodos de Animal
  public abstract void locomover();
  public abstract void alimentar();
  public abstract void emitirSom();

  public float getPeso(){
    return this.peso;
  }
  public void setPeso(float peso){
    this.peso = peso;
  }

  public int getIdade(){
    return this.idade;
  }
  public void setIdade(int idade){
    this.idade = idade;
  }

  public int getMenbros(){
    return this.membros;
  }
  public void setMembros(int membros){
    this.membros = membros;
  }
}