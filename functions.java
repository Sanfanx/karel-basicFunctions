class program {
    void turnright() {
        iterate(3){
            turnleft();
        }
    }

    void recoger_todo(pasos){
        iterate(pasos){
            while(nextToABeeper()) {
                pickbeeper();
            }
            move();
        } 
        if(nextToABeeper()) {
            pickbeeper();
        }
    }

    void dejar_todo(pasos,cuantos){
        iterate(pasos){
            iterate(cuantos){
                if (anyBeepersInBeeperBag){
                    putbeeper();
                }
            }
            move();
        } 
    }

    void recoger_en_perimetro(longitud) {
      iterate(4){
        iterate(longitud) {
          while(nextToABeeper()) {
            pickbeeper();
          }
          move();
        }
        turnright();
      }
    }
  
    void rodear_camino(recoger_beepers) {
        //recoger_beepers = 1; (TRUE)
        //recoger_beepers = 0; (FALSE)
        //turnleft();
        if (rightIsBlocked()){
            while(rightIsBlocked()) {
                iterate(recoger_beepers){
                    while(nextToABeeper()) {
                        pickbeeper();
                    }
                }
                move(); 
            }
            iterate (3){
                turnleft();
            }
            move();
        
            iterate (3){
                turnleft();
            }
        
            move();
            turnleft();
        }
        else
        {
            while(leftIsBlocked()) {
                iterate(recoger_beepers){
                    while(nextToABeeper()) {
                        pickbeeper();
                    }
                }
                move(); 
            }
            turnleft();
            move();
        
            turnleft();
            move();
        

            iterate(3) {
                turnleft();
            }
        }
    }

    void salir_laberinto_simple(){
        while(nextToABeeper()) {
            
            if(rightIsBlocked()) {
                if(frontIsClear()) {
                    pickbeeper();
                    move();
                }
                else {
                    turnleft();
                }
            }
            else {
                turnright();
                pickbeeper();
                move();
            }
        }
        turnleft();
        turnleft();
        move();
    }
    program () {
        //CODIGOOOOOO :D
    }
}
