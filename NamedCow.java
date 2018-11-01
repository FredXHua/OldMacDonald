class NamedCow extends Cow
{
 private String myName;
 public NamedCow(){
   myName = "theName";
 }
 public NamedCow(String name, String sound, String type){
   myName = name;
   mySound = sound;
   myType = type;
 }
  public String getName(){return myName;}  
}
