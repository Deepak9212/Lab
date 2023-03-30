package LabMarch30;

	public class LoaderThread implements Runnable {

	    private Integer startNumber;
	    private Integer lastNumber;
	    private ListLoader loader;

	    public LoaderThread(Integer startNumber, Integer lastNumber, ListLoader loader) {
	        this.startNumber = startNumber;
	        this.lastNumber = lastNumber;
	        this.loader = loader;
	    }

	    @Override
	    public void run() {
	        loader.loadList(startNumber, lastNumber);
	    }
}
