public class Case {
  private boolean libre;
  private Pion pion;
  private Joueur joueur;

  public Case(Joueur j){
    this.libre=true;
    this.joueur = j;
    this.pion = NULL;
  }

  public boolean estLibre(){
   return this.libre;
  }

  public void setPion(Pion p){
    this.pion = p;
    this.libre = false;
  }

/* méthode qui sert à libérer la case (méthode ajoutée) */
  public void freeCase(){
    this.pion = NULL;
    this.libre = true;
  }

  public Pion getPion(){
    return this.pion;
  }

  public String toString(){
    String s = "";
    switch (this.pion.getScore()){
      case 1:
        s = "P";
        break;
      case 2:
        s = "M";
        break;
      case 3:
        s = "G";
        break;
      default:
        s = " ";
        break;
    }
    return s;
  }
}
