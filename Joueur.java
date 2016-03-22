import liste.Liste;

public class Joueur {
  private String pseudo;
  private Liste pionCaptures;

  public Joueur(String sonPseudo){
    this.pseudo=sonPseudo;
    this.pionCaptures = new Liste();
  }

  public void ajouterPionCapturer(Pion p){
    this.pionCaptures.add(p);
  }

  public int getNbPionsCaptures(){
    return this.pionCaptures.size()
  }

  public boolean equals(Object o){
    ????
  }

  public int calculerScore(){
    int score = 0;
    for(int i=0; i<this.getNbPionsCaptures(); i++){
      score += ((Pion)this.pionCaptures.get(i)).getScore();
    }
    return score;
  }
}
