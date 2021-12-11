package DAY_21.com.demo.test;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import DAY_21.com.demo.beans.Friend;


public class TestSerialization {
	public static void writeData(List<Friend> flist) {
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("friend.txt"))){
			//serialization
			for(Friend ob :flist) {
				oos.writeObject(ob);
			}
			
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static List<Friend> readData(){
		List<Friend> lst=new ArrayList<>();
		
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("friend.txt"))){
			
			while(true) {
				    //EOFEXception will be thrown when reached to EOF(end of file)
					Friend f=(Friend)ois.readObject();
					lst.add(f);
			}
			
		}  catch(EOFException e) {
			System.out.println("Reached to end of file");
			
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			lst=null;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			lst=null;
		}
		return lst;
	}
	
	
	public static void main(String[] args) {
		List<Friend> flist=new ArrayList<>();
		flist.add(new Friend(1,"Ashu","1111"));
		flist.add(new Friend(2,"Deepa","2222"));
		flist.add(new Friend(3,"Kedar","3333"));
		writeData(flist);
		List<Friend> flist1=readData();
		System.out.println("size of list: "+flist1.size());
		flist1.stream().forEach(System.out::println);
		
		
	}

}
