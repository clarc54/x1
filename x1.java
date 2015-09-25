//////// Exercise x2:  modularize exercise x1, and add dog to chase hero.
//////// Christopher Clark  (CST 112; Sept. 24, 2015)

//////// Please change these to your name and today's date.
String author=  "Christopher Clark";
String title=  " x2 ";
String help=  " Click to relocate hero \n 'q' to quit; 'r' to reset. ";


//// GLOBALS:  coordinates, speed, etc.
float horizon;
float x, y;       // Position.
float dx, dy;     // Speed.
float dogX, dogY;

//// SETUP:  window size, initialization (start in middle of screen).
void setup() {
  size(640,480);
  horizon=  height/4;
  x=  width/2;
  y=  height/2;
  dx=  3;
  dy=  2;
}

//// NEXT FRAME:  scene, action, show.
void draw() {
  scene();
  hero();
  dog();
  messages();
}

//// SCENE:  sky, sun, tree, house, etc.
void scene() {  
 background( 100,150,200 );                // sky
  fill( 255,255,0 );
  ellipse( width*3/4, height/8, 40,40 );    // sun
  // Grass
  fill( 100,200,100 );
  rect( 0,horizon, width,height*3/4 );      // grass.
  line(mouseX, 0, mouseX, 480);             //Mouse X Coordinate
  line(0,mouseY,640,mouseY);                //Mouse Y Coordinate
  text(mouseX, 50,50);                      // Mouse X coordinate on screen
  text(mouseY, 50,70);                      // Mouse Y coordinate on screen
  /* INSERT YOUR CODE HERE! */
  //Tree
  fill(139,69,19);
  rect( 150,50,50,70 );
  fill(0,100,0);
  triangle(135,50, 175,0, 215,50);
  // House
  fill(255,228,196);
  rect(300,60, 85,60);
  fill(75,75,75);
  triangle(300,60, 340,20, 385,60);
  fill(88,58,12);
  rect(310,80, 20,40);
  fill(255);
  rect(350,86, 25,25);
  fill(0);
}

void messages() {
  text( title, width/3, 20 );
  text( help, width*2/3, 30 );
  text( author, 10,height-20 );
}

//// ACTION:  move (x,y) coordinates of hero & dog; show them.
void hero() {
  fill(255,0,0); 
  ellipse(x,y, 30,50);
  text( "Hero", x,y ); 
  //// ACTION:  move (x,y) coordinates.
  x=  x + dx;
  y=  y + dy;
}
void dog() {
  dogX=  dogX + (dogX-x)/30;
  dogY=  dogY + (dogY-x)/40;
  fill(0,255,0);
  ellipse(x+50,y+50, 30,50);
  text("Pal", x+50,y+50);
  x=  x + dx;
  y=  y + dy;
}




//////// HANDLERS:  mouse clicks, keys
void mousePressed() {
  x=  mouseX;                             // Set (x,y) to mouse
  y=  mouseY;
  //
  dx=  random( -6, +6 );                  // random speed.
  dy=  random( -4, +4 );
}
void keyPressed() {
  if (key == 'q') {
    exit(); }             // press 'q' key to QUIT.
}
  /* INSERT YOUR CODE HERE! */
