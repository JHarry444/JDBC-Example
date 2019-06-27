package main;

import java.util.List;

public interface CRUDRepo<T> {

	public void create(List<T> toInsert);

	public List<T> read();

	public void update(List<T> users);

	public void delete(List<T> toDelete);

}
