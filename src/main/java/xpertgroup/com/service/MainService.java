package xpertgroup.com.service;

import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import xpertgroup.com.repository.MainRepository;

@Service
public class MainService {

    
    private MainRepository mainRepository;

    @PostConstruct
    public void init(){
        mainRepository = new MainRepository();
    }
    
    public int query(int matriz[][][], int px, int qx, int rx, int py, int qy, int ry) throws Exception {

        return getMainRepository().query(matriz, px, qx, rx, py, qy, ry);
    }

    public List<Integer> update(int matriz[][][], int i, int j, int k, int value) throws Exception {
        return getMainRepository().update(matriz, i, j, k, value);
    }

    /**
     * @return the mainRepository
     */
    public MainRepository getMainRepository() {
        return mainRepository;
    }

    /**
     * @param mainRepository the mainRepository to set
     */
    public void setMainRepository(MainRepository mainRepository) {
        this.mainRepository = mainRepository;
    }

}
