package thread_4.thread_4_2.thread_4_2_4.project_1_ReadWriteLockBegin4;


public class ThreadB extends Thread {

	private Service service;

	public ThreadB(Service service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.write();
	}
}