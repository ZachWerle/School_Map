package processing.test.sketch_181220a;

import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.lang.Math; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class sketch_181220a extends PApplet {



float s, x, y, fx1, fx2, fy1, fy2, fb, fa;


public void setup(){
  
  orientation(LANDSCAPE);
  s = 1;
  x = 100;
  y = 100;
  fx1 = 0;
  fx2 = 0;
  fy1 = 0;
  fy2 = 0;
  fa = 0;
  fb = 0;
}

public void draw(){
  background(255);
  scale(s);
  rect(x, y, 100, 100);
  if( touches.length == 2){
    fx1 = touches[0].x;
    fx2 = touches[1].x;
    fy1 = touches[0].y;
    fy2 = touches[1].y;
    
    fa = abs((fx1 - fx2) + (fy1 - fy2));
    
    if( fa < fb){
      s -= 0.05f;
    }
    if( fa > fb){
      s += 0.05f;
    }
    
    fb = fa;
    
  }
}

public void touchMoved() {
  if(touches.length == 1){  
    x = mouseX;
    y = mouseY;
  }
}
  public void settings() {  fullScreen(); }
}
