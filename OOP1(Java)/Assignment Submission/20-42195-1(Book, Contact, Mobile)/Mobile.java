public class Mobile{
	
	//access modifier,dataType,variable name
	private String mobileOwnerName;
	private String mobileNumber;
	private double mobileBalance;
	private String mobileOSName;
	private boolean lock;

	
	//Empty Constructor
    public Mobile(){
		
		System.out.println("Mobile");
	 }
	
	//Parameterized Constructor
	public Mobile(String mobileOwnerName,String mobileNumber,double mobileBalance,String mobileOSName,boolean lock){
		
		this.mobileOwnerName=mobileOwnerName;
		this.mobileNumber=mobileNumber;
		this.mobileBalance=mobileBalance;
		this.mobileOSName=mobileOSName;
		this.lock=lock;
	}
	
	//Setter & Getter Method
	public void setMobileOwnerName(String mobileOwnerName){
		this.mobileOwnerName=mobileOwnerName;
	}
	public String getMobileOwnerName(){
		return mobileOwnerName;
	}
	public void setMobileNumber(String mobileNumber){
		this.mobileNumber=mobileNumber;
	}
	public String getMobileNumber(){
		return mobileNumber;
	}
	public void setMobileBalance(double mobileBalance){
		this.mobileBalance=mobileBalance;
	}
	public double getMobileBalance(){
		return mobileBalance;
	}
	public void setMobileOSName(String mobileOSName){
		this.mobileOSName=mobileOSName;
	}
	public String getMobileOSName(){
		return mobileOSName;
	}
	public void setLock(boolean lock){
		this.lock=lock;
	}
	public boolean isLock(){
		return lock;
	}
	
	public void showInfo(){
		
		System.out.println("Owner name :"+mobileOwnerName);
		System.out.println("Mobile number :"+mobileNumber);
		System.out.println("Mobile balance :"+mobileBalance);
		System.out.println("Mobile osname :"+mobileOSName);
		System.out.println("Is lock :"+lock);
	}
	
	public void recharge(int amount){
		
		mobileBalance = mobileBalance + amount;
		System.out.println("After Recharge :"+mobileBalance);
	}
	
	//After calling someone
	public void callSomeOne(int timeDuration){
		
		if(mobileBalance > 0){
			
			mobileBalance = mobileBalance - (timeDuration*0.5);
		}
		
		else{
			
			System.out.println("Not enough balance");
		}
		System.out.println("After calling someone :"+mobileBalance);
}
		
		public static void main(String[] args){
		
		//Create Object
		Mobile M1 = new Mobile("Nafinur Leo","01749207978",75.55,"Android",false);
		
		M1.showInfo();
		M1.callSomeOne(10);
		M1.recharge(20);

	}


}

	
	

