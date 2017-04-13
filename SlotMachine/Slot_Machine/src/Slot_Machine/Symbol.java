package Slot_Machine;

public class Symbol implements ISymbol {
	
	private String path;
	private int value;
	
	//Reel reelComp = new Reel();
	
	public void setImage(String p){
		path = p;
	}
	
	public String getImage(){
		return path;
		
	}
	
	public void setValue(int v){
		value = v;
	}
	
	public int getValue(){
		return value;
		
	}
	
	public Symbol symbolCompare(Symbol i, Symbol j, Symbol k){
		
		if(i.equals(j) && j.equals(k)){
			System.out.println("1");
			return i;
		}
		else if(i.equals(j)){
			System.out.println("2");
			return i;
		}
		else if(i.equals(k)){
			System.out.println("3");
			return i;
		}
		else if(j.equals(k)){
			System.out.println("4");
			return j;
		}else{
			System.out.println("5");
			return k;
		}
		
		
	}

}

