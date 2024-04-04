import java.util.*;
public class Sound
{
  /** the array of values in this sound; guaranteed not to be null */
  int[] samples;



  /** Changes those values in this sound that have an amplitude greater than limit.
   *  Values greater than limit are changed to limit.
   *  Values less than -limit are changed to -limit.
   *  @param limit the amplitude limit
   *         Precondition: limit >= 0
   *  @return the number of values in this sound that this method changed
   */
  public int limitAmplitude(int limit)
  {  
  int count=0;
    for(int i=0;i<samples.length;i++){
    if(samples[i]>limit){
      samples[i]=limit;
      count++;
    }
      else if(samples[i]<limit*(-1)){
        samples[i]=limit*(-1);
        count++;
      }
    }
    return count;
    }
    public void trimSilenceFromBeginning()
  {
    int start=0;
    boolean flip=false;
    while(flip==false){
      int k=0;
       if(samples[k]!=0)
      flip=true;
      
      if(samples[k]==0&&flip==false)
      start++;

     k++;
    }
    int [] list=new int[samples.length-start];
    for(int j=0;j<list.length;j++){
    list[j]=samples[j+start];
    }
    samples=list;
  }
  }






