package study01;

public class MainThread {

	public static void main(String[] args) {

		// get current Thread
		Thread thread = Thread.currentThread();
		System.out.println("current thread: " + thread);
		// Thread[main,5,main]
		
		// get current Thread Group
		ThreadGroup threadGroup = thread.getThreadGroup();
		System.out.println("current thread group: " + threadGroup);
		// java.lang.ThreadGroup[name=main,maxpri=10]
		
		// get parent of current Thread Group
		ThreadGroup threadGroupParent = thread.getThreadGroup().getParent();
		System.out.println("parent of current thread group: " + threadGroupParent);
		// java.lang.ThreadGroup[name=system,maxpri=10]
		// here: system - it's JVM
		
		// get parent of parent of current Thread Group
		ThreadGroup threadGroupParentParent = threadGroupParent.getParent(); // null
		// null - JVM doesn't know about Operational System
	}

}
