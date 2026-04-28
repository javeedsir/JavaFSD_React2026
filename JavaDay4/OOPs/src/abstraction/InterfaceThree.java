package abstraction;

public interface InterfaceThree  extends InterfaceOne , InterfaceTwo {  // multiple inheritance
	
	
	public void three();

}


class  MyImp  implements InterfaceThree{

	@Override
	public int one() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void two() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void three() {
		// TODO Auto-generated method stub
		
	}
	
	
}