package GInt.GStrings;

import java.util.Stack;
import java.util.Vector;

public class LuggagueBags {

  public static void main(String args[]){
    Vector<Integer> bagsWithLugguage = new Vector<>();
    int MaxBags = 20;
    System.out.println(unloadBaggages(bagsWithLugguage, MaxBags).toString());
  }

  public static Vector<Integer> unloadBaggages(Vector<Integer> bags, int maxCount){
    int count =1;
    Stack<Integer> bagStacks = new Stack<>();
    for( int i=1; i<= maxCount; i++){
      bags.add(i);
      count++;
    }
    System.out.println(bags.size());
    for(Integer i: bags){
      bagStacks.push(i);
    }
    System.out.println("StackSize=" +bagStacks.size());

    Vector<Integer> outputVectors = new Vector<>();
    for(int i=0; i<bagStacks.size(); i++) {
      outputVectors.add(bagStacks.pop());
    }
    return outputVectors;
  }
}
