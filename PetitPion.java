public PetitPion extend Pion{

private int score=1;

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
     Liste deplacement = new Liste;
     for(cases en diago de 1){
       if (case.estLibre){
         case.ajouter à la Liste
       }
     }
     return deplacement;
  }


  /**methode qui permet d'afficher le pion */
   public String to String(){
     return "C'est un petit pion qui vaut "+this.getScore()+ "il a du swagg, le mangez pas il vaut pas beaucoup.";
   }

}
