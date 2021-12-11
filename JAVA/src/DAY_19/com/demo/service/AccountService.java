package DAY_19.com.demo.service;

import com.demo.exceptions.BlockSystemException;
import com.demo.exceptions.InsufficientException;

public interface AccountService {

	void addNewAccount(int x) throws BlockSystemException;

	boolean withdrawamount(int accid, double amt) throws InsufficientException;

	void displayAll();

}
