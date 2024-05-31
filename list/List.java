package list;
import java.util.Arrays;

/**
 * List class provides an implementation for storing heterogenus items.
 * Implements a python like list that stores every kind of object.
 * Provides methods to add, get, delete and update elements, to display the entire list, to return size of list 
 */
public class List {
	private Object[] list;
	int size;

	public List() {
		list = new Object[1];
		size = 0;
	}

	/**
	 * Returns the number of elements in the list.
	 *
	 * @return the number of elements in the list
	 */
	public int size() {
		return size;
	}

	/**
	 * Adds the specified element to the end of the list.
	 *
	 * @param element the element to be added to the list
	 */
	public void add(Object element) {
		if (size == list.length) {
			list = Arrays.copyOf(list, list.length + 1);
		}
		list[size++] = element;
	}

	/**
	 * Deletes the element at the specified index from the list.
	 * Shifts any subsequent elements to the left 
	 * 
	 * @param index the index of the element to be removed
	 * @throws IndexOutOfBoundsException if the index is out of range (index < 0 || index >= size)
	 */
	public void delete(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index Out of range");
		}
		for (int i = index; i < size - 1; i++) {
			list[i] = list[i + 1];
		}
		list[--size] = null;
		list = Arrays.copyOf(list, list.length - 1);
	}

	/**
	 * Returns the element at the specified index in the list.
 	* 
 	* @param index the index of the element to return
 	* @return the element at the specified index
 	* @throws IndexOutOfBoundsException if the index is out of range (index < 0 || index >= size)
 	*/
	public Object get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index Out of range");
		}
		return list[index];
	}

	/**
 	* Updates the element at the specified index with the new element.
 	* 
 	* @param index the index of the element to be updated
 	* @param element the new element to be placed at the specified index
 	* @throws IndexOutOfBoundsException if the index is out of range (index < 0 || index >= size)
 	*/
	public void update(int index, Object element) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index Out of range");
		}
		list[index] = element;
	}

	/**
	 * Displays all items currently in the list 
	 */
	public void display() {
		System.out.print('[');
		for (int i = 0; i < size; i++) {
			Object element = this.get(i);
			if (element instanceof String) {
				System.out.print('"' + element.toString() + '"');
			} else if (element instanceof Character) {
				System.out.print("'" + element.toString() + "'");
			} else {
				System.out.print(element.toString());
			}
			if (i < size - 1) {
				System.out.print(", ");
			}
		}
		System.out.println(']');
	}
}
