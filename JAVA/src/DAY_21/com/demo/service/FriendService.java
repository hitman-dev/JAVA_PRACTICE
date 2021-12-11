package DAY_21.com.demo.service;
import java.util.List;
import DAY_21.com.demo.beans.Friend;

public interface FriendService {

	int readData();

	void writeData();

	List<Friend>displayAll();

	void addNewFriend();

	boolean deleteById(int id);

}
