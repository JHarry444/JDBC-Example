package main;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		CRUDRepo<User> repo = new MyUserRepo();
//		System.out.println(repo.read());
//		repo.create(repo.read());
//		repo.update(Arrays.asList(new User(1, 44, "M", 1, "WS!! 6XG"), new User(2, 94, "F", 1, "WS11 12F")));
		System.out.println(repo.read());
		repo.delete(Arrays.asList(new User(1, 0, null, 0, null)));
		System.out.println(repo.read());
	}
}
