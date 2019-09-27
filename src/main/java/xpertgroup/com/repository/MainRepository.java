package xpertgroup.com.repository;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class MainRepository implements ItMainRepository {
	
	
	@Getter
	@Setter
	private List<Integer> list;

	public MainRepository() {

		this.list = new ArrayList<>();
	}

	@Override
	public int query(int[][][] matriz, int px, int qx, int rx, int py, int qy, int ry) throws Exception {
		int suma = 0;
		for (int i = 0; i <= getList().size() - 3; i = i + 3) {
			int a = getList().get(i);
			int b =  getList().get(i + 1);
			int c =  getList().get(i + 2);
			if ((a >= px && a <= py) && (b >= qx && b <= qy) && (c >= rx && c <= ry)) {
				suma += matriz[a - 1][b - 1][c - 1];
			}
		}
		return suma;
	}

	@Override
	public List<Integer> update(int[][][] matriz, int i, int j, int k, int value) throws Exception {
		matriz[i - 1][j - 1][k - 1] = value;
		 getList().add(i);
		 getList().add(j);
		 getList().add(k);
		return getList();
	}

	/**
	 * @return the list
	 */
	public List<Integer> getList() {
		return list;
	}

	/**
	 * @param list the list to set
	 */
	public void setList(List<Integer> list) {
		this.list = list;
	}

}
