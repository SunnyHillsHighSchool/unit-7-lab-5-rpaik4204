//header for Number class
public class Number
{
//private instance variable (must be an Integer)
  private int num;

//constructors
  public Number()
  {
    num = 0;
  }

  public Number(int n)
  {
    num = n;
  }

//getter method
  public int getNumber()
  {
    return num;
  }

//setter method
  public void setNumber(int n)
  {
    num = n; 
  }

//isOdd method
  public boolean isOdd()
  {
    //use an if statement to check if the number has a remainder of 1
      if (num % 2 == 1)
      {
        //result equals true
        return true;
      } else 
      {
        //result equals false
        return false;
      }
  }

//isPerfect method
  public boolean isPerfect()
  {
    //declare int variable called divisor
    int divisor;
    //declare int variable sum and initialize it to 0
    int sum = 0;
    //use an if statement to predetermine if number is less than 1
    if (num < 1){
      return false;
    }
    //use a for loop where divisor starts at 1 and iterates through 
    for(divisor = 1; divisor < num; divisor++)
    {
      //use an if statement to check if the remainder of the number divided by the divisor is equal to 0
      if(num % divisor == 0)
      {
        //increment divisor to sum
        sum = sum + divisor;
      }
    }
      //if the number is equal to the sum
    if(num == sum)
    {
      //result is true
      return true;
    } else {
      //result is false
      return false;
    }
    
  }

//toString
  public String toString()
  {
    //return the number
    return "" + num;
  }
}