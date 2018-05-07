//has numerical information about ball 

public class Ball {
  //Stores x/y component (location, speed)
  PVector loc;
  PVector speed;
  
  Ball(PVector loc, PVector speed) {
    this.loc = loc;
    this.speed = speed;
  }
}