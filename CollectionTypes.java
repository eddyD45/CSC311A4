import java.awt.List;
import java.io.IOException;
import java.util.*;

public class CollectionTypes {
	
	
	public static void main(String[] args) throws IOException {
		int [] nums = filereader.intfileToArray("numbers.txt");
		
		Collection<Integer> vectorColl = new Vector<Integer>();
		Collection<Integer> treeColl = new TreeSet<Integer>();
//		Collection<Integer> list2 = new List();
		SortedSet<Integer> sortSet = new TreeSet<Integer>();
		Collection<Integer> sortSetColl = sortSet;
		Set<Integer> set = new TreeSet();
		Collection<Integer> setColl = set;
//		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
//		Collection<Integer,Integer> mapColl = map;
		
		

//		Map map = new HashMap();
//		Map sortMap = new SortedMap();
		
		
		vectorColl = returnColl(vectorColl,nums);
		treeColl = returnColl(treeColl,nums);
		//list
		sortSetColl = returnColl(sortSetColl,nums);
		setColl = returnColl(setColl,nums);
		//map
		//sortedmap
		
		
		System.out.println("Print collections:");
		showColl(vectorColl);
		showColl(treeColl);
		//list
		showColl(sortSetColl);
		showColl(setColl);
		//map
		//sortedmap
		System.out.println("-----------------------------Collections done--------------------------------");
		
		int[] vectorArr = collToArray(vectorColl);
		int[] treeArr = collToArray(treeColl);
		//list
		int[] sortSetArr = collToArray(sortSetColl);
		int[] setArr = collToArray(setColl);
		//map
		//sortedmap
		
		System.out.println("\nPrint arrays:");
		printArr(vectorArr);
		printArr(treeArr);
		//list
		printArr(sortSetArr);
		printArr(setArr);
		//map
		//sortedmap
		System.out.println("-----------------------------Arrays done--------------------------------");

		
		
		
		
	}
	
	public static Collection<Integer> returnColl (Collection<Integer> coll, int [] arr) {
		for (int i = 0; i < arr.length; i++) {
			coll.add(arr[i]);
		}
		
		
		return coll;
	}
	
	public static void showColl(Collection<Integer> coll) {
		Iterator<Integer> iter = coll.iterator();
		System.out.println();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
	
	public static int [] collToArray(Collection<Integer> coll) {
		int size = 0, i = 0;
		Iterator<Integer> iter = coll.iterator();
		while(iter.hasNext()) {
			size++;
			iter.next();
		}
		
		int [] arr = new int[size];
		iter = coll.iterator();
		
		while(iter.hasNext()) {
			arr[i++] = (Integer)iter.next();
		}
		return arr;
	}
	
	public static void printArr(int [] arr) {
		System.out.println();
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
