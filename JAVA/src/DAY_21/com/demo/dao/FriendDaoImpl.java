package DAY_21.com.demo.dao;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import DAY_21.com.demo.beans.Friend;


public class FriendDaoImpl implements FriendDao{
	static List<Friend> flist;
    static {
    	flist=new ArrayList<>();
    	
    }
	@Override
	public int readData() {
		File file=new File("friend.txt");
		if(file.exists()&& file.canRead()) {
			try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(file))){
				while(true) {
					Friend f=(Friend)ois.readObject();
					flist.add(f);
				}
				
			}catch (EOFException e) {
				System.out.println("Reached to end of file");
				return flist.size();
			}catch(IOException e) {
				return 0;
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return 0;
			}
		}
		else {
			System.out.println("file does not exists");
			return 0;
		}
		
	}
	@Override
	public void writeData() {
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("friend.txt"))){
			for(Friend f:flist) {
				oos.writeObject(f);
			}
			//flist.forEach(x->oos.writeObject(x));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public List<Friend> displayAll() {
		return flist;
	}
	@Override
	public void save(Friend f) {
		flist.add(f);
		
	}
	public Friend searchById(int id) {
		int pos=flist.indexOf(new Friend(id));
		if(pos!=-1) {
			return flist.get(pos);
		}
		return null;
	}
	@Override
	public boolean deleteById(int id) {
		//flist.removeIf(x->x.getId()==id);
		Scanner sc=new Scanner(System.in);
		Friend f=searchById(id);
		if(f!=null) {
			System.out.println(f);
			System.out.println("delete(y/n)");
			String ans=sc.next();
			if(ans.equals("y")) {
				return flist.remove(new Friend(id));
			}
		}
		return false;
		
		
	}

}
