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
		
		Q1 = new AQueue<Integer>();
		Q2 = new AQueue<Integer>();
		Q3 = new LQueue<Integer>();
		Q4 = new LQueue<Integer>();
		Q5 = new DQueue<Integer>();
		Q6 = new DQueue<Integer>();
	

		
		
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


	/*
	Test case Lqueue Dequeue 2
	* Tester: Aydin & Kleard
	* Date: Feb 18th 2023
	* Test type: Additional BCC test
	* Test case description:  Queue is not full - Queue is empty - Element in queue is not null
	* Expected output: Exception Thrown
	* Bug report: Throws assertion error
	* */
	@Test
	public void testLqueueDequeue2() {
		Q3.dequeue();
		assertEquals("< >", Q3.toString());
	}


	/*
	Test case Dqueue Enqueue 1
	* Tester: Aydin & Kleard
	* Date: Feb 18th 2023
	* Test type: Base test
	* Test case description:  Input not null - Queue not full - Queue not empty - Elements in queue is 1
	* Expected output:  < 47 >
	* Bug report:
	* */
	@Test
	public void testDqueueEnqueue1() {
		Q5.enqueue(47);
		assertEquals("< 47 >", Q5.toString());
	}


	/*
	Test case Dqueue Enqueue 2
	* Tester: Aydin & Kleard
	* Date: Feb 18th 2023
	* Test type: Additional BCC test
	* Test case description:  Input null - Queue not full - Queue not empty - Elements in queue is 1
	* Expected output: < null >
	* Bug report:
	* */
	@Test
	public void testDqueueEnqueue2() {
		Q5.enqueue(null);
		assertEquals("< null >", Q5.toString());
	}


	/*
	Test case Dqueue Dequeue 1
	* Tester: Aydin & Kleard
	* Date: Feb 18th 2023
	* Test type: Additional BCC test
	* Test case description:  Queue is not full - Queue is not empty - Element in queue is not null - Previous Element is not null
	* Expected output: < 25 >
	* Bug report:
	* */
	@Test
	public void testDqueueDequeue1() {
		Q5.enqueue(10);
		Q5.enqueue(25);
		Q5.dequeue();
		assertEquals("< 25 >", Q5.toString());
	}


	/*
	Test case Dqueue Dequeue 2
	* Tester: Aydin & Kleard
	* Date: Feb 18th 2023
	* Test type: Additional BCC test
	* Test case description:  Queue is not full - Queue is not empty - Element in queue is null - Previous Element is not null
	* Expected output: < null >
	* Bug report:
	* */
	@Test
	public void testDqueueDequeue2() {
		Q5.enqueue(10);
		Q5.enqueue(null);
		Q5.dequeue();
		assertEquals("< null >", Q5.toString());
	}

	/*
	Test case Dqueue Dequeue 3
	* Tester: Aydin & Kleard
	* Date: Feb 18th 2023
	* Test type: ECC test
	* Test case description:  Queue is not empty - Element in queue is not null - Previous element is null
	* Expected output: < 15 >
	* Bug report:
	* */
	@Test
	public void testDqueueDequeue3() {
		Q5.enqueue(null);
		Q5.enqueue(15);
		Q5.dequeue();
		assertEquals("< 15 >", Q5.toString());
	}
}

