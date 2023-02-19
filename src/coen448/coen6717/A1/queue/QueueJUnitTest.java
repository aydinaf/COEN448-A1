package coen448.coen6717.A1.queue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class QueueJUnitTest {
	
	private ADTQueue<Integer> Q1;
	private ADTQueue<Integer> Q2;
	private ADTQueue<Integer> Q3;
	private ADTQueue<Integer> Q4;

	private ADTQueue<Integer> Q5;
	private ADTQueue<Integer> Q6;
	

	@BeforeEach
	void setUp() throws Exception {
		
		Q1 = new DQueue<Integer>();
		Q2 = new DQueue<Integer>();
		
		
	}

	@Test
	public void testGeneral() {
		int temp;
		
		Q2.enqueue(10);
		Q2.enqueue(20);
		Q2.enqueue(15);
		assertEquals("< 10 20 15 >", Q2.toString());
		
		while(Q2.length() > 0) {
		  temp = Q2.dequeue();
		  Q1.enqueue(temp);
		}
		assertEquals("< >", Q2.toString());
		assertEquals("< 10 20 15 >", Q1.toString());

	}
		/*
		Test case Aqueue Enqueue 1
		* Tester: Aydin & Kleard
		* Date: Feb 18th 2023
		* Test type: Base case
		* Test case description: Queue not full - Queue not empty - Elements in queue is 1
		* Expected output: Q2 == < 10 >
		* Bug report:
		* */
	@Test
	public void testAqueueEnqueue1() {

		Q2.enqueue(10);

		assertEquals("< 10 >", Q2.toString());

	}

	/*
	Test case Aqueue Enqueue 2
	* Tester: Aydin & Kleard
	* Date: Feb 18th 2023
	* Test type: Additional BCC test
	* Test case description: Input null - Queue not full - Queue not empty - Elements in queue is 1
	* Expected output: Q2 == < null >
	* Bug report:
	* */
	@Test
	public void testAqueueEnqueue2() {

		Q2.enqueue(null);

		assertEquals("< null >", Q2.toString());

	}

	/*
	Test case Aqueue Dequeue 1
	* Tester: Aydin & Kleard
	* Date: Feb 18th 2023
	* Test type: Base case
	* Test case description: Queue is not full - Queue is not empty - Element in queue is not null
	* Expected output: Q2 == < >
	* Bug report:
	* */
	@Test
	public void testAqueueDequeue1() {

		Q2.enqueue(10);
		Q2.dequeue();

		assertEquals("< >", Q2.toString());

	}

	/*
	Test case Aqueue Dequeue 2
	* Tester: Aydin & Kleard
	* Date: Feb 18th 2023
	* Test type: Additional BCC test
	* Test case description: Queue is not full - Queue is not empty - Element in queue is null
	* Expected output: Q2 == < >
	* Bug report:
	* */
	@Test
	public void testAqueueDequeue2() {

		Q2.enqueue(null);
		Q2.dequeue();

		assertEquals("< >", Q2.toString());

	}


	/*
	Test case Lqueue Enqueue 1
	* Tester: Aydin & Kleard
	* Date: Feb 18th 2023
	* Test type: Base test
	* Test case description: Input not null - Queue not full - Queue not empty - Elements in queue is 1
	* Expected output: Q3 == < 21 >
	* Bug report:
	* */
	@Test
	public void testLqueueEnqueue1() {

		Q3.enqueue(21);

		assertEquals("< 21 >", Q3.toString());

	}


	/*
	Test case Lqueue Enqueue 2
	* Tester: Aydin & Kleard
	* Date: Feb 18th 2023
	* Test type: Additional BCC test
	* Test case description:  Input null - Queue not full - Queue not empty - Elements in queue is 1
	* Expected output: Q3 == < null >
	* Bug report:
	* */
	@Test
	public void testLqueueEnqueue2() {

		Q3.enqueue(null);

		assertEquals("< null >", Q3.toString());

	}



	/*
	Test case Lqueue Dequeue 1
	* Tester: Aydin & Kleard
	* Date: Feb 18th 2023
	* Test type: Base test
	* Test case description:  Queue is not full - Queue is not empty - Element in queue is not null
	* Expected output: Q3 == < 48 >
	* Bug report:
	* */
	@Test
	public void testLqueueDequeue1() {
		Q3.enqueue(10);
		Q3.enqueue(48);
		Q3.dequeue();

		assertEquals("< 48 >", Q3.toString());

	}
}

