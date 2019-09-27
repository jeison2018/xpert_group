package xpertgroup.com.repository;

import java.util.List;

public interface ItMainRepository {
	
	int query(int matriz[][][], int px, int qx, int rx, int py, int qy, int ry) throws Exception;
	
	List<Integer> update(int matriz[][][], int i, int j, int k, int value) throws Exception;

}
