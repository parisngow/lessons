Ball player;
ArrayList<Ball> enemies;

void setup() {
  size(600, 600);
  
  //initialize player
  PVector loc = new PVector(150, 250);
  PVector speed = new PVector(0, 0);
  player = new Ball(loc, speed);
  
  //initialize enemies
  enemies = new ArrayList();
  PVector eLoc = new PVector(width, 200);
  PVector eSpeed = new PVector(-2, 0);
  Ball enemy1 = new Ball(eLoc, eSpeed);
  enemies.add(enemy1);
}

void draw() {
  //initialize enemies in a controlled environment lmao
  if (frameCount % 60 == 0) {
    PVector eLoc = new PVector(width, random(0, height));
    PVector eSpeed = new PVector(-2, 0);
    Ball enemy1 = new Ball(eLoc, eSpeed);
    enemies.add(enemy1);
  }
  
  background(0, 0, 0);
  
  //draw player which has loc/speed of ball class, fill pink
  noStroke();
  fill(#FFC0CB);
  ellipse(player.loc.x, player.loc.y, 60, 60);
  
  //move and draw enemies
  for (Ball enemy : enemies) {
    //move
    enemy.loc.add(enemy.speed);
    
    /*check collision
    or PVector.dist(player.loc, enemy.loc);*/
    float dist = player.loc.dist(enemy.loc);
    if (dist < 30+30) {
      println("COLLISION");
      background(255, 0, 0);
    } else {
      println();
    }
    
    //draw
    noStroke();
    fill(#FF0000);
    ellipse(enemy.loc.x, enemy.loc.y, 60, 60);
  }
}

void mouseMoved() {
  player.loc.set(80, mouseY);
}