/* Generated by Together */

package com.javapatterns.facade.sessionfacade;

import javax.ejb.EJBHome;
import javax.ejb.CreateException;
import javax.ejb.EJBException;
import java.rmi.RemoteException;

public interface SessionFacadeHome extends EJBHome {
SessionFacade create() throws CreateException, EJBException, RemoteException;

    /** @link dependency */
    /*#SessionFacadeBean lnkSession1Bean;*/
}