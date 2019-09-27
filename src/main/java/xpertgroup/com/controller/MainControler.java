package xpertgroup.com.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import xpertgroup.com.service.MainService;

@Controller
public class MainControler {
	
	@Autowired
	private MainService mainService;  //  
        
 
	

	
	public List<Integer> update(int matriz[][][], int inputOne, int inputTwo, int inputThree, int inputFour) throws Exception {
		return  getMainService().update(matriz, inputOne, inputTwo, inputThree, inputFour);
	}
	
	
	
	public int query(int matriz [][][], int inputOne, int inputTwo, int inputThree, int inputFour,
			int inputFive, int inputSix) throws Exception {
		return  getMainService().query(matriz, inputOne, inputTwo, inputThree, inputFour, inputFive, inputSix);
	}



	/**
	 * @return the mainService
	 */
	public MainService getMainService() {
		return mainService;
	}



	/**
	 * @param mainService the mainService to set
	 */
	public void setMainService(MainService mainService) {
		this.mainService = mainService;
	}
	
	
	
}
