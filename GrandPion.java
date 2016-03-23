public GrandPion extend Pion{

private int score=3;

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

  public Liste getDeplacement(coordDepartX int, coordDepartY int, coordArriveeX int,  coordArriveeY int){
  }

  /**selecteur qui donne le chemin vertical
  *@param coordDepartX qui represente la coordonnée X de départ
  *@param coordDepartY qui represente la coordonnée Y de départ
  *@param coordArriveeX qui represente la coordonnée X d'arrivée
  *@param coordArriveeY qui represente la coordonnée Y d'arrivée
  */

  protected Liste getCheminVertical(coordDepartX int, coordDepartY int, coordArriveeX int,  coordArriveeY int){

  }

  /**selecteur qui donne le chemin horizontal
  *@param coordDepartX qui represente la coordonnée X de départ
  *@param coordDepartY qui represente la coordonnée Y de départ
  *@param coordArriveeX qui represente la coordonnée X d'arrivée
  *@param coordArriveeY qui represente la coordonnée Y d'arrivée
  */

  protected Liste getCheminHorizontal(coordDepartX int, coordDepartY int, coordArriveeX int,  coordArriveeY int){

  }

  /**selecteur qui donne le chemin diagonal
  *@param coordDepartX qui represente la coordonnée X de départ
  *@param coordDepartY qui represente la coordonnée Y de départ
  *@param coordArriveeX qui represente la coordonnée X d'arrivée
  *@param coordArriveeY qui represente la coordonnée Y d'arrivée
  */

  protected Liste getCheminDiagonal(coordDepartX int, coordDepartY int, coordArriveeX int,  coordArriveeY int){

  }

  /**methode qui permet d'afficher le pion */
  String toString(){
    return "C'est un grand pion qui vaut "+this.getScore()+ "il a du swagg, mangez le, il vaut masse point.";
  }
}
