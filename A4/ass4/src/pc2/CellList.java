package pc2;

  

import java.util.NoSuchElementException;
import java.util.Iterator;
import java.util.LinkedList;

public class CellList{
	
	
	public class CellNode{
		private CellPhone phone;
		private CellNode link;

		public CellNode(){
			phone = null;
			link = null;
		}

		public CellNode(CellPhone phone, CellNode link){
			this.phone = phone;
			this.link = link;
		}

		
		public CellNode(CellNode cellNode){
			phone = cellNode.phone.clone(cellNode.phone.getSerialNum());
			link = cellNode.link;
		}

		public CellNode clone(){
			return new CellNode(this.phone.clone(this.phone.getSerialNum()), this.link);
		}
		
		
		
		public void setPhone(CellPhone newPhone){
			this.phone = newPhone;
		}
		public void setLink(CellNode newLink){
			this.link = newLink;
		}
		public CellPhone getPhone(){
			return phone;
		}
		public CellNode getLink(){
			return link;
		}

	}
	
	public class CellListIterator{
		private CellNode position;
		private CellNode previous;

		public CellListIterator(){
			position = head;
			previous = null;
		}

		public void restart(){
			position = head;
			previous = null;
		}

		public CellPhone next(){
			if (!hasNext()){
				throw new NoSuchElementException();
			}
			CellPhone toReturn = position.phone;
			previous = position;
			position = position.link;
			return toReturn;
		}

		public boolean hasNext(){
			return (position != null);
		}

		public CellPhone peek(){
			if (!hasNext()){
				throw new IllegalStateException();
			}
			return position.phone;
		}
	}
	

	private CellNode head;
	private int size;

	

	public CellList(){
		head = null;
		size = 0;   
	}

	
	public void addToStart(CellPhone cellPhone){	
		head = new CellNode(cellPhone, head);
		size++;
	}

	

	
	public int size(){
		int count = 0;
		CellNode position = head;

		while (position != null){
			count++;
			position = position.link;
		}

		return count;
	}
	
	public void insertAtIndex(CellPhone cellPhone, int index){
		try{
			if (index < 0 || index > (this.size()-1)){
				throw new NullPointerException();
			}
			else if (index == 0)
				this.addToStart(cellPhone);
			else{
				CellListIterator iterator = new CellListIterator();
				int count = 0;
				while(count < index){
					iterator.next();
					count++;
				}
				CellNode temp = new CellNode(cellPhone, iterator.position);
				iterator.previous.link = temp;			
			}
			size++;
		}
		catch (Exception e){
			System.out.println("Invalid Index! Terminating Program.");
			System.exit(0);	
		}
	}
	public void deleteFromIndex(int index){
		try{	
			if (index < 0 || index > (this.size()-1)){
				throw new NullPointerException();
			}
			else if(index == 0)
				this.deleteFromStart();
			else{
				CellListIterator iterator = new CellListIterator();
				int count = 0;
				while(count < index){
					iterator.next();
					count++;
				}
				iterator.previous.link = iterator.position.link;
				iterator.position = iterator.position.link;
			}	
			size--;	
		}
		catch (Exception e){
			System.out.println("Invalid Index! Terminating Program.");
			System.exit(0);	
		}
		
	}
								
	
	public void deleteFromStart(){
		if (head != null)
			head = head.link;			
		else
			throw new NullPointerException("List is empty");


	}

	public void ReplaceAtIndex(CellPhone cellPhone, int index){
		try{
			if (index < 0 || index > (this.size()-1))
				throw new NullPointerException();
							
			else if (index == 0)			
				head =  new CellNode(cellPhone, head);
			else{
				CellListIterator iterator = new CellListIterator();
				int count = 0;
				while(count < index){
					iterator.next();
					count++;
				}
				iterator.position.phone = cellPhone;
				iterator.previous.link = iterator.position;
			}
		}
		catch (Exception e){
			System.out.println("Invalid Index! Terminating Program.");
			System.exit(0);	
		}		
	}
	
	
	public CellNode find(long serial){
		CellNode position = head;
		long serialAtPostion;
		while (position != null){
			serialAtPostion = position.phone.getSerialNum();
			if (serialAtPostion == serial){
				return position;
			}
			position = position.link;
		}
		return null;
	}

	
	public boolean contains(long serial){
		return find(serial) != null;
	}

	
	public void showContents(){
		CellNode position = head;
		while (position != null){
			System.out.print("["+position.phone+"] ---> ");
			position = position.link;
		}
	}

	
}

