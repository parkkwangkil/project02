package exercise;

 class NumberBox {
	public int ivalue;
	public float fvalue= 0;

	void print(){
		System.out.println("1"+ivalue+"1"+fvalue);
	}
	
	class Exercise {
		public void main(String[] args) {
			NumberBox nb = new NumberBox();
			nb.ivalue = 10;
			nb.fvalue = (float) 1.2345;
		}

	}}
//	void ivalue(int s){
//		ivalue = 10;
//	}
//		
//	void fvalue(){
//		fvalue = (float) 1.2345;
//	}
//	
//	public String toString() {
//		return "필드:" + ivalue + ", 필드:" + fvalue;
//	}
//	
//}
//			
//
//
