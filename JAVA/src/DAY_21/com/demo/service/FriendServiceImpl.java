package DAY_21.com.demo.service;
import java.util.List;
import java.util.Scanner;
import DAY_21.com.demo.beans.Friend;
import DAY_21.com.demo.dao.FriendDao;
import DAY_21.com.demo.dao.FriendDaoImpl;


public class FriendServiceImpl implements FriendService{
   private FriendDao fdao;

public FriendServiceImpl() {
	super();
	fdao=new FriendDaoImpl();
}

@Override
public int readData() {
	return fdao.readData();
	
}

@Override
public void writeData() {
	fdao.writeData();
	
}

@Override
public List<Friend> displayAll() {
	return fdao.displayAll();
	
}

@Override
public void addNewFriend() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enetr id");
	int id=sc.nextInt();
	System.out.println("enetr name");
	String nm=sc.next();
	System.out.println("enetr mobile");
	String mobile=sc.next();
	Friend f=new Friend(id,nm,mobile);
	fdao.save(f);
	
	
}

@Override
public boolean deleteById(int id) {
	return fdao.deleteById(id);
}
   
}
