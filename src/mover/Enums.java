/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mover;

/**
 *
 * @author DungX
 */
public class Enums {

}

  
enum DENSITY {
  HDPI("hdpi"),
  LDPI("ldpi"),
  MDPI("mdpi"),
  XHDPI ("xhdpi"),
  XXHDPI("xxhdpi"),
  XXXHDPI("xxxhdpi"),
  W600DP("w600dp"),
  W720DP("w720dp");
    
  private final String density;

  DENSITY(String density) {
    this.density = density;
  }

  public String getDensity() {
    return density;
  }
  
  
}

enum RESOURCE {
  DRAWABLE("drawable"),
  LAYOUT("layout"),
  MIPMAP("mipmap"),
  VALUES("values"),
  XML("xml");

  private final String type;

  RESOURCE(String type) {      
    this.type = type;
  }

  public String getType() {
    return type;
  }
}