import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(800, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(102, 217, 255);
  }

  public void draw() {
	//house base
  fill(255,255,204);
  rect(200, 300, 400, 300);
  triangle(200, 300, 400, 200, 600, 300);
  
  //grass
  fill(51, 204, 51);
  rect(0, 580, 800, 20);
  
  //door
  fill(255, 204, 102);
  rect(360, 450, 80, 130);

  //windows
  fill (51, 204, 255);
  rect(250, 350, 50, 50);
  rect(500, 350, 50, 50);
  
  //yellow (sun and doorknob)
  fill(255, 255, 0);
  ellipse(100, 100, 100, 100);
  ellipse(420, 520, 10, 10);
  
  //window lines
  line(275, 350, 275, 400);
  line(250, 375, 300, 375);

  line(525, 350, 525, 400);
  line(500, 375, 550, 375);

  //flower stems
  stroke(51, 153, 51);
  strokeWeight(4);
  line(250, 580, 250, 520);
  line(325, 580, 325, 520);
  line(475, 580, 475, 520);
  line(550, 580, 550, 520);
  
  //flowers
  stroke(0);
  strokeWeight(0);

  fill(255, 153, 0);
  ellipse(250, 520, 50, 20);
  ellipse(250, 520, 20, 50);

  ellipse(550, 520, 50, 20);
  ellipse(550, 520, 20, 50);

  fill(255, 102, 255);
  ellipse(325, 520, 50, 20);
  ellipse(325, 520, 20, 50);

  ellipse(475, 520, 50, 20);
  ellipse(475, 520, 20, 50);


  //flower centers
  strokeWeight(1);
  fill(255, 255, 0);
  ellipse(250, 520, 20, 20);
  ellipse(325, 520, 20, 20);
  ellipse(475, 520, 20, 20);
  ellipse(550, 520, 20, 20);

  }
  
}