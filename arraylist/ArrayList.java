package arraylist;

/**
 * ArrayList provides a generic implementation for storing elements.
 * This class offers methods to add, get, delete, and display elements,
 * and to return the current size of the list.
 * 
 * @param <T> the type of elements in this list
 */
public class ArrayList<T> {

	private T[] list;
	private int totCapacity;
	private int curCapacity;

	@SuppressWarnings("unchecked")
	/*
	 * type check for conversion of Object[] to T[] has been supressed because the
	 * list is being
	 * created in the constructor and there is no provision for type errors to occur
	 */

	/**
	 * Constructs an ArrayList with the specified initial capacity.
	 *
	 * @param size the initial capacity of the list
	 */
	public ArrayList(int size) {
		this.totCapacity = size;
		this.curCapacity = 0;
		this.list = (T[]) new Object[size];
	}

	/**
	 * Returns the number of elements in the list.
	 *
	 * @return the number of elements in the list
	 */
	public int size() {
		return this.curCapacity;
	}

	/**
	 * Resizes the internal array to accommodate more elements.
	 * The new capacity is twice the current total capacity.
	 */
	private void resize() {
		@SuppressWarnings("unchecked")
		T[] newArr = (T[]) new Object[this.totCapacity * 2];
		for (int i = 0; i < this.curCapacity; i++) {
			newArr[i] = this.list[i];
		}
		this.list = newArr;
		this.totCapacity *= 2;
	}

	/**
	 * Adds the specified element to the end of the list.
	 * Resizes the list if the current capacity is reached.
	 *
	 * @param element the element to be added to the list
	 */
	public void add(T element) {
		if (this.curCapacity == this.totCapacity) {
			resize();
		}
		this.list[this.curCapacity] = element;
		this.curCapacity++;
	}

	/**
	 * Returns the element at the specified position in the list.
	 *
	 * @param index the index of the element to return
	 * @return the element at the specified position in the list
	 * @throws IndexOutOfBoundsException if the index is out of range (index < 0 ||
	 *                                   index >= curCapacity)
	 */
	public T get(int index) {
		if (index < 0 || index >= this.curCapacity) {
			throw new IndexOutOfBoundsException("Index Out of range");
		}
		return this.list[index];
	}

	/**
	 * Removes the element at the specified position in the list.
	 * Shifts any subsequent elements to the left (subtracts one from their
	 * indices).
	 *
	 * @param index the index of the element to be removed
	 * @throws IndexOutOfBoundsException if the index is out of range (index < 0 ||
	 *                                   index >= curCapacity)
	 */
	public void delete(int index) {
		if (index < 0 || index >= this.curCapacity) {
			throw new IndexOutOfBoundsException("Index Out of range");
		}
		for (int i = index; i < this.curCapacity - 1; i++) {
			this.list[i] = this.list[i + 1];
		}
		this.list[this.curCapacity - 1] = null;
		this.curCapacity--;
	}

	/**
	 * Displays all elements in the list in a readable format.
	 */
	public void display() {
		System.out.print("[");
		for (int i = 0; i < curCapacity; i++) {
			System.out.print(this.list[i]);
			if (i < curCapacity - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}

}
