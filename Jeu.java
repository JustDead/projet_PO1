public class Jeu {
  private Joueur[] joueurs;
  private Plateau plateau;

  public Jeu(int x, int y, String j1, String j2){
    this.initialiserJoueur(j1,j2)
    this.initialiserPlateau(x,y,this.joueurs[0],this.joueurs[1]);
  }

  public void initialiserPlateau(int x, int y, Joueur j1, Joueur j2){
    this.plateau = new Plateau(x,y,j1,j2);
  }

  public void jouer(Joueur j){

  }

  private void initialiserJoueur(String j1, String j2) {
    this.joueurs = new Joueur[2];
    this.joueurs[0] = new Joueur(j1);
    this.joueurs[1] = new Joueur(j2);
  }

  public boolean deplacementPossible(int coordDepartX, int coordDepartY, int coordArriveX, int coordArriveY, Joueur j){

  }

  public boolean deplacer(int coordDepartX, int coordDepartY, int coordArriveX, int coordArriveY, Joueur j){

  }

  public Joueur joueurVainqueur(){

  }

  public boolean arretPartie(){

  }

  public String toString(){

  }

}
