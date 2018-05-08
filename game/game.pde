class Target {
  PVector loc;
  PVector speed;
  int diameter = 120;
  
  Target(PVector loc, PVector speed) {
    this.loc = loc;
    this.speed = speed;
  }
  
  void update() {
    loc.add(speed);
  }
  
  void draw() {
    noStroke();
    fill(255, 0, 0);
    ellipse(loc.x, loc.y, diameter, diameter);
  }  
  
  /*test collision within target
  pythagorean theorem (find distance of two points from x/y values)
  distance function (related to PVector)
  or float dist = PVector.dist(player.loc, enemy.loc); OR player.loc.dist(enemy.loc);*/
  boolean contains(int x, int y) {
    PVector point = new PVector(x, y);
    float dist = PVector.dist(this.loc, point);
    
    return dist <= this.diameter/2;
  }
}

//declare variable globally so you can use it throughout the file
Target t;
//create arraylist to access all targets, must loop through array
//better to loop through once.. can do many things in one loop
ArrayList<Target> targets;
//create global score variable
int score;

void setup() {
  size(600,600);
  
  //initalize score variable
  score = 0;
  
  //initialize array list
  targets = new ArrayList();
  
  //assign random x/y location to target, add target to array list of targets
  for (int i = 0; i < 5; i++) {
    float x = random(0, width);
    float y = random (0, height);
    PVector loc = new PVector(x, y);
    
    float dx = random(-5, 5);
    float dy = random(-5, 5);
    PVector speed = new PVector(dx, dy);
    targets.add(new Target(loc, speed));
  }
}

void draw() {
  
  if (frameCount % 60 == 0) {
    float x = random(0, width);
    float y = random (0, height);
    PVector loc = new PVector(x, y);
    PVector speed = new PVector(0, 0);
    targets.add(new Target(loc, speed));
  }
  
  background(255, 255, 255);
  
  for (int x = 0; x < targets.size(); x++) {
    targets.get(x).update();
    targets.get(x).draw();
  }
  
  //score text
  fill(0);
  textSize(35);
  text("Score: " + score, 10, 50);
}

void mousePressed() {
  //check all targets for collision
  for (int i = 0; i < targets.size(); i++) {
    if (targets.get(i).contains(mouseX, mouseY)) {
      //keep track of frame count to see if it is actually working within the flood of collides
      println(frameCount + "Collide!!");
      
      //destory target;
      targets.remove(i);
      
      //add to score
      score ++;
      
      //so that it only checks for one target, after one is hit it won't hit another that it may overlap
      break;
    }
  }
}
