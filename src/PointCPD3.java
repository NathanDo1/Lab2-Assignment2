// This file contains material supporting section 2.9 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at www.lloseng.com 

/**
 * This class contains instances of coordinates in either polar or
 * cartesian format.  It also provides the utilities to convert
 * them into the other type. It is not an optimal design, it is used
 * only to illustrate some design issues.
 *
 * @author Fran&ccedil;ois B&eacute;langer
 * @author Dr Timothy C. Lethbridge
 * @modified by Nhat Do for SEG 2105F18
 * @version July 2000, updated by Nhat Do September 2018
 */
public class PointCPD3
{
  //Instance variables ************************************************

  /**
   * Contains C(artesian) or P(olar) to identify the type of
   * coordinates that are being dealt with.
   */
  
  /**
   * Contains the current value of X or RHO depending on the type
   * of coordinates.
   */
  private double Rho;
  
  /**
   * Contains the current value of Y or THETA value depending on the
   * type of coordinates.
   */
  private double Theta;
  
  /**
   * Contains the blank initiation value of the x and y coordinate after converted to Cartesian Coordinate
   */
  private double x;
  private double y; 
	
  
  //Constructors ******************************************************

  /**
   * Constructs a coordinate object, with a type identifier.
   */
  public PointCPD3(double Rho, double Theta)
  {
    
    this.Rho = Rho;
    this.Theta = Theta;
    this.x = 0.0;
    this.y = 0.0;
   
  }
	
  
  //Instance methods **************************************************
 
 
  public double getRho()
  {
	  return Rho;
  }
  
  
  public double getTheta()
  {
      return Theta;
      
  }
  
  public double getX() {
	  return x;
  }
  
  public double getY() {
	  return y; 
  }

	
  /**
   * Converts Polar coordinates to Cartesian coordinates.
   */
  public void convertStorageToCartesian()
  {
	  
    x = (Math.cos(Math.toRadians(Theta)) * Rho);
    y = (Math.sin(Math.toRadians(Theta)) * Rho);
    
  }

  

  /**
   * Returns information about the coordinates.
   *
   * @return A String containing information about the coordinates.
   */
  public String toString()
  {
    return "Stored as Polar Coordinate: (" + getRho() +"," + getTheta() +")\n" + "Converted to Cartesian Coordinate (" + getX() + "," + getY() +")";
  }
}


