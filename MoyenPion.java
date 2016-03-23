public MoyenPion extend GrandPion{

private int score=2;

  /**methode qui permet d'afficher le score du pion */
  public int getScore(){
    return this.score;
  }

  /**selecteur qui donne le déplacement possible
  *@param coordDepartX qui represente la coordonnée X de départ
  *@param coordDepartY qui represente la coordonnée Y de départ
  *@param coordArriveeX qui represente la coordonnée X d'arrivée
  *@param coordArriveeY qui represente la coordonnée Y d'arrivée
  */

  public int Liste getDeplacement(coordDepartX int, coordDepartY int, coordArriveeX int,  coordArriveeY int){
    Liste deplacement = new Liste;
    for(cases de 1 et 2){
      if (case.estLibre){
        case.ajouter à la Liste
      }
    }
    return deplacement;
  }

  public Liste longeurOk(coordDepartX int, coordDepartY int, coordArriveeX int,  coordArriveeY int){

  }

  /**methode qui permet d'afficher le pion */

  String toString(){
    return "C'est un moyen pion qui vaut "+this.getScore()+ "il a du swagg, vous pouvez le mangez, il vaut pas quelques points.";
  }

}

}
