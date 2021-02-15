//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.ArrayList;

public class NumberAnalyzer
{
	private ArrayList<Number> list;

	//write a constructor
  public NumberAnalyzer(int[]n)
  {
    list = new ArrayList<Number>();
    for(int a: n)
    {
      list.add(new Number(a));
    }  
  }

	//write count odds
  //Create a method called countOdds
  public int countOdds()
  {
    //declare int variable called oddCount and intialize it to 0
    int oddCount = 0;
    //Create a for each loop with Number called i and iterate through list
    for (Number i : list)
    {
      //Use an if statement to check if number is odd using the isOdd() method
      if(i.isOdd() == true )
      {
        //increment oddCount++
        oddCount++;
      }
    }
    return oddCount;
  }

	//write count evens
  //Create a method called countEvens
  public int countEvens()
  {
    //declare int variable called evenCount and initialize it to 0
    int evenCount = 0;
    //Create a for each loop with Number called e and iterate through list
    for(Number e: list)
    {
      //Use an if statement to check if number is even using the isOdd() method to check if the number is not odd
      if(e.isOdd() == false )
      {
        //increment evenCount++
        evenCount++;
      }
    }
    return evenCount;
  }

	//write count perfects
  //Create a method called countPerfects
	public int countPerfects()
  {
    //declare int variable called perfectCount and initialize it to 0
    int perfectCount = 0;
    //Create a for each loop with Number called p and iterate through list
    for(Number p: list)
    {
      //Use an if statement to check if number is perfect using the isPerfect() method
      if(p.isPerfect() == true )
      {
        //increment perfectCount++
        perfectCount++;
      }
    }
    return perfectCount;
  }

	//write a toString
  public String toString()
  {
    //return the list
  return "" + list;
  }
}