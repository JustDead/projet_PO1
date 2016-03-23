public class Plateau {
  private int tailleHorizontale;
  private int tailleVerticale;
  private Case[][] cases;

  public Plateau(int x, int y, Joueur j1, Joueur j2){
    this.tailleHorizontale = x;
    this.tailleVerticale = y;
    this.cases = new Case[this.tailleHorizontale][this.tailleVerticale];
    this.initialiser(j1,j2);
  }

  public void initialiser(Joueur j1, Joueur j2){
    for(int i=0; i<(this.tailleVerticale/2); i++){
      for(int j=0; j<this.tailleHorizontale; j++){
        this.cases[i][j] = new Case(j1);
      }
    }
    for(int i=(this.tailleVerticale/2); i<this.tailleVerticale; i++){
      for(int j=0; j<this.tailleHorizontale; j++){
        this.cases[i][j] = new Case(j2);
      }
    }

    /*placement des pions du joueur 1*/
    this.cases[0][0].setPion(new GrandPion());
    this.cases[0][1].setPion(new GrandPion());
    this.cases[1][0].setPion(new GrandPion());
    this.cases[0][2].setPion(new MoyenPion());
    this.cases[1][1].setPion(new MoyenPion());
    this.cases[2][0].setPion(new MoyenPion());
    this.cases[1][2].setPion(new PetitPion());
    this.cases[2][1].setPion(new PetitPion());
    this.cases[2][2].setPion(new PetitPion());

    /*placement des pions du joueur 2 (Variable en fonction de la taille du plateau)*/
    this.cases[this.tailleHorizontale-1][this.tailleVerticale-1].setPion(new GrandPion());
    this.cases[this.tailleHorizontale-1][this.tailleVerticale-2].setPion(new GrandPion());
    this.cases[this.tailleHorizontale-2][this.tailleVerticale-1].setPion(new GrandPion());
    this.cases[this.tailleHorizontale-3][this.tailleVerticale-1].setPion(new MoyenPion());
    this.cases[this.tailleHorizontale-2][this.tailleVerticale-2].setPion(new MoyenPion());
    this.cases[this.tailleHorizontale-1][this.tailleVerticale-3].setPion(new MoyenPion());
    this.cases[this.tailleHorizontale-3][this.tailleVerticale-2].setPion(new PetitPion());
    this.cases[this.tailleHorizontale-3][this.tailleVerticale-3].setPion(new PetitPion());
    this.cases[this.tailleHorizontale-2][this.tailleVerticale-3].setPion(new PetitPion());
  }

  public String toString(){
    String s = "";
    for(int i=0; i<this.tailleVerticale; i++){
      for(int j=0; j<this.tailleHorizontale; j++){
        s += "=====";
      }
      s += "\n";
      for(int j=0; j<this.tailleHorizontale; j++){
        s += "|   |";
      }
      s += "\n";
      for(int j=0; j<this.tailleHorizontale; j++){
        s += "| " + this.cases[i][j] + " |";
      }
      s += "\n";
      for(int j=0; j<this.tailleHorizontale; j++){
        s += "|   |";
      }
      s += "\n";
      for(int j=0; j<this.tailleHorizontale; j++){
        s += "=====";
      }
      s += "\n";
    }
    return s;
  }
}
