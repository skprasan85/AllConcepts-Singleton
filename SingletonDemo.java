package com.project.singleton;

public class SingletonDemo {

	public static void main(String[] args) {
		
		//Thread to prove Synchronization
		/*Thread t1 = new Thread(new Runnable(){
			public void run(){
				Singleton obj1 = Singleton.getInstance();
				System.out.println(obj1);
			}
		});
		Thread t2 = new Thread(new Runnable(){
			public void run(){
				Singleton obj1 = Singleton.getInstance();
				System.out.println(obj1);
			}
		});
		
		t1.start();
		t2.start();*/
		
		/*Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		System.out.println(obj1);
		System.out.println(obj2);*/
	}

}


/*class Singleton {
	
	static Singleton singObj; //if "new" object created here it is called eager initialization
	
	//private Constructor
	private Singleton(){
		System.out.println("Instance Created");
	}
	
	public static synchronized Singleton getInstance(){
		
		//Double Checked locking - instead of synchronized method, using synchronized block
		
		if(singObj == null){
			
			synchronized(Singleton.class){
				if(singObj == null)
				singObj = new Singleton();				
			}			
		}
		return singObj;
	}
	
}*/


//Another best way - Enum is already thread safe.

enum Singleton{
	INSTANCE;
}