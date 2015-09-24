//// GLOBALS:  coordinates, speed, etc.
float x, y;       // Position of creature.
float dx, dy;     // Speed.
float horizon;

//// SETUP:  window size, initialization (start in middle of screen).
void setup() {
  size( 640,480);
  horizon=  height/4;
  x=  width/2;
  y=  height/2;
  dx=  3;
  dy=  2;
}

//// NEXT FRAME:  scene, action, show.
void draw() {
  //// SCENE:  sky, sun, tree, house, etc.
  background( 100,150,200 );                // sky
  fill( 255,255,0 );
  ellipse( width*3/4, height/8, 40,40 );    // sun
  // Grass
  fill( 100,200,100 );
  rect( 0,horizon, width,height*3/4 );      // grass.
  //Mouse X Coordinate on screen
  line(mouseX, 0, mouseX, 480); 
  //Mouse Y Coordinate on screen
  line(0,mouseY,640,mouseY); 

  text(mouseX, 50,50);// Mouse X coordinate
  text(mouseY, 50,70);// Mouse Y coordinate

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
  text( "My name is Chris", 10,height-20 );                                          
                                            
  //// ACTION:  move (x,y) coordinates.
  x=  x + dx;
  y=  y + dy;
  
  //// SHOW:  display the creature at (x,y)

  /* INSERT YOUR CODE HERE! */
  fill(255,0,0); rect( x,y, 30,50 );        /* REPLACE THIS WITH YOUR OWN CODE! */
  text( "Pal", x,y );

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
