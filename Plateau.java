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
    for(int j=0; j<(this.tailleVerticale/2); j++){
      for(int i=0; i<this.tailleHorizontale; i++){
        this.cases[i][j] = new Case(j1);
      }
    }
    for(int j=(this.tailleVerticale/2); j<this.tailleVerticale; j++){
      for(int i=0; i<this.tailleHorizontale; i++){
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

    /*placement des pions du joueur 2 */
    this.cases[3][7].setPion(new GrandPion());
    this.cases[3][6].setPion(new GrandPion());
    this.cases[2][7].setPion(new GrandPion());
    this.cases[1][7].setPion(new MoyenPion());
    this.cases[2][6].setPion(new MoyenPion());
    this.cases[3][5].setPion(new MoyenPion());
    this.cases[1][6].setPion(new PetitPion());
    this.cases[1][5].setPion(new PetitPion());
    this.cases[2][5].setPion(new PetitPion());
  }

  public String toString(){

  }
}
