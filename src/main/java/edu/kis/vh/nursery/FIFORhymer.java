package edu.kis.vh.nursery;

import edu.kis.vh.nursery.storage.IntLinkedList;
import edu.kis.vh.nursery.storage.IntStorageInterface;

public class FIFORhymer extends DefaultCountingOutRhymer 
{

	public FIFORhymer() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public IntLinkedList temp = new IntLinkedList();

	@Override
	public int countOut() 
	{
		while (!callCheck())
			temp.push(super.countOut());

		int ret = temp.pop();

		while (!temp.isEmpty())
			countIn(temp.pop());

		return ret;
	}

	public FIFORhymer(IntStorageInterface i) {
		super(i);
		// TODO Auto-generated constructor stub
	}
}
