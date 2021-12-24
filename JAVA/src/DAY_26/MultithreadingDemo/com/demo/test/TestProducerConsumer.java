package DAY_26.MultithreadingDemo.com.demo.test;

import DAY_26.MultithreadingDemo.com.demo.beans.Storage;
import DAY_26.MultithreadingDemo.com.demo.threads.MyConsumer;
import DAY_26.MultithreadingDemo.com.demo.threads.MyProducer;


public class TestProducerConsumer {

	public static void main(String[] args) {
		Storage s=new Storage();
		MyProducer p=new MyProducer(s);
		MyConsumer c=new MyConsumer(s);
		p.start();
		c.start();
		
		
	}

}
