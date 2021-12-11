package DAY_21.com.demo.dao;
import java.util.List;
import DAY_21.com.demo.beans.Friend;


public interface FriendDao {

	int readData();

	void writeData();

	List<Friend> displayAll();

	void save(Friend f);

	boolean deleteById(int id);

}
