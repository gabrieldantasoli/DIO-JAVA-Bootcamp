package ListaEncadeadaSimples;

public class SingleLinkedList<T> {
	private T data;
	private SingleLinkedList nextNode;
	
	public SingleLinkedList(T data) {
		this.data = data;
		this.nextNode = new SingleLinkedList();
	}
	
	public SingleLinkedList() {
		this.data = null;
		this.nextNode = null;
	}
	
	
	public void addNode(T data) {
		if (this.data == null) {
			this.data = data;
			this.nextNode = new SingleLinkedList();
		} else {
			this.recursiveAddNode(data, this.nextNode);
		}
	}
	
	private void recursiveAddNode(T data, SingleLinkedList node) {
		if (node.data == null) {
			node.setData(data);
			node.nextNode = new SingleLinkedList();
		} else {
			this.recursiveAddNode(data, node.nextNode);
		}
	}
	
	public boolean removeNode(T data) {
		if (this.data == null) return false;
		if (this.data == data) {
			this.data = (T) this.nextNode.getData();
			this.nextNode = this.nextNode.nextNode;
			return true;
		}
		return this.recursiveRemoveNode(data, this.nextNode);
	}
	
	private boolean recursiveRemoveNode(T data, SingleLinkedList node) {
		if (node.nextNode.data == null && node.data == data) {
			node.setData(null);
			node.nextNode = null;
		}
		if (node.nextNode == null || node.nextNode.getData() == null) return false;
		if (node.getData() == data) {
			node.setData(node.nextNode.getData());
			node.nextNode = node.nextNode.nextNode;
			return true;
		} else {
			return this.recursiveRemoveNode(data, node.nextNode);
		}
	}
	
	public String ArrayString() {
		String arrayString = this.data.toString();
		
		SingleLinkedList aux = this.nextNode;
		
		while (aux.nextNode != null) {
			arrayString += " " + aux.data;
			aux = aux.nextNode;
		}
		
		return arrayString;
	}
	
	public T getData() {
		return this.data;
	}
	
	private void setData(T data) {
		this.data = data;
	}
}
