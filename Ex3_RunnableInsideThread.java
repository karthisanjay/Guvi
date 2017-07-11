
public class Ex3_RunnableInsideThread {
	public static void main(String[] args){
		
		Thread t = new Thread(new Runnable(){

			public void run() {
				for(int i=0;i<10;i++){
					System.out.println("Hi"+i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
		});
		t.start();
	}
}
