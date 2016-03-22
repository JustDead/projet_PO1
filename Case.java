public class Case {
  private boolean libre;
  private Pion pion;
  private Joueur joueur;

  public Case(Joueur j){
    this.libre=true;
    this.joueur = j;
  }

  public boolean estLibre(){
   return this.libre;
  }

  public void setPion(Pion p){
    
  }
}
