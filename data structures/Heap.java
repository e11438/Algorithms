public class Heap<T extends Comparable<T>> { 
    private int default_size; 
    
    private T[] array;
    private int size; 

    public Heap(int heapSize) {
    default_size=heapSize;
	array = (T[]) new Comparable[default_size];
	size  = 0; 
    }

    boolean isRoot(int index) {	return (index == 0);   }
    int leftChild(int index)  { return 2 * index + 1;  }
    int parent(int index)     { return (int)((index - 1) / 2); }
    int rightChild(int index) { return 2 * index + 2;   }
    T myParent(int index) { return array[parent(index)]; }
    boolean hasLeftChild(int i) { return leftChild(i) < size; } 
    boolean hasRightChild(int i){ return rightChild(i) < size; } 

    private void swap(int a, int b) { 
	T tmp = array[a]; 
	array[a] = array[b]; 
	array[b] = tmp;
    }

    public boolean isEmpty() { return (size == 0); } 


    /* adding heap */
    public void add(T value) { 
	if(size == default_size) throw new IllegalStateException("Full array");
	array[size++] = value; 
	bubbleUp(); 
    }

    public void bubbleUp() { 
	if(size == 0) throw new IllegalStateException("Shape error");
	int index = size - 1;  
	while(!isRoot(index)) { 
	    if(myParent(index).compareTo(array[index]) <= 0) break; 
	    /* else part */
	    swap(parent(index), index); 
	    index = parent(index);
	}
    }  

    /* removing */

    public T remove() {
	if(isEmpty()) return null; 
	T res = array[0]; /* root */
	array[0] = array[size-1]; 
	size --; 
	//System.out.println("======="+size);
	bubbleDown(0); 
	return res;
    }

    private void bubbleDown(int index) { 
	/* implmement me */
    	//if(size == 0) throw new IllegalStateException("only one element remaining");
    	if(index < size){
    	    int p = index;
    	    int l = leftChild(index);
    	    int r = rightChild(index);
    	    int s = size;
    	    //array[r]<array[p] && array[r]<array[l]
    	    if(r<s && array[r].compareTo(array[p])<0 && array[r].compareTo(array[l])<0){
    	        /*int temp = array[r];
    	        heap[r] = heap[p];
    	        heap[p] = temp;
    	        downHeap(r);*/
    	    	swap(r,p);
    	    	bubbleDown(r);
    	    }else if(l<s && array[l].compareTo(array[p])<0){ //else if(l<s && heap[l]<heap[p])
    	        /*int temp = heap[l];
    	        heap[l] = heap[p];
    	        heap[p] = temp;
    	        downHeap(l);*/
    	    	swap(l,p);
    	    	bubbleDown(l);
	
    	    }
    	}
    	
    }


    public void show() {
	for(int i=0; i<size; i++) 
	    System.out.print(array[i] + " "); 
	System.out.println("======="+size);
    }


    public static void main(String [] args) {
	Heap heap = new Heap<Integer>(10); 

	for(int i=0; i<10; i++) {
	    heap.add((int) (Math.random() * 10)); 
	    heap.show();
	}

	//System.out.println(array[leftChild(index)].compareTo(array[rightChild(index)]));

	System.out.println("You should see sorted numbers");
	while(!heap.isEmpty()) 
	    System.out.print(heap.remove());
	
    }
       

}
	