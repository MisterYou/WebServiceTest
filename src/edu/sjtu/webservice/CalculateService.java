package edu.sjtu.webservice;

public class CalculateService {
	 //�ӷ�  
    public float plus(float x, float y) {  
        return x + y;  
    }  
    //����  
    public float minus(float x, float y) {  
        return x - y;  
    }  
    //�˷�  
    public float multiply(float x, float y) {  
        return x * y;  
    }  
    //����  
    public float divide(float x, float y) {  
        if(y!=0)  
        {  
            return x / y;  
        }  
        else  
            return -1;  
    }  
}
