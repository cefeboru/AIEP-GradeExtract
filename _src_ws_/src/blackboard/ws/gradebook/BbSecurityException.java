
/**
 * BbSecurityException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package blackboard.ws.gradebook;

public class BbSecurityException extends java.lang.Exception{

    private static final long serialVersionUID = 1465944117545L;
    
    private blackboard.ws.gradebook.GradebookWSStub.BbSecurityExceptionE faultMessage;

    
        public BbSecurityException() {
            super("BbSecurityException");
        }

        public BbSecurityException(java.lang.String s) {
           super(s);
        }

        public BbSecurityException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public BbSecurityException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(blackboard.ws.gradebook.GradebookWSStub.BbSecurityExceptionE msg){
       faultMessage = msg;
    }
    
    public blackboard.ws.gradebook.GradebookWSStub.BbSecurityExceptionE getFaultMessage(){
       return faultMessage;
    }
}
    