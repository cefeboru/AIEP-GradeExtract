
/**
 * PersistenceException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package blackboard.ws.gradebook;

public class PersistenceException extends java.lang.Exception{

    private static final long serialVersionUID = 1465944117553L;
    
    private blackboard.ws.gradebook.GradebookWSStub.PersistenceExceptionE faultMessage;

    
        public PersistenceException() {
            super("PersistenceException");
        }

        public PersistenceException(java.lang.String s) {
           super(s);
        }

        public PersistenceException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public PersistenceException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(blackboard.ws.gradebook.GradebookWSStub.PersistenceExceptionE msg){
       faultMessage = msg;
    }
    
    public blackboard.ws.gradebook.GradebookWSStub.PersistenceExceptionE getFaultMessage(){
       return faultMessage;
    }
}
    