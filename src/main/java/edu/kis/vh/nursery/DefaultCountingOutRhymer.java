package edu.kis.vh.nursery;

import edu.kis.vh.nursery.storage.IntLinkedList;
import edu.kis.vh.nursery.storage.IntStorageInterface;

/**
 * @author modyfikacji Damian Golema
 *
 */
public class DefaultCountingOutRhymer 
{
	private IntStorageInterface isi = null;

	public DefaultCountingOutRhymer() 
	{
		
	}
	public DefaultCountingOutRhymer(IntStorageInterface i) 
	{
		isi = i;
	}

	public void countIn(int in) 
	{
		isi.push(in);
	}
	public boolean callCheck() 
	{
		return isi.isEmpty();
	}
	public boolean isFull() 
	{
		return false;
	}
	public int countOut() 
	{
		return isi.pop();
	}
	public int peekaboo() 
	{
		return isi.top();
	}	

}
