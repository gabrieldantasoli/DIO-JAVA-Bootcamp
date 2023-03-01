package ListaDuplamenteEncadeada;

public class ListaDuplamenteEncadeada<T> {
	private T data;
	private ListaDuplamenteEncadeada next;
	private ListaDuplamenteEncadeada previous;
	
	public ListaDuplamenteEncadeada() {
		this.data = null;
		this.next = null;
		this.previous = null;
	}
	
	public void addElement(T element) {
		if (this.isEmpty()) {
			this.setData(element);
			this.next = new ListaDuplamenteEncadeada();
			this.previous = new ListaDuplamenteEncadeada();
		} else {
			this.recursiveAddElement(element, this);
		}
	}
	
	private void recursiveAddElement(T element, ListaDuplamenteEncadeada<T> node) {
		if (node.next.isEmpty()) {
			node.next.setData(element);
			node.next.next = new ListaDuplamenteEncadeada<T>();
			node.next.previous = node;
		} else {
			this.recursiveAddElement(element, node.next);
		}
	}
	
	public void removeElement(T element) {
		if (!this.isEmpty()) {
			if (this.data == element) {
				this.data = (T) this.next.data;
				this.next = this.next.next;
				this.next.next.previous = this;
			} else {
				this.recursiveRemoveElement(element, this.next);
			}
		}
	}
	
	private void recursiveRemoveElement(T element, ListaDuplamenteEncadeada<T> node) {
		if (node.isEmpty()) return;
		if (node.data == element) {
			node.data = (T) node.next.data;
			node.next = node.next.next;
		} else {
			this.recursiveRemoveElement(element, node.next);
		}
	}
	
	private boolean isEmpty() {
		return this.data == null ? true : false;
	}
	
	private void setData(T element) {
		this.data = element;
	}
	
	public String arrayString() {
		if (this.isEmpty()) return "[]";
		String arrayString = data.toString();
		
		ListaDuplamenteEncadeada<T> aux = this.next;
		
		while (!aux.isEmpty()) {
			arrayString += " " + aux.data;
			aux = aux.next;
		}
		
		return arrayString;
	}
}
