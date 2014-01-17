/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package de.example.service;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

/**
 *
 * @author admin
 */
public class HouseInterceptor {
    
    @AroundInvoke
    public Object doIntercept(InvocationContext ic) throws Exception{
        System.out.println("Intercepted call to "+ic.getMethod());
        return ic.proceed();
    }
    
}
