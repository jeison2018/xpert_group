package com.xpertgroup.com;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import xpertgroup.com.controller.MainControler;
import xpertgroup.com.repository.MainRepository;
import xpertgroup.com.service.MainService;


public class XpertGroupApplicationTests {

    @Test
    public void testQuery() throws Exception {
        System.out.println("query");
        int[][][] matriz = new int[4][4][4];
        matriz[1][1][1] = 4;
        int inputOne = 1;
        int inputTwo = 1;
        int inputThree = 1;
        int inputFour = 3;
        int inputFive = 3;
        int inputSix = 3;
        MainControler instance = new MainControler();
        instance.setMainService(new MainService());
        instance.getMainService().setMainRepository(new MainRepository());
        instance.getMainService().getMainRepository().getList().add(2);
        instance.getMainService().getMainRepository().getList().add(2);
        instance.getMainService().getMainRepository().getList().add(2);
        int expResult = 4;
        int result = instance.query(matriz, inputOne, inputTwo, inputThree, inputFour, inputFive, inputSix);
        assertEquals(expResult, result);

    }
    
    
       @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        int[][][] matriz = new int[4][4][4];
        int inputOne = 2;
        int inputTwo = 2;
        int inputThree = 2;
        int inputFour = 4;
        MainControler instance = new MainControler();
        instance.setMainService(new MainService());
        instance.getMainService().setMainRepository(new MainRepository());
        List<Integer> expResult = new ArrayList<>();
        expResult.add(inputOne);
        expResult.add(inputTwo);
        expResult.add(inputThree);
        List<Integer> result = instance.update(matriz, inputOne, inputTwo, inputThree, inputFour);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
}
